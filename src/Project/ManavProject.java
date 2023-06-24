package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManavProject {

    static ArrayList<String> urunListesi = new ArrayList<>(Arrays.asList("domat->1", "biber->2", "balcan->3", "avakado->4", "muz->5"));
    static ArrayList<Double> urunFiyatListesi = new ArrayList<>(Arrays.asList(8.5, 10.3, 13.2, 35.7, 23.8));
    static Scanner input = new Scanner(System.in);
    static double toplamOdenecekMiktar = 0;


    public static void main(String[] args) {//main level
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        System.out.println(urunListesi);
        System.out.println(urunFiyatListesi);
        musteriSecim();
    }//main sonu

    private static void musteriSecim() {

        System.out.print("Agam hangi urun istersin :");
        int secim = input.nextInt();

        if (secim < 6 && secim > 0) {

            System.out.print("Agam sectiğin urun miktarını giresen : ");
            double kilo = input.nextDouble();
            toplamOdenecekMiktar += kilo * urunFiyatListesi.get(secim - 1);
            System.out.println("agam sectiğiniz urun :" + urunListesi.get(secim - 1) + "\n" + " agam sectiğiniz urunun fiyatı :" + urunFiyatListesi.get(secim - 1));
            // System.out.println("agam sectiğiniz urunun fiyatı :"+urunFiyatListesi.get(secim-1));
            System.out.println("Agam alışveriş DEWAMKEEE için 1 KASA için 2 giresen : ");
            int karar = input.nextInt();
            if (karar == 1) {
                musteriSecim();


            } else if (karar == 2) {

                kasa();
            } else System.out.println("agam adam gibi bişey giresen ");
        } else {
            System.out.println("agam adam gibi bişey giresen ");
            musteriSecim();
        }
    }

    private static void kasa() {

        System.out.println("Agam toplam ödemeniz gereken miktar : " + toplamOdenecekMiktar + " yine bekleriz selametle  ...");
    }


}//Class sonu