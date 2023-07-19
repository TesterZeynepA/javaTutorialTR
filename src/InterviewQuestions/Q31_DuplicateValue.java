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

        //2. yol

        char [] arr = str.toCharArray();//metin her bir karakter arr ye atandı
        ArrayList<Character> output = new ArrayList<Character>();//tekrarlanan elemanların depolanacağı boş list
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] ==arr[j] && !output.contains(arr[j])) {

                  //  System.out.println("arr[j] = " + arr[j]);
                    output.add(arr[j]);
                }
            }

        }

        System.out.println("output = " + output);


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


