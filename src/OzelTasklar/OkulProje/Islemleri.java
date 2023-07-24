package OzelTasklar.OkulProje;

import java.util.Scanner;

import static OzelTasklar.OkulProje.IslemMethodlari.*;
import static OzelTasklar.OkulProje.IslemMethodlari.cikis;

public class Islemleri {
    static String kisiTuru;


    static void anaMenu() {
        System.out.println("====================================" +
                "\nÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ" +
                "\n\"====================================\"");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ" + "\n2- ÖĞRETMEN İŞLEMLERİ" + "\nQ- ÇIKIŞ");
        String anaMenuTercih = input.next().toUpperCase();
        switch (anaMenuTercih) {
            case "1":
                kisiTuru = "ÖĞRENCİ";
                islemlerMenu();
                break;
            case "2":
                kisiTuru = "ÖĞRETMEN";
                islemlerMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Yanlış giriş yaptınız! Tekrar panele yönlendiriliyorsunuz.");
                anaMenu();
                break;
        }
    }

    static void islemlerMenu() {

        System.out.println("***** " + kisiTuru + " İŞLEMLERİ MENÜSÜNE HOŞ GELDİNİZ *****\nEKLEME işlemleri için 1\n" +
                "ARAMA işlemleri için 2\nLİSTELEME işlemleri için 3\nSİLME işlemleri için 4\nANA MENÜ'ye dönmek için 5\n" +
                "ÇIKIŞ için Q seçiniz = ");
        String islemlerMenuSecim = input.next().toUpperCase();
        switch (islemlerMenuSecim) {
            case "1":
                ekleme();
                islemlerMenu();
                break;
            case "2":
                arama();
                islemlerMenu();
                break;
            case "3":
                listele();
                islemlerMenu();
                break;
            case "4":
                silme();
                islemlerMenu();
                break;
            case "5":
                anaMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız, Lütfen tekrar deneyiniz...");
                islemlerMenu();
                break;
        }


    }

}
