package ch20_Constructor.projeGiris01;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class KayitMethodlari {
    //step 2 a)

    static ArrayList<Kullanici> kullaniciList= new ArrayList<>();
    static Scanner input = new Scanner(System.in);
// step 2 b)
    public ArrayList<Kullanici> kayitAl(){

        //kullanici class dan obje üretecek
        //kullanıcıdan aldığı ismi array liste ekleyecek

        System.out.println("ismini gir");
        String isim =input.nextLine();
        //LocalDateTime time = LocalDateTime.now();

        Kullanici kullanici = new Kullanici(isim, LocalDateTime.now());
        //kullanıcıdan aldığımız isim 1. pm olarak const a verdik
        //2 pm olarak LocalDateTİme.now i direk verdik

        kullaniciList.add(kullanici);

        return kullaniciList;
    }

    //step 3

    public void sansliKullanici(ArrayList<Kullanici> list){
        //bu method her dakikanın ilk 10 saniyesinde kaydolanları bulacak

        for (Kullanici each : list) {

            if (each.kayitZamani.getSecond()<=10){
                System.out.println("Sayin " + each.name + " bugün şanslı günündesin");
            }else

                System.out.println("Malesef şanslı gününde değilsin, tekrar dene...");
        }
    }
public void listele(){
    System.out.println("kullaniciList = " + kullaniciList);

}
public void cikis(){
    System.out.println("gule gule");

}


}
