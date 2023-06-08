package tasks06;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// kullanicidan VIP (Very Important Person) kisaltmasinda hangi harfin anlamini
		// istedigi soralim
		// girilen harfin aciklamasini yazdiralim
		Scanner input = new Scanner(System.in);
		System.out.println("VIP kısaltmasında hangi harfin anlamını öğrenmek istersiniz?");
		String harf = input.next().toUpperCase();

		switch (harf) {

			case "V":
				System.out.println("V : Very");
				break;
			case "I":
				System.out.println("I : Important");
				break;
			case "P":
				System.out.println("P : Person");
				break;
			default:

				System.out.println("Geçersiz bir harf girdiniz");


		}


	}
}
