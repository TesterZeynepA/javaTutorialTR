package Challange06;

import java.util.Scanner;

public class Task03_TekSayıAdedi {

    /* Task->
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ve adedini print eden code create ediniz.

   */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");

        int sayi =input.nextInt();

        int i = 1;
        int tekSayiAdedi =0;

        while (i<= sayi) {

            if (i%2 ==1) {
                tekSayiAdedi++;
                System.out.print(i + " \n");

            }


            i++;

        }
        System.out.println("Tek sayı adedi :" + tekSayiAdedi);




    }

}
