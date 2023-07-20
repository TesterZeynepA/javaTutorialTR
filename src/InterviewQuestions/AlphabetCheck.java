package InterviewQuestions;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
	 // Task->
		// Check if the character is among a-z or A-Z
	    // girilen karakterin a-z or A-Z arasında olmasını kontrol eden code create ediniz

		Scanner input =new Scanner(System.in);
		System.out.println("bir ifade giriniz");
	    char ch =input.next().charAt(0);

		System.out.println((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') ?
				" girilen karakter ALPHABET" : " girilen karakter ALPHABET DEĞİL");


		if (isLowerCase(ch) || isUpperCase(ch)) {
			System.out.println("Girilen karakter a-z veya A-Z arasındadır.");
		} else {
			System.out.println("Girilen karakter a-z veya A-Z arasında değildir.");
		}
	}

	// Küçük harf kontrolü
	public static boolean isLowerCase(char ch) {
		return ch >= 'a' && ch <= 'z';
	}

	// Büyük harf kontrolü
	public static boolean isUpperCase(char ch) {
		return ch >= 'A' && ch <= 'Z';
	}
}
