# Viktorina (veb versiya)

Spring Boot backend + brauzerdə işləyən oyun. 400-dən çox sual, 8 mövzu, hər oyunda 10 sual. Görülmüş suallar təkrar gəlmir (hamısı bitənə qədər).

## İşə salmaq
1. IntelliJ-də `pom.xml` faylını "Open as Project" ilə aç
2. `QuizWebApplication` faylını Run et
3. Brauzerdə `http://localhost:8080` aç

Və ya terminalda: `mvn spring-boot:run`

## Quruluş
- `QuestionBank.java`: əl ilə yazılmış suallar
- `QuestionGenerator.java`: cədvəllərdən yaradılan sualllar (paytaxtlar, elementlər, riyaziyyat, şəxsiyyətlər)
- `QuizController.java`: API (`/api/categories`, `/api/quiz`, `/api/check`, `/api/fifty/{id}`)
- `static/index.html`: oyunun görünüşü və məntiqi (HTML, CSS, JavaScript)

Düzgün cavablar yalnız serverdə saxlanır, brauzerə göndərilmir.

## Əlavə etmək üçün fikirlər
- [ ] Sual sayını seçmək (5/10/15)
- [ ] Reytinq cədvəli (nəticələri bazaya yaz)
- [ ] Şəkilli suallar
- [ ] İki nəfərlik rejim

## Dostlara paylaşmaq (pulsuz)
1. Layihəni GitHub-a yüklə (`target/` qovluğu `.gitignore`-dadır).
2. Pulsuz hosting xidmətində (məsələn Render) "New Web Service" → GitHub repozitoriyanı seç → Docker ilə deploy et.
3. Verilən `https://...` linkini dostlara göndər.
4. Telefonda linki aç:
   - Android (Chrome): menyu ⋮ → "Tətbiqi quraşdır" / "Ana ekrana əlavə et"
   - iPhone (Safari): Paylaş düyməsi → "Ana ekrana əlavə et"
