package ch09_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {


        // Task-> girilen 7 tamsayının 10 ile 20 arasındakileri hariç toplamını print eden code create ediniz.

        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int count = 0;

        System.out.println("7  tane tamsayı girin:");

      // for (int i = 1; i <= 7; i++) {

      //     int sayi = input.nextInt();

      //     if (sayi < 10 || sayi > 20) {

      //         toplam += sayi;

      //     }
      // }

      // System.out.println("10 ile 20 arası hariç diğer tamsayıların toplamı : " + toplam);

        while (count <7){

            int num = input.nextInt();
            if (num>=10 && num <=20) {
                count++;
                continue;

            }
               toplam += num;
            count++;

        }
        System.out.println("girilen 7 tamsayının 10 ile 20 arasındakileri hariç toplamı " + toplam);









    }








    }
