package InterviewQuestions;

import java.util.Scanner;

public class Q27_AtbashCode {
    /*  Task->
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";

      Girilen bir str'nin AtbashCode print eden code create ediniz.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str = input.next();

        String atbashKod = atbashKodConvert(str);
        System.out.println(atbashKod);
    }

    public static String atbashKodConvert(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char karakter = str.charAt(i);

            if (Character.isLetter(karakter)) {
                if (Character.isUpperCase(karakter)) {
                    char kodluKarakter = (char) ('Z' - (karakter - 'A'));
                    sb.append(kodluKarakter);
                } else {
                    char kodluKarakter = (char) ('z' - (karakter - 'a'));
                    sb.append(kodluKarakter);
                }
            } else {
                sb.append(karakter);
            }
        }

        return sb.toString();
    }
}