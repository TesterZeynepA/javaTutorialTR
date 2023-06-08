package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

       /*
Task01
   girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
 */

        Scanner scanner = new Scanner (System.in);

        System.out.println("bir sayi giriniz");
    int sayi = scanner.nextInt();
    if (sayi < 0) {
        System.out.println("sayi negatif");

    }
        else if (sayi > 0) {

        System.out.println("sayi pozitif");

    }
else {

    System.out.println("sayi 0");
        }







    }
}
