package Challange08;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
       /* task->
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)

        */

        Scanner input= new Scanner(System.in);

        int[] arr = new int[8];

        System.out.println("Lütfen 8 tamsayı giriniz:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }

        System.out.println("Dizideki 3'e bölünebilen sayı adedi: " + count);
    }

    }
