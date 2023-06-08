package Challange02;

import java.util.Scanner;

public class Task04_IfStatement {
    public static void main(String[] args) {

        /* Task ->
         * Girilen Y/N  degerlerini
         * print eden code create ediniz..
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner input = new Scanner(System.in);
        System.out.println("yes için Y, no için N giriniz");
        char harf = input.nextLine().charAt(0);

        if (harf == 'Y' || harf == 'y') {

            System.out.println("YES");

        } else if (harf == 'N' || harf == 'n') {

            System.out.println("NO");

        } else System.out.println("yanlış bir harf girdiniz");

    }






    }

