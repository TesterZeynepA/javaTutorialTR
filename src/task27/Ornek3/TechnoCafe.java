package task27.Ornek3;

import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean siparisBittiMi = false;

        while (!siparisBittiMi) {
            System.out.println("****** TechnoCafe'ye Hoşgeldiniz ******");
            System.out.println("Lütfen siparişinizi giriniz : \n1. Adana Kebab Siparişi \n2. Lahmacun Siparişi"+
                    "\n3. Borsh Siparişi \n4. Palov Siparişi \n0. Sipariş Tamam");

            int secim = input.nextInt();
            switch (secim) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    siparisBittiMi = true;
                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }

    }
}
