package ch07_StringManipulations;

import java.util.Scanner;

public class C06_substring {
    public static void main(String[] args) {
/*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder

substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
        String str = "Çalıştıkça daha çok şey bilmediğimi farkediyorum";
        System.out.println("str.substring(0,4) = " + str.substring(0, 5));
        // ilk girilen parametre dahildir ikinci parametre dahil edilmez

        //TASK str datasının son 12 karakterini print ediniz

       int sonOnİkiKarakterIndexi=str.length()-12;
        System.out.println("sonOnİkiKarakterIndexi = " + sonOnİkiKarakterIndexi);//sonOnİkiKarakterIndexi = 36
        System.out.println("str.charAt(sonOnİkiKarakterIndexi) = " + str.charAt(sonOnİkiKarakterIndexi));//str.charAt(sonOnİkiKarakterIndexi) = f
        System.out.println("str.substring(sonOnİkiKarakterIndexi) = " + str.substring(sonOnİkiKarakterIndexi));//str.substring(sonOnİkiKarakterIndexi) = farkediyorum

// TASK str datasının ilk 10 (on dahil) karakterini print ediniz...

        System.out.println("str.substring(0,11) = " + str.substring(0, 10));

        //TASK str datasının sadece ilk karakterini print ediniz...

        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("str.substring(0,1) = " + str.substring(0, 1));


        //TASK girilen 4 harfli kelimeyi tersten yan yana print eden code create ediniz

        Scanner input =new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime = input.next();

        System.out.print(kelime.substring(kelime.length() - 1)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));

    if (kelime.length()!=4) {

        System.out.println("yanlis kelime girdin 4 harfli gireceksin");
    } else {
        System.out.print(kelime.substring(kelime.length() - 1));

        System.out.print(kelime.charAt(kelime.length()-2));

       //System.out.print(kelime.substring((kelime.length()-2), (kelime.length()-1)));

        System.out.print(kelime.substring((kelime.length()-3), (kelime.length()-2)));


    }

    }
}
