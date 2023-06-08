package tasks03;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
         System.out.println("Lütfen Boyunuzu cm olarak girin");

         System.out.println("Lütfen kilonuzu kg olarak girin");

        int boy = scan.nextInt();

         double kilo = scan.nextDouble();

         int VKE = (int) (kilo/ (boy*boy/10000));

         double VKİ = (double) (kilo/ (boy*boy/10000.0));

         System.out.println("VKE = " + VKE);

         System.out.println("VKİ = " + VKİ);





    }
}
