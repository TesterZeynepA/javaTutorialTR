package ch03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

         /*
         byte < short < int < long < float < double
            Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina Java  otomatik olarak yapar.
         */
        //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
        //              byte < short < int < long < float < double
        //Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
        //Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir

        boolean basariliMi = true;

        //CTE  String basari = basariliMi; dogal uyum olmadigi icin hata verir

        String basari = String.valueOf(basariliMi);//boolean olan bir degeri Stringe cevrildi
        System.out.println("basari = " + basari);//basari = true
        double d = 17 ;//double container ina  int olan 17 degeri atandi Auto Widening yapildi
        System.out.println("d = " + d);// 17.0
    int sayi1 = 33;
    int sayi2 = 4;
        System.out.println("sayi1/sayi2 = " + sayi1 / sayi2);// sayi1/sayi2 = 8
        // Zeynep Aytop => sonuç tam sayı olmasa da int olduğu için virgül sonrasını vermez.
        /* java iki int sayiyi birbirine böldüğünüzde sonucu int verir
        eğer bölme işleminde ondalik sonuç çıkarsa ondalık kısmı siler.
         */
    byte by =127;
    int number = by; // küçük kutuyu büyük kutuya ekledik
        int num = 123;
        double d1 = 14;
        double d2 = d1/num;
        System.out.println("d2 = " + d2); //d2 = 0.11382113821138211

        double db1 = 14.66;
        int i = (int) db1; // büyük olan kutu küçük olan kutuya eklenmeye çalışıldı.

        int num3 =150;
        byte by1 = (byte) num3;
        System.out.println("by1 = " + by1);// by1= -106
        //byte 127ye kadar olani sayar sonra başa döner -128'den tekrar başlar

        /*
        task ->
        kullunıcıdan bir character girmesini isteyin ve
        girilen karakteri ve ascii degerini yazın

        örnek: input : a
        output : girdiğiniz 'a' karakterinin ascii değeri :97

         */
        Scanner input =new Scanner(System.in);// kullanıcıdan veri alabilmek için Scanner objesi create edildi.
        System.out.println("bir karakter giriniz");// kullanıcıya komut verildi.
        char ch = input.next().charAt(0); // kullanıcının girdiği ifadenin ilk karakteri alınıp char variable a atandı
        //tekbir karakter alınabilmesi için charAt () methodu kullanıldı.

        System.out.println("ch = " + (ch+0));
// char variable ı bir sayi ile toplanırsa sonuç tamsayı olur.
        System.out.println("ch = " + ch);
        System.out.println("ch = " + (int) ch);

        //extra ascii değeri bulma metodu.

        String str = "a"; // tek karakter girilirse hashCode () methodu ile bulunabilir ascii değeri.
        System.out.println("str.hashCode() = " + str.hashCode()); //str.hashCode() = 97


    }
}
