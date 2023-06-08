package tasks05;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf" yazdirin
		 Bu character kucuk harf ise "Kucuk Harf" yazdirin
		 Bu character harf degil ise "Harf Degil" yazdirin
		*/

		Scanner input = new Scanner (System.in);
		System.out.println("Bir karakter giriniz :");
		char character = input.next().charAt(0);

        if (Character.isUpperCase(character)) {
			System.out.println("Buyuk Harf");
		}else if (Character.isLowerCase(character)) {
			System.out.println("Kucuk Harf");
		} else

			System.out.println("Girilen harf değil");



} 

}
