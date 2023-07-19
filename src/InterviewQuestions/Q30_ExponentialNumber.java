package InterviewQuestions;

import java.util.Scanner;

public class Q30_ExponentialNumber {
    //Task->
    // Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // Girilen taban ve us değerleri için sayının kuvvetini print eden code create ediniz.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        int taban = input.nextInt();
        int us = input.nextInt();

        int cozum = 1;
        //1.yol

       // for (int i = 0; i < us; i++) {
       //     cozum *= taban;
       // }
       // System.out.println(taban + " sayısının  " + us + " . kuvveti = " + cozum+ " olur.");

        //2.yol

        System.out.println("***** while ile çözüm *****");

        System.out.println("   ***  while loop   ***   ");
        while (us != 0) {
            cozum *= taban;
            us--;
        }
        System.out.println(cozum);
    }

}



