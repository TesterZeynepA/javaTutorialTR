package Lambda_StreamApi.LambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7,58,17,54,33,3,13,35,65,18,61,46,25,16,6));

        System.out.println("    *** task 01 ***   ");

        printCiftStructured(sayiList);//58 54 18 46 16 6 
        
        System.out.println("\n   *** task 02 ***   ");
        
        printCiftFunctional(sayiList);//58 54 18 46 16 6

        System.out.println("\n   *** task 03 ***   ");

        print35KckCiftFunctional(sayiList);//18 16 6

        System.out.println("\n   *** task 04 ***   ");

        print35KckCiftFunctional1(sayiList);//18 16 6

        System.out.println("\n   ***  ***   ");

        print34BykTekFunctional2(sayiList);//7 58 17 54 33 3 13 35 65 61 46 25

    }//main sonu


    //Task01->"Structured Programming"--> AMELE Programming kullanarak listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz

    private static void printCiftStructured(List<Integer> sayiList) {

        for (int avuc : sayiList) {

            if (avuc%2==0){
                System.out.print(avuc + " ");
            }
        }
    }
//task02-> "Functional Programming"--> CINCIX Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz

private static void printCiftFunctional(List<Integer> sayiList) {

        sayiList.//action a girecek akış kaynağı call edildi
                stream().//call edilen collection elemanları akışa alındı
               // filter(t->t%2==0).//akıştaki elemanlar çift şartına göre filtreledi.
                filter(SeedMethods::ciftMi).
                forEach(SeedMethods::intYazdir);//akişta  çifte göre filtrelenen elemanlar print edildi...

}
    //task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin 35'den kucuk
    // çift elemanlarını aynı satırda aralarında bosluk ile print ediniz

    private static void print35KckCiftFunctional(List<Integer> sayiList) {

        sayiList.
                stream().
                //.filter(t-> t % 2 == 0 && t < 35).//akistaki 35 den kck çift elemanlar filtrelendi.
        filter(t-> t % 2 == 0).filter(t-> t<35).
                forEach(SeedMethods::intYazdir);
    }
    private static void print35KckCiftFunctional1(List<Integer> sayiList) {

        sayiList.
                stream().
                        filter(SeedMethods::cift35Kck).///akistaki 35 den kck çift elemanlar filtrelendi.
                forEach(SeedMethods::intYazdir);
    }

    //task04-> "Functional Programming"--> CINCIX Programming kullanarak  listin 34'den buyuk yada  tek
    // elemanlarını aynı satırda aralarında bosluk ile print ediniz

    private static void print34BykTekFunctional2(List<Integer> sayiList) {

        sayiList.
                stream().
                filter(t-> t%2==1 || t>34).
                forEach(SeedMethods::intYazdir);
    }

}

