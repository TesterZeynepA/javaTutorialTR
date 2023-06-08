package Challange03;

import java.util.Scanner;

public class Task02_Ternary {
    public static void main(String[] args) {
        /* Task->
         * Girilen fiyat içinb
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * print eden code create ediniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir fiyat giriniz");
        double fiyat = input.nextDouble();

        String result = fiyat <10 ? "ucuz" : fiyat>=10 && fiyat<20 ? "normal" : fiyat>=20 ? "pahali" : "geçersiz bir fiyat girdiniz";

        System.out.println("result = " + result);


    }


    }

