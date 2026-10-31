package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Java üzrə əlavə suallar (bölmələr üzrə).
 * Yeni sual əlavə etmək üçün: q(BÖLMƏ, "sual", "DÜZGÜN cavab", "yanlış1", "yanlış2", "yanlış3");
 */
public class JavaQuestions {

    private static final String S1 = "Proqramlaşdırma/Java əsasları";
    private static final String S2 = "Proqramlaşdırma/Java tiplər və operatorlar";
    private static final String S3 = "Proqramlaşdırma/Java şərt və dövrlər";
    private static final String S4 = "Proqramlaşdırma/Java metodlar";
    private static final String S5 = "Proqramlaşdırma/Java massivlər";
    private static final String S6 = "Proqramlaşdırma/Java String";
    private static final String S7 = "Proqramlaşdırma/Java OOP";
    private static final String S8 = "Proqramlaşdırma/Java Collections";
    private static final String S9 = "Proqramlaşdırma/Java Exceptions";
    private static final String S10 = "Proqramlaşdırma/Java Generics və Stream";
    private static final String S11 = "Proqramlaşdırma/Java Thread və JVM";
    private static final String S12 = "Proqramlaşdırma/Java Spring və alətlər";

    private static final List<Question> LIST = new ArrayList<>();

    private static void q(String cat, String text, String correct, String w1, String w2, String w3) {
        LIST.add(new Question(cat, text, correct, w1, w2, w3));
    }

