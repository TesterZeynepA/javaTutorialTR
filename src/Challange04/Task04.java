package Challange04;

import java.security.cert.CRLReason;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* Task->
         * Girilen  bir kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana  degil ise girilen kelimeyi print eden code create ediniz.
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = input.nextLine();




        if (kelime.length() >=3) {

            String SonİkiKarakter = String.valueOf(kelime.charAt(kelime.length()-2));
            String SonKarakter = String.valueOf(kelime.charAt(kelime.length()-1));
            System.out.println("Kelime = " + SonİkiKarakter +SonKarakter+SonİkiKarakter+SonKarakter);

        }else
            System.out.println(kelime);













    }
}
