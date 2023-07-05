package InterviewQuestions;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /* Task->
     * Girilen  Stringin ilk ve son harfini yine girilen  sayi kadar
     * return eden metod create ediniz.
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str = input.next();
        System.out.println("ilk ve son harf için tekrar sayısını giriniz");
        int tekrar = input.nextInt();

        String yinelenenString = ilkSonHarfTekrari(str, tekrar);
        System.out.println(yinelenenString);
    }

    public static String ilkSonHarfTekrari(String str, int tekrar) {
        if (str.isEmpty() || tekrar <= 0) {
            return "";
        }

        char ilkHarf = str.charAt(0);
        char sonHarf = str.charAt(str.length() - 1);


        char[] tekrarKarakterler = new char[tekrar*2];

        int index= 0;

        for (int i = 0; i < tekrar; i+=2) {
            tekrarKarakterler[index++] = ilkHarf;
            tekrarKarakterler[index++] = sonHarf;
        }



        return new String(tekrarKarakterler);

    }


}
