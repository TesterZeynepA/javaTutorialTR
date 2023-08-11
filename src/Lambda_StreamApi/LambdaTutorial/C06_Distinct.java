package Lambda_StreamApi.LambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_Distinct {
    public static void main(String[] args) {
        List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı",
                "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        // List<String> yemahhh = new ArrayList<>(Arrays.asList("bicibici", "güllaç", "sütlaç", "künefix", "bicibici", "güllaç", "güllaç"));

        System.out.println("   *** task01 ***   ");
        printAlfabetikBykTekrarsiz(yemahhh);
        //ARABAŞI BÜRYAN BİCİBİCİ CACİX GÜVEÇ KOKEREÇ KÜŞLEME MELEMEN SOĞANLI TANTUNİ TRİLEÇE YAĞLAMA
        System.out.println("\n   *** task02 ***   ");
        printKarakterSayiTersSira(yemahhh);//8 7 6 5
        System.out.println("\n   *** task03 ***   ");
        printKarakterSayiSira(yemahhh);//5 6 7 8

        System.out.println("\n   *** task04 ***   ");
        printSonKarakterTersSiraTekrarsiz(yemahhh);//64 36
        //soğanlı arabAşı kokereç güveç cacix büryan melemen bicibici tantuni küşleme trileçe yağlama

        System.out.println("\n   *** task05 ***   ");
        printCiftSayiliKarakterKareTekrarsizSira(yemahhh);

    }//main sonu

//Task01-> list elemanlarını alfabetik Buyuk harf ile tekrarsız print eden code create ediniz...

    private static void printAlfabetikBykTekrarsiz(List<String> yemahhh) {

        yemahhh.stream().map(String::toUpperCase).sorted().distinct().forEach(SeedMethods::strYazdir);
        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir.
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
    }
    // Task02-> : list elemanlarinin character sayisini ters sirali olarak tekrarsiz print eden code create ediniz.
    private static void printKarakterSayiTersSira(List<String> yemahhh) {

        yemahhh.stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(SeedMethods::intYazdir);
    }

    // Task03-> : list elemanlarinin character sayisini k->b sıralı print eden code create ediniz.
    private static void printKarakterSayiSira(List<String> yemahhh) {
        yemahhh.stream().map(String::length).sorted().distinct().forEach(SeedMethods::intYazdir);
    }

    // Task04-> : list elemanlarini son characterine göre ters sıralı print eden code create ediniz.

    private static void printSonKarakterTersSiraTekrarsiz(List<String> yemahhh) {

        yemahhh.
                stream().
                sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).distinct().
                forEach(SeedMethods::strYazdir);
    }
    // Task05->listin elemanlarin  cift sayili karakterlerinin  karelerini  tekrarsiz buyukten kucuge sirali  print eden code create ediniz...

    private static void printCiftSayiliKarakterKareTekrarsizSira(List<String> yemahhh) {

        yemahhh.
                stream().
                map(t->t.length()*t.length()).
                filter(SeedMethods::ciftMi).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(SeedMethods::intYazdir);
    }














}