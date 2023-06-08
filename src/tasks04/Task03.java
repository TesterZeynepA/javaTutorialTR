package tasks04;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner input = new Scanner(System.in);

        System.out.print("Üç basamakli bir sayi giriniz: ");
		int sayi = input.nextInt();
		int birlerBasamagi = sayi - sayi/10*10;
		int yüzlerBasamagi = sayi / 100;
		System.out.println(birlerBasamagi + yüzlerBasamagi);

	// ikinci yöntem
		int basamak1 = sayi%10;
		int basamak2 = sayi/100;
		System.out.println(basamak1 + basamak2);
		
	}

}
