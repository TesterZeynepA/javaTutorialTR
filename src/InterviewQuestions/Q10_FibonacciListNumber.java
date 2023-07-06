package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_FibonacciListNumber {

    /* Task-!
     Girilen bir tamsayıya kadar FIBONACCI dizisini print eden code create ediniz.
     0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi = input.nextInt();


        for (int i = 0; i <= sayi; i++) {

            System.out.println("fibonacci(i) = " + fibonacci(i));

        }

    }

    private static int fibonacci(int n) {

        if (n <= 1) {
            return n;

        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

}