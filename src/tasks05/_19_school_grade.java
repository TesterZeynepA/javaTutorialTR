package tasks05;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE

        Scanner input = new Scanner(System.in);
        System.out.println("Please Quiz Score entered");
        int Quiz_score = input.nextInt();
        System.out.println("Please Final Score entered");
        int Final_score = input.nextInt();
        System.out.println("Please mid term score entered");
        int mid_term_score = input.nextInt();
        int ortalama = (Quiz_score + mid_term_score + Final_score)/3;
        if ( ortalama >= 90) {
            System.out.println("Your grade is A");
        } else if (ortalama>=70 && ortalama < 90) {
            System.out.println("Your grade is B");
        }else if (ortalama >=50 && ortalama < 70) {
            System.out.println("Your grade is C");
        }else if (ortalama <50) {
            System.out.println("Your grade is F");
        }else {
            System.out.println("Invalid input");
        }


    }
}
