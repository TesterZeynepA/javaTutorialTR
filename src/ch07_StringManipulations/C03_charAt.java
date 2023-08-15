package ch07_StringManipulations;

import java.util.Scanner;

public class C03_charAt {
    public static void main(String[] args) {
        /*
       charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
       index değeri 0'dan başlar
        */
        String city = "Istanbul";
        // city variable inin birinci karakterini bulun yazdirin
        System.out.println("city.charAt(0) = " + city.charAt(0)); // city.charAt(0) = I
    //city variable inin birinci indexte ki elemani bulun yazdirin
        System.out.println("city.charAt(1) = " + city.charAt(1)); //city.charAt(1) =s
        char cityBirinciIndexElemani = city.charAt(1);
        System.out.println("cityBirinciIndexElemani = " + cityBirinciIndexElemani);

        //task son karakteri alin atama ile yazdıran kod yaziniz


        System.out.println("city.charAt(city.length()-1) = " + city.charAt(city.length() - 1));

        int SonHarfIndexi = city.length() - 1;
        System.out.println("SonHarfIndexi = " + SonHarfIndexi);
        System.out.println("city.charAt(SonHarfIndexi) = " + city.charAt(SonHarfIndexi));
        //

        //alinan son karakteri uygun bir variable a atama yaparak yazdirin.

        char son = city.charAt(city.length()-1);
        System.out.println("son = " + son);

        // RTE System.out.println("city.charAt(21) = " + city.charAt(21));


        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri
// print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.println("Bir şehir giriniz");
        String cityName = input.nextLine();

        if (cityName.length()%2!=0) { // girilen ifadenin lenght i tek sayi ise if calisacak.
            // lenght i ikiye bölerek ortadaki indeks bulunur.
            System.out.println("orta karakter = " + cityName.charAt(cityName.length() / 2));
        }else {
            System.out.println("orta karakter bulunamadı");
        }



    }
}
