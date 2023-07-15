package Project4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<Kisi> ogretmenList = new ArrayList<>();//create edilecek ogrtmen obj saklayacak bos Kisi data type list tanımlandı
    static List<Kisi> ogrenciList = new ArrayList<>();//create edilecek ogrenci obj saklayacak bos Kisi data type list tanımlandı
    static Scanner input = new Scanner(System.in);
    static String kisiTuru;//yukarıdaki yapılar her method için call edilmesi için static tanımlandı.

    public static void girisPaneli() {
        System.out.println("**********************************      \nOGRENCI VE OGRETMEN ANA MENU \n**********************************\n1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS \nLutfen yapmak istediginiz islemi giriniz : ");
        // String secim = input.next().toUpperCase();//kullanıcının secim girdisi byk harf atandı
        // switch (secim) {
        switch (input.next().toUpperCase()) {
            case "1":
                kisiTuru = "OGRENCI";//kisiTuru 1 case için OGRENCI value atandı
                islemMenu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";//kisiTuru 1 case için OGRETMEN value atandı
                islemMenu();
                break;
            case "Q":
                cıkıs();

                break;
            default:
                System.out.println("hatalı giriş yaptınız tekrar deneyiniz...");
                girisPaneli();//recursive meth.
                break;


        }
    }


    private static void islemMenu() {
        System.out.println("Sectiginiz kisi turu: " + kisiTuru + " ISLEM MENU , Lutfen asagidaki islemlerden tercih yapiniz.\n"
                + "*********** " + kisiTuru + " ISLEMLER ************\n 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU \n" +
                "Islem Tercihinizi giriniz : ");
        // int secilenIslem = input.nextInt();
        // switch (secilenIslem) {
        switch (input.nextInt()) {
            case 1:
                ekle();
                // islemMenu();
                break;
            case 2:
                ara();
                islemMenu();
                break;
            case 3:
                listele();
                //islemMenu();
                break;
            case 4:
                sil();
                islemMenu();
                break;
            case 0:
                girisPaneli();

                break;
            default:
                System.out.println("hatalı giriş yaptınız tekrar deneyiniz...");
                islemMenu();//recursive meth.
                break;

        }


    }

    private static void ara() {
        System.out.println("   ***   " + kisiTuru + " ARAMA  sayfası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//oğrcList sartı
            input.nextLine();//dumy
            System.out.println("Aranan öğrenci KimlikNo giriniz : ");
            String arananOgrcKimlikNo = input.nextLine();
            for (Kisi k : ogrenciList) {
                if (k.getKimlikNo().equals(arananOgrcKimlikNo)) {
                    System.out.println("Aradığınız öğrenci : " + k.getAdSoyad() + " listemizde mevcut");
                    break;
                } else System.out.println("Aradığınız öğrenci : " + k.getAdSoyad() + " listemizde mevcut değil");
            }
        } else {
            input.nextLine();//dumy
            System.out.println("Aranan öğretmen KimlikNo giriniz : ");
            String arananOgrtKimlikNo = input.nextLine();
            for (Kisi k : ogretmenList) {
                if (k.getKimlikNo().equals(arananOgrtKimlikNo)) {
                    System.out.println("Aradığınız muhteşem öğretmen : " + k.getAdSoyad() + " listemizde mevcut");
                    break;
                } else
                    System.out.println("Aradığınız muhteşem öğretmen : " + k.getAdSoyad() + " listemizde mevcut değil");
            }
        }
        islemMenu();
    }

    private static void listele() {
        System.out.println("   ***   " + kisiTuru + " listeleme sayfası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//oğrcList sartı
            System.out.println(ogrenciList);
        } else System.out.println(ogretmenList);
        islemMenu();
    }

    private static void sil() {
        System.out.println("   ***   " + kisiTuru + " silme sayfası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//kisiTuru oğrenci olma  sartı

            System.out.print("silinecek oğrencinin kimlik no'sunu giriniz : ");
            String silinecekOgrcNo = input.next();
            for (Kisi k : ogrenciList) {
                if (k.getKimlikNo().equals(silinecekOgrcNo)) {//silinecek oğrencinin kimlik no'su öğrenciList'te varlık kontrol
                    ogrenciList.remove(k);//oğrenciKimlik nosu listede olan öğrc list'ten silindi
                    System.out.println("öğrenciniz  başarı ile silinmiştir.");
                    break;
                } else System.out.println("silinecek öğrenci listemizde mevcut değil ");
            }
            System.out.println("öğrenciniz işleminiz başarı ile yapılmıştır. \n" +
                    "OGRENCI ISLEM MENU'ye yönlendiriliyorsunuz");
            islemMenu();
        } else {//kisiTuru oğretmen olma  sartı
            System.out.print("silinecek öğretmenin kimlik no'sunu giriniz : ");
            // String silinecekOgrtNo = input.next();
            for (Kisi k : ogretmenList) {
                // if (k.getKimlikNo().equals(silinecekOgrtNo)) {//silinecek oğretmenin kimlik no'su öğretmenList'te varlık kontrol
                if (k.getKimlikNo().equals(input.next())) {//silinecek oğrencinin kimlik no'su öğrenciList'te varlık kontrol
                    ogretmenList.remove(k);//oğretmenKimlik nosu listede olan öğrt list'ten silindi
                    System.out.println("mukteşem öğretmenimiz  başarı ile silinmiştir.");
                    break;
                } else System.out.println("silinecek muhteşem öğretmenimiz listemizde mevcut değil ");
            }
            System.out.println("muhteşem öğretmen işleminiz başarı ile yapılmıştır. \n" +
                    "OGRETMEN ISLEM MENU'ye yönlendiriliyorsunuz");
            islemMenu();


        }
    }

    private static void ekle() {
        System.out.println("   ***   " + kisiTuru + " ekleme sayfası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//kisiTuru oğrenci olma  sartı
            // input.nextInt();//dumyy
            System.out.print("ad-soyad giriniz : ");
            String ogcAdSoyad = input.nextLine();
            input.nextLine();//dummy
            System.out.print("kimlikNo  giriniz : ");
            // input.nextLine();//dummy
            String ogcKimlikNo = input.next();
            System.out.print("yas  giriniz : ");
            int ogcYas = input.nextInt();
            System.out.print("numara  giriniz : ");

            String ogcNumara = input.next();
            System.out.print("sinif  giriniz : ");
            String ogcsınıf = input.next();
            Ogrenci ogrc = new Ogrenci(ogcAdSoyad, ogcKimlikNo, ogcYas, ogcNumara, ogcsınıf);//ogrc obj create edildi
            ogrenciList.add(ogrc);//ogrc obj ogrenciList'e eklendi

            System.out.println("öğrenciniz " + ogrc.getAdSoyad() + " başarı ile eklenmiştir. \n" +
                    "OGRENCI ISLEM MENU'ye yönlendiriliyorsunuz");
            islemMenu();
        } else {//kisiTuru oğretmen olma  sartı
            //input.nextInt();//dumyy
            System.out.print("ad-soyad giriniz : ");
            String ogrtAdSoyad = input.nextLine();
            input.nextLine();//dummy
            System.out.print("kimlikNo  giriniz : ");
            // input.nextLine();//dummy
            String ogrtKimlikNo = input.next();
            System.out.print("yas  giriniz : ");
            int ogrtYas = input.nextInt();
            System.out.print("sicil numara  giriniz : ");

            String ogrtSicilNo = input.next();
            System.out.print("bolum  giriniz : ");
            String ogrtbolum = input.next();
            Ogretmen ogrt = new Ogretmen(ogrtAdSoyad, ogrtKimlikNo, ogrtYas, ogrtSicilNo, ogrtbolum);//ogrt obj create edildi
            ogretmenList.add(ogrt);//ogrt obj ogretmenList'e eklendi

            System.out.println("muhteşem öğretmenimiz " + ogrt.getAdSoyad() + " başarı ile eklenmiştir. \n" +
                    "OGRETMEN ISLEM MENU'ye yönlendiriliyorsunuz");
            islemMenu();
        }


    }

    private static void cıkıs() {

        System.out.println("Agam yine bekleriz selametle...");
    }


}

