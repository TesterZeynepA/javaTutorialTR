package ch08_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
//girilen pozitif sayıdan 100 e kadar 4 ün katı tamsayıları print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = input.nextInt();

        if (sayi <0){

            System.out.println("pozitif sayı girmelisiniz");
        }else {

            for (int i = sayi; i <=100 ; i++) { // i sayidan başlar 100 e kadar artarak devam eder
                if (i%4==0) {// her bir i degeri 4 e tam bölünürse şarti
                    System.out.println("i = " + i);


                }

            }


        }

    }
}
