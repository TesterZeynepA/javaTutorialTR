package ch04_JavaOperators.jo01_ArithmeticOperators;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        int number = 7;
        //pre increment

        System.out.println(++number);//8
        System.out.println("number = " + number);// number =8

        //post increment

        System.out.println(number++);//8
        //postincrement sonrası deger güncellendi

        System.out.println("number = " + number);// number =9

        System.out.println(number++ + ++number);//20

        System.out.println("number = " + number);//11

        System.out.println(number++ + number++); // 11 + 12 = 23;

        //the value changed at 'number++' is never used.





    }
}
