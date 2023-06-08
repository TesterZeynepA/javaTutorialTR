package tasks07;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */

        Scanner input = new Scanner(System.in);
        System.out.println("String giriniz");
        String str = input.nextLine();

        str = str.substring(0,str.length()-1);
        System.out.println("str = " + str);


    }
}
