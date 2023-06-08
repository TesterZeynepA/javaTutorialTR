package tasks06;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		 Kullanizi ay ismini girdiginde o ayin kac cektigini ekrana yazan bir program yapiniz
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir ay ismi giriniz :");
		String ay = input.next().toLowerCase();

		switch (ay) {
			case "ocak":
			case "mart":
			case "mayıs":
			case "temmuz":
			case "ağustos":
			case "ekim":
			case "aralık":

				System.out.println("Bu ay 31 gün çekiyor");
				break;

			case "nisan":
			case "haziran":
			case "eylül":
			case "kasım":

				System.out.println("Bu ay 30 gün çekiyor");
				break;

			case "şubat":

				System.out.println("Lütfen bir yıl giriniz");

				int yil = input.nextInt();

				Object subat = (yil % 4 == 0) ?  "Bu ay 29 çekiyor" : "Bu ay 28 çekiyor";

				System.out.println(subat);

				break;

			default:
				System.out.println("Lütfen geçerli bir ay ismi giriniz");
				break;


		}



	}

}
