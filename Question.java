package com.example.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Bir sual: mətn, düzgün cavab və 3 yanlış cavab. */
public class Question {

    private final String category;
    private final String text;
    private final String correct;
    private final List<String> wrong;

    public Question(String category, String text, String correct, String... wrong) {
        this.category = category;
        this.text = text;
        this.correct = correct;
        this.wrong = List.of(wrong);
    }

    /** Hər çağırışda variantları qarışdırır, ona görə düzgün cavabın yeri hər dəfə fərqli olur. */
    public List<String> shuffledOptions() {
        List<String> options = new ArrayList<>(wrong);
        options.add(correct);
        Collections.shuffle(options);
        return options;
    }

    public String getCategory() { return category; }
    public String getText() { return text; }
    public String getCorrect() { return correct; }
    public List<String> getWrong() { return wrong; }
}
