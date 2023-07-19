package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q31_DuplicateValue {
       /* Task->
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Girilen bir string için tekrarlanan karakterleri print eden code create ediniz.
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str = input.next();

        tekrarKarakteriBul(str);
    }

    public static void tekrarKarakteriBul(String str) {
        str = str.toLowerCase();
        System.out.println("Stringde tekarlanan karakterler: ");

        for (int i = 0; i < str.length(); i++) {
            char mevcutKarakter = str.charAt(i);

            if (Character.isLetter(mevcutKarakter)) {
                int sayac = 0;

                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == mevcutKarakter) {
                        sayac++;
                    }
                }

                if (sayac > 0) {
                    System.out.println("Girilen String ifadede " + (sayac + 1) + " tane " + mevcutKarakter + " vardır.");
                }
            }
        }
    }
}


