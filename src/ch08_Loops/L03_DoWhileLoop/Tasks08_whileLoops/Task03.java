package ch08_Loops.L03_DoWhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("bir tam sayı giriniz");
		int num = input.nextInt();


		for (int i = 1; i < 11; i++) {

			System.out.println("(çarpım tablosu = " + (num + "x" + i + "=" + (num * i)));

		}


		System.out.println("****** while ile çözüm *****");




	int i =1;
		while (i<=10){

			System.out.println("(çarpım tablosu = " + (num + "x" + i + "=" + (num * i)));
		    i++;

		}




	}

}
