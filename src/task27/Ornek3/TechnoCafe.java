package task27.Ornek3;
import java.util.Scanner;

public class TechnoCafe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean siparisBittiMi = false;
        double toplamUcret = 0.0;

        System.out.println("TechnoCafe'ye hoş geldiniz!");


        while (!siparisBittiMi) {

            System.out.println("Lütfen sipariş vermek istediğiniz yemeği seçin: \n1. Adana Kebabı \n2. Lahmacun " +
                    "\n3. Borş \n4. Palov \n5. Siparişi Tamamla");

            int secim = input.nextInt();
            Food yemek =null ;

            switch (secim) {
                case 1:
                    yemek = new AdanaKebab();
                    AdanaKebab adanaKebab = (AdanaKebab) yemek;
                    adanaKebab.marinade();
                    adanaKebab.grill();
                    toplamUcret+= yemek.doubleUcret(160);
                    break;
                case 2:
                    yemek = new Lahmacun();
                    Lahmacun lahmacun = (Lahmacun) yemek;
                    lahmacun.dough();
                    lahmacun.topping();
                    lahmacun.bake();
                    toplamUcret+= yemek.doubleUcret(50);
                    break;
                case 3:
                    yemek = new Borsh();
                    Borsh borsh = (Borsh) yemek;
                    borsh.boil();
                    toplamUcret+= yemek.doubleUcret(70);
                    break;
                case 4:
                    yemek = new Palov();
                    Palov palov = (Palov) yemek;
                    palov.fry();
                    palov.boil();
                    toplamUcret+= yemek.doubleUcret(80);
                    break;
                case 5:
                    siparisBittiMi = true;
                    System.out.println("Siparişiniz tamamlandı. En kısa sürede servis edeceğiz...");
                    break;
                default:
                    System.out.println("Yanlış giriş yaptınız! Lütfen tekrar deneyin...");
                    break;
            }

            if (!siparisBittiMi) {
                yemek.taste();
            }
        }
        System.out.println("Toplam Tutar: " + toplamUcret);
    }
}