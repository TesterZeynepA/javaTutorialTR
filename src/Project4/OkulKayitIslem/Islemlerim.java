package Project4.OkulKayitIslem;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemlerim {

    static List<Ogretmen> ogretmenList = new ArrayList<>();
    static List<Ogrenci> ogrenciList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static String kisiTuru;

    public static void girisPaneli(){
        System.out.println("********************\nOGRENCI VE OGRETMEN ANA MENU \n********************" +
                "\n1- OGRENCI İSLEMLERI\n2- OGREMEN ISLEMLERI\nQ- CIKIS \nLutfen yapmak istediğiniz islemi giriniz = ");

       // String secim =input.next().toUpperCase();
       // switch (secim){
        switch (input.next().toUpperCase()){

            case "1":
                kisiTuru="OGRENCI";//kisi turu ögrenci atandı
                islemMenu();
                break;
            case "2":
                kisiTuru= "OGRETMEN";//kisi turu ögretmen atandı
                islemMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("hatalı giriş yaptınız tekrar deneyiniz");
                girisPaneli();
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

            case 0:
                girisPaneli();
                break;
            case 1:
                ekleme();
                islemMenu();
                break;
            case 2:
                arama();
                islemMenu();
                break;
            case 3:
                listeleme();
                islemMenu();
                break;
            case 4:
                silme();
                islemMenu();
            default:
                System.out.println("hatali secim yaptınız lütfen tekrar giriş yapınız");
                islemMenu();
                break;
        }
    }

    private static void silme() {

     islemMenu();

    }

    private static void listeleme() {


        islemMenu();
    }

    private static void arama() {


       islemMenu();
    }

    private static void ekleme() {



      islemMenu();

    }

    private static void cikis() {

        System.out.println("güle güle yine bekleriz");
    }
}
