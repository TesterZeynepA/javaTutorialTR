package task26.task03;


import task26.task01.Ogrenci;
import task26.task01.Okul;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {


        task26.task01.Okul okul = new Okul("Clarusway", 5);

        Scanner input = new Scanner(System.in);

        while (okul.getOgrenciList().size() < okul.getMaxOgrenciSayisi()) {

            System.out.println("Öğrencinin adını giriniz");
            String ad = new Scanner(System.in).nextLine();
            System.out.println("Öğrencinin soyadını giriniz");
            String soyAd = new Scanner(System.in).nextLine();

            int yas = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.println("Öğrencinin yaşını giriniz");
                    yas = Integer.parseInt(input.nextLine());

                    if (yas > 15) {
                        throw new IllegalArgumentException("Yaş 15'ten büyük olamaz!");
                    }

                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Hatalı giriş! Lütfen geçerli bir sayı girin.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            task26.task01.Ogrenci yeniOgrenci = new Ogrenci(ad, soyAd, yas);
            okul.getOgrenciList().add(yeniOgrenci);
            System.out.println("Öğrenci eklendi: " + yeniOgrenci.getAd() + " " + yeniOgrenci.getSoyAd());
        }

        System.out.println("kontenjanımız dolmuştur... Artık kayıt alamıyoruz");
    }



}
