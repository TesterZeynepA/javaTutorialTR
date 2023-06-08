package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {

    public static void main(String[] args) {
        // TASK-> girilen  pozitof bir tamsayının 2 veya daha fazla
        // basamaklı olmasını
        // kontrol eden code create ediniz.

Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int a = input.nextInt();

        String basamakSayi=(a>0&&a<10)?"Tek basamaklı Sayi":(a>9&&a<100)?"İki basamaklı":"İkiden daha fazla basamaklı sayı";
        System.out.println("basamakSayi = " + basamakSayi);
    }

}
