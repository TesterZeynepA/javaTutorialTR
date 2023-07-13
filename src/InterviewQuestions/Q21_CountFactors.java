package InterviewQuestions;

import java.util.Scanner;

public class Q21_CountFactors {
      /* Task->
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Girilen sayının tam bolen sayısını print eden code create ediniz.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
*/
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Bir sayı giriniz");
            int sayi = input.nextInt();

            System.out.println("*** while ile ***");

            int bolenSayisi =0;
            int bolen= 1;

            while (bolen<=sayi){
                  if (sayi%bolen==0){
                        bolenSayisi++;

                        System.out.println(bolen + " ");
                  }
                  bolen++;
            }

            System.out.println();
            System.out.println(sayi + " nın " + bolenSayisi + " tane tam böleni vardır");

            System.out.println("****  for ile ****");
            int bolenSayi= 0;
            int boleni = 1;
            for (int i = 1; i <= sayi; i++) {
                  if(sayi%boleni==0){
                        bolenSayi++;
                        System.out.print(boleni+" ");
                  }
                  boleni++;
            }
            
            
      }
}
