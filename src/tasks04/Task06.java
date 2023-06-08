package tasks04;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */

        Scanner input = new Scanner (System.in);
        System.out.println("Üç basamaklı bir sayı giriniz : ");
        int sayi= input.nextInt();
        int sayi2 = sayi;
        // 1'ler basamagi -> bir sayının 10 a bölümünden kalan 1 ler basamağıdır.
        int birler = sayi % 10;
        sayi /= 10;
        int onlar = sayi % 10;
        int yuzler = sayi / 10;

        System.out.println("Girdiginiz sayinin birler basamagi : "+birler+" \nGirdiginiz sayinin onlar basamagi : "+onlar+" \nGirdiginiz sayinin yuzler basamagi : "+yuzler+"");





    }
}
