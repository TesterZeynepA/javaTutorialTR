package Challange05;

import java.util.Scanner;

public class Q05_NestedForLoop {
    public static void main(String[] args) {
/*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

        Scanner input = new Scanner(System.in);
        System.out.println("lünfen bir sütun giriniz");
        int sütun = input.nextInt();
        System.out.println("lütfen bir satır giriniz");
        int satır = input.nextInt();

        for (int i = 1; i <= satır; i++) {

            for (int j = 1; j <= sütun; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }











    }
}
