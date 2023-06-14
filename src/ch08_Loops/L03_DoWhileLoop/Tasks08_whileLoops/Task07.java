package ch08_Loops.L03_DoWhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz

        Scanner input = new Scanner(System.in);

      int count = 1;
      int enBuyukSayi = Integer.MIN_VALUE;

      while (count <= 5) {
          System.out.println(count + ". sayıyı girin: ");
          int sayi = input.nextInt();

          if (sayi > enBuyukSayi) {
              enBuyukSayi = sayi;
          }

          count++;
      }

      System.out.println("En büyük sayı: " + enBuyukSayi);

        // sadece if ile uzun çözüm

      //  System.out.println("***** if ile uzun çözüm *****");

    // int sayi1, sayi2, sayi3, sayi4, sayi5;
    // int enBuyuk;

    // System.out.println("1. sayıyı girin: ");
    // sayi1 = input.nextInt();

    // System.out.println("2. sayıyı girin: ");
    // sayi2 = input.nextInt();

    // System.out.println("3. sayıyı girin: ");
    // sayi3 = input.nextInt();

    // System.out.println("4. sayıyı girin: ");
    // sayi4 = input.nextInt();

    // System.out.println("5. sayıyı girin: ");
    // sayi5 = input.nextInt();

    // enBuyuk = sayi1;

    // if (sayi2 > enBuyuk) {
    //     enBuyuk = sayi2;
    // }

    // if (sayi3 > enBuyuk) {
    //     enBuyuk = sayi3;
    // }

    // if (sayi4 > enBuyuk) {
    //     enBuyuk = sayi4;
    // }

    // if (sayi5 > enBuyuk) {
    //     enBuyuk = sayi5;
    // }

    // System.out.println("En büyük sayı: " + enBuyuk);


    }
}
