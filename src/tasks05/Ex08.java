package tasks05;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*
         Kullanicidan bir sayi alin

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */
    Scanner input = new Scanner (System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = input.nextInt();
        if (sayi > 0 && sayi>10) {
            System.out.println("Buyuksun!");
        }else if (sayi>0 && sayi<10) {
            System.out.println("Normalsin!");
        }if (sayi<0 && sayi> -10) {
            System.out.println("Negatifsin!");
        } else if (sayi<0 && sayi< -10) {
            System.out.println("Cok Negatifsin!");

        }else if (sayi==0) {
            System.out.println("sayi sıfıra eşittir");
        }


    }
}
