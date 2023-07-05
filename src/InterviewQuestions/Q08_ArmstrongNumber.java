package InterviewQuestions;

import java.util.Scanner;

public class Q08_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dört basamakli bir sayi giriniz");

        int sayi = input.nextInt();

        int birler = sayi %10;
        int onlar= (sayi/10)%10;
        int yüzler = (sayi/100)%10;
        int binler = (sayi/1000)%10;

        int armstrong = (birler*birler*birler)+ (onlar*onlar*onlar)+ (yüzler*yüzler*yüzler)+ (binler*binler*binler);
        if (sayi == armstrong){

            System.out.println(sayi + " sayisi Armstrong bir sayidir");


        }else
            System.out.println(sayi + " sayisi Armstrong bir sayi değildir");








    }
}
