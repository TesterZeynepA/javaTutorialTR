package InterviewQuestions;

import java.util.Scanner;

public class Q63_FactorialWithoutLoop {
    /*
        0! = 1,     1! = 1,     2! = 2*1,   3! = 3*2*1,     6! = 6*5*4*3*2*1
    */
    public static void main(String[] args) {

        System.out.println("loopsuzFaktoriyel(5) = " + loopsuzFaktoriyel(5));

    }

    private static int loopsuzFaktoriyel(int sayi) {

        return sayi==1? 1:sayi*loopsuzFaktoriyel(sayi-1);
    }
    }


