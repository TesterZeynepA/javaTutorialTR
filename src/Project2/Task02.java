package Project2;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		/*
		 Task-> girilen sayıya kadar  tüm sayıların toplamını print eden METHOD create ediniz.
          Ornegin; 5, 4, 7, 0 ise 5+4+7=16

		  */

		sıfıraKadarTopla();

	}

	private static void sıfıraKadarTopla() {

		int sayi = 0;

		int toplam = 0;

		do {
			Scanner input = new Scanner(System.in);

			System.out.println("lütfen bir sayi giriniz");

			sayi = input.nextInt();

			toplam += sayi;


		} while (sayi != 0);

		System.out.println("toplam = " + toplam);


	}
}