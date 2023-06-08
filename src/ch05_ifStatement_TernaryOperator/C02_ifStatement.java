package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifStatement {
    public static void main(String[] args) {

// TASK -> girilen yasın 18 den büyüklügünü kontrol eden code create edinitz
        // 18 den küçük ise ehliyet alamazsınız print ediniz

        Scanner input = new Scanner(System.in);

        System.out.print("Yasinizi giriniz: ");
        int yas = input.nextInt();

        if (yas >= 18) {

            System.out.println("ehliyet alabilirsiniz");

        }

    else {

            System.out.println("ehliyet alamazsiniz");
        }


    }
}
