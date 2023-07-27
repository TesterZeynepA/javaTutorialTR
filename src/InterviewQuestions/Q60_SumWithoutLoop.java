package InterviewQuestions;

import java.util.Scanner;

public class Q60_SumWithoutLoop {
   /*
   Task-> girilen sayıya kadar olan pozitif tamsayıların toplamını loop kullanmadan print eden code create ediniz.
    */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();

       // loopTopla(sayi);
        System.out.println("loopsuzTopla(sayi) = " + loopsuzTopla(sayi));

    }

    private static int loopsuzTopla(int sayi) {

        //return (sayi>0)?sayi+loppsuzTopla(sayi-1) :sayi;
        if (sayi == 1) {
            return 1;
        } else {
            return sayi + loopsuzTopla(sayi - 1);
    }}

   public static void loopTopla(int sayi){
       int toplam=0;
       for (int i = 0; i < sayi; i++) {

           toplam+=i;
       }
       System.out.println("toplam = " + toplam);

   }


}
