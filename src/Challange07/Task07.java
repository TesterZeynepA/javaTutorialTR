package Challange07;

import java.util.Scanner;

public class Task07 {

    /* task ->
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println(" iki tam sayi giriniz");
        int num1 = input.nextInt();
        int num2 = input.nextInt();


        System.out.println("esitMiKontrolEt(num1, num2) = " + esitMiKontrolEt(num1, num2));


    }

    private static String esitMiKontrolEt(int num1, int num2) {

        return num1 == num2 ? "girilen sayi Eşit" : "girilen sayi Eşit Değil";

    }
}




