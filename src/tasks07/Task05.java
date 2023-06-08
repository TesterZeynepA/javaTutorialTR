package tasks07;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen adınızı ve soy adınızı giriniz");
        String isim = input.nextLine().toLowerCase();

        int soyIsimBaşlangıcIndexi = isim.indexOf(" ") +1;
        isim = isim.substring(0,1).toUpperCase()
                +isim.substring(1, soyIsimBaşlangıcIndexi)
                + isim.substring(soyIsimBaşlangıcIndexi,soyIsimBaşlangıcIndexi+1).toUpperCase()
                +isim.substring(soyIsimBaşlangıcIndexi+1);
        System.out.println("isim = " + isim);


    }
}
