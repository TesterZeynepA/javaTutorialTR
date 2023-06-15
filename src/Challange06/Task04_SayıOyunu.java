package Challange06;

import java.util.Scanner;

public class Task04_SayıOyunu {

    /*
    Task->
       Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = input.nextInt();

        int toplam=0;
        int sayac=0;


        while (true){
            sayac++;
            toplam+=sayi;
            System.out.println("girilen sayıların toplamı :" +toplam);
            if (toplam >100){
                System.out.println(sayac + " kere sayı girdin. Bu kadar sayı yeter");
                break;
            }else

            System.out.println("bir sayi giriniz");
            sayi = input.nextInt();

            System.out.println();
        }






    }

}
