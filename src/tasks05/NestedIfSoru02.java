package tasks05;

import java.util.Scanner;

public class NestedIfSoru02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Harf giriniz");
		char harf = input.next().charAt(0);
		String result = Character.isLowerCase(harf) ? (harf=='a'? "İlk küçük harf": "ilk küçük harf değil"): "küçük harf girmediniz";
		System.out.println("result = " + result);

		String result2 = Character.isUpperCase(harf) ? (harf=='Z' ? "Son büyük harf": "Son büyük harf değil"): "büyük harf girmediniz";
		System.out.println("result2 = " + result2);


	}

}
