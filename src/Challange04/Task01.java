package Challange04;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("adınızı ve soyadınızı giriniz");
        String AdSoyad = input.nextLine();

        String result =AdSoyad.toUpperCase();
        System.out.println("result: " + result);












    }
}
