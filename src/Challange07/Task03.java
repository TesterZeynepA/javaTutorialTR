package Challange07;

import java.util.Scanner;

public class Task03 {
    /* task->
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method create ediniz.
      */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("cm cinsinden bir sayi giriniz");
        int sayi = input.nextInt();

        System.out.println( sayi + " cm = " + cmToMeter(sayi) + " metre");

        System.out.println(sayi + " cm = " + cmToKilometer(sayi) + " kilometre");


    }

    private static double cmToKilometer(double cm) {
        return cm /100000;

    }

    private static double cmToMeter(double cm) {

        return cm/100;



    }

}