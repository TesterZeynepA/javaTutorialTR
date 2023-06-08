package Challange04;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
         * Girilen 4 kelime  cumle haline getirip sonunda . ile print eden code create ediniz.
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Dört kelime giriniz");
        String kelime = input.nextLine();
        String kelime2 = input.nextLine();
        String kelime3 = input.nextLine();
        String kelime4 = input.nextLine();
        System.out.println("cümle = " + ((kelime.toUpperCase().charAt(0) + kelime.substring(1) )+" " + kelime2 + " " + kelime3 + " " + kelime4 + "."));


    }
}
