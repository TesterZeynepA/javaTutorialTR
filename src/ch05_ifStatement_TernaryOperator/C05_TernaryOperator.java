package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {

    public static void main(String[] args) {
        // TASK-> girilen bir tamsayı çiftse yarısını değilse
        // "girilen sayı tek oldugu için yarısı tamsayı değildir"
        // print eden code create ediniz
    Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();
        int yari = sayi/2;
        if (sayi % 2 == 0 ) {
            System.out.println("çift sayinin yarisi = " + yari);
        } else {
            System.out.println("Girilen sayı tek oldugu icin yarisi tamsayi degildir");
        }


    }
}
