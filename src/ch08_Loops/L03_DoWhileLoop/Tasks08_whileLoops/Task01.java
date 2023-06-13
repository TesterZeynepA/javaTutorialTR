package ch08_Loops.L03_DoWhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

    Scanner input = new Scanner(System.in);

        int SayilarinToplami = 0;
        int SayiAdedi = 0;

        while (SayilarinToplami <= 333) {
            System.out.print("Bir sayı girin: ");
            int sayi = input.nextInt();
            SayilarinToplami += sayi;
            SayiAdedi++;
        }

        System.out.println("Girilen sayı adedi: " + SayiAdedi );
        System.out.println("Girilen sayıların toplamı: " + SayilarinToplami);
    }
}






