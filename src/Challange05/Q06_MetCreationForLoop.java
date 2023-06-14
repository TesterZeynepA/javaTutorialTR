package Challange05;

import java.util.Scanner;

public class Q06_MetCreationForLoop {
    public static void main(String[] args) {
 /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */

        Scanner input = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin = input.next();

        for (int i = metin.length()-1; i >=0 ; i--) {

            System.out.print(metin.charAt(i));


        }



    }
}
