package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {


    public static void main(String[] args) {

        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...

         */
        Scanner input = new Scanner(System.in);
        System.out.print("Cinsiyetinizi giriniz: (Erkek ise 'E' Kadın ise 'K') ");
        char cinsiyet = input.next().toUpperCase().charAt(0);

        System.out.print("Yas giriniz: ");
        int yas = input.nextInt();

        System.out.print("Prim gununu giriniz: ");
        int prim = input.nextInt();

        if (cinsiyet == 'K') {
            if (yas >= 60) {
                if (prim >= 6000) {
                    System.out.println("Emeklisiniz.");
                }else {
                    prim = 6000 - prim;
                    System.out.println("gerekli prim = " + prim);
                }
            }else {
                yas = 60 - yas;
                System.out.println("gerekli yıl = " + yas);
            }

        } else if (cinsiyet == 'E' ) {
            if (yas >= 65) {
                if (prim >= 7000) {
                    System.out.println("Emeklisiniz.");
                }else {
                    prim = 7000 - prim;
                    System.out.println("gerekli prim = " + prim);
                }
            }else {
                yas = 65 - yas;
                System.out.println("gerekli yıl = " + yas);
            }
        }else {
            System.out.println("Cinsiyet için yanlış giriş yaptınız...");
        }


    }
}
