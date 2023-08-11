package Lambda_StreamApi.LambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sort {
    public static void main(String[] args) {

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7,58,17,54,33,3,13,35,65,18,61,46,25,16,6));

        System.out.println("    *** task 01 ***   ");
        printCiftKareSira(sayiList);//36 256 324 2116 2916 3364

        System.out.println("\n   *** task 02 ***   ");

        printTekKareSira(sayiList);//4225 3721 1225 1089 625 289 169 49 9

        System.out.println("\n   *** task 03 ***   ");

        System.out.println("\n   *** task 04 ***   ");

    }//main sonu

    // Task01-> list çift elemanlarının karelerini k->b sıra ile print eden code create ediniz

    private static void printCiftKareSira(List<Integer> sayiList) {

        sayiList.stream().filter(SeedMethods::ciftMi).map(SeedMethods::kareAl).sorted().forEach(SeedMethods::intYazdir);
/*
sorted() -> akışdaki elemanları naturel order (doğal sıra) halinde akış return eder
sorted() tekrarlı kullanılırsa son return aktif olur...
 */
    }

    // Task02-> list tek elemanlarının karelerini b->k sıra ile print eden code create ediniz

    private static void printTekKareSira(List<Integer> sayiList) {

        sayiList.
                stream().
                filter(SeedMethods::tekMi).
                map(SeedMethods::kareAl).
                sorted(Comparator.reverseOrder()).//akış elemanları b-> ters sıralar...
                forEach(SeedMethods::intYazdir);






    }





    }//class sonu
