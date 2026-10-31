package com.example.quiz;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Brauzerdəki oyun bu API ilə danışır. Düzgün cavablar yalnız serverdə qalır. */
@RestController
@RequestMapping("/api")
public class QuizController {

    private final List<Question> bank = QuestionBank.getAll();

    record QuizQuestion(int id, String category, String text, List<String> options) {}
    record CheckRequest(int id, String answer) {}
    record CheckResponse(boolean correct, String correctAnswer) {}

    @GetMapping("/categories")
    public List<String> categories() {
        return bank.stream().map(Question::getCategory).distinct().toList();
    }

    @GetMapping("/count")
    public int count() {
        return bank.size();
    }

    // /api/quiz?category=Java&count=10&seen=1,5,9  (seen: artıq görülmüş sual nömrələri)
    // Əvvəlcə hələ görülməmiş suallar seçilir. Hamısı bitəndə köhnələrdən təkrar başlayır.
    @GetMapping("/quiz")
    public List<QuizQuestion> quiz(@RequestParam(defaultValue = "") String category,
                                   @RequestParam(defaultValue = "10") int count,
                                   @RequestParam(defaultValue = "") String seen) {
        Set<Integer> seenIds = new HashSet<>();
        for (String s : seen.split(",")) {
            try {
                seenIds.add(Integer.parseInt(s.trim()));
            } catch (NumberFormatException ignored) {
                // boş və ya səhv dəyərləri keç
            }
        }
        List<Integer> fresh = new ArrayList<>();
        List<Integer> old = new ArrayList<>();
        for (int i = 0; i < bank.size(); i++) {
            String c = bank.get(i).getCategory();
            if (category.isBlank() || c.equals(category) || c.startsWith(category + "/")) {
                if (seenIds.contains(i)) {
                    old.add(i);
                } else {
                    fresh.add(i);
                }
            }
        }
        if (fresh.isEmpty() && old.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Belə kateqoriya yoxdur");
        }
        Collections.shuffle(fresh);
        Collections.shuffle(old);
        List<Integer> ids = new ArrayList<>(fresh);
        ids.addAll(old);
        int n = Math.max(1, Math.min(count, ids.size()));
        return ids.subList(0, n).stream().map(i -> {
            Question q = bank.get(i);
            return new QuizQuestion(i, q.getCategory(), q.getText(), q.shuffledOptions());
        }).toList();
    }

    @PostMapping("/check")
    public CheckResponse check(@RequestBody CheckRequest request) {
        Question q = find(request.id());
        return new CheckResponse(q.getCorrect().equals(request.answer()), q.getCorrect());
    }

    // 50/50 köməyi: iki yanlış variantı qaytarır
    @GetMapping("/fifty/{id}")
    public List<String> fifty(@PathVariable int id) {
        List<String> wrong = new ArrayList<>(find(id).getWrong());
        Collections.shuffle(wrong);
        return wrong.subList(0, 2);
    }

    private Question find(int id) {
        if (id < 0 || id >= bank.size()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sual tapılmadı");
        }
        return bank.get(id);
    }
}
