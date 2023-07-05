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

        System.out.println("ilkSonHarfTekrari(str, tekrar) = " + ilkSonHarfTekrari(str, tekrar));


    }

    public static String ilkSonHarfTekrari(String str, int tekrar) {
      String output= "";



        for (int i = 0; i <= tekrar ; i++) {

            output+= str.substring(0,1)+str.substring(str.length()-1);
        }


        return output;

    }//main sonu


}//class sonu
