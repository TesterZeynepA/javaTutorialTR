package Challange04;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

        /* Task->
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str = input.nextLine();

        System.out.println("str.contains(\"xyz\") = " + str.contains("xyz"));


    }
}
