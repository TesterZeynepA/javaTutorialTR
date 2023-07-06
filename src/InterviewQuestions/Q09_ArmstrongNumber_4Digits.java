package InterviewQuestions;

import java.util.Scanner;

public class Q09_ArmstrongNumber_4Digits {
   /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Beş basamakli bir sayi giriniz");

       int rakamKupToplam= 0;

        String sayi= input.next();
        
        String [] rakam = sayi.split("");

        for (int i = 0; i < rakam.length; i++) {

            rakamKupToplam+= Math.pow(Double.parseDouble(rakam[i]), rakam.length);
            
        }

        System.out.println(
                rakamKupToplam == Integer.parseInt(sayi) ?
                        ("girilen sayi " + sayi + " AMSTRONG :) ") :
                        "girilen sayi " + sayi + " AMSTRONG değil :( ");

        




    }
}