package Challange02;

import java.util.Scanner;

public class Task02_Modulus {
    public static void main(String[] args) {
        /*
         *  Girilen 5 basamakli tamsayinin ilk 2 ve son 2 basamagindaki rakamlari toplamini print eden code create ediniz.
         *
         *   Ex :
         *   input  : 14531
         *   output : 9
         */

        Scanner input = new Scanner (System.in);
        System.out.println("5 basamaklı bir sayı giriniz :");
        int num1 = input.nextInt();

        int ilkİkiSayi= num1 / 1000;
        int sonİkiSayi = num1%100;
      //  System.out.println("ilkİkiSayi = " + ilkİkiSayi);
      //  System.out.println("sonİkiSayi = " + sonİkiSayi);

        int sonİkiToplam = (sonİkiSayi/10)+(sonİkiSayi%10);
        System.out.println("sonİkiToplam = " + sonİkiToplam);
        int ilkİkiToplam = (ilkİkiSayi/10)+(ilkİkiSayi%10);
        System.out.println("ilkİkiToplam = " + ilkİkiToplam);

        System.out.println("girilen sayinin ilk 2 ve son 2 rakam toplamı :" + (ilkİkiToplam+sonİkiToplam));

    }
}
