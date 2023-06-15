package Challange06;

import java.util.Scanner;

public class Task09_HarfSay {
    /* Task->
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cümle = input.nextLine();
        System.out.println("Bir karakter giriniz");
        char harf = input.next().charAt(0);

        int harfSayisi = 0;
        int index = 0;
        int cumleUzunlugu = cümle.length();

        while (index < cumleUzunlugu) {
            if (cümle.charAt(index) == harf) {
                harfSayisi++;
            }

            index++;
        }

        System.out.println(cümle + " cümlesinde " + harf + " harfi " + harfSayisi + " kere kullanılmış.");


        //hocanın for çözümü


        for (int i = 0; i < cümle.length(); i++) {
            if (cümle.charAt(i) == harf) {
                harfSayisi++;


            }



        }
        System.out.println(harf + "harfi adedi = " + harfSayisi);


    }



    }
