package task08_whileLoop;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner input = new Scanner(System.in);


        char ch;
        do {
            System.out.println("bir karakter giriniz");
            ch = input.next().charAt(0);

            if (ch == 'x') {
                System.out.println("JAVATAR");
                continue;

            }
            System.out.println("javaCAN");
        } while (ch != 'x');


    }
}

