package tasks05;

import java.util.Scanner;

public class Ifstatement04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 sayi 3 basamakli ise console ' a 3 basamakli yazdirin
		 sayi 2 basamakli ise console'a 2 basmakli yazdirin
		 sayi 3 basamakli yada 2 basamakli degilse ikiside degil yazdirin
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = input.nextInt();
		if (sayi >= 100 && sayi <=999) {
			System.out.println("Üç basamaklı");

		}else if (sayi >= 10 && sayi <=99) {
			System.out.println("İki basamaklı");
		}else if ((sayi<=9 ||sayi>=1000)) {
			System.out.println("sayi üç ya da iki basamaklı değil");
		}




	}

}
