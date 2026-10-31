package com.example.quiz;

import java.util.List;
import java.util.Random;

/** Proqramlaşdırma, Azərbaycan, Ümumi və Texnologiya mövzuları üçün əlavə suallar (sual|cavab;). */
class ExtraQuestions {

    private static final String PROG = "Proqramlaşdırma/";

    private static final String JAVA_KW =
            "Java-da yeni sinif yaratmaq üçün hansı açar söz işlədilir?|class;Başqa sinifdən miras almaq üçün hansı açar söz işlədilir?|extends;"
            + "İnterfeysi həyata keçirmək üçün hansı açar söz işlədilir?|implements;Dəyişməyən (sabit) dəyər üçün hansı açar söz işlədilir?|final;"
            + "Obyekt yaratmadan çağırıla bilən metod üçün hansı açar söz işlədilir?|static;Dövrdən tam çıxmaq üçün hansı komanda işlədilir?|break;"
            + "Dövrün cari təkrarını keçib növbətiyə keçmək üçün hansı komanda işlədilir?|continue;Dəyər qaytarmayan metodun tipi hansıdır?|void;"
            + "Hər yerdən əlçatan olan modifikator hansıdır?|public;Yalnız sinif daxilində əlçatan olan modifikator hansıdır?|private;"
            + "Metoddan nəticəni geri qaytarmaq üçün hansı açar söz işlədilir?|return";

    private static final String JAVA_C =
            "Obyekt yaradılanda işləyən xüsusi metod necə adlanır?|Konstruktor;Bir sinfin digərinin xüsusiyyətlərini götürməsi necə adlanır?|Varislik;"
            + "Məlumatı gizlədib yalnız metodlarla açmaq prinsipi necə adlanır?|İnkapsulyasiya;Ölçüsü dəyişə bilən siyahı saxlayan sinif hansıdır?|ArrayList;"
            + "Açar-dəyər cütləri saxlayan sinif hansıdır?|HashMap;Təkrarlanan elementə icazə verməyən sinif hansıdır?|HashSet;"
            + "Xətanı tutmaq üçün hansı blok işlədilir?|try-catch;Klaviaturadan məlumat oxumaq üçün hansı sinif işlədilir?|Scanner;"
            + "İki mətni müqayisə etmək üçün hansı metod işlədilir?|equals();Mətnin uzunluğunu hansı metod verir?|length();"
            + "Spring Boot nə üçün istifadə olunur?|Veb tətbiq və API yaratmaq üçün;Maven nə edir?|Layihənin asılılıqlarını və yığılmasını idarə edir;"
            + "Java kodunu işlədən mühit necə adlanır?|JVM;Eyni adlı metodun müxtəlif şəkildə işləməsi necə adlanır?|Polimorfizm";

    private static final String PY =
            "Python-da ekrana yazı çıxaran funksiya hansıdır?|print();Python-da siyahının uzunluğunu hansı funksiya verir?|len();"
            + "Python-da şərh hansı simvolla başlayır?|#;Python-da funksiya hansı açar sözlə təyin olunur?|def;"
            + "Python-da istifadəçidən məlumat almaq üçün hansı funksiya işlədilir?|input();Python-da dəyərin tipini hansı funksiya göstərir?|type();"
            + "Python-da başqa modulu çağırmaq üçün hansı açar söz işlədilir?|import;Python-da kod bloklarını nə ayırır?|Girinti (boşluq);"
            + "Python-da siyahı hansı mötərizə ilə yazılır?|[ ];Python-da lüğət (dictionary) hansı mötərizə ilə yazılır?|{ }";

    private static final String PYN =
            "Python-da 2 ** 3 neçəyə bərabərdir?|8;Python-da 10 // 3 neçəyə bərabərdir?|3;Python-da 10 % 3 neçəyə bərabərdir?|1;"
            + "Python-da len(\"salam\") neçəyə bərabərdir?|5;Python-da 7 + 3 * 2 neçəyə bərabərdir?|13;Python-da 20 / 4 neçəyə bərabərdir?|5.0";

    private static final String JS =
            "JavaScript-də sabit (dəyişməyən) dəyişən necə elan olunur?|const;JavaScript-də konsola yazı çıxaran komanda hansıdır?|console.log();"
            + "JavaScript-də bir sətirlik şərh necə yazılır?|// şərh;JavaScript-də massivin sonuna element əlavə edən metod hansıdır?|push();"
            + "JavaScript-də ekranda xəbərdarlıq pəncərəsi açan funksiya hansıdır?|alert();JavaScript-də tipi də yoxlayan bərabərlik operatoru hansıdır?|===;"
            + "JavaScript-də funksiya hansı açar sözlə yaradılır?|function;DOM nə deməkdir?|Səhifənin obyekt modeli (Document Object Model)";

    private static final String WEB =
            "HTML-də ən böyük başlıq hansı teqlə yazılır?|<h1>;HTML-də paraqraf hansı teqlə yazılır?|<p>;HTML-də şəkil hansı teqlə əlavə olunur?|<img>;"
            + "HTML-də keçid (link) hansı teqlə yaradılır?|<a>;HTML-də siyahı hansı teqlə yaradılır?|<ul>;CSS-də mətnin rəngini hansı xüsusiyyət dəyişir?|color;"
            + "CSS-də arxa fon rəngini hansı xüsusiyyət dəyişir?|background-color;CSS-də şrift ölçüsünü hansı xüsusiyyət dəyişir?|font-size;"
            + "CSS-də xarici boşluğu hansı xüsusiyyət təyin edir?|margin;CSS-də daxili boşluğu hansı xüsusiyyət təyin edir?|padding";

    private static final String SQL =
            "SQL-də məlumatı seçmək üçün hansı komanda işlədilir?|SELECT;SQL-də yeni sətir əlavə etmək üçün hansı komanda işlədilir?|INSERT;"
            + "SQL-də mövcud məlumatı dəyişmək üçün hansı komanda işlədilir?|UPDATE;SQL-də sətir silmək üçün hansı komanda işlədilir?|DELETE;"
            + "SQL-də şərt yazmaq üçün hansı açar söz işlədilir?|WHERE;SQL-də nəticəni sıralamaq üçün hansı ifadə işlədilir?|ORDER BY;"
            + "SQL-də cədvəlləri birləşdirmək üçün hansı açar söz işlədilir?|JOIN;SQL-də sətirləri qruplaşdırmaq üçün hansı ifadə işlədilir?|GROUP BY;"
            + "SQL-də sətirlərin sayını hansı funksiya verir?|COUNT()";

    private static final String GIT =
            "Dəyişiklikləri yaddaşa qeyd etmək üçün hansı Git komandası işlədilir?|git commit;Uzaq repozitoriyanı kompüterə köçürmək üçün hansı komanda işlədilir?|git clone;"
            + "Kodu uzaq repozitoriyaya göndərmək üçün hansı komanda işlədilir?|git push;Uzaq repozitoriyadan yenilikləri almaq üçün hansı komanda işlədilir?|git pull;"
            + "Faylı commit üçün hazırlamaq üçün hansı komanda işlədilir?|git add;Yeni Git repozitoriyası yaratmaq üçün hansı komanda işlədilir?|git init;"
            + "Faylların vəziyyətini göstərən komanda hansıdır?|git status;Yeni budaq (branch) yaratmaq üçün hansı komanda işlədilir?|git branch";

    private static final String CONCEPT =
            "Eyni kodu təkrar yazmamaq üçün nə istifadə olunur?|Funksiya (metod);Eyni tipli çoxlu dəyəri saxlayan struktur hansıdır?|Massiv;"
            + "Koddakı səhvi axtarıb tapmaq prosesi necə adlanır?|Debug;Alqoritm nədir?|Məsələni həll edən addımlar ardıcıllığı;"
            + "IDE nədir?|Proqram yazmaq üçün inteqrasiya olunmuş mühit;API nədir?|Proqramların bir-biri ilə əlaqə qurduğu interfeys;"
            + "Frontend nədir?|İstifadəçinin gördüyü hissə;Backend nədir?|Serverdə işləyən hissə;Dəyişən nədir?|Məlumat saxlayan adlandırılmış yer;"
            + "Kompilyator nə edir?|Kodu maşın dilinə çevirir;Rekursiya nədir?|Funksiyanın özünü çağırması;"
            + "Verilənlər bazası nə üçündür?|Məlumatı sistemli saxlamaq üçün;Açıq mənbə (open source) nə deməkdir?|Mənbə kodu hamıya açıqdır";

    private static final String AZ_PLACES =
            "Azərbaycanın ən uzun çayı hansıdır?|Kür;Kür çayı hansı su hövzəsinə tökülür?|Xəzər dənizinə;Şəki Xan Sarayı hansı şəhərdədir?|Şəki;"
            + "Şirvanşahlar Sarayı hansı şəhərdədir?|Bakı;Cıdır düzü hansı şəhərdədir?|Şuşa;Xınalıq kəndi hansı rayondadır?|Quba;"
            + "Lahıc qəsəbəsi hansı rayondadır?|İsmayıllı;Nohur gölü və Qəbələ hansı bölgənin məşhur turizm məkanıdır?|Şimal-Qərb;"
            + "Neft vannaları ilə məşhur şəhər hansıdır?|Naftalan;Heydər Əliyev Mərkəzinin memarı kimdir?|Zaha Hadid;"
            + "Azərbaycanla quru sərhədi olan ölkə hansıdır?|Gürcüstan;Azərbaycanın şimal qonşusu hansı ölkədir?|Rusiya";

    private static final String AZ_CULTURE =
            "“Aldanmış kəvakib” əsərinin müəllifi kimdir?|Mirzə Fətəli Axundzadə;“Leyli və Məcnun” poemasını türk dilində yazan şair kimdir?|Məhəmməd Füzuli;"
            + "“Vaqif” dramının müəllifi kimdir?|Səməd Vurğun;“Almaz” pyesinin müəllifi kimdir?|Cəfər Cabbarlı;"
            + "Aşağıdakılardan hansı muğamdır?|Segah;Aşağıdakılardan hansı Azərbaycan milli musiqi alətidir?|Tar;"
            + "“Kitabi-Dədə Qorqud” nədir?|Qədim türk eposu;Novruzda hansı bitki cücərdilir?|Səməni;Novruzda hansı od yandırılır?|Tonqal;"
            + "Azərbaycan əlifbasında neçə hərf var?|32;Azərbaycanın dövlət dili hansıdır?|Azərbaycan dili";

    private static final String AZ_DAYS =
            "Müstəqillik Günü hansı tarixdə qeyd olunur?|18 oktyabr;Respublika Günü hansı tarixdə qeyd olunur?|28 may;"
            + "Milli Qurtuluş Günü hansı tarixdə qeyd olunur?|15 iyun;Zəfər Günü hansı tarixdə qeyd olunur?|8 noyabr;"
            + "Bayraq Günü hansı tarixdə qeyd olunur?|9 noyabr";

    private static final String AZ_YEARS =
            "Azərbaycan Eurovision mahnı müsabiqəsini hansı ildə qazanıb?|2011;İlk Avropa Oyunları Bakıda hansı ildə keçirilib?|2015;"
            + "Bakıda ilk Formula 1 yarışı (Avropa Qran-Prisi) hansı ildə keçirilib?|2016;Bakı metrosu hansı ildə istifadəyə verilib?|1967";

    private static final String ANIMALS =
            "Ən böyük quru heyvanı hansıdır?|Fil;Ən hündür heyvan hansıdır?|Zürafə;Dünyanın ən böyük heyvanı hansıdır?|Göy balina;"
            + "Uça bilməyən ən böyük quş hansıdır?|Dəvəquşu;Aşağıdakılardan hansı məməlidir?|Delfin;Arı hansı məhsulu verir?|Bal;"
            + "Ağ-qara zolaqlı Afrika heyvanı hansıdır?|Zebr;Hansı heyvan Avstraliyanın simvoludur?|Kenquru;Pinqvinlər harada yaşayır?|Cənub yarımkürəsində";

    private static final String SPACE =
            "Qırmızı planet adlanan planet hansıdır?|Mars;Halqaları ilə məşhur planet hansıdır?|Saturn;Ən isti planet hansıdır?|Venera;"
            + "Günəş sisteminin Günəşdən ən uzaq planeti hansıdır?|Neptun;Yerin təbii peyki hansıdır?|Ay;Günəş sistemində neçə planet var?|8;"
            + "Adi ildə neçə gün var?|365;Kəbisə ilində neçə gün var?|366;Göy qurşağında neçə rəng var?|7";

    private static final String BODY =
            "İnsan ürəyi neçə kameradan ibarətdir?|4;Qanı bədənə vuran orqan hansıdır?|Ürək;Ən böyük daxili orqan hansıdır?|Qaraciyər;"
            + "Nəfəs alarkən hansı qazı qəbul edirik?|Oksigen;Bitkilər fotosintezdə hansı qazı udur?|Karbon qazı;"
            + "Yetkin insanda neçə diş olur?|32;Bədənin ən böyük orqanı hansıdır?|Dəri";

    private static final String WORLD =
            "Ən böyük isti səhra hansıdır?|Sahara;Ən dərin göl hansıdır?|Baykal;Sahəsinə görə ən böyük qitə hansıdır?|Asiya;"
            + "Nil çayı hansı qitədədir?|Afrika;Everest hansı dağ silsiləsindədir?|Himalay;Amazon meşələrinin böyük hissəsi hansı ölkədədir?|Braziliya;"
            + "Futbol komandası meydanda neçə oyunçu ilə oynayır?|11;Olimpiya bayrağında neçə halqa var?|5;Şahmat taxtasında neçə xana var?|64;"
            + "Müasir Olimpiya Oyunları ilk dəfə hansı şəhərdə keçirilib?|Afina;Olimpiya Oyunları neçə ildən bir keçirilir?|4;Ən qısa ay hansıdır?|Fevral";

    private static final String TECH =
            "CPU nə deməkdir?|Mərkəzi prosessor;Windows hansı şirkətin məhsuludur?|Microsoft;macOS və iPhone hansı şirkətə məxsusdur?|Apple;"
            + "ChatGPT-ni hansı şirkət hazırlayıb?|OpenAI;Claude süni intellektini hansı şirkət hazırlayıb?|Anthropic;WhatsApp hazırda hansı şirkətə məxsusdur?|Meta;"
            + "YouTube hansı şirkətə məxsusdur?|Google;Bitcoin nədir?|Kriptovalyuta;Chrome və Firefox nədir?|Brauzer;"
            + "GB nə deməkdir?|Qiqabayt;URL nədir?|Veb ünvan;Fişinq (phishing) nədir?|Saxta mesajla məlumat oğurluğu;"
            + "Antivirus nə üçündür?|Zərərli proqramlardan qorumaq üçün;Güclü parol necə olmalıdır?|Hərf, rəqəm və simvol qarışığı;"
            + "Wi-Fi nə üçündür?|Simsiz internet üçün;.jpg faylı nə tipli fayldır?|Şəkil;.mp3 faylı nə tipli fayldır?|Səs;"
            + "SSD nədir?|Sürətli yaddaş qurğusu;Elon Mask hansı elektrik avtomobil şirkətinin rəhbəridir?|Tesla";

    private ExtraQuestions() {
    }

    static void addAll(List<Question> out, Random rnd) {
        QuestionGenerator.facts(out, rnd, PROG + "Java", JAVA_KW);
        QuestionGenerator.facts(out, rnd, PROG + "Java", JAVA_C);
        QuestionGenerator.facts(out, rnd, PROG + "Python", PY);
        QuestionGenerator.facts(out, rnd, PROG + "Python", PYN);
        QuestionGenerator.facts(out, rnd, PROG + "JavaScript", JS);
        QuestionGenerator.facts(out, rnd, PROG + "HTML və CSS", WEB);
        QuestionGenerator.facts(out, rnd, PROG + "SQL", SQL);
        QuestionGenerator.facts(out, rnd, PROG + "Git", GIT);
        QuestionGenerator.facts(out, rnd, PROG + "Ümumi anlayışlar", CONCEPT);
        QuestionGenerator.facts(out, rnd, "Azərbaycan", AZ_PLACES);
        QuestionGenerator.facts(out, rnd, "Azərbaycan", AZ_CULTURE);
        QuestionGenerator.facts(out, rnd, "Azərbaycan", AZ_DAYS);
        QuestionGenerator.facts(out, rnd, "Azərbaycan", AZ_YEARS);
        QuestionGenerator.facts(out, rnd, "Ümumi", ANIMALS);
        QuestionGenerator.facts(out, rnd, "Ümumi", SPACE);
        QuestionGenerator.facts(out, rnd, "Ümumi", BODY);
        QuestionGenerator.facts(out, rnd, "Ümumi", WORLD);
        QuestionGenerator.facts(out, rnd, "Texnologiya", TECH);
    }
}
