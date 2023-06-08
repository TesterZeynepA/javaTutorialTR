package Challange02;

public class Task03_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println(" *** Arttirma *** ");
        int a = 1;
        System.out.println("++a = " + ++a);
        System.out.println("a++ = " + a++);
        System.out.println("a = " + a);

        int b = 5;
        System.out.println("--b = " + --b);
        System.out.println("b-- = " + b--);
        System.out.println("b = " + b);

        System.out.println(" *** Task *** ");

        int x = 20;
        int y =15;
        System.out.println("++x+y-- = " + ++x + y--);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("++x+y-- = " + ++x + y--);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int k = 7;
        System.out.println("++k+k+++k+++--k+k--+k = " + ++k + k++ + k++ + --k + k-- + k);


    }
}
