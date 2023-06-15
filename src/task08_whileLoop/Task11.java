package task08_whileLoop;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        int sayac=1,toplam=0;
        while (sayi != 0) {
            sayac++;
            toplam+=sayi;
            System.out.println("Bir sayı giriniz: ");
            sayi = input.nextInt();

        }
        System.out.println("Girilen sayı adeti = " + sayac);
        System.out.println("Girilen sayıların toplamı = " + toplam);







    }
}
