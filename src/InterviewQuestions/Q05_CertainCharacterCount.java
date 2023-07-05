package InterviewQuestions;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /* Task->
     * Girilen  bir cumle ve bir harf için
     * Cumlede harfin kac kere
     * kullanildigini print eden code create ediniz.
     *  ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle = input.nextLine().toLowerCase();

        System.out.println("bir harf giriniz");
        char harf = input.next().toLowerCase().charAt(0);

        int countHarf= 0;

        for (int i = 0; i < cumle.length(); i++) {

            if (harf==cumle.charAt(i)){

                countHarf++;

            }

        }

        System.out.println(cumle + " cümlesinde " + harf + " harfi " + countHarf + " kere geçmektedir" );


    }
}