    static {
        // ---------- JAVA ƏSASLARI ----------
        q(S1, "Java dilinin yaradıcısı kimdir?",
          "James Gosling", "Linus Torvalds", "Bjarne Stroustrup", "Guido van Rossum");
        q(S1, "Java mənbə kodu kompilyasiya olunanda hansı fayl yaranır?",
          ".class faylı", ".exe faylı", ".obj faylı", ".bin faylı");
        q(S1, "Java kodunu kompilyasiya edən komanda hansıdır?",
          "javac", "java", "javadoc", "jar");
        q(S1, "Kompilyasiya olunmuş Java proqramını işə salan komanda hansıdır?",
          "java", "javac", "jrun", "compile");
        q(S1, "Bytecode nədir?",
          "JVM-in başa düşdüyü aralıq kod", "Maşın dilində exe fayl", "Kodun şərhləri", "Verilənlər bazası sorğusu");
        q(S1, "JDK nə deməkdir?",
          "Java Development Kit", "Java Debug Kernel", "Java Data Kit", "Java Deploy Key");
        q(S1, "JRE nə üçün lazımdır?",
          "Java proqramlarını işə salmaq üçün", "Yalnız mətn redaktoru kimi", "Verilənlər bazasını idarə etmək üçün", "Veb dizayn üçün");
        q(S1, "Java-nın məşhur şüarı hansıdır?",
          "Bir dəfə yaz, hər yerdə işlət", "Daha sürətli, daha güclü", "Kod yaz və unut", "Hər şey obyektdir, hər şey sürətlidir");
        q(S1, "Java faylında public sinfin adı necə olmalıdır?",
          "Fayl adı ilə eyni", "Həmişə Main", "Həmişə App", "İstənilən ad ola bilər");
        q(S1, "Java hərf registrinə həssasdır?",
          "Bəli, Main və main fərqli adlardır", "Xeyr, eyni sayılır", "Yalnız sinif adları üçün", "Yalnız metod adları üçün");
        q(S1, "Düzgün main metodunun imzası hansıdır?",
          "public static void main(String[] args)", "public void main(String args)", "static public int main()", "private static void main(int args)");
        q(S1, "Java-da hər ifadə nə ilə bitir?",
          "Nöqtəli vergül (;)", "Nöqtə (.)", "Vergül (,)", "İki nöqtə (:)");
        q(S1, "Java-da kod blokunu hansı mötərizələr əhatə edir?",
          "{ }", "[ ]", "( )", "< >");
        q(S1, "Java-da çoxsətirli şərh necə yazılır?",
          "/* şərh */", "// şərh //", "<!-- şərh -->", "''' şərh '''");
        q(S1, "Javadoc şərhi necə başlayır?",
          "/**", "/*", "//", "##");
        q(S1, "Paketi elan etmək üçün hansı açar söz işlədilir?",
          "package", "namespace", "module", "folder");
        q(S1, "Başqa paketdəki sinfi istifadə etmək üçün hansı açar söz işlədilir?",
          "import", "include", "using", "require");
        q(S1, "Hansı paket avtomatik import olunur?",
          "java.lang", "java.util", "java.io", "java.sql");
        q(S1, "Garbage Collector (zibil yığıcı) nə edir?",
          "İstifadə olunmayan obyektlərin yaddaşını boşaldır", "Kodu kompilyasiya edir", "Faylları silir", "Xətaları avtomatik düzəldir");
        q(S1, "Java-da pointer (göstərici) arifmetikası varmı?",
          "Xeyr, yoxdur", "Bəli, C-dəki kimi", "Yalnız massivlərdə", "Yalnız String-də");
        q(S1, "Java əsasən hansı proqramlaşdırma paradiqmasına əsaslanır?",
          "Obyekt yönümlü", "Yalnız funksional", "Assembly", "Məntiqi (Prolog tipli)");
        q(S1, "Java 10-da gələn var açar sözü nə üçündür?",
          "Lokal dəyişənin tipini kompilyatorun müəyyən etməsi üçün", "Sabit yaratmaq üçün", "Qlobal dəyişən üçün", "Massiv elan etmək üçün");
        q(S1, "Aşağıdakılardan hansı Java üçün IDE-dir?",
          "IntelliJ IDEA", "Photoshop", "Excel", "Figma");
        q(S1, "System.out.print ilə System.out.println arasındakı fərq nədir?",
          "println sonda yeni sətrə keçir", "print yeni sətrə keçir", "Heç bir fərq yoxdur", "println yalnız rəqəm çap edir");
        q(S1, "System.out.printf nə üçün istifadə olunur?",
          "Formatlı çıxış üçün", "Fayl yazmaq üçün", "Xəta atmaq üçün", "Giriş oxumaq üçün");
        q(S1, "printf-də %d nəyi ifadə edir?",
          "Tam ədədi", "Kəsr ədədi", "Mətni", "Simvolu");
        q(S1, "printf-də %s nəyi ifadə edir?",
          "Mətni (String)", "Tam ədədi", "Kəsr ədədi", "Məntiqi dəyəri");
        q(S1, "printf-də %.2f nə edir?",
          "Kəsr ədədi nöqtədən sonra 2 rəqəmlə göstərir", "Ədədi 2-yə vurur", "Ədədi 2 simvola kəsir", "İki ədəd çap edir");
        q(S1, "\\n escape ardıcıllığı nə edir?",
          "Yeni sətrə keçir", "Tab əlavə edir", "Sətri silir", "Boşluq qoyur");
        q(S1, "\\t escape ardıcıllığı nə edir?",
          "Tab (girinti) əlavə edir", "Yeni sətrə keçir", "Mətni silir", "Dırnaq qoyur");
        q(S1, "Mətnin içinə cüt dırnaq yazmaq üçün nə işlədilir?",
          "\\\"", "''", "/\"", "%\"");
        q(S1, "Java-da sabit adlandırma qaydası hansıdır?",
          "BÜTÜN_BÖYÜK_HƏRFLƏR (MAX_SIZE)", "camelCase", "PascalCase", "kebab-case");
        q(S1, "Java-da sinif adları necə yazılır?",
          "PascalCase (StudentInfo)", "snake_case", "ALL_CAPS", "kebab-case");
        q(S1, "Java-da dəyişən və metod adları necə yazılır?",
          "camelCase (studentName)", "PascalCase", "ALL_CAPS", "kebab-case");
        q(S1, "Dəyişən adı rəqəmlə başlaya bilərmi?",
          "Xeyr", "Bəli", "Yalnız kiçik hərflə", "Yalnız sinif daxilində");
        q(S1, "Hansı dəyişən adı düzgündür?",
          "myVar", "2var", "my-var", "class");
        q(S1, "Aşağıdakılardan hansı Java açar sözüdür?",
          "synchronized", "function", "define", "elif");
        q(S1, "Java proqramı kompilyasiya xətası verirsə, proqram necə davranır?",
          "İşə düşmür", "Xətanı keçib işləyir", "Yarısı işləyir", "Avtomatik düzəlir");
        q(S1, "Java-nın platformadan asılı olmamasını nə təmin edir?",
          "JVM", "Maven", "Git", "Spring");
        q(S1, "Mənbə kodunu bir dəfə kompilyasiya edib müxtəlif əməliyyat sistemində işlətmək hansı xüsusiyyətlə bağlıdır?",
          "Platforma müstəqilliyi", "İnkapsulyasiya", "Rekursiya", "Overloading");
        q(S1, "Java proqramının bir yerdə toplanmış paketi hansı uzantıya malikdir?",
          ".jar", ".zip.java", ".exe", ".dll");
        q(S1, "Java-da sətrin sonunda nöqtəli vergül unudulsa nə baş verir?",
          "Kompilyasiya xətası", "Proqram işləyir", "İşləmə vaxtı xətası", "Heç nə");
        q(S1, "IntelliJ IDEA-da proqramı işə salmaq üçün hansı düymə istifadə olunur?",
          "Run (yaşıl üçbucaq)", "Stop (qırmızı kvadrat)", "Debug-ı söndür", "Save All");
        q(S1, "Aşağıdakılardan hansı Java versiyası deyil?",
          "Java 3.14", "Java 8", "Java 17", "Java 21");
        q(S1, "LTS (Long-Term Support) versiya nə deməkdir?",
          "Uzun müddət dəstəklənən versiya", "Ən sürətli versiya", "Yalnız test versiyası", "Məhdud sətir sayı olan versiya");
        q(S1, "Java-da Scanner sinfi hansı paketdədir?",
          "java.util", "java.io.scanner", "java.lang", "java.net");
        q(S1, "Scanner ilə bütöv sətri oxumaq üçün hansı metod işlədilir?",
          "nextLine()", "next()", "readAll()", "getString()");
        q(S1, "Scanner ilə tam ədəd oxumaq üçün hansı metod işlədilir?",
          "nextInt()", "readInt()", "getInt()", "parseInt()");
        q(S1, "Java-da System.in nə üçündür?",
          "Standart giriş axını", "Standart çıxış axını", "Xəta axını", "Fayl yolu");
        q(S1, "Java-da System.err nə üçündür?",
          "Xəta mesajlarını çap etmək üçün", "Fayla yazmaq üçün", "Klaviaturadan oxumaq üçün", "Şəbəkə üçün");
        q(S1, "Java kodunun işləmə nöqtəsi (entry point) nədir?",
          "main metodu", "İlk sinif elanı", "İlk import", "Konstruktor");
        q(S1, "Java-da ən çox istifadə olunan build alətlərindən biri hansıdır?",
          "Maven", "Photoshop", "Notepad", "Paint");
        q(S1, "Eyni layihədə neçə sinif ola bilər?",
          "İstənilən sayda", "Yalnız bir", "Ən çox on", "Yalnız iki");
        // ---------- JAVA TIPLƏR VƏ OPERATORLAR ----------
        q(S2, "byte tipi neçə bayt yer tutur?",
          "1", "2", "4", "8");
        q(S2, "short tipi neçə bayt yer tutur?",
          "2", "1", "4", "8");
        q(S2, "int tipi neçə bayt yer tutur?",
          "4", "2", "8", "1");
        q(S2, "long tipi neçə bayt yer tutur?",
          "8", "4", "2", "16");
        q(S2, "float tipi neçə bayt yer tutur?",
          "4", "8", "2", "16");
        q(S2, "double tipi neçə bayt yer tutur?",
          "8", "4", "16", "2");
        q(S2, "char tipi neçə bayt yer tutur?",
          "2", "1", "4", "8");
        q(S2, "byte tipinin dəyər aralığı necədir?",
          "-128-dən 127-yə qədər", "0-dan 255-ə qədər", "-256-dan 255-ə qədər", "-127-dən 128-ə qədər");
        q(S2, "int tipinin ən böyük dəyəri nədir?",
          "2147483647", "32767", "65535", "999999999");
        q(S2, "Java-da neçə primitiv tip var?",
          "8", "6", "10", "4");
        q(S2, "Aşağıdakılardan hansı primitiv tip deyil?",
          "String", "int", "char", "double");
        q(S2, "int üçün wrapper sinfi hansıdır?",
          "Integer", "Int", "Number", "Intg");
        q(S2, "char üçün wrapper sinfi hansıdır?",
          "Character", "Char", "Letter", "Symbol");
        q(S2, "boolean üçün wrapper sinfi hansıdır?",
          "Boolean", "Bool", "Logical", "Binary");
        q(S2, "Primitiv tipin avtomatik olaraq wrapper obyektinə çevrilməsi necə adlanır?",
          "Autoboxing", "Casting", "Overloading", "Shadowing");
        q(S2, "long tipli dəyəri yazmaq üçün ədədin sonuna hansı hərf qoyulur?",
          "L", "D", "F", "S");
        q(S2, "float tipli ədəd yazmaq üçün sonluğa hansı hərf qoyulur?",
          "f", "l", "d", "s");
        q(S2, "char dəyəri hansı dırnaqla yazılır?",
          "Tək dırnaq 'A'", "Cüt dırnaq \"A\"", "Tərs dırnaq `A`", "Dırnaqsız");
        q(S2, "String dəyəri hansı dırnaqla yazılır?",
          "Cüt dırnaq \"mətn\"", "Tək dırnaq 'mətn'", "Tərs dırnaq `mətn`", "Mötərizə (mətn)");
        q(S2, "int x = 10 / 3; ifadəsində x neçəyə bərabərdir?",
          "3", "3.33", "4", "0");
        q(S2, "10 % 3 ifadəsinin nəticəsi nədir?",
          "1", "3", "0", "3.33");
        q(S2, "5 / 2 ifadəsinin nəticəsi (int ədədlər) nədir?",
          "2", "2.5", "3", "2.0");
        q(S2, "5 / 2.0 ifadəsinin nəticəsi nədir?",
          "2.5", "2", "3", "2.0");
        q(S2, "(double) 5 / 2 ifadəsinin nəticəsi nədir?",
          "2.5", "2.0", "2", "3");
        q(S2, "(double) (5 / 2) ifadəsinin nəticəsi nədir?",
          "2.0", "2.5", "2", "3.0");
        q(S2, "(int) 3.9 ifadəsinin nəticəsi nədir?",
          "3", "4", "3.9", "0");
        q(S2, "-7 / 2 ifadəsinin nəticəsi (int) nədir?",
          "-3", "-4", "-3.5", "3");
        q(S2, "-7 % 3 ifadəsinin nəticəsi nədir?",
          "-1", "1", "2", "-2");
        q(S2, "int x = 5; int y = x++; Bu kodda y neçədir?",
          "5", "6", "4", "0");
        q(S2, "int x = 5; int y = ++x; Bu kodda y neçədir?",
          "6", "5", "4", "7");
        q(S2, "int x = 4; x += 3; Bu kodda x neçədir?",
          "7", "4", "12", "3");
        q(S2, "int x = 4; x *= 2; Bu kodda x neçədir?",
          "8", "6", "2", "16");
        q(S2, "Məntiqi VƏ operatoru hansıdır?",
          "&&", "||", "!", "&|");
        q(S2, "Məntiqi VƏ YA operatoru hansıdır?",
          "||", "&&", "!", "??");
        q(S2, "Məntiqi inkar (NOT) operatoru hansıdır?",
          "!", "~~", "!=", "<>");
        q(S2, "Bərabər deyil operatoru hansıdır?",
          "!=", "<>", "=/=", "!==");
        q(S2, "Ternar operator necə yazılır?",
          "şərt ? dəyər1 : dəyər2", "şərt : dəyər1 ? dəyər2", "if ? then : else", "şərt -> dəyər1 | dəyər2");
        q(S2, "int a = 10; String s = a > 5 ? \"A\" : \"B\"; Bu kodda s nədir?",
          "A", "B", "10", "null");
        q(S2, "8 >> 1 ifadəsinin nəticəsi nədir?",
          "4", "16", "7", "9");
        q(S2, "1 << 3 ifadəsinin nəticəsi nədir?",
          "8", "3", "4", "13");
        q(S2, "5 & 3 ifadəsinin nəticəsi nədir?",
          "1", "7", "6", "8");
        q(S2, "5 | 3 ifadəsinin nəticəsi nədir?",
          "7", "1", "6", "2");
        q(S2, "5 ^ 3 ifadəsinin nəticəsi nədir?",
          "6", "1", "7", "8");
        q(S2, "Integer.MAX_VALUE + 1 ifadəsinin nəticəsi nədir?",
          "Mənfi ədəd (overflow)", "2147483648", "0", "Kompilyasiya xətası");
        q(S2, "0.1 + 0.2 == 0.3 ifadəsi nə qaytarır?",
          "false", "true", "0", "Xəta");
        q(S2, "char c = 'A'; (char)(c + 1) ifadəsinin nəticəsi nədir?",
          "'B'", "66", "'A1'", "Xəta");
        q(S2, "'a' + 1 ifadəsinin nəticəsi nədir?",
          "98", "'b'", "a1", "97");
        q(S2, "System.out.println('a' + 'b'); nə çap edir?",
          "195", "ab", "a b", "98");
        q(S2, "System.out.println(\"\" + 'a' + 'b'); nə çap edir?",
          "ab", "195", "a+b", "97 98");
        q(S2, "Math.max(3, 7) nəyi qaytarır?",
          "7", "3", "10", "4");
        q(S2, "Math.abs(-5) nəyi qaytarır?",
          "5", "-5", "0", "25");
        q(S2, "Math.pow(2, 3) nəyi qaytarır?",
          "8.0", "6", "9.0", "23");
        q(S2, "Math.sqrt(16) nəyi qaytarır?",
          "4.0", "8.0", "256", "4");
        q(S2, "Math.round(2.5) nəyi qaytarır?",
          "3", "2", "2.5", "2.0");
        q(S2, "Math.ceil(2.1) nəyi qaytarır?",
          "3.0", "2.0", "2", "2.1");
        q(S2, "Math.floor(2.9) nəyi qaytarır?",
          "2.0", "3.0", "3", "2.9");
        q(S2, "Math.random() hansı aralıqda ədəd qaytarır?",
          "0.0 daxil, 1.0 daxil deyil", "1-dən 100-ə", "0-dan 10-a", "-1-dən 1-ə");
        q(S2, "Integer.parseInt(\"123\") nəyi qaytarır?",
          "123 (int)", "\"123\" (String)", "123.0", "Xəta");
        q(S2, "Integer a = 127, b = 127; a == b ifadəsi nə qaytarır?",
          "true", "false", "0", "Xəta");
        q(S2, "Integer a = 1000, b = 1000; a == b ifadəsi nə qaytarır?",
          "false", "true", "1000", "Xəta");
        q(S2, "final açar sözü ilə elan olunmuş dəyişənə nə etmək olmaz?",
          "Dəyərini sonradan dəyişmək", "Oxumaq", "Metoda ötürmək", "Çap etmək");
        q(S2, "Boolean dəyişənin default (ilkin) dəyəri sinif sahəsi kimi nədir?",
          "false", "true", "null", "0");
        q(S2, "int tipli sinif sahəsinin default dəyəri nədir?",
          "0", "null", "-1", "undefined");
        q(S2, "Obyekt tipli sinif sahəsinin default dəyəri nədir?",
          "null", "0", "\"\"", "false");
        q(S2, "Lokal dəyişənə dəyər verilmədən istifadə edilsə nə olur?",
          "Kompilyasiya xətası", "Dəyəri 0 olur", "Dəyəri null olur", "Proqram avtomatik düzəldir");
        q(S2, "double d = 5; ifadəsi işləyirmi?",
          "Bəli, int avtomatik double-a çevrilir", "Xeyr, xəta verir", "Yalnız cast ilə", "Yalnız final ilə");
        q(S2, "int i = 5.5; ifadəsi nə verir?",
          "Kompilyasiya xətası", "i = 5", "i = 6", "i = 5.5");
        q(S2, "Ədədin cüt olub-olmadığını yoxlamaq üçün hansı ifadə işlədilir?",
          "n % 2 == 0", "n / 2 == 0", "n * 2 == 0", "n - 2 == 0");
        q(S2, "instanceof operatoru nə üçündür?",
          "Obyektin tipini yoxlamaq üçün", "Obyekt yaratmaq üçün", "Obyekti silmək üçün", "İki ədədi müqayisə etmək üçün");
        // ---------- JAVA ŞƏRT VƏ DÖVRLƏR ----------
        q(S3, "Şərti yoxlayan Java operatoru hansıdır?",
          "if", "when", "check", "cond");
        q(S3, "Əgər şərt ödənmirsə alternativ blok üçün hansı açar söz işlədilir?",
          "else", "otherwise", "elseif", "then");
        q(S3, "switch-də case-dən sonra break yazılmasa nə baş verir?",
          "Növbəti case-lər də icra olunur (fall-through)", "Proqram dayanır", "Xəta verir", "Heç nə olmur");
        q(S3, "switch-də heç bir case uyğun gəlmirsə hansı blok işləyir?",
          "default", "else", "otherwise", "none");
        q(S3, "do-while dövrünün while-dən fərqi nədir?",
          "Ən azı bir dəfə işləyir", "Heç vaxt işləmir", "Yalnız massivlərlə işləyir", "Sonsuz işləyir");
        q(S3, "for (int i = 0; i < 5; i++) dövrü neçə dəfə təkrarlanır?",
          "5", "4", "6", "0");
        q(S3, "for (int i = 1; i <= 10; i += 2) dövrü neçə dəfə təkrarlanır?",
          "5", "10", "4", "6");
        q(S3, "int s = 0; for (int i = 1; i <= 4; i++) s += i; Bu kodda s neçədir?",
          "10", "4", "24", "6");
        q(S3, "for (;;) dövrü necə işləyir?",
          "Sonsuz dövr", "Heç işləmir", "Bir dəfə işləyir", "Xəta verir");
        q(S3, "for (int x : arr) konstruksiyası necə adlanır?",
          "for-each dövrü", "while dövrü", "switch", "ternar dövr");
        q(S3, "for (int i = 0; i < 3; i++) System.out.print(i); nə çap edir?",
          "012", "123", "0123", "321");
        q(S3, "for (int i = 3; i > 0; i--) System.out.print(i); nə çap edir?",
          "321", "210", "123", "3210");
        q(S3, "int i = 0; while (i < 3) { i++; } Dövrdən sonra i neçədir?",
          "3", "2", "0", "4");
        q(S3, "int i = 10; do { i++; } while (i < 5); Dövrdən sonra i neçədir?",
          "11", "10", "5", "12");
        q(S3, "İç-içə iki dövr: xarici 3, daxili 4 dəfə işləyirsə, daxili blok cəmi neçə dəfə icra olunur?",
          "12", "7", "3", "4");
        q(S3, "int c = 0; for (int i = 0; i < 10; i++) { if (i % 2 == 0) c++; } Bu kodda c neçədir?",
          "5", "10", "4", "0");
        q(S3, "if (x = 5) Java-da nə verir (x int-dir)?",
          "Kompilyasiya xətası", "true", "false", "x-ə 5 mənimsədir və işləyir");
        q(S3, "Java 14+ switch ifadəsində ox sintaksisi necə yazılır?",
          "case 1 -> ...", "case 1 => ...", "case 1 :: ...", "case 1 >> ...");
        q(S3, "Switch String tipini dəstəkləyirmi?",
          "Bəli, Java 7-dən", "Xeyr", "Yalnız Java 5-də", "Yalnız enum ilə");
        q(S3, "Dövrdə continue nə edir?",
          "Cari təkrarı atlayıb növbətiyə keçir", "Dövrü bitirir", "Proqramı bitirir", "Dövrü yenidən başladır");
        q(S3, "Dövrdə break nə edir?",
          "Dövrü tamamilə bitirir", "Cari təkrarı atlayır", "Dövrü təkrar başladır", "Metoddan çıxır və dəyər qaytarır");
        q(S3, "false && (1 / 0 > 0) ifadəsi xəta verirmi?",
          "Xeyr, qısa dövrə (short-circuit) var", "Bəli, ArithmeticException", "Bəli, kompilyasiya xətası", "Yalnız Java 8-də");
        q(S3, "true || (1 / 0 > 0) ifadəsi xəta verirmi?",
          "Xeyr, ikinci hissə yoxlanmır", "Bəli, ArithmeticException", "Bəli, kompilyasiya xətası", "Yalnız debug rejimində");
        q(S3, "int x = 7; x % 2 == 0 ifadəsi nə qaytarır?",
          "false", "true", "1", "0");
        q(S3, "1-dən 5-ə qədər ədədlərin hasilini (faktorial) tapmaq üçün hansı ilkin dəyər lazımdır?",
          "1", "0", "5", "-1");
        q(S3, "5! (5 faktorial) neçəyə bərabərdir?",
          "120", "25", "60", "720");
        q(S3, "Dövrün şərti ilk dəfə yoxlananda false olarsa while dövrü neçə dəfə işləyir?",
          "0", "1", "Sonsuz", "2");
        q(S3, "Etiketli break (break outer;) nə üçündür?",
          "İç-içə dövrlərdən birdən çıxmaq üçün", "Sinif adı vermək üçün", "Metodu çağırmaq üçün", "Dəyişən elan etmək üçün");
        q(S3, "while (true) dövrünü hansı komanda dayandıra bilər?",
          "break", "skip", "exit-loop", "stop");
        q(S3, "Aşağıdakılardan hansı şərt operatoru deyil?",
          "loop", "if", "switch", "?:");
        // ---------- JAVA METODLAR ----------
        q(S4, "Eyni adlı, lakin fərqli parametrli metodların yazılması necə adlanır?",
          "Overloading", "Overriding", "Overflow", "Overwrite");
        q(S4, "Alt sinifdə üst sinfin metodunu eyni imza ilə yenidən yazmaq necə adlanır?",
          "Overriding", "Overloading", "Shadowing", "Wrapping");
        q(S4, "Metodun imzası (signature) nədən ibarətdir?",
          "Metod adı və parametr tipləri", "Yalnız qaytarma tipi", "Modifikator və sinif adı", "Yalnız metod adı");
        q(S4, "Yalnız qaytarma tipinə görə overloading etmək olarmı?",
          "Xeyr", "Bəli", "Yalnız static metodlar üçün", "Yalnız final metodlar üçün");
        q(S4, "Java-da arqumentlər metoda necə ötürülür?",
          "Dəyərlə (pass by value)", "Yalnız istinadla", "Yalnız göstəriciylə", "Adla");
        q(S4, "void change(int x) { x = 10; } int a = 5; change(a); Bundan sonra a neçədir?",
          "5", "10", "0", "15");
        q(S4, "void f(int[] arr) { arr[0] = 99; } int[] a = {1, 2}; f(a); Bundan sonra a[0] neçədir?",
          "99", "1", "2", "0");
        q(S4, "Dəyişən sayda parametr qəbul edən metod necə elan olunur?",
          "int... nums", "int[] nums...", "int nums*", "int ...nums[]");
        q(S4, "Rekursiv metodda dayanma şərti necə adlanır?",
          "Base case", "Loop case", "Final case", "Return case");
        q(S4, "Fibonacci ardıcıllığında fib(0)=0, fib(1)=1 olarsa fib(6) neçədir?",
          "8", "5", "13", "6");
        q(S4, "factorial(4) neçəyə bərabərdir?",
          "24", "10", "12", "16");
        q(S4, "static metodu necə çağırmaq olar?",
          "SinifAdı.metodAdı()", "obyekt yaratmadan adla çağırmaq mümkün deyil", "this.metodAdı()", "super.metodAdı()");
        q(S4, "Metodun daxilində elan olunan dəyişən necə adlanır?",
          "Lokal dəyişən", "Sinif sahəsi", "Qlobal sabit", "Statik sahə");
        q(S4, "Dəyər qaytaran metodda return olmasa nə baş verir?",
          "Kompilyasiya xətası", "Default dəyər qaytarılır", "null qaytarılır", "Proqram dayanır");
        q(S4, "Metodun daxilində return yazıldıqdan sonrakı kod nə olur?",
          "İcra olunmur (əlçatmaz kod)", "Normal icra olunur", "Yalnız bir dəfə işləyir", "Xəta atılır");
        q(S4, "Eyni sinifdə iki konstruktorun parametrləri fərqli olarsa bu nə adlanır?",
          "Konstruktor overloading", "Konstruktor overriding", "Konstruktor casting", "Konstruktor boxing");
        q(S4, "Rekursiyada dayanma şərti olmasa hansı xəta baş verir?",
          "StackOverflowError", "NullPointerException", "OutOfBounds", "NumberFormatException");
        q(S4, "Metodun adından əvvəl yazılan void nə deməkdir?",
          "Dəyər qaytarmır", "Boş dəyər qaytarır", "null qaytarır", "Metod private-dir");
        q(S4, "Metod parametri ilə arqument arasındakı fərq nədir?",
          "Parametr elan zamanı, arqument çağırış zamanı verilən dəyərdir", "Heç bir fərq yoxdur", "Parametr dəyərdir, arqument adıdır", "Arqument yalnız String ola bilər");
        q(S4, "Bir metodun başqa metodu çağırması mümkündürmü?",
          "Bəli", "Xeyr", "Yalnız main-də", "Yalnız static metodlarda");
        q(S4, "Metodun qaytardığı dəyəri istifadə etməmək olarmı?",
          "Bəli", "Xeyr, xəta verir", "Yalnız void metodlarda", "Yalnız String qaytaranda");
        q(S4, "Utility sinifdə köməkçi metodlar adətən necə elan olunur?",
          "public static", "private final", "protected abstract", "default void");
        q(S4, "Metodun qaytarma tipi int olarsa return ilə hansı dəyər qaytarıla bilər?",
          "42", "\"42\"", "true", "4.2");
        q(S4, "Metoda parametr kimi massiv ötürüləndə nə ötürülür?",
          "Massivin istinadı (referansı)", "Massivin tam surəti", "Yalnız ilk element", "Massivin uzunluğu");
        q(S4, "Eyni adlı iki metodun eyni parametrləri və eyni qaytarma tipi olarsa nə baş verir?",
          "Kompilyasiya xətası", "İkincisi işləyir", "Birincisi işləyir", "Overloading olur");
        // ---------- JAVA MASSIVLƏR ----------
        q(S5, "int[] a = new int[5]; massivinin elementlərinin ilkin dəyəri nədir?",
          "0", "null", "-1", "Təyin olunmayıb");
        q(S5, "Massivin uzunluğu necə tapılır?",
          "a.length", "a.length()", "a.size()", "a.count()");
        q(S5, "String[] s = new String[3]; massivinin elementləri ilkin olaraq nədir?",
          "null", "\"\"", "0", "\" \"");
        q(S5, "boolean[] b = new boolean[2]; elementlərin ilkin dəyəri nədir?",
          "false", "true", "null", "0");
        q(S5, "int[] a = {5, 3, 8}; a[1] neçədir?",
          "3", "5", "8", "1");
        q(S5, "3 elementli massivdə a[3]-ə müraciət etsək hansı xəta atılır?",
          "ArrayIndexOutOfBoundsException", "NullPointerException", "NumberFormatException", "ClassCastException");
        q(S5, "Massivi sıralamaq üçün hansı metod işlədilir?",
          "Arrays.sort()", "Arrays.order()", "Array.sort()", "Collections.sortArray()");
        q(S5, "Massivi mətnə çevirib çap etmək üçün hansı metod işlədilir?",
          "Arrays.toString()", "Array.print()", "Arrays.show()", "toText()");
        q(S5, "Massivi eyni dəyərlə doldurmaq üçün hansı metod işlədilir?",
          "Arrays.fill()", "Arrays.set()", "Arrays.all()", "Arrays.put()");
        q(S5, "Massivin surətini yaratmaq üçün hansı metod işlədilir?",
          "Arrays.copyOf()", "Arrays.cloneAll()", "Arrays.dup()", "Arrays.twin()");
        q(S5, "İki massivin məzmununu müqayisə etmək üçün hansı metod işlədilir?",
          "Arrays.equals()", "a == b", "a.compare(b)", "Arrays.same()");
        q(S5, "int[][] m = new int[3][4]; ifadəsində m.length neçədir?",
          "3", "4", "12", "7");
        q(S5, "int[][] m = new int[3][4]; ifadəsində m[0].length neçədir?",
          "4", "3", "12", "0");
        q(S5, "Massivin ölçüsü yaradıldıqdan sonra dəyişdirilə bilərmi?",
          "Xeyr", "Bəli", "Yalnız int massivlərdə", "Yalnız final olmayanlarda");
        q(S5, "Sıralanmış massivdə sürətli axtarış üçün hansı metod işlədilir?",
          "Arrays.binarySearch()", "Arrays.find()", "Arrays.search()", "Arrays.locate()");
        q(S5, "int[] a = new int[0]; a.length neçədir?",
          "0", "1", "-1", "null");
        q(S5, "Massivlər Java-da nədir?",
          "Obyektdir", "Primitiv tipdir", "Sinifdir", "Interfeysdir");
        q(S5, "İki massiv üçün a == b nəyi müqayisə edir?",
          "İstinadları (referansları)", "Bütün elementləri", "Yalnız uzunluğu", "Yalnız tipi");
        q(S5, "String[] s = new String[3]; s[0].length() nə verir?",
          "NullPointerException", "0", "3", "Kompilyasiya xətası");
        q(S5, "Massivin elementlərinin cəmini stream ilə tapmaq üçün hansı ifadə işlədilir?",
          "Arrays.stream(a).sum()", "Arrays.sum(a)", "a.sum()", "Stream.sum(a)");
        q(S5, "Massivi tərsinə çevirmək üçün Arrays sinfində hazır metod varmı?",
          "Xeyr, əl ilə yazmaq lazımdır", "Bəli, Arrays.reverse()", "Bəli, Arrays.flip()", "Bəli, Arrays.invert()");
        q(S5, "int[] a = {3, 1, 2}; Arrays.sort(a); Arrays.toString(a) nə qaytarır?",
          "[1, 2, 3]", "[3, 2, 1]", "[3, 1, 2]", "1 2 3");
        q(S5, "int[] a = {5, 3, 8}; Bu massivdə ən böyük element neçədir?",
          "8", "5", "3", "16");
        q(S5, "Massivi elan etməyin düzgün yolu hansıdır?",
          "int[] a = new int[5];", "int a = new int(5);", "array int a = 5;", "int a[5] = new;");
        q(S5, "Massivin sonuncu elementinin indeksi necə tapılır?",
          "a.length - 1", "a.length", "a.length + 1", "a.size()");
        q(S5, "Massivi dövrdə gəzmək üçün ən sadə yol hansıdır?",
          "for-each dövrü", "switch", "try-catch", "instanceof");
        q(S5, "Massivin surətini a.clone() ilə yaratmaq nəyi verir?",
          "Yeni massiv obyekti", "Eyni obyektə ikinci istinad", "Xəta", "null");
        q(S5, "int[] a = {1, 2}; int[] b = a; b[0] = 9; a[0] neçədir?",
          "9", "1", "2", "0");
        // ---------- JAVA STRING ----------
        q(S6, "String sinfi Java-da necədir?",
          "Dəyişməz (immutable)", "Dəyişə bilən (mutable)", "Primitiv tipdir", "Yalnız statikdir");
        q(S6, "\"salam\".length() neçədir?",
          "5", "4", "6", "0");
        q(S6, "\"Hello\".charAt(4) nəyi qaytarır?",
          "'o'", "'l'", "'H'", "Xəta");
        q(S6, "\"Java\".toUpperCase() nəyi qaytarır?",
          "\"JAVA\"", "\"java\"", "\"Java\"", "\"jAVA\"");
        q(S6, "\"Hello\".substring(1, 3) nəyi qaytarır?",
          "\"el\"", "\"ell\"", "\"He\"", "\"Hel\"");
        q(S6, "\"Hello\".substring(2) nəyi qaytarır?",
          "\"llo\"", "\"He\"", "\"ello\"", "\"lo\"");
        q(S6, "\"Hello\".indexOf(\"l\") nəyi qaytarır?",
          "2", "3", "1", "0");
        q(S6, "\"Hello\".lastIndexOf(\"l\") nəyi qaytarır?",
          "3", "2", "4", "1");
        q(S6, "Mətndə axtarılan simvol tapılmasa indexOf nəyi qaytarır?",
          "-1", "0", "null", "false");
        q(S6, "\"banana\".replace(\"a\", \"o\") nəyi qaytarır?",
          "\"bonono\"", "\"bonana\"", "\"banano\"", "\"bnn\"");
        q(S6, "\"  hi \".trim().length() neçədir?",
          "2", "3", "5", "4");
        q(S6, "\"\".isEmpty() nə qaytarır?",
          "true", "false", "null", "Xəta");
        q(S6, "\" \".isEmpty() nə qaytarır?",
          "false", "true", "null", "Xəta");
        q(S6, "\" \".isBlank() nə qaytarır?",
          "true", "false", "null", "Xəta");
        q(S6, "\"a,b,c\".split(\",\").length neçədir?",
          "3", "2", "5", "1");
        q(S6, "\"Hello World\".split(\" \")[1] nəyi qaytarır?",
          "\"World\"", "\"Hello\"", "\"Hello World\"", "\" \"");
        q(S6, "String.join(\"-\", \"a\", \"b\", \"c\") nəyi qaytarır?",
          "\"a-b-c\"", "\"abc\"", "\"a b c\"", "\"-a-b-c\"");
        q(S6, "Böyük-kiçik hərfə fikir vermədən iki mətni müqayisə edən metod hansıdır?",
          "equalsIgnoreCase()", "equalsNoCase()", "compareAll()", "sameText()");
        q(S6, "\"abc\".compareTo(\"abd\") nəyi qaytarır?",
          "-1", "1", "0", "3");
        q(S6, "\"abc\".contains(\"bc\") nə qaytarır?",
          "true", "false", "1", "Xəta");
        q(S6, "\"Hello\".startsWith(\"He\") nə qaytarır?",
          "true", "false", "2", "Xəta");
        q(S6, "\"Hello\".endsWith(\"lo\") nə qaytarır?",
          "true", "false", "3", "Xəta");
        q(S6, "\"a\" + 1 + 2 ifadəsinin nəticəsi nədir?",
          "\"a12\"", "\"a3\"", "\"3a\"", "Xəta");
        q(S6, "1 + 2 + \"a\" ifadəsinin nəticəsi nədir?",
          "\"3a\"", "\"12a\"", "\"a3\"", "Xəta");
        q(S6, "String s1 = \"hi\"; String s2 = \"hi\"; s1 == s2 nə qaytarır?",
          "true", "false", "null", "Xəta");
        q(S6, "String s1 = \"hi\"; String s2 = new String(\"hi\"); s1 == s2 nə qaytarır?",
          "false", "true", "null", "Xəta");
        q(S6, "String s1 = \"hi\"; String s2 = new String(\"hi\"); s1.equals(s2) nə qaytarır?",
          "true", "false", "null", "Xəta");
        q(S6, "Eyni mətn literallarının saxlandığı yaddaş sahəsi necə adlanır?",
          "String pool", "Char cache", "Text stack", "Literal queue");
        q(S6, "Dəyişə bilən mətn yaratmaq üçün hansı sinif işlədilir?",
          "StringBuilder", "StringConst", "MutableString", "TextBuilder");
        q(S6, "StringBuilder-də sona mətn əlavə edən metod hansıdır?",
          "append()", "add()", "push()", "concat()");
        q(S6, "new StringBuilder(\"abc\").reverse().toString() nəyi qaytarır?",
          "\"cba\"", "\"abc\"", "\"bca\"", "\"acb\"");
        q(S6, "StringBuilder-i String-ə çevirmək üçün hansı metod işlədilir?",
          "toString()", "asText()", "build()", "convert()");
        q(S6, "StringBuilder ilə StringBuffer arasındakı əsas fərq nədir?",
          "StringBuffer thread-safe-dir", "StringBuilder immutable-dir", "StringBuffer daha sürətlidir", "Fərq yoxdur");
        q(S6, "Mətni simvol massivinə çevirən metod hansıdır?",
          "toCharArray()", "toArray()", "chars()", "splitAll()");
        q(S6, "\"ab\".repeat(3) nəyi qaytarır?",
          "\"ababab\"", "\"aaabbb\"", "\"ab3\"", "\"ab ab ab\"");
        q(S6, "Java 15-də gələn \"\"\" ... \"\"\" konstruksiyası nə adlanır?",
          "Text block", "String pool", "Raw literal", "Doc string");
        q(S6, "String.format(\"%05d\", 42) nəyi qaytarır?",
          "\"00042\"", "\"42000\"", "\"42\"", "\"05d42\"");
        q(S6, "String.valueOf(123) nəyi qaytarır?",
          "\"123\"", "123", "123.0", "'123'");
        q(S6, "Character.isDigit('7') nə qaytarır?",
          "true", "false", "7", "Xəta");
        q(S6, "Character.isLetter('5') nə qaytarır?",
          "false", "true", "5", "Xəta");
        q(S6, "\"Java\".indexOf('v') nəyi qaytarır?",
          "2", "1", "3", "-1");
        q(S6, "\"Java\".substring(0, 1) nəyi qaytarır?",
          "\"J\"", "\"Ja\"", "\"a\"", "\"\"");
        q(S6, "\"hello\".toUpperCase().charAt(0) nəyi qaytarır?",
          "'H'", "'h'", "\"H\"", "'E'");
        q(S6, "String s = null; s.length() nə verir?",
          "NullPointerException", "0", "-1", "Kompilyasiya xətası");
        q(S6, "\"Java\".concat(\"21\") nəyi qaytarır?",
          "\"Java21\"", "\"21Java\"", "\"Java 21\"", "\"Java+21\"");
        q(S6, "Mətnin palindrom olub-olmadığını yoxlamaq üçün adətən hansı üsul istifadə olunur?",
          "Tərsinə çevirib orijinalla müqayisə etmək", "Yalnız uzunluğa baxmaq", "Böyük hərfə çevirmək", "Massivə çevirib sıralamaq");
        q(S6, "\"abc\".matches(\"[a-z]+\") nə qaytarır?",
          "true", "false", "\"abc\"", "Xəta");
        q(S6, "String dəyişməzdir sözü nə deməkdir?",
          "Yaradıldıqdan sonra məzmunu dəyişdirilmir", "Silinə bilməz", "Yalnız oxuna bilər", "Yalnız statik ola bilər");
        // ---------- JAVA OOP ----------
        q(S7, "Sinif ilə obyekt arasındakı fərq nədir?",
          "Sinif şablondur, obyekt onun nümunəsidir", "Obyekt şablondur, sinif nümunədir", "Eyni şeydir", "Sinif yalnız metodlardan ibarətdir");
        q(S7, "Konstruktorun adı necə olmalıdır?",
          "Sinif adı ilə eyni", "Həmişə init", "Həmişə create", "İstənilən ad");
        q(S7, "Konstruktorun qaytarma tipi nədir?",
          "Yoxdur (void də yazılmır)", "void", "int", "Sinif adı");
        q(S7, "Heç bir konstruktor yazılmayıbsa nə olur?",
          "Kompilyator default konstruktor əlavə edir", "Obyekt yaratmaq olmur", "Xəta verir", "Proqram dayanır");
        q(S7, "this() nə üçün istifadə olunur?",
          "Eyni sinfin başqa konstruktorunu çağırmaq üçün", "Üst sinfin konstruktorunu çağırmaq üçün", "Obyekti silmək üçün", "Metodu bitirmək üçün");
        q(S7, "super() nə üçün istifadə olunur?",
          "Üst sinfin konstruktorunu çağırmaq üçün", "Eyni sinfin konstruktorunu çağırmaq üçün", "Metodu override etmək üçün", "Obyekti klonlamaq üçün");
        q(S7, "this açar sözü nəyə istinad edir?",
          "Cari obyektə", "Üst sinfə", "Növbəti obyektə", "Sinfin özünə, obyektsiz");
        q(S7, "OOP-nin dörd əsas prinsipi hansılardır?",
          "İnkapsulyasiya, varislik, polimorfizm, abstraksiya", "Dövr, şərt, massiv, metod", "Heap, stack, pool, cache", "Frontend, backend, baza, server");
        q(S7, "Abstraksiya nə deməkdir?",
          "Mürəkkəb detalları gizlədib yalnız vacib hissəni göstərmək", "Sinfi silmək", "Dəyişəni dəyişdirmək", "Kodu kompilyasiya etmək");
        q(S7, "abstract sinifdən birbaşa obyekt yaratmaq olarmı?",
          "Xeyr", "Bəli", "Yalnız static ilə", "Yalnız main-də");
        q(S7, "abstract metodun gövdəsi olurmu?",
          "Xeyr, gövdəsi olmur", "Bəli, həmişə", "Yalnız boş gövdə", "Yalnız static olanda");
        q(S7, "Bir sinif neçə sinifdən miras ala bilər?",
          "Yalnız bir", "İki", "Üç", "Sınırsız");
        q(S7, "Bir sinif neçə interfeysi həyata keçirə bilər?",
          "İstənilən sayda", "Yalnız bir", "Yalnız iki", "Heç birini");
        q(S7, "İnterfeysdəki sahələr (field) default olaraq necədir?",
          "public static final", "private", "protected", "yalnız static");
        q(S7, "Java 8-dən interfeysdə gövdəli metod üçün hansı açar söz işlədilir?",
          "default", "final", "open", "body");
        q(S7, "Sahələri private edib getter/setter ilə əlçatan etmək hansı prinsipdir?",
          "İnkapsulyasiya", "Varislik", "Polimorfizm", "Rekursiya");
        q(S7, "protected modifikatoru haradan əlçatandır?",
          "Eyni paketdən və alt siniflərdən", "Yalnız eyni sinifdən", "Hər yerdən", "Yalnız başqa paketlərdən");
        q(S7, "Modifikator yazılmasa (default) sahə haradan əlçatandır?",
          "Yalnız eyni paketdən", "Hər yerdən", "Yalnız eyni sinifdən", "Yalnız alt siniflərdən");
        q(S7, "static sahə kimə məxsusdur?",
          "Sinfə, bütün obyektlər üçün ortaqdır", "Hər obyektin öz nüsxəsi var", "Yalnız main metoduna", "Yalnız interfeysə");
        q(S7, "final sinif haqqında nə doğrudur?",
          "Ondan miras almaq olmaz", "Obyekt yaratmaq olmaz", "Metodu yoxdur", "Yalnız static ola bilər");
        q(S7, "final metod haqqında nə doğrudur?",
          "Alt sinifdə override edilə bilməz", "Çağırıla bilməz", "Yalnız static ola bilər", "Parametr qəbul etmir");
        q(S7, "Java-da bütün siniflərin əcdadı hansı sinifdir?",
          "Object", "Main", "Base", "Class");
        q(S7, "Object sinfinin toString() metodu default olaraq nə qaytarır?",
          "SinifAdı@hashKod", "Sahələrin dəyərlərini", "Boş mətn", "Sinfin yolu");
        q(S7, "equals() override edilirsə hansı metod da override edilməlidir?",
          "hashCode()", "toString()", "clone()", "finalize()");
        q(S7, "@Override annotasiyası nə üçündür?",
          "Metodun üst sinifdən override edildiyini yoxlamaq üçün", "Metodu gizlətmək üçün", "Metodu static etmək üçün", "Xətaları susdurmaq üçün");
        q(S7, "Animal a = new Dog(); ifadəsi hansı anlayışı göstərir?",
          "Upcasting və polimorfizm", "Overloading", "Autoboxing", "Serializasiya");
        q(S7, "Animal a = new Dog(); a.speak() çağırılanda hansı metod işləyir?",
          "Dog-un override etdiyi metod", "Həmişə Animal-ın metodu", "Hər ikisi", "Heç biri");
        q(S7, "Animal a = new Dog(); a.bark() (bark yalnız Dog-dadır) nə verir?",
          "Kompilyasiya xətası", "Normal işləyir", "null qaytarır", "ClassCastException");
        q(S7, "Kompilyasiya zamanı seçilən polimorfizm növü hansıdır?",
          "Overloading", "Overriding", "Casting", "Boxing");
        q(S7, "İcra zamanı seçilən polimorfizm növü hansıdır?",
          "Overriding", "Overloading", "Autoboxing", "Shadowing");
        q(S7, "Sabit dəyərlər toplusunu yaratmaq üçün hansı konstruksiya istifadə olunur?",
          "enum", "record", "interface", "abstract");
        q(S7, "Enum-un bütün sabitlərini massiv kimi almaq üçün hansı metod işlədilir?",
          "values()", "getAll()", "list()", "toArray()");
        q(S7, "Java 16-da gələn record nə üçündür?",
          "Dəyişməz məlumat daşıyan sinif yaratmaq üçün", "Fayla yazmaq üçün", "Verilənlər bazası cədvəli üçün", "Thread yaratmaq üçün");
        q(S7, "Başqa sinfin daxilində elan olunan sinif necə adlanır?",
          "Nested (daxili) sinif", "Super sinif", "Final sinif", "Abstract paket");
        q(S7, "Adı olmayan, yerindəcə yaradılan sinif necə adlanır?",
          "Anonim sinif", "Daxili enum", "Lokal paket", "Gizli interfeys");
        q(S7, "Yalnız bir obyektin yaradılmasına icazə verən dizayn nümunəsi hansıdır?",
          "Singleton", "Factory", "Observer", "Builder");
        q(S7, "Singleton üçün konstruktor necə elan olunur?",
          "private", "public", "abstract", "static");
        q(S7, "\"is-a\" münasibəti hansı anlayışa uyğundur?",
          "Varislik", "Kompozisiya", "Aqreqasiya", "Statik bağlama");
        q(S7, "\"has-a\" münasibəti hansı anlayışa uyğundur?",
          "Kompozisiya", "Varislik", "Overriding", "Polimorfizm");
        q(S7, "Alt sinif obyekti yaradılanda əvvəlcə hansı konstruktor işləyir?",
          "Üst sinfin konstruktoru", "Alt sinfin konstruktoru", "Hər ikisi eyni anda", "Heç biri");
        q(S7, "Alt sinif konstruktorunda super() yazılmayıbsa nə baş verir?",
          "Üst sinfin parametrsiz konstruktoru avtomatik çağırılır", "Xəta verir", "Heç nə çağırılmır", "Alt sinif işləmir");
        q(S7, "private metodu override etmək olarmı?",
          "Xeyr", "Bəli", "Yalnız eyni paketdə", "Yalnız static ilə");
        q(S7, "class Counter { static int count; Counter() { count++; } } Üç obyekt yaradılsa count neçə olar?",
          "3", "1", "0", "2");
        q(S7, "Abstract sinifin interfeysdən fərqlərindən biri nədir?",
          "Abstract sinifdə konstruktor və adi sahələr ola bilər", "Interfeysdə konstruktor var", "Abstract sinifdən çoxlu miras olur", "Heç bir fərq yoxdur");
        q(S7, "Comparable interfeysində hansı metod var?",
          "compareTo()", "compare()", "equals()", "sort()");
        q(S7, "Comparator interfeysində hansı metod var?",
          "compare()", "compareTo()", "order()", "sort()");
        q(S7, "Runnable interfeysində hansı metod var?",
          "run()", "start()", "execute()", "call()");
        q(S7, "POJO nədir?",
          "Sadə, xüsusi çərçivəyə bağlı olmayan Java obyekti", "Verilənlər bazası növü", "Java kompilyatoru", "Build alətinin adı");
        q(S7, "Java-da obyektin sinfini öyrənmək üçün hansı metod işlədilir?",
          "getClass()", "typeOf()", "classOf()", "whatClass()");
        q(S7, "Bir sinfin ancaq bir işi görməsi prinsipi SOLID-də hansıdır?",
          "Single Responsibility", "Open/Closed", "Liskov Substitution", "Dependency Inversion");
        q(S7, "null olan obyektin metodunu çağırsaq nə baş verir?",
          "NullPointerException", "0 qaytarılır", "Boş mətn qaytarılır", "Kompilyasiya xətası");
        q(S7, "Obyektin sahələrinə sinifdən kənarda birbaşa müraciəti məhdudlaşdırmaq üçün hansı modifikator işlədilir?",
          "private", "public", "static", "final");
        q(S7, "Static blok nə vaxt işləyir?",
          "Sinif yaddaşa yüklənəndə", "Hər obyekt yaranarkən", "Proqram bitəndə", "Metod çağırılanda");
        q(S7, "Eyni sinfin iki obyektinin sahələri eyni olsa belə == nə qaytarır?",
          "false (fərqli obyektlərdir)", "true", "null", "Xəta");
        q(S7, "getter metodu nə üçündür?",
          "Private sahənin dəyərini oxumaq üçün", "Sahənin dəyərini dəyişmək üçün", "Obyekti silmək üçün", "Sinfi gizlətmək üçün");
        q(S7, "setter metodu nə üçündür?",
          "Private sahənin dəyərini təyin etmək üçün", "Sahənin dəyərini oxumaq üçün", "Obyekti silmək üçün", "Sinfi kompilyasiya etmək üçün");
        q(S7, "abstract və final açar sözləri bir sinifdə birlikdə işlənə bilərmi?",
          "Xeyr", "Bəli", "Yalnız metodda", "Yalnız interfeysdə");
        // ---------- JAVA COLLECTIONS ----------
        q(S8, "Collection framework-də əsas interfeyslər hansılardır?",
          "List, Set, Map, Queue", "Array, String, int, char", "File, Path, Reader, Writer", "Thread, Runnable, Lock, Task");
        q(S8, "ArrayList-ə element əlavə edən metod hansıdır?",
          "add()", "push()", "insertEnd()", "append()");
        q(S8, "ArrayList-dən indeksə görə element götürən metod hansıdır?",
          "get(index)", "at(index)", "item(index)", "read(index)");
        q(S8, "ArrayList-in ölçüsünü verən metod hansıdır?",
          "size()", "length()", "count()", "length");
        q(S8, "ArrayList-də elementin olub-olmadığını yoxlayan metod hansıdır?",
          "contains()", "has()", "exists()", "includes()");
        q(S8, "ArrayList-i tamamilə təmizləyən metod hansıdır?",
          "clear()", "deleteAll()", "empty()", "reset()");
        q(S8, "ArrayList təkrarlanan elementlərə icazə verirmi?",
          "Bəli", "Xeyr", "Yalnız String üçün", "Yalnız sıralanmışsa");
        q(S8, "List<Integer> l = new ArrayList<>(List.of(10, 20, 30)); l.remove(1); Nəticədə list necədir?",
          "[10, 30]", "[20, 30]", "[10, 20]", "[10, 20, 30]");
        q(S8, "List<Integer> l = new ArrayList<>(List.of(10, 20, 30)); l.remove(Integer.valueOf(10)); Nəticədə list necədir?",
          "[20, 30]", "[10, 30]", "[10, 20]", "[30]");
        q(S8, "LinkedList hansı halda ArrayList-dən üstündür?",
          "Ortada tez-tez əlavə və silmə olanda", "İndekslə tez-tez oxuyanda", "Yaddaşa qənaət lazım olanda", "Sıralama lazım olanda");
        q(S8, "ArrayList-də get(index) əməliyyatının mürəkkəbliyi nədir?",
          "O(1)", "O(n)", "O(log n)", "O(n²)");
        q(S8, "LinkedList-də get(index) əməliyyatının mürəkkəbliyi nədir?",
          "O(n)", "O(1)", "O(log n)", "O(2)");
        q(S8, "HashMap-də get əməliyyatının orta mürəkkəbliyi nədir?",
          "O(1)", "O(n)", "O(n²)", "O(n log n)");
        q(S8, "HashSet təkrarlanan elementlə necə davranır?",
          "Təkrarı əlavə etmir", "Xəta atır", "Köhnəsini silir", "İkisini də saxlayır");
        q(S8, "HashSet-ə \"a\", \"b\", \"a\" əlavə etsək ölçüsü neçə olar?",
          "2", "3", "1", "0");
        q(S8, "LinkedHashSet-in HashSet-dən fərqi nədir?",
          "Əlavə olunma sırasını saxlayır", "Təkrarlara icazə verir", "Sıralanmış saxlayır", "Yalnız rəqəm saxlayır");
        q(S8, "TreeSet elementləri necə saxlayır?",
          "Sıralanmış şəkildə", "Təsadüfi sırada", "Əlavə sırasında", "Tərs sırada, həmişə");
        q(S8, "HashMap-ə yeni açar-dəyər əlavə edən metod hansıdır?",
          "put()", "add()", "insert()", "set()");
        q(S8, "HashMap-dən açara görə dəyər alan metod hansıdır?",
          "get()", "find()", "fetch()", "read()");
        q(S8, "HashMap-də açarın olub-olmadığını yoxlayan metod hansıdır?",
          "containsKey()", "hasKey()", "keyExists()", "findKey()");
        q(S8, "Açar olmadıqda dəyər əvəzinə default vermək üçün hansı metod işlədilir?",
          "getOrDefault()", "getElse()", "orDefault()", "tryGet()");
        q(S8, "HashMap-də mövcud olmayan açarla get() çağırsaq nə qaytarılır?",
          "null", "0", "Xəta atılır", "Boş mətn");
        q(S8, "HashMap-ə eyni açarla iki dəfə put etsək nə baş verir?",
          "Köhnə dəyər əvəz olunur", "Xəta atılır", "İki dəyər saxlanılır", "İkinci put ignor edilir");
        q(S8, "HashMap-in bütün açarlarını almaq üçün hansı metod işlədilir?",
          "keySet()", "keys()", "getKeys()", "allKeys()");
        q(S8, "HashMap-in bütün dəyərlərini almaq üçün hansı metod işlədilir?",
          "values()", "valueList()", "getValues()", "allValues()");
        q(S8, "HashMap-i açar-dəyər cütləri ilə gəzmək üçün hansı metod uyğundur?",
          "entrySet()", "pairs()", "items()", "cells()");
        q(S8, "TreeMap açarları necə saxlayır?",
          "Sıralanmış", "Təsadüfi", "Əlavə sırası ilə", "Dəyərə görə");
        q(S8, "LinkedHashMap-in xüsusiyyəti nədir?",
          "Əlavə sırasını saxlayır", "Açarları sıralayır", "Thread-safe-dir", "Təkrar açara icazə verir");
        q(S8, "Stack hansı prinsiplə işləyir?",
          "LIFO (son girən birinci çıxır)", "FIFO (ilk girən birinci çıxır)", "Təsadüfi", "Sıralı");
        q(S8, "Queue hansı prinsiplə işləyir?",
          "FIFO (ilk girən birinci çıxır)", "LIFO", "Təsadüfi", "Ən böyük birinci");
        q(S8, "Stack-ə element əlavə edən metod hansıdır?",
          "push()", "add-top()", "put()", "insert()");
        q(S8, "Stack-in ən üstündən elementi çıxaran metod hansıdır?",
          "pop()", "remove-top()", "poll-last()", "take()");
        q(S8, "Stack-ə 1, 2, 3 push edilib. pop() nəyi qaytarır?",
          "3", "1", "2", "null");
        q(S8, "Queue-ya 1, 2, 3 offer edilib. poll() nəyi qaytarır?",
          "1", "3", "2", "null");
        q(S8, "PriorityQueue-ya 5, 1, 3 əlavə edilib. poll() nəyi qaytarır?",
          "1", "5", "3", "null");
        q(S8, "Hər iki ucdan əlavə və silməyə imkan verən interfeys hansıdır?",
          "Deque", "Set", "Map", "Iterator");
        q(S8, "Deque üçün çox istifadə olunan sinif hansıdır?",
          "ArrayDeque", "ArraySet", "DequeMap", "StackList");
        q(S8, "Siyahını sıralamaq üçün hansı metod işlədilir?",
          "Collections.sort()", "Collections.order()", "List.arrange()", "Collections.arrange()");
        q(S8, "Siyahıdakı ən böyük elementi tapmaq üçün hansı metod işlədilir?",
          "Collections.max()", "Collections.top()", "Collections.biggest()", "List.largest()");
        q(S8, "Collections.max(List.of(3, 9, 4)) nəyi qaytarır?",
          "9", "3", "4", "16");
        q(S8, "Collections.frequency(List.of(1, 2, 1, 1), 1) nəyi qaytarır?",
          "3", "1", "2", "4");
        q(S8, "Siyahını təsadüfi qarışdırmaq üçün hansı metod işlədilir?",
          "Collections.shuffle()", "Collections.mix()", "Collections.random()", "Collections.scatter()");
        q(S8, "Siyahını tərsinə çevirmək üçün hansı metod işlədilir?",
          "Collections.reverse()", "Collections.flip()", "Collections.invert()", "Collections.back()");
        q(S8, "Dəyişdirilə bilməyən siyahı yaratmaq üçün hansı metod işlədilir?",
          "List.of()", "List.new()", "List.fixed()", "List.final()");
        q(S8, "List.of(1, 2).add(3) nə verir?",
          "UnsupportedOperationException", "[1, 2, 3]", "[3, 1, 2]", "null");
        q(S8, "List.of(\"a\", \"b\", \"c\", \"d\").subList(1, 3) nəyi qaytarır?",
          "[b, c]", "[a, b, c]", "[b, c, d]", "[a, b]");
        q(S8, "Kolleksiyanı dövrdə gəzərkən onu dəyişsək hansı xəta baş verir?",
          "ConcurrentModificationException", "NullPointerException", "ClassCastException", "NumberFormatException");
        q(S8, "Kolleksiya elementlərini təhlükəsiz silmək üçün hansı vasitə uyğundur?",
          "Iterator.remove()", "for-each daxilində remove()", "Arrays.remove()", "String.remove()");
        q(S8, "Iterator-un növbəti element olub-olmadığını yoxlayan metodu hansıdır?",
          "hasNext()", "next()", "hasMore()", "isNext()");
        q(S8, "List<int> yazmaq niyə düzgün deyil?",
          "Generics primitiv tipləri qəbul etmir", "int çox kiçikdir", "List yalnız String saxlayır", "Sintaksis dəyişib");
        q(S8, "Primitiv ədədləri List-də saxlamaq üçün nə yazılır?",
          "List<Integer>", "List<integer>", "List<Number[]>", "List<Int>");
        q(S8, "Map-in hər bir açar-dəyər cütünü təmsil edən tip hansıdır?",
          "Map.Entry", "Map.Pair", "Map.Item", "Map.Cell");
        q(S8, "Map interfeysi Collection interfeysindən miras alırmı?",
          "Xeyr", "Bəli", "Yalnız TreeMap", "Yalnız HashMap");
        q(S8, "Diamond operatoru (<>) nə üçündür?",
          "Generic tipini kompilyatorun müəyyən etməsi üçün", "Müqayisə üçün", "Massiv elanı üçün", "Şərh üçün");
        q(S8, "Siyahıdan şərtə uyğun elementləri silən metod hansıdır?",
          "removeIf()", "deleteIf()", "filterOut()", "dropWhen()");
        q(S8, "Kolleksiyanın hər elementi üçün əməliyyat yerinə yetirən metod hansıdır?",
          "forEach()", "each()", "iterateAll()", "loop()");
        q(S8, "Thread-safe Map üçün müasir seçim hansıdır?",
          "ConcurrentHashMap", "HashMap", "TreeMap", "LinkedHashMap");
        q(S8, "Köhnə, sinxronlaşdırılmış Map sinfi hansıdır?",
          "Hashtable", "HashMap", "TreeMap", "EnumMap");
        q(S8, "HashMap-də null açara icazə verilirmi?",
          "Bəli, bir dənə", "Xeyr", "Yalnız iki dənə", "Sınırsız sayda");
        q(S8, "ArrayList-də elementi dəyişmək üçün hansı metod işlədilir?",
          "set(index, value)", "replace(value)", "update(index)", "change(value)");
        q(S8, "ArrayList-də elementin indeksini tapan metod hansıdır?",
          "indexOf()", "find()", "search()", "position()");
        q(S8, "Siyahını massivə çevirən metod hansıdır?",
          "toArray()", "asArray()", "convert()", "listToArray()");
        q(S8, "TreeSet-ə 3, 1, 2 əlavə edilib. Çap olunan nəticə necədir?",
          "[1, 2, 3]", "[3, 1, 2]", "[3, 2, 1]", "[1, 3, 2]");
        // ---------- JAVA EXCEPTIONS ----------
        q(S9, "Bütün xətaların və istisnaların ən üst sinfi hansıdır?",
          "Throwable", "Exception", "Error", "RuntimeException");
        q(S9, "Checked exception nədir?",
          "Kompilyasiya zamanı yoxlanılan və ya throws ilə bildirilən istisna", "Yalnız icra zamanı baş verən istisna", "Yalnız Error alt sinifləri", "Susdurula bilən xəbərdarlıq");
        q(S9, "Aşağıdakılardan hansı checked exception-dur?",
          "IOException", "NullPointerException", "ArithmeticException", "IllegalArgumentException");
        q(S9, "Aşağıdakılardan hansı unchecked exception-dur?",
          "NullPointerException", "IOException", "FileNotFoundException", "InterruptedException");
        q(S9, "RuntimeException-ın alt sinifləri hansı kateqoriyaya aiddir?",
          "Unchecked", "Checked", "Error", "Warning");
        q(S9, "int-i 0-a bölmək (5 / 0) hansı xətanı verir?",
          "ArithmeticException", "NullPointerException", "NumberFormatException", "IOException");
        q(S9, "5.0 / 0 ifadəsi nəyi qaytarır?",
          "Infinity", "ArithmeticException", "0", "NaN");
        q(S9, "Integer.parseInt(\"abc\") hansı xətanı verir?",
          "NumberFormatException", "ClassCastException", "ArithmeticException", "IOException");
        q(S9, "new ArrayList<>().get(0) hansı xətanı verir?",
          "IndexOutOfBoundsException", "NullPointerException", "NumberFormatException", "InputMismatchException");
        q(S9, "\"abc\".charAt(5) hansı xətanı verir?",
          "StringIndexOutOfBoundsException", "ArrayIndexOutOfBoundsException", "NullPointerException", "NumberFormatException");
        q(S9, "Object o = \"text\"; Integer i = (Integer) o; hansı xətanı verir?",
          "ClassCastException", "NumberFormatException", "NullPointerException", "ArithmeticException");
        q(S9, "Scanner nextInt() çağırılanda mətn daxil edilsə hansı xəta atılır?",
          "InputMismatchException", "NumberFormatException", "IOException", "ClassCastException");
        q(S9, "Sonsuz rekursiya hansı xətaya səbəb olur?",
          "StackOverflowError", "OutOfMemoryError", "NullPointerException", "ArithmeticException");
        q(S9, "Yaddaş tükənəndə hansı xəta baş verir?",
          "OutOfMemoryError", "StackOverflowError", "NumberFormatException", "IOException");
        q(S9, "StackOverflowError hansı kateqoriyaya aiddir?",
          "Error", "Checked exception", "RuntimeException", "Warning");
        q(S9, "finally bloku nə vaxt işləyir?",
          "Xəta olsa da olmasa da", "Yalnız xəta olanda", "Yalnız xəta olmayanda", "Heç vaxt");
        q(S9, "finally blokunun işləməməsinə səbəb ola biləcək hal hansıdır?",
          "System.exit() çağırışı", "return yazmaq", "catch bloku", "Dəyişən elanı");
        q(S9, "throw açar sözü nə edir?",
          "İstisna obyektini atır", "İstisnanı tutur", "Metodun istisna atdığını bildirir", "İstisnanı silir");
        q(S9, "throws açar sözü nə edir?",
          "Metodun istisna ata biləcəyini bildirir", "İstisna obyektini atır", "İstisnanı tutur", "İstisnanı gizlədir");
        q(S9, "Öz istisna sinfini yaratmaq üçün hansı sinifdən miras almaq lazımdır?",
          "Exception", "Thread", "String", "Runnable");
        q(S9, "try-with-resources konstruksiyası nə üçündür?",
          "Resursları avtomatik bağlamaq üçün", "Sürəti artırmaq üçün", "İstisnaları gizlətmək üçün", "Thread yaratmaq üçün");
        q(S9, "try-with-resources-da resurs hansı interfeysi həyata keçirməlidir?",
          "AutoCloseable", "Runnable", "Comparable", "Serializable");
        q(S9, "Bir catch blokunda bir neçə istisnanı tutmaq üçün hansı simvol işlədilir?",
          "|", "&", ",", "+");
        q(S9, "Bir neçə catch blokunda hansı sıra düzgündür?",
          "Xüsusi istisnalar əvvəl, ümumi sonda", "Ümumi əvvəl, xüsusi sonda", "Fərq etmir", "Yalnız bir catch ola bilər");
        q(S9, "İstisna mesajını almaq üçün hansı metod işlədilir?",
          "getMessage()", "getText()", "message()", "readError()");
        q(S9, "İstisnanın stack izini çap edən metod hansıdır?",
          "printStackTrace()", "showTrace()", "printError()", "dumpAll()");
        q(S9, "Yanlış arqument ötürüləndə adətən hansı istisna atılır?",
          "IllegalArgumentException", "IOException", "StackOverflowError", "ArithmeticException");
        q(S9, "Obyekt uyğun olmayan vəziyyətdə olanda adətən hansı istisna atılır?",
          "IllegalStateException", "NumberFormatException", "IOException", "ArithmeticException");
        q(S9, "Fayl tapılmayanda hansı istisna atılır?",
          "FileNotFoundException", "NullPointerException", "ClassCastException", "NumberFormatException");
        q(S9, "Thread.sleep() hansı checked istisnanı ata bilər?",
          "InterruptedException", "IOException", "FileNotFoundException", "ArithmeticException");
        q(S9, "Checked istisna atan metodu çağıranda nə etmək lazımdır?",
          "try-catch ilə tutmaq və ya throws ilə bildirmək", "Heç nə", "Yalnız finally yazmaq", "Metodu static etmək");
        q(S9, "catch blokunu boş qoymaq niyə pis təcrübədir?",
          "Xəta gizlənir və problemi tapmaq çətinləşir", "Proqram kompilyasiya olmur", "Sürət azalır", "Java buna icazə vermir");
        q(S9, "try bloku olmadan catch yazmaq olarmı?",
          "Xeyr", "Bəli", "Yalnız finally ilə", "Yalnız static metodda");
        q(S9, "String s = null; s.length() hansı xətanı verir?",
          "NullPointerException", "IllegalStateException", "ArithmeticException", "IOException");
        // ---------- JAVA GENERICS VƏ STREAM ----------
        q(S10, "Generics-in əsas faydası nədir?",
          "Tip təhlükəsizliyi və təkrar kodun azalması", "Proqramın sürətini iki dəfə artırması", "Yaddaşı azaltması", "Xətaları gizlətməsi");
        q(S10, "Generic sinifdə <T> nə deməkdir?",
          "Tip parametri", "Thread tipi", "Text tipi", "Test tipi");
        q(S10, "Generics-də ? simvolu nə adlanır?",
          "Wildcard", "Placeholder", "Nullable", "Varargs");
        q(S10, "Lambda ifadəsinin sintaksisi hansıdır?",
          "(a, b) -> a + b", "(a, b) => a + b", "function(a, b) a + b", "lambda a, b: a + b");
        q(S10, "Funksional interfeys nədir?",
          "Yalnız bir abstrakt metodu olan interfeys", "Yalnız static metodları olan interfeys", "Heç bir metodu olmayan interfeys", "Yalnız default metodları olan sinif");
        q(S10, "Funksional interfeysi işarələyən annotasiya hansıdır?",
          "@FunctionalInterface", "@Lambda", "@Functional", "@Single");
        q(S10, "Predicate interfeysinin əsas metodu hansıdır?",
          "test()", "apply()", "accept()", "get()");
        q(S10, "Function interfeysinin əsas metodu hansıdır?",
          "apply()", "test()", "accept()", "run()");
        q(S10, "Consumer interfeysinin əsas metodu hansıdır?",
          "accept()", "get()", "test()", "apply()");
        q(S10, "Supplier interfeysinin əsas metodu hansıdır?",
          "get()", "accept()", "test()", "set()");
        q(S10, "Method reference üçün hansı operator işlədilir?",
          "::", "->", "=>", "->>");
        q(S10, "Stream-dən elementləri şərtə görə süzən metod hansıdır?",
          "filter()", "select()", "where()", "find()");
        q(S10, "Stream-də hər elementi çevirən metod hansıdır?",
          "map()", "convert()", "change()", "transform()");
        q(S10, "Stream-in nəticəsini siyahıya yığan metod hansıdır?",
          "collect() / toList()", "gather()", "pack()", "build()");
        q(S10, "Stream-də elementlərin sayını verən metod hansıdır?",
          "count()", "size()", "length()", "total()");
        q(S10, "Stream-dəki təkrarları silən metod hansıdır?",
          "distinct()", "unique()", "removeDup()", "single()");
        q(S10, "Stream-də ilk n elementi götürən metod hansıdır?",
          "limit()", "first()", "take()", "head()");
        q(S10, "Stream-də elementləri sıralayan metod hansıdır?",
          "sorted()", "order()", "arrange()", "sortBy()");
        q(S10, "Stream.of(1, 2, 3, 4).filter(x -> x % 2 == 0).count() nəyi qaytarır?",
          "2", "4", "1", "3");
        q(S10, "Stream.of(1, 2, 3).map(x -> x * x).toList() nəyi qaytarır?",
          "[1, 4, 9]", "[1, 2, 3]", "[2, 4, 6]", "[1, 8, 27]");
        q(S10, "Stream.of(1, 2, 3, 4).reduce(0, Integer::sum) nəyi qaytarır?",
          "10", "4", "24", "0");
        q(S10, "Stream.of(1, 1, 2).distinct().toList() nəyi qaytarır?",
          "[1, 2]", "[1, 1, 2]", "[2]", "[1]");
        q(S10, "Stream.of(1, 2, 3).limit(2).toList() nəyi qaytarır?",
          "[1, 2]", "[2, 3]", "[1, 2, 3]", "[3]");
        q(S10, "IntStream.range(0, 5).sum() nəyi qaytarır?",
          "10", "15", "5", "4");
        q(S10, "IntStream.rangeClosed(1, 5).sum() nəyi qaytarır?",
          "15", "10", "5", "6");
        q(S10, "Stream.of(\"a\", \"b\").collect(Collectors.joining(\",\")) nəyi qaytarır?",
          "\"a,b\"", "\"ab\"", "\"[a, b]\"", "\"a b\"");
        q(S10, "Stream əməliyyatları orijinal kolleksiyanı dəyişirmi?",
          "Xeyr", "Bəli", "Yalnız sorted()", "Yalnız filter()");
        q(S10, "Eyni Stream obyektini iki dəfə istifadə etsək nə baş verir?",
          "IllegalStateException", "İki dəfə işləyir", "Boş nəticə qaytarır", "Kompilyasiya xətası");
        q(S10, "Stream-də ən az bir elementin şərti ödəyib-ödəmədiyini yoxlayan metod hansıdır?",
          "anyMatch()", "someMatch()", "hasAny()", "oneMatch()");
        q(S10, "Stream-də bütün elementlərin şərti ödədiyini yoxlayan metod hansıdır?",
          "allMatch()", "everyMatch()", "fullMatch()", "sumMatch()");
        q(S10, "Optional sinfi nə üçün yaradılıb?",
          "null yoxlamalarından qaçmaq üçün", "Fayl oxumaq üçün", "Thread idarə etmək üçün", "Massiv sıralamaq üçün");
        q(S10, "Optional-da dəyərin olub-olmadığını yoxlayan metod hansıdır?",
          "isPresent()", "hasValue()", "exists()", "notNull()");
        q(S10, "Optional boş olanda default dəyər vermək üçün hansı metod işlədilir?",
          "orElse()", "ifEmpty()", "otherwise()", "orDefault()");
        q(S10, "Boş Optional yaratmaq üçün hansı metod işlədilir?",
          "Optional.empty()", "Optional.null()", "Optional.none()", "new Optional()");
        q(S10, "Collectors.groupingBy nə edir?",
          "Elementləri açara görə qruplaşdırıb Map qaytarır", "Elementləri sıralayır", "Təkrarları silir", "Elementləri birləşdirib String edir");
        q(S10, "parallelStream() nə üçündür?",
          "Stream-i paralel işləmək üçün", "Stream-i silmək üçün", "Stream-i tərsinə çevirmək üçün", "Stream-i fayla yazmaq üçün");
        q(S10, "Stream-də hər elementə əməliyyat tətbiq edən son (terminal) metod hansıdır?",
          "forEach()", "map()", "filter()", "limit()");
        q(S10, "map() və filter() hansı növ stream əməliyyatlarıdır?",
          "Aralıq (intermediate)", "Terminal", "Statik", "Final");
        q(S10, "Stream-i işə salan əməliyyat növü hansıdır?",
          "Terminal əməliyyat", "Aralıq əməliyyat", "Statik əməliyyat", "Lokal əməliyyat");
        // ---------- JAVA THREAD VƏ JVM ----------
        q(S11, "Obyektlər JVM-də hansı yaddaş sahəsində saxlanılır?",
          "Heap", "Stack", "Register", "Cache");
        q(S11, "Lokal dəyişənlər və metod çağırışları hansı yaddaş sahəsində saxlanılır?",
          "Stack", "Heap", "Metaspace", "Disk");
        q(S11, "Sinif metadatası Java 8-dən hansı sahədə saxlanılır?",
          "Metaspace", "PermGen", "Stack", "Register");
        q(S11, "JIT kompilyator nə edir?",
          "İşləmə zamanı bytecode-u maşın koduna çevirib sürətləndirir", "Kodu kompilyasiya xətalarından qoruyur", "Faylları sıxışdırır", "Dəyişənləri silir");
        q(S11, "ClassLoader nə edir?",
          "Sinifləri JVM-ə yükləyir", "Obyektləri silir", "Thread-ləri dayandırır", "Kodu yazır");
        q(S11, "Thread yaratmağın iki əsas yolu hansılardır?",
          "Thread-dən miras almaq və Runnable həyata keçirmək", "for və while yazmaq", "static və final istifadə etmək", "try və catch yazmaq");
        q(S11, "Thread-i işə salmaq üçün hansı metod çağırılır?",
          "start()", "run()", "begin()", "launch()");
        q(S11, "start() ilə run() arasındakı fərq nədir?",
          "start() yeni axın yaradır, run() eyni axında çağırılır", "Fərq yoxdur", "run() yeni axın yaradır", "start() yalnız bir dəfə yoxlayır");
        q(S11, "Başqa thread-in bitməsini gözləmək üçün hansı metod işlədilir?",
          "join()", "wait-end()", "await()", "pause()");
        q(S11, "Thread.sleep(1000) nə qədər gözləyir?",
          "1 saniyə", "1 millisaniyə", "1 dəqiqə", "1000 saniyə");
        q(S11, "synchronized açar sözü nə üçündür?",
          "Eyni anda yalnız bir thread-in girişinə icazə vermək", "Thread-i dayandırmaq", "Dəyişəni silmək", "Metodu sürətləndirmək");
        q(S11, "volatile açar sözü nə təmin edir?",
          "Dəyişənin dəyərinin thread-lər arasında görünməsini", "Dəyişənin sabit olmasını", "Dəyişənin silinməsini", "Dəyişənin gizlədilməsini");
        q(S11, "Deadlock nədir?",
          "Thread-lərin bir-birini gözləyərək əbədi donması", "Yaddaşın dolması", "Metodun rekursiyası", "Kompilyasiya xətası");
        q(S11, "Race condition nədir?",
          "Nəticənin thread-lərin icra sırasından asılı olması", "Thread-lərin yarışda sürətlənməsi", "Çox sürətli dövr", "Yaddaş sızması");
        q(S11, "Thread pool yaratmaq üçün hansı interfeys/sinif ailəsi işlədilir?",
          "ExecutorService", "ThreadList", "PoolManager", "TaskArray");
        q(S11, "Thread-safe ədəd sayğacı üçün hansı sinif uyğundur?",
          "AtomicInteger", "int", "Integer", "Number");
        q(S11, "Daemon thread nədir?",
          "Əsas thread-lər bitəndə avtomatik dayanan arxa plan thread-i", "Ən sürətli thread", "Xəta atan thread", "Dayandırıla bilməyən thread");
        q(S11, "Hər Java proqramı ən azı hansı thread ilə başlayır?",
          "main thread", "GC thread", "daemon thread", "pool thread");
        q(S11, "Garbage Collector hansı obyektləri silə bilər?",
          "Heç bir istinadı qalmayan obyektləri", "Bütün obyektləri", "Yalnız String-ləri", "Yalnız massivləri");
        q(S11, "System.gc() çağırışı nə edir?",
          "GC-nin işləməsini xahiş edir (zəmanət yoxdur)", "GC-ni dərhal işə salır", "Yaddaşı sıfırlayır", "Proqramı dayandırır");
        q(S11, "Eyni anda bir neçə işi görmək imkanı necə adlanır?",
          "Multithreading", "Overloading", "Serialization", "Boxing");
        q(S11, "Callable ilə Runnable arasındakı əsas fərq nədir?",
          "Callable nəticə qaytara və istisna ata bilər", "Callable daha yavaşdır", "Runnable nəticə qaytarır", "Fərq yoxdur");
        q(S11, "Java-da JAR faylı nədir?",
          "Siniflərin və resursların arxivi", "Verilənlər bazası", "Mətn redaktoru", "Şəkil formatı");
        // ---------- JAVA SPRING VƏ ALƏTLƏR ----------
        q(S12, "Maven layihəsinin əsas konfiqurasiya faylı hansıdır?",
          "pom.xml", "build.json", "config.yaml", "maven.txt");
        q(S12, "Maven-də asılılıqlar harada elan olunur?",
          "pom.xml içində <dependencies> blokunda", "main metodunda", "README faylında", ".gitignore faylında");
        q(S12, "mvn clean komandası nə edir?",
          "Əvvəlki build qovluğunu (target) silir", "Kodu formatlayır", "Git-i təmizləyir", "Cache-i serverdən silir");
        q(S12, "Spring Boot tətbiqini işə salan əsas annotasiya hansıdır?",
          "@SpringBootApplication", "@RunApp", "@MainClass", "@StartBoot");
        q(S12, "REST API sinfini işarələyən annotasiya hansıdır?",
          "@RestController", "@RestClass", "@ApiBean", "@WebApp");
        q(S12, "GET sorğusunu metoda bağlayan annotasiya hansıdır?",
          "@GetMapping", "@GetRequest", "@Get", "@FetchMapping");
        q(S12, "POST sorğusunu metoda bağlayan annotasiya hansıdır?",
          "@PostMapping", "@SendMapping", "@Post", "@CreateRequest");
        q(S12, "URL-dəki ?id=5 kimi parametri almaq üçün hansı annotasiya işlədilir?",
          "@RequestParam", "@PathVariable", "@RequestBody", "@UrlQuery");
        q(S12, "URL-in yolundakı /users/5 kimi dəyəri almaq üçün hansı annotasiya işlədilir?",
          "@PathVariable", "@RequestParam", "@RequestBody", "@UrlPart");
        q(S12, "Sorğunun JSON gövdəsini obyektə çevirmək üçün hansı annotasiya işlədilir?",
          "@RequestBody", "@RequestParam", "@PathVariable", "@JsonInput");
        q(S12, "Biznes məntiqi sinfini işarələmək üçün adətən hansı annotasiya işlədilir?",
          "@Service", "@Page", "@Route", "@Logic");
        q(S12, "Verilənlər bazası ilə işləyən sinfi işarələmək üçün adətən hansı annotasiya işlədilir?",
          "@Repository", "@Template", "@View", "@Helper");
        q(S12, "Spring-in obyektləri özü yaradıb idarə etdiyi bean-ləri işarələyən ümumi annotasiya hansıdır?",
          "@Component", "@Object", "@Make", "@Spring");
        q(S12, "Dependency Injection nədir?",
          "Asılı obyektlərin sinfə kənardan verilməsi", "Obyekti silmək", "Kodu şifrələmək", "Xətanı tutmaq");
        q(S12, "Inversion of Control (IoC) nə deməkdir?",
          "Obyektlərin yaradılmasına nəzarəti çərçivənin üzərinə götürməsi", "Dövrün tərsinə işləməsi", "Massivin tərsinə çevrilməsi", "Kodun geriyə sıxışdırılması");
        q(S12, "Spring Boot-un default port nömrəsi neçədir?",
          "8080", "80", "3000", "5432");
        q(S12, "Spring Boot-da əsas konfiqurasiya faylı hansıdır?",
          "application.properties", "spring.exe", "boot.txt", "main.cfg");
        q(S12, "JPA-da sinfi verilənlər bazası cədvəli ilə əlaqələndirən annotasiya hansıdır?",
          "@Entity", "@Row", "@Database", "@Record");
        q(S12, "JPA-da əsas açarı (primary key) göstərən annotasiya hansıdır?",
          "@Id", "@Key", "@Primary", "@Unique-Row");
        q(S12, "Hibernate nədir?",
          "ORM (obyekt-relyasiya xəritələmə) çərçivəsi", "Kompilyator", "Veb brauzer", "Mətn redaktoru");
        q(S12, "JDBC nə üçündür?",
          "Java-dan verilənlər bazasına qoşulmaq üçün", "Şəkil emalı üçün", "Veb dizayn üçün", "Thread idarəsi üçün");
        q(S12, "JpaRepository interfeysi nə verir?",
          "Hazır CRUD metodları", "Veb səhifə dizaynı", "Thread pool", "Fayl sıxışdırma");
        q(S12, "CRUD sözü nəyin qısaltmasıdır?",
          "Create, Read, Update, Delete", "Copy, Run, Undo, Debug", "Compile, Run, Use, Deploy", "Call, Return, Unwrap, Divide");
        q(S12, "HTTP-də məlumat oxumaq üçün hansı metod işlədilir?",
          "GET", "DELETE", "PUT", "PATCH");
        q(S12, "HTTP-də resursu silmək üçün hansı metod işlədilir?",
          "DELETE", "GET", "POST", "OPTIONS");
        q(S12, "HTTP 200 status kodu nə deməkdir?",
          "Uğurlu cavab", "Tapılmadı", "Server xətası", "İcazə yoxdur");
        q(S12, "HTTP 404 status kodu nə deməkdir?",
          "Resurs tapılmadı", "Uğurlu cavab", "Server xətası", "Yönləndirmə");
        q(S12, "HTTP 500 status kodu nə deməkdir?",
          "Server daxili xətası", "Resurs tapılmadı", "Uğurlu cavab", "Yanlış sorğu");
        q(S12, "JSON-u Java obyektinə çevirmək üçün Spring Boot-da default hansı kitabxana işlədilir?",
          "Jackson", "Lombok", "Mockito", "Hibernate");
        q(S12, "Lombok kitabxanasının @Getter annotasiyası nə edir?",
          "Getter metodlarını avtomatik yaradır", "Sinfi silir", "Thread yaradır", "Fayla yazır");
        q(S12, "JUnit-də test metodunu işarələyən annotasiya hansıdır?",
          "@Test", "@Check", "@Run", "@Verify");
        q(S12, "Mockito nə üçün istifadə olunur?",
          "Testlərdə saxta (mock) obyektlər yaratmaq üçün", "Verilənlər bazası bağlantısı üçün", "Şəkil emalı üçün", "Kodu kompilyasiya etmək üçün");
        q(S12, "Thymeleaf nədir?",
          "Java üçün server tərəfli şablon mühərriki", "Verilənlər bazası", "Build aləti", "Test kitabxanası");
        q(S12, "Gradle nədir?",
          "Maven kimi build aləti", "Verilənlər bazası", "Veb server", "Brauzer");
        q(S12, "Spring Security nə üçün istifadə olunur?",
          "Autentifikasiya və avtorizasiya üçün", "Şəkil emalı üçün", "Fayl sıxışdırma üçün", "Qrafik çəkmək üçün");
        q(S12, "Fayl oxumaq üçün BufferedReader hansı paketdədir?",
          "java.io", "java.net", "java.sql", "java.awt");
        q(S12, "Faylın bütün sətirlərini siyahı kimi oxumaq üçün hansı metod işlədilir?",
          "Files.readAllLines()", "File.readList()", "Files.getLines()", "Reader.all()");
        q(S12, "Obyekti fayla və ya şəbəkəyə göndərmək üçün baytlara çevirmək necə adlanır?",
          "Serializasiya", "Kompilyasiya", "Boxing", "Overloading");
        q(S12, "Serializasiya üçün sinif hansı interfeysi həyata keçirməlidir?",
          "Serializable", "Cloneable", "Comparable", "Runnable");
        q(S12, "Maven layihəsini Git-ə yükləyəndə adətən .gitignore-a nə əlavə edilir?",
          "target qovluğu (build nəticəsi)", "src qovluğu", "pom.xml faylı", "Mənbə kod faylları");
    }

    private JavaQuestions() {
    }

    public static List<Question> getAll() {
        return new ArrayList<>(LIST);
    }
}
