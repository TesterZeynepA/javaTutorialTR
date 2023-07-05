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

        String [] arr = str.split(" ");

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {


            toplam += Integer.parseInt(arr[i].replaceAll("\\D", ""));

        }


        System.out.println("toplam = " + toplam);








    }



}
