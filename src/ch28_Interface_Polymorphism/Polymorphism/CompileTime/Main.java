package ch28_Interface_Polymorphism.Polymorphism.CompileTime;

public class Main {
    public static void main(String[] args) {

        /**
         * Compile Time Polymorphism (Static Poly.)
         * "Method overloading"
         */

        Calculation.sum(5,9);
        Calculation.sum(5,9,55);
        Calculation.sum(5.9,5.6);
        Calculation.sum(5.9,6.5,99.36);

        Calculation.subtract(5,3);
        Calculation.subtract(5,3,2);
        Calculation.subtract(5.4,3.1);
        Calculation.subtract(55.25,35.10,2.1);




    }
}
