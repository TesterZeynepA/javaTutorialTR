package OzelTasklar;

import java.util.Arrays;
import java.util.Scanner;

public class T04_AnagramKontrol {

    public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kelimeyi giriniz: ");
        String str1 = input.nextLine();

        System.out.print("Ikinci kelimeyi giriniz: ");
        String str2 = input.nextLine();

        boolean anagram = anagramKontrolu(str1, str2);

        if (anagram) {
            System.out.println("Girilen kelimeler anagramdır.");
        } else {
            System.out.println("Girilen kelimeler anagram değildir.");
        }
    }
    public static boolean anagramKontrolu(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1, charArr2);
    }
}