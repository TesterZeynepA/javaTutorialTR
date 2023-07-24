package OzelTasklar.OkulProje;

import java.util.ArrayList;
import java.util.Scanner;


import static OzelTasklar.OkulProje.Islemleri.*;

public class IslemMethodlari {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Ogretmen> ogretmenList = new ArrayList<>();
    static ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
    static ArrayList<String> kimlikList = new ArrayList<>();

    static Kisi kisi = new Kisi();

    static void getUser() {

        adSoyadKontrol();
        kimlikKontrol();
        yasKontrol();

    }

    static void adSoyadKontrol() {
        System.out.println(kisiTuru + " nin ismini giriniz:");
        String adSoyad = new Scanner(System.in).nextLine().toLowerCase();// dummy kullanmamak için new ile yeni obj üzerinden veri aldık.

        if (adSoyad.matches("[a-zçğıüöş\\s]+")) {
            kisi.setAdSoyad(adSoyad);
        } else {
            System.out.println("Ad-soyad sadece harflerden oluşmalıdır. Tekrar giriş yapmalısınız.");
            adSoyadKontrol();
        }
    }

    static void kimlikKontrol() {

        System.out.println(kisiTuru + " nin kimlik no giriniz:");
        System.out.println("Kimlik numarası rakamlardan oluşmalı ve 11 haneli olmalıdır.");
        String kimlikNo = input.next();

        if (kimlikNo.matches("\\d+") && kimlikNo.length() == 5) {
            if (!(kimlikList.contains(kimlikNo))) {
                kimlikList.add(kimlikNo);
                kisi.setKimlikNo(kimlikNo);
            } else {
                System.out.println("Bu kimlik no ile bir kişi sistemde kayıtlıdır. Tekrar giriş yapmalısın");
                kimlikKontrol();
            }
        } else {
            System.out.println("Kimlik no hatalı giriş:. Tekrar giriş yapmalısın.");
            kimlikKontrol();
        }
    }

    static void yasKontrol() {
        System.out.println(kisiTuru + " nin yas giriniz: ");
        System.out.println("Öğrenci için yas aralığı (7-18) olmalıdır.\nÖğretmen için yaş aralığı(22-65) olmalıdır.");

        int yas = input.nextInt();

        if (kisiTuru.equals("ÖĞRENCİ") && 7 <= yas && yas <= 18) {
            kisi.setYas(yas);
        } else if (kisiTuru.equals("ÖĞRETMEN") && 22 <= yas && yas <= 65) {
            kisi.setYas(yas);
        } else {
            System.out.println("Yas hatalı girildi. Tekrar giriş yapmalısın.");
            yasKontrol();
        }
    }

    static void ekleme() {
        System.out.println("*** " + kisiTuru + " Ekleme Sayfası***");
        getUser();

        if (kisiTuru.equals("ÖĞRENCİ")) {
            String sinif;
            do {
                System.out.println(kisiTuru + " nin sınıfını giriniz: ");
                sinif = input.next();
                char ch;
                if (sinif.length() == 1 && Character.isUpperCase(sinif.charAt(0))) {
                    ch = sinif.charAt(0);
                    System.out.println("Girilen sınıf: " + ch);
                    break;
                } else System.out.println("Sınıf için hatali giriş yaptınız, Lütfen Büyük harf kullanın!");

            } while (true);

            ogrenciList.add(new Ogrenci(kisi.getAdSoyad(), kisi.getKimlikNo(), kisi.getYas(), sinif));
            System.out.println("Kayıt başarıyla yapıldı.");

        } else {

            String bolum;
            do {
                System.out.println(kisiTuru + " nin bölümünü giriniz: ");
                bolum = input.next().toLowerCase();

                if (bolum.matches("[a-zçğıüöş\\s]+")) {
                    new Ogretmen().setBolum(bolum);
                    break;
                } else {
                    System.out.println("Bölüm hatalı giriş. Tekrar giriş yapmalısınız.");
                }
            } while (true);

            ogretmenList.add(new Ogretmen(kisi.getAdSoyad(), kisi.getKimlikNo(), kisi.getYas(), bolum, kisi.getKimlikNo().substring(0, 5)));
            System.out.println("Kayıt başarıyla yapıldı.");
        }
    }

