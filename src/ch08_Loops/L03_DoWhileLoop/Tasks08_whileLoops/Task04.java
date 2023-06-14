package ch08_Loops.L03_DoWhileLoop.Tasks08_whileLoops;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

		int sayi = 999;
		int count = 0;

		while (sayi >= 100) {
			if (sayi % 4 == 0 && sayi % 6 == 0) {
				System.out.println(sayi);
				count++;
			}
			sayi--;
		}

		System.out.println(count + " tane sayı vardır");

			
	}

}
