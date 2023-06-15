package Challange06;

import java.util.Scanner;

public class Task08_AsalKontrol {
      /*
   Task->
    Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
     */
      public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("lütfen bir sayı giriniz");
            int sayi = input.nextInt();

            boolean asalMi = true;
            int bolen = 2;

            while (bolen <= sayi / 2) {
                  if (sayi % bolen == 0) {
                        asalMi = false;
                        break;
                  }
                  bolen++;
            }

            if (asalMi) {
                  System.out.println(sayi + " bir asal sayıdır.");
            } else {
                  System.out.println(sayi + " bir asal sayı değildir.");


            }
      }




}
