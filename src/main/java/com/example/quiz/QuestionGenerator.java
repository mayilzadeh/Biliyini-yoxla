package com.example.quiz;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Məlumat cədvəllərindən yüzlərlə sual yaradır.
 * Yeni sual əlavə etmək üçün sadəcə aşağıdakı siyahılara yeni cüt yaz (a|b; şəklində).
 */
public class QuestionGenerator {

    private static final String GEO = "Coğrafiya";
    private static final String CHEM = "Kimya";
    private static final String MATH = "Riyaziyyat";
    private static final String ARTS = "Elm və incəsənət";

    // ölkə|paytaxt
    private static final String CAPITALS =
            "Azərbaycan|Bakı;Türkiyə|Ankara;Gürcüstan|Tbilisi;Ermənistan|İrəvan;Rusiya|Moskva;İran|Tehran;"
            + "Ukrayna|Kiyev;Belarus|Minsk;Qazaxıstan|Astana;Özbəkistan|Daşkənd;Türkmənistan|Aşqabad;"
            + "Qırğızıstan|Bişkek;Tacikistan|Düşənbə;Pakistan|İslamabad;Əfqanıstan|Kabil;Hindistan|Nyu-Dehli;"
            + "Çin|Pekin;Yaponiya|Tokio;Cənubi Koreya|Seul;Şimali Koreya|Pxenyan;Monqolustan|Ulan-Bator;"
            + "Vyetnam|Hanoy;Tailand|Banqkok;İndoneziya|Cakarta;Malayziya|Kuala-Lumpur;Filippin|Manila;"
            + "Banqladeş|Dəkkə;Nepal|Katmandu;İraq|Bağdad;Suriya|Dəməşq;Livan|Beyrut;İordaniya|Amman;"
            + "Səudiyyə Ərəbistanı|Ər-Riyad;Qətər|Doha;Küveyt|Küveyt;Oman|Maskat;Misir|Qahirə;Liviya|Tripoli;"
            + "Tunis|Tunis;Əlcəzair|Əlcəzair;Mərakeş|Rabat;Sudan|Xartum;Efiopiya|Əddis-Əbəbə;Keniya|Nairobi;"
            + "Nigeriya|Abuca;Qana|Akkra;Seneqal|Dakar;Uqanda|Kampala;Anqola|Luanda;Fransa|Paris;Almaniya|Berlin;"
            + "İtaliya|Roma;İspaniya|Madrid;Portuqaliya|Lissabon;Böyük Britaniya|London;İrlandiya|Dublin;"
            + "Niderland|Amsterdam;Belçika|Brüssel;İsveçrə|Bern;Avstriya|Vyana;Polşa|Varşava;Çexiya|Praqa;"
            + "Macarıstan|Budapeşt;Rumıniya|Buxarest;Bolqarıstan|Sofiya;Yunanıstan|Afina;Serbiya|Belqrad;"
            + "Xorvatiya|Zaqreb;Albaniya|Tiran;İsveç|Stokholm;Norveç|Oslo;Finlandiya|Helsinki;Danimarka|Kopenhagen;"
            + "İslandiya|Reykyavik;Litva|Vilnüs;Latviya|Riqa;Estoniya|Tallin;Moldova|Kişinyov;Kipr|Nikosiya;"
            + "ABŞ|Vaşinqton;Kanada|Ottava;Meksika|Mexiko;Kuba|Havana;Braziliya|Brasiliya;Argentina|Buenos-Ayres;"
            + "Çili|Santyaqo;Peru|Lima;Kolumbiya|Bogota;Venesuela|Karakas;Ekvador|Kito;Uruqvay|Montevideo;"
            + "Avstraliya|Kanberra;Yeni Zelandiya|Vellinqton";

    // element|simvol
    private static final String ELEMENTS =
            "Hidrogen|H;Helium|He;Litium|Li;Karbon|C;Azot|N;Oksigen|O;Flüor|F;Neon|Ne;Natrium|Na;Maqnezium|Mg;"
            + "Alüminium|Al;Silisium|Si;Fosfor|P;Kükürd|S;Xlor|Cl;Argon|Ar;Kalium|K;Kalsium|Ca;Dəmir|Fe;Mis|Cu;"
            + "Sink|Zn;Gümüş|Ag;Qızıl|Au;Civə|Hg;Qurğuşun|Pb;Qalay|Sn;Nikel|Ni;Platin|Pt;Yod|I;Uran|U;Titan|Ti;"
            + "Xrom|Cr;Manqan|Mn;Brom|Br;Bor|B";

