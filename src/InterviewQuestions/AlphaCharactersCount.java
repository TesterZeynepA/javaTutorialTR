package InterviewQuestions;

import java.util.Arrays;

public class AlphaCharactersCount {

	public static void main(String[] args) {

		
		// Task-> Find out how many alpha characters present in a string?
		// "heKL75jki8#"; ifdesindeki harf sayısıı print eden code create ediniz.

		String str = "heKL75jki8#";
		int harfSayisi = harfSayisiBulma(str);
		System.out.println("Girilen ifadede harf sayısı: " + harfSayisi);
		System.out.println("str.replaceAll(\"[^a-zA-Z]\", \"\").length() = " + str.replaceAll("[^a-zA-Z]", "").length());


	}

	public static int harfSayisiBulma(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				count++;
			}
		}
		return count;
	}
}