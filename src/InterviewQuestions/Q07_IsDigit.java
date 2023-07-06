package InterviewQuestions;

import java.util.Scanner;

public class Q07_IsDigit {
      /* Task->
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     girilen bir stringdeki rakam değerlerinin toplamını return eden method create ediniz.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = input.nextLine();


        System.out.println("sumOfDigit(str) = " + sumOfDigit(str));


    }

    private static int sumOfDigit(String s) {

        int toplam=0;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))){

                toplam+= Character.getNumericValue(s.charAt(i));// ascii değeri olan character numerik

              //  toplam+=Integer.valueOf(s.charAt(i));
            }

        }
        return  toplam;

    }


}
