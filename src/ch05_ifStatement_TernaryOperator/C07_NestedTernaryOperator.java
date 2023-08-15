package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {

    public static void main(String[] args) {

        /*
        TASK :
         Girilen bir pozitif tamsayı  4 basamaklı ise  “4 Basamaklı” print eden
         4 basamaklı degilse
         çift olup olmadigini kontrol edip.
          Çift ise “4 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “4 basamaklı olmayan tek sayı yazdırın.”

         */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz : ");
        int sayi = input.nextInt();

        String cozum = (sayi>=1000 && sayi<=9999)? "4 basamaklı":((sayi%2==0)? "4 basamaklı olmayan cift sayi": "4 basamaklı olmayan tek sayi");
        System.out.println(cozum);


    }
}
