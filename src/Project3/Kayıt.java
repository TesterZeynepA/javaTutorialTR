package Project3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {//step 2->

   static ArrayList<Kullanıcı> kullanıcılar = new ArrayList<>();//Kullanıcı class dan create edilen objelerin depolanacağı boş list

    public static ArrayList<Kullanıcı> kayıtAl(){

        System.out.print("Adınızı giriniz");

        Kullanıcı k1obj = new Kullanıcı(new Scanner(System.in).nextLine(), LocalDateTime.now());//name ve kayıt zamanı p olarak girilen k1obj üretildi
        kullanıcılar.add(k1obj);//üretilen k1obj kullanıcılar liste eklendi
        return kullanıcılar;
    }

public static void sansliKullaniciBul(ArrayList<Kullanıcı>kllnc){

    for (Kullanıcı avuc : kllnc){

        if (avuc.kayitZamani.getSecond()<=10){//tekrardaki her bir kullanıcı obj kayıt zamanı saniyesi 10 dan az olma şartı

            System.out.println(avuc.name + " Tebrik ederiz, bugünün şanslı kişisi sizsiniz! Kayıt zamanınız " +avuc.kayitZamani + "");
        }else System.out.println(avuc.name + " Malesef şanslı kişi değilsiniz. Kayıt zamanınız " +avuc.kayitZamani);


    }
}

public static void listele(ArrayList<Kullanıcı> kullanıcı){

    System.out.println(kullanıcı);
}


    public void cıkıs() {

        System.out.println("Çıkış yaptınız...");
    }
}

