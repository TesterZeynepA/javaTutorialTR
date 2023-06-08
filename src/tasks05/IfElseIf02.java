package tasks05;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
“Eşkenar üçgen�? yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen�?
yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın�?
		 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("üçgenin a kenar uzunluğunu giriniz");
		int a = input.nextInt();
		System.out.println("üçgenin b kenar uzunluğunu giriniz");
		int b = input.nextInt();
		System.out.println("üçgenin c kenar uzunluğunu giriniz");
		int c = input.nextInt();
		if (a ==b && c==a && (a>0 && b>0 && c>0)) {
			System.out.println("Eşkenar üçgen");
		} else if (a==b && c!=a && (a>0 && b>0 && c>0)) {

			System.out.println("Ikizkenar üçgen");
		} else if (a!=b && b!=c && a!=c && (a>0 && b>0 && c>0)) {

            System.out.println("Çeşitkenar üçgen");
		}else

			System.out.println("Lütfen geçerli bir kenar uzunluğu giriniz");



	}
	

}
