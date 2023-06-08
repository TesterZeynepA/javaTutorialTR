package ch03_ScannerClass_TypeCasting;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin
        // "import" etmek gerekir.
        //Scanner Class'i Java nin util kutuphanesindedir.

        Scanner input = new Scanner(System.in); //1. adim
       // System.out.println("sifreni gir"); //2. adim
       // String sifre = input.nextLine(); //3. adim
       // System.out.println (sifre.replaceAll("\\d" , "*"));

//kullaniicidan veri almak istedigimizde adimlar:
        //1. adim Scanner clasdan obj create edilir
        //2. adim kullaniciya ne istedgimiz sorulur yani input istenir
        //    System.out.println("sifreni gir");
        //3. adim kullanicinin girdigi yani istegimiz verinin data type ina gore containe create edilir
        ///     String sifre = input.nextLine().replaceAll("\\d","*");//Scanner class dan create edilen obj
        // kulllanilarak String data
        // type inda sifre isimli variable atama yapildi
        //System.out.println("sifreniz " +sifre.replaceAll("\\d","*"));

        //     System.out.println("sifreniz " +sifre);
        //Scanner input = new Scanner(System.in);//1. adim
        //  System.out.println("sifreni gir"); //2. adim
        //  String sifre = input.nextLine(); //3. adim
        //  System.out.println(sifre.replaceAll("\\d", "*"));

// \\d regex ifadesi rakamlari simgeler digit demek.
        // \\D ifadesi harfleri simgeler non-digit demek
        // \\W ifadesi bütün şifreyi gizliyor.


        //TASK -> Kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir code creat ediniz...
        // trick soru Scanner objesi create etmeli miyiz?
        //edebiliriz fakat gereksiz bellekte yer isgali olur.

       // System.out.println("karenin kenarini gir"); //kullanıcıya kenar girme komutu verildi.
      // int kenar = input. nextInt(); //kullanıcının girdiği integer değer kenar variablesine atama yapıldı.

      // int alan = kenar * kenar; // kenarı çarparak alan variable ı atandı.

      // int cevre = kenar * 4; //kenarı 4 ile çarparak çevre variable ına atandı.

       //System.out.println("alan = " + alan);
       //System.out.println("cevre = " + cevre);


        //TASK -> Kullanıcının  günde içtiği çay ve kullandığı şeker değerine göre
        //bir yılda kaç kg şeker kullandığını hesaplayan bir code create ediniz...
        //1 kup şeker = 1.7 gr
        //örnek input: cay sayisi: 10 şeker sayısı:15
        //Output:

       // System.out.println("gunluk cay sayisini gir"); //kullanıcıya komut girildi.
       // int caySayisi = input.nextInt(); //kullanıcının girdiği değer ataması yapıldı.
       // System.out.println("cay a kac seker atarsin");
       // int sekerSayisi = input.nextInt();
       // System.out.println("yılda ictigin cay sayisi = " + (365*caySayisi));
       // System.out.println("yılda tükettigin seker miktari kg olarak = " + (caySayisi*sekerSayisi*1.7*365/1000));


        //TASK -> Kullanıcıdan ismini alıp ilk harfini yazdırın
        System.out.println("ismini gir");
        String name = input.nextLine(); // ismin tamamını alıp name variable atandı.
        System.out.println("name = " + name);
        char ilkHarf = name.charAt(0); // kullanıcının girdiği isimin ilk harfi char variableye atandı
        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("name.length = " + name.length()); //kactane haften oluştuğu yazdırıldı.

        //task ismin son harfini yazdırın.
        char sonHarf = name.charAt(name.length() - 1); // ismin son harfini atamasi yapıldı.

        System.out.println("sonHarf = " + sonHarf);

    }
}
