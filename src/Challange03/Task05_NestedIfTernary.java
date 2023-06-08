package Challange03;

import java.util.Scanner;

public class Task05_NestedIfTernary {
    public static void main(String[] args) {

/* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();


       String result = sayi==0 ?"zero":sayi==1 ? "one" : sayi==2 ? "two" : sayi==3 ? "three"
               : sayi==4 ? "four" : sayi==5 ?"five" : sayi==6 ? "six" : sayi==7 ? "seven" : sayi==8 ? "eight"
               : sayi==9 ? "nine" : "Gecersiz";

       System.out.println("result = " + result);



    }
}
