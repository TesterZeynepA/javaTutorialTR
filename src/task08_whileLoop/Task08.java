package task08_whileLoop;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //	Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        //	ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //	Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //	yanlislikla kac negative sayi girdigini
        //	ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Toplamak istediğiniz pozitif sayiları giriniz: ");
        int sayi = input.nextInt();

        System.out.println("İslemi bitirmek istediğinizde 0’a basın!");
        int toplam = 0, sayacPozitif = 0, sayacNegatif = 0;
        while (sayi != 0) {
            if (sayi > 0) {
                toplam += sayi;
                sayacPozitif++;
            } else {
                System.out.println("Negatif sayi giremezsiniz");
                sayacNegatif++;
            }
            sayi = input.nextInt();
        }
        System.out.println(sayacNegatif + " adet Negatif sayı girdiniz.");
        System.out.println(sayacPozitif + " adet Pozitif sayı girdiniz.");
        System.out.println("toplam = " + toplam);


    }
}
