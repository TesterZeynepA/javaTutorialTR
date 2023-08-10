package Lambda_StreamApi.LambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 17,  3, 13, 35, 25, 16, 6));

        System.out.println("    *** task 01 ***   ");
        printCiftKare(sayiList);//256 36
        System.out.println("\n   *** task 02 ***   ");
        printTekKüpBirFazla(sayiList);//344 4914 28 2198 42876 15626
        System.out.println("\n   *** task 03 ***   ");

        printCiftKarekok(sayiList);
        System.out.println("\n   *** task 04 ***   ");


    }//main sonu

    // Task01-> listin çift elemanlarının karelerini aynı satıra aralarına bosluk bırakarak print eden code create ediniz.

    private static void printCiftKare(List<Integer> sayiList) {
        sayiList.
                stream().//7, 17,  3, 13, 35, 25, 16, 6
                filter(SeedMethods::ciftMi).//16, 6
                //map(t-> (int)(Math.pow(t,2))).
             //   map(t-> t*t).
                map(SeedMethods::kareAl).//256 36
                forEach(SeedMethods::intYazdir);//256 36
        ////map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update)için map kullanılmaktadır.
    }
    // Task02 : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini
    // ayni satirda aralarina bosluk birakarak print eden code create ediniz.

    private static void printTekKüpBirFazla(List<Integer> sayiList) {

        sayiList.
                stream().//7, 17,  3, 13, 35, 25, 16, 6
              //  filter(t-> t%2==1).//7, 17,  3, 13, 35, 25
                filter(SeedMethods::tekMi).//7, 17,  3, 13, 35, 25
                map(t-> t*t*t+1).//344 4914 28 2198 42876 15626
                forEach(SeedMethods::intYazdir);//344 4914 28 2198 42876 15626
    }

    // Task03-> Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina
    // bosluk birakarak print eden code create ediniz.

    private static void printCiftKarekok(List<Integer> sayiList) {

        sayiList.
                stream().//7, 17,  3, 13, 35, 25, 16, 6
                filter(SeedMethods::ciftMi).//16, 6
                map(t-> (int)Math.sqrt(t)).//4 2
                forEach(SeedMethods::intYazdir);//4 2

    }


}
