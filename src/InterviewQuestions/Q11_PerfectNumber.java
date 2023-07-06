package InterviewQuestions;

import java.util.Scanner;

public class Q11_PerfectNumber {
    /* Task->
    Perfect Number (Mukemmel sayi)
      Girilen bir sayinın mukemmel olmasını kontrol eden method create ediniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();

        int toplam =0;

        for (int i = 1; i < sayi ; i++) {

            if (sayi%i ==0){

                toplam+= i;
            }

        }

        System.out.println("toplam = " + toplam);

       // if (toplam==sayi) {
//
       //     System.out.println(sayi+ " sayisi mükemmel sayidir");
       // }else
       //     System.out.println(sayi+" sayisi mükemmel sayi Değildir!" );

      String result = (toplam==sayi) ? "sayi mükemmeldir" : "sayi mükemmel değildir";

        System.out.println("result = " + result);


    }

}