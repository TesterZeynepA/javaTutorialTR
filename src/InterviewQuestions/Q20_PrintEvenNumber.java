package InterviewQuestions;

import java.util.Scanner;


public class Q20_PrintEvenNumber {
    /* Task->
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    Girilen sayını tek-çiftlğini return eden method create ediniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = input.nextInt();

        System.out.println(tekCiftKontrol(sayi));
        System.out.println(tekCiftKontrol1(sayi));

    }//main sonu

    private static boolean tekCiftKontrol(int sayi) {
        return sayi % 2 == 0 ? true : false;
    }

    private static String tekCiftKontrol1(int sayi) {
        return sayi % 2 == 0 ? "sayı CİFT" : "sayı TEK";
    }

}//Class sonu