package task08_whileLoop;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print eden code create ediniz

		 */

		Scanner input = new Scanner(System.in);

		System.out.println("İsim ve soyisim giriniz");
		String isimSoyisim = input.nextLine();

		int index = 0;
		char ilkHarf = isimSoyisim.charAt(0);
		char sonHarf = isimSoyisim.charAt(isimSoyisim.length() - 1);

		while (ilkHarf <= sonHarf) {
			System.out.print(ilkHarf + " ");
			ilkHarf++;
		}


	}

}