    static void arama() {
        System.out.println("*** " + kisiTuru + " Arama Sayfası***");

        boolean flag = false;
        int index = 0;

        if (kisiTuru.equals("ÖĞRENCİ")) {
            if (ogrenciList.isEmpty()) {
                System.out.println("Öğrenci List boş");
            } else {
                System.out.println("Aradığınız " + kisiTuru + " nin kimlik no giriniz:");
                String arananKimlikNo = input.next();

                for (Ogrenci w : ogrenciList) {
                    if (arananKimlikNo.equals(w.getKimlikNo())) {
                        index = ogrenciList.indexOf(w);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Aranan öğrenci: " + arananKimlikNo + " kimlik numarasıyla " + ogrenciList.get(index).getAdSoyad() + " ismi ile kayıtlıdır.");
                } else
                    System.out.println("Aranan öğrenci: " + arananKimlikNo + " kimlik numarasıyla kayıtlı öğrenci yoktur.");
            }
        } else {
            if (ogretmenList.isEmpty()) {
                System.out.println("Öğretmen List boş");
            } else {
                System.out.println("Aradığınız " + kisiTuru + " nin kimlik no giriniz:");
                String arananKimlikNo = input.next();

                for (Ogretmen w : ogretmenList) {
                    if (arananKimlikNo.equals(w.getKimlikNo())) {
                        index = ogretmenList.indexOf(w);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Aranan öğretmen: " + arananKimlikNo + " kimlik numarasıyla " + ogretmenList.get(index).getAdSoyad() + " ismi ile kayıtlıdır.");
                } else
                    System.out.println("Aranan öğretmen: " + arananKimlikNo + " kimlik numarasıyla kayıtlı öğretmen yoktur.");
            }
        }
    }

    static void silme() {

        System.out.println("*** " + kisiTuru + " Silme Sayfası***");

        boolean flag = false;
        int index = 0;

        if (kisiTuru.equals("ÖĞRENCİ")) {
            if (ogrenciList.isEmpty()) {
                System.out.println("Öğrenci List boş");
            } else {
                System.out.println("Silmek istediğiniz " + kisiTuru + " nin kimlik no giriniz:");
                String arananKimlikNo = input.next();

                for (Ogrenci w : ogrenciList) {
                    if (arananKimlikNo.equals(w.getKimlikNo())) {
                        index = ogrenciList.indexOf(w);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(ogrenciList.get(index).getAdSoyad() + " isimli öğrenci: " + arananKimlikNo + " kimlik numarasıyla silinmiştir.");
                    ogrenciList.remove(ogrenciList.get(index));
                    kimlikList.remove(kimlikList.get(index));
                } else
                    System.out.println(arananKimlikNo + " kimlik numarasıyla kayıtlı öğrenci yoktur.");

            }
        } else {
            if (ogretmenList.isEmpty()) {
                System.out.println("Öğretmen List boş");
            } else {
                System.out.println("Silmek istediğiniz " + kisiTuru + " nin kimlik no giriniz:");
                String arananKimlikNo = input.next();

                for (Ogretmen w : ogretmenList) {
                    if (arananKimlikNo.equals(w.getKimlikNo())) {
                        index = ogretmenList.indexOf(w);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(ogretmenList.get(index).getAdSoyad() + " isimli öğretmen: " + arananKimlikNo + " kimlik numarasıyla silinmiştir.");
                    ogretmenList.remove(ogretmenList.get(index));
                    kimlikList.remove(kimlikList.get(index));
                } else
                    System.out.println(arananKimlikNo + " kimlik numarasıyla kayıtlı öğretmen yoktur.");
            }
        }
    }

    static void listele() {
        System.out.println("*** " + kisiTuru + " Listeleme Sayfası***");

        if (kisiTuru.equals("ÖĞRENCİ")) {
            if (!ogrenciList.isEmpty()) {
                System.out.println("***Öğrenciler***");
                for (Ogrenci w : ogrenciList) {
                    System.out.println(w);
                }
            } else
                System.out.println("Sistemde öğrenci bulunmamaktadır.");

        } else if (kisiTuru.equals("ÖĞRETMEN")) {
            if (!ogretmenList.isEmpty()) {
                System.out.println("***Öğretmenler***");
                for (Ogretmen w : ogretmenList) {
                    System.out.println(w);
                }
            } else
                System.out.println("Sistemde öğretmen bulunmamaktadır.");
        }
    }

    static void cikis() {
        System.out.println("Çıkış yapıldı");
    }
}

