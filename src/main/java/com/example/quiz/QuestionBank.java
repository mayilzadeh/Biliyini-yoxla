package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Bütün suallar burada saxlanılır.
 * Yeni sual əlavə etmək üçün sadəcə bir sətir yaz:
 * add(kateqoriya, sual, DÜZGÜN cavab, yanlış1, yanlış2, yanlış3)
 * Düzgün cavabı həmişə birinci yaz, proqram özü qarışdırır.
 */
public class QuestionBank {

    private static final String JAVA = "Proqramlaşdırma/Java";
    private static final String AZ = "Azərbaycan";
    private static final String GENERAL = "Ümumi";
    private static final String TECH = "Texnologiya";

    private static final List<Question> QUESTIONS = new ArrayList<>();

    private static void add(String category, String text, String correct, String w1, String w2, String w3) {
        QUESTIONS.add(new Question(category, text, correct, w1, w2, w3));
    }

    static {
        // ---------- JAVA ----------
        add(JAVA, "Java proqramlaşdırma dilini hansı şirkət yaradıb?",
                "Sun Microsystems", "Microsoft", "Apple", "Google");
        add(JAVA, "Java mənbə (source) kodu faylının uzantısı hansıdır?",
                ".java", ".jav", ".js", ".exe");
        add(JAVA, "Tam ədədləri saxlamaq üçün hansı tip istifadə olunur?",
                "int", "String", "boolean", "char");
        add(JAVA, "Mətn (söz və cümlə) saxlamaq üçün hansı tip istifadə olunur?",
                "String", "int", "double", "boolean");
        add(JAVA, "Java proqramı hansı metoddan başlayır?",
                "main", "start", "run", "begin");
        add(JAVA, "Konsola yazı çıxarmaq üçün hansı komanda işlədilir?",
                "System.out.println()", "Console.write()", "echo()", "print.screen()");
        add(JAVA, "Aşağıdakılardan hansı dövr (loop) operatorudur?",
                "for", "if", "new", "class");
        add(JAVA, "true və ya false dəyəri saxlayan tip hansıdır?",
                "boolean", "int", "String", "double");
        add(JAVA, "Massivin ilk elementinin indeksi neçədir?",
                "0", "1", "-1", "10");
        add(JAVA, "Sinifdən yeni obyekt yaratmaq üçün hansı açar söz işlədilir?",
                "new", "create", "make", "object");
        add(JAVA, "JVM nə deməkdir?",
                "Java Virtual Machine", "Java Visual Method", "Java Version Manager", "Joint Virtual Memory");
        add(JAVA, "Kəsr ədədləri (məsələn, 3.14) saxlamaq üçün hansı tip uyğundur?",
                "double", "int", "boolean", "char");
        add(JAVA, "İki dəyərin bərabər olub-olmadığını yoxlayan operator hansıdır?",
                "==", "=", "=>", "!!");
        add(JAVA, "Java-da bir sətirlik şərh (comment) necə yazılır?",
                "// şərh", "# şərh", "-- şərh", "<!-- şərh -->");

        // ---------- AZƏRBAYCAN ----------
        add(AZ, "Azərbaycanın paytaxtı hansı şəhərdir?",
                "Bakı", "Gəncə", "Sumqayıt", "Şəki");
        add(AZ, "Azərbaycanın ən hündür zirvəsi hansıdır?",
                "Bazardüzü", "Şahdağ", "Tufandağ", "Murovdağ");
        add(AZ, "Azərbaycan dövlət müstəqilliyini hansı ildə bərpa edib?",
                "1991", "1918", "1995", "2003");
        add(AZ, "Azərbaycan Xalq Cümhuriyyəti hansı ildə yaradılıb?",
                "1918", "1920", "1991", "1905");
        add(AZ, "Azərbaycanın milli valyutası hansıdır?",
                "Manat", "Lari", "Dram", "Tenqe");
        add(AZ, "Azərbaycanın şərq sahillərini hansı su hövzəsi yuyur?",
                "Xəzər dənizi", "Qara dəniz", "Aral dənizi", "Aralıq dənizi");
        add(AZ, "“Xəmsə” əsərinin müəllifi kimdir?",
                "Nizami Gəncəvi", "Füzuli", "Nəsimi", "Xaqani Şirvani");
        add(AZ, "“Leyli və Məcnun” operasının bəstəkarı kimdir?",
                "Üzeyir Hacıbəyli", "Qara Qarayev", "Fikrət Əmirov", "Niyazi");
        add(AZ, "Novruz bayramı ilin hansı fəslində qeyd olunur?",
                "Yazda", "Yayda", "Payızda", "Qışda");
        add(AZ, "Bakıda yerləşən məşhur tarixi abidə hansıdır?",
                "Qız Qalası", "Eyfel qülləsi", "Kolizey", "Big Ben");
        add(AZ, "Coğrafi baxımdan Xəzər dünyanın ən böyük nəyi sayılır?",
                "Gölü", "Okeanı", "Çayı", "Körfəzi");
        add(AZ, "Azərbaycan bayrağında hansı rənglər var?",
                "Mavi, qırmızı, yaşıl", "Qırmızı, ağ, mavi", "Yaşıl, ağ, qırmızı", "Sarı, mavi, qırmızı");

        // ---------- ÜMUMİ BİLİK ----------
        add(GENERAL, "Günəş sistemində ən böyük planet hansıdır?",
                "Yupiter", "Saturn", "Neptun", "Mars");
        add(GENERAL, "Suyun kimyəvi formulu nədir?",
                "H2O", "CO2", "O2", "NaCl");
        add(GENERAL, "Yer kürəsində neçə qitə var?",
                "7", "5", "6", "8");
        add(GENERAL, "Yetkin insan bədənində neçə sümük var?",
                "206", "106", "306", "256");
        add(GENERAL, "“Mona Liza” tablosunun müəllifi kimdir?",
                "Leonardo da Vinçi", "Pablo Pikasso", "Vinsent van Qoq", "Salvador Dali");
        add(GENERAL, "Dünyanın ən hündür dağı hansıdır?",
                "Everest", "Elbrus", "Kilimancaro", "Mont Blan");
        add(GENERAL, "Dünyanın ən böyük okeanı hansıdır?",
                "Sakit okean", "Atlantik okeanı", "Hind okeanı", "Şimal Buzlu okeanı");
        add(GENERAL, "Günəşə ən yaxın planet hansıdır?",
                "Merkuri", "Venera", "Yer", "Mars");
        add(GENERAL, "2022-ci il futbol üzrə Dünya Çempionatını hansı komanda qazanıb?",
                "Argentina", "Fransa", "Braziliya", "Almaniya");
        add(GENERAL, "Hörümçəyin neçə ayağı var?",
                "8", "6", "10", "4");
        add(GENERAL, "Quru heyvanlarından ən sürətlisi hansıdır?",
                "Gepard", "Aslan", "At", "Pələng");
        add(GENERAL, "Eyfel qülləsi hansı şəhərdədir?",
                "Paris", "London", "Roma", "Madrid");
        add(GENERAL, "Sahəsinə görə dünyanın ən böyük ölkəsi hansıdır?",
                "Rusiya", "Kanada", "Çin", "ABŞ");
        add(GENERAL, "Oksigenin kimyəvi simvolu hansıdır?",
                "O", "Ok", "Og", "Gn");
        add(GENERAL, "İşıq vakuumda təxminən saniyədə nə qədər yol gedir?",
                "300 000 km", "30 000 km", "3 000 km", "3 000 000 km");
        add(GENERAL, "Ağ ayı təbiətdə harada yaşayır?",
                "Arktikada (Şimal qütbünə yaxın)", "Antarktidada", "Saharada", "Amazon meşələrində");

        // ---------- TEXNOLOGİYA ----------
        add(TECH, "World Wide Web-i (internet səhifələri sistemini) kim icad edib?",
                "Tim Berners-Lee", "Bill Gates", "Steve Jobs", "Mark Zuckerberg");
        add(TECH, "HTML nə deməkdir?",
                "HyperText Markup Language", "High Tech Modern Language",
                "Home Tool Markup Language", "Hyper Transfer Mobile Link");
        add(TECH, "Linux əməliyyat sisteminin yaradıcısı kimdir?",
                "Linus Torvalds", "Bill Gates", "Elon Musk", "Dennis Ritchie");
        add(TECH, "1 bayt neçə bitdən ibarətdir?",
                "8", "4", "16", "10");
        add(TECH, "Android əməliyyat sistemini hansı şirkət inkişaf etdirir?",
                "Google", "Apple", "Microsoft", "Samsung");
        add(TECH, "İlk iPhone hansı ildə təqdim olunub?",
                "2007", "2003", "2010", "2012");
        add(TECH, "Python dilinin adı nədən götürülüb?",
                "Monty Python komediya qrupundan", "İlan növündən",
                "Yunan miflərindən", "Yaradıcısının soyadından");
        add(TECH, "Proqramdakı səhvə nə deyilir?",
                "Bug", "Virus", "Chip", "Cookie");
        add(TECH, "Git nə üçün istifadə olunur?",
                "Kodun versiyalarını idarə etmək üçün", "Şəkil redaktəsi üçün",
                "Oyun yaratmaq üçün", "Video çəkmək üçün");
        add(TECH, "RAM nədir?",
                "Operativ (müvəqqəti) yaddaş", "Əsas prosessor", "Monitor növü", "Klaviatura növü");
        add(TECH, "Instagram hazırda hansı şirkətin sahibliyindədir?",
                "Meta", "Google", "Microsoft", "Amazon");
        add(TECH, "Ctrl + C qısayolu nə edir?",
                "Kopyalayır", "Kəsir", "Yapışdırır", "Silir");
    }

    private QuestionBank() {
    }

    /** Siyahının surətini qaytarır ki, qarışdıranda orijinal pozulmasın. */
    public static List<Question> getAll() {
        List<Question> all = new ArrayList<>(QUESTIONS);
        all.addAll(QuestionGenerator.generate());
        all.addAll(JavaQuestions.getAll());
        return all;
    }
}
