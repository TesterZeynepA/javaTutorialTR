package Challange06;

import java.util.Scanner;

public class Task05_KombinasyonPermutasyon {

    /*  Problem Tanımı
  Verilen iki sayının kombinasyonunu bulan kodu yazınız.
  Hatırlatma C(n,r) = n! / (r!(n-r)!)

  Verilen iki sayının permütasyonunu bulan kodu yazınız.
  Hatırlatma P(n,r) = n! / (n-r)!

  Ekran Çıktısı
  Birinci sayıyı giriniz: 15
  Ikinci sayıyı giriniz: 4
  Kombinasyon: 1365
  permütasyon: 32760

  Birinci sayıyı giriniz: 5
  Ikinci sayıyı giriniz: 3
  Kombinasyon: 10
  permütasyon: 60
*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        int sayi1= input.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi2= input.nextInt();

        int faktoriyelSayi1 = faktoriyelHesapla(sayi1);
        int faktoriyelSayi2 = faktoriyelHesapla(sayi2);
        int faktoriyelÇıkarma = faktoriyelHesapla(sayi1 - sayi2);

        int kombinasyon = faktoriyelSayi1 / (faktoriyelSayi2 * faktoriyelÇıkarma);

        System.out.println("Kombinasyon: " + kombinasyon);


        int permutasyon = faktoriyelSayi1 / faktoriyelÇıkarma;

        System.out.println("Permutasyon: " + permutasyon);



    }

    public static int faktoriyelHesapla(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;







    }
}