    // sual|cavab
    private static final String ARTS_DATA =
            "Nisbilik nəzəriyyəsini kim irəli sürüb?|Albert Eynşteyn;Ümumdünya cazibə qanununu kim kəşf edib?|İsaak Nyuton;"
            + "Penisilini kim kəşf edib?|Aleksandr Fleminq;Dinamiti kim icad edib və Nobel mükafatını təsis edib?|Alfred Nobel;"
            + "Kimyəvi elementlərin dövri sistemini kim yaradıb?|Dmitri Mendeleyev;Təkamül nəzəriyyəsinin müəllifi kimdir?|Çarlz Darvin;"
            + "Günəşmərkəzli sistemi irəli sürən alim kimdir?|Nikolay Kopernik;Rentgen şüalarını kim kəşf edib?|Vilhelm Rentgen;"
            + "Polonium və radiumu kim kəşf edib?|Mariya Kyuri;Telefonun icadı kimin adı ilə bağlıdır?|Aleksandr Bell;"
            + "Teleskopla Yupiterin peyklərini kim kəşf edib?|Qalileo Qalilei;Kosmosa uçan ilk insan kimdir?|Yuri Qaqarin;"
            + "Aya ilk addım atan insan kimdir?|Nil Armstronq;İlk motorlu təyyarə uçuşunu kim həyata keçirib?|Rayt qardaşları;"
            + "“Hamlet” əsərinin müəllifi kimdir?|Vilyam Şekspir;“Cinayət və cəza” romanının müəllifi kimdir?|Fyodor Dostoyevski;"
            + "“Müharibə və sülh” romanının müəllifi kimdir?|Lev Tolstoy;“Don Kixot” romanının müəllifi kimdir?|Migel de Servantes;"
            + "“İlahi komediya” əsərinin müəllifi kimdir?|Dante Aliqyeri;“Faust” faciəsinin müəllifi kimdir?|Yohan Volfqanq Höte;"
            + "“Kiçik şahzadə” əsərinin müəllifi kimdir?|Antuan de Sent-Ekzüperi;“Yeddi gözəl” poeması kimin əsəridir?|Nizami Gəncəvi;"
            + "“Ulduzlu gecə” tablosunun müəllifi kimdir?|Vinsent van Qoq;“Qernika” tablosunun müəllifi kimdir?|Pablo Pikasso;"
            + "“Son şam yeməyi” fresk əsərinin müəllifi kimdir?|Leonardo da Vinçi;“Ay işığı sonatası”nın bəstəkarı kimdir?|Ludviq van Bethoven;"
            + "“Qu gölü” baletinin bəstəkarı kimdir?|Pyotr Çaykovski;“Fiqaronun evlənməsi” operasının bəstəkarı kimdir?|Volfqanq Motsart;"
            + "“Arşın mal alan” musiqili komediyasının müəllifi kimdir?|Üzeyir Hacıbəyli;“Koroğlu” operasının bəstəkarı kimdir?|Üzeyir Hacıbəyli;"
            + "“Dörd fəsil” əsərinin bəstəkarı kimdir?|Antonio Vivaldi";

    private QuestionGenerator() {
    }

    public static List<Question> generate() {
        Random rnd = new Random(7); // sabit toxum: sual nömrələri hər dəfə eyni qalır
        List<Question> out = new ArrayList<>();

        pairs(out, rnd, GEO, CAPITALS, "%s ölkəsinin paytaxtı hansı şəhərdir?", "%s hansı ölkənin paytaxtıdır?", true);
        pairs(out, rnd, CHEM, ELEMENTS, "%s elementinin kimyəvi simvolu hansıdır?", "%s simvolu hansı elementə aiddir?", false);
        facts(out, rnd, ARTS, ARTS_DATA);
        ExtraQuestions.addAll(out, rnd);
        math(out, rnd);
        return out;
    }

    /** "a|b" cütlərindən iki istiqamətdə sual yaradır. */
    private static void pairs(List<Question> out, Random rnd, String cat, String data,
                              String fwd, String rev, boolean unused) {
        List<String[]> items = parse(data);
        List<String> firsts = new ArrayList<>(), seconds = new ArrayList<>();
        for (String[] p : items) { firsts.add(p[0]); seconds.add(p[1]); }
        for (String[] p : items) {
            add(out, cat, String.format(fwd, p[0]), p[1], pick(seconds, p[1], rnd));
            add(out, cat, String.format(rev, p[1]), p[0], pick(firsts, p[0], rnd));
        }
    }

    /** "sual|cavab;" cədvəlindən sual yaradır, yanlış variantları eyni cədvəlin digər cavablarından seçir. */
    static void facts(List<Question> out, Random rnd, String cat, String data) {
        List<String[]> items = parse(data);
        List<String> answers = new ArrayList<>();
        for (String[] p : items) if (!answers.contains(p[1])) answers.add(p[1]);
        for (String[] p : items) add(out, cat, p[0], p[1], pick(answers, p[1], rnd));
    }

    private static void math(List<Question> out, Random rnd) {
        for (int a = 3; a <= 12; a++) {
            for (int b = a; b <= 12; b++) {
                int ans = a * b;
                add(out, MATH, a + " × " + b + " neçəyə bərabərdir?", "" + ans,
                        numbers(rnd, ans, ans + a, ans - a, ans + b, ans - b, ans + 1, ans - 1, ans + 10, ans - 10));
            }
        }
        for (int n = 13; n <= 25; n++) {
            int ans = n * n;
            add(out, MATH, n + " ədədinin kvadratı neçədir?", "" + ans,
                    numbers(rnd, ans, ans + n, ans - n, ans + 10, ans - 10, ans + 1, ans - 1, ans + 20));
        }
        for (int n = 11; n <= 25; n++) {
            add(out, MATH, (n * n) + " ədədinin kvadrat kökü neçədir?", "" + n,
                    numbers(rnd, n, n + 1, n - 1, n + 2, n - 2, n + 10, n * 2));
        }
    }

    // ---------- köməkçi metodlar ----------

    private static List<String[]> parse(String data) {
        List<String[]> list = new ArrayList<>();
        for (String item : data.split(";")) list.add(item.split("\\|"));
        return list;
    }

    private static List<String> pick(List<String> pool, String correct, Random rnd) {
        List<String> copy = new ArrayList<>(pool);
        copy.remove(correct);
        java.util.Collections.shuffle(copy, rnd);
        return copy.subList(0, 3);
    }

    private static List<String> numbers(Random rnd, int correct, int... candidates) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int c : candidates) if (c > 0 && c != correct) set.add(c);
        List<String> list = new ArrayList<>();
        for (int c : set) list.add("" + c);
        java.util.Collections.shuffle(list, rnd);
        return list.subList(0, 3);
    }

    private static void add(List<Question> out, String cat, String text, String correct, List<String> wrong) {
        out.add(new Question(cat, text, correct, wrong.get(0), wrong.get(1), wrong.get(2)));
    }
}
