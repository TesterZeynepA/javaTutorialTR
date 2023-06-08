package Challange02;

import java.util.Scanner;

public class Task07_IfStatement {
    public static void main(String[] args) {

       /*

		task->
		Kullanicinın  yas ve kilo bilgileri için
		18 yasindan kucuk ise kan bagisi yapamaz.
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		print eden code create ediniz.

		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Yasinizi ve kilonuzu giriniz");
        int yas = input.nextInt();
        int kilo = input.nextInt();

        if (yas <18) {

            System.out.println("kan bagisi yapamaz!");

        }else if (yas >=18 && kilo <50) {

            System.out.println("kan bagisi yapamaz!");

        }else if (yas >=18 && kilo >=50) {

            System.out.println("kan bagisi yapabilir");

        }else System.out.println("yanlış bilgi girdiniz");








    }
}
