package OzelTasklar;

import java.util.Scanner;

public class T05_KullaniciSayiGir {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde, 
		 * ekrana o ana kadar girmiş olduğu 
         * tüm sayıların toplamını yazdırınız.
         * Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
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