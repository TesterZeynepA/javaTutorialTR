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

        int sayi = input.nextInt();

        int birler = sayi %10;
        int onlar= (sayi/10)%10;
        int yüzler = (sayi/100)%10;
        int binler = (sayi/1000)%10;
        int onBinler = (sayi/10000)%10;

        int armstrong = (birler*birler*birler)+ (onlar*onlar*onlar)+ (yüzler*yüzler*yüzler)+
                (binler*binler*binler)+ (onBinler*onBinler*onBinler);

        if (sayi == armstrong){

            System.out.println(sayi + " sayisi Armstrong bir sayidir");


        }else
            System.out.println(sayi + " sayisi Armstrong bir sayi değildir");








    }
}