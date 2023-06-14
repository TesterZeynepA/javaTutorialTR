package ch08_Loops.L03_DoWhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = input.nextInt();

        int i = 1;
        while (i<= sayi) {

         if (i%2 ==1) {

             System.out.println(i + " ");

         }
            i++;

        }






    }
}
