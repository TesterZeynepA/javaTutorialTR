package ch07_StringManipulations;

import java.util.Scanner;

public class C09_replaceAll {
    public static void main(String[] args) {
/** replace()
 * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
 * (update -set) saglar. Sonuc String'dir..
 *
 */
        String str = "ezberlemek beyne ihanettir 2023 ^$%$&$%6 () :?";
        System.out.println("str.replace('a', '$') = " + str.replace('a', '$'));
//str.replace('a', '$') = ezberlemek beyne ih$nettir 2023 ^$%$&$%6 () :?

        System.out.println("str.replace (\"tir\", \"*\") = " + str.replace("tir", "*"));
//str.replace ("tir", "*") = ezberlemek beyne ihanet* 2023 ^$%$&$%6 () :?
        System.out.println("str.replaceFirst(\"e\",\"*\") = " + str.replaceFirst("e", "*"));
//str.replaceFirst("e","*") = *zberlemek beyne ihanettir 2023 ^$%$&$%6 () :?

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)


//(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler

//   "\\w" tum harf ve rakamlar [A-Z a-z 0-9]
        System.out.println("str. replaceAll(\"\\\\w\", \"*\") = " + str.replaceAll("\\w", "*"));
        //str. replaceAll("\\w", "*") = ********** ***** ********* **** ^$%$&$%* () :?
        System.out.println("str.replaceAll(\"\\\\W\",\"*\") = " + str.replaceAll("\\W", "*"));
//str.replaceAll("\\W","*") = ezberlemek*beyne*ihanettir*2023********6******
        //sadece harfleri yildiza cevirin

        System.out.println("str.replaceAll(\"\\\\D\", \"*\") = " + str.replaceAll("\\D", "*"));
//str.replaceAll("\\D", "*") = ***************************2023********6******
        System.out.println("str.replaceAll(\"[A-Z a-z]\", \"*\") = " + str.replaceAll("[A-Z a-z]", "*"));
//str.replaceAll("[A-Z a-z]", "*") = ***************************2023*^$%$&$%6*()*:?

        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki
// formatta print eden code create ediniz.

// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = input.next();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim= input.next();
        System.out.println("Lütfen kart numaranızı giriniz");
        String kart = input.next();

        String yeniIsimCiktisi = isim.charAt(0) +isim.substring(1).replaceAll("\\w", "*");
        System.out.println("yeniIsimCiktisi = " + yeniIsimCiktisi);
        String yeniSoyIsimCiktisi = soyisim.charAt(0) + soyisim.substring(1).replaceAll("\\w", "*");
        System.out.println("yeniSoyIsimCiktisi = " + yeniSoyIsimCiktisi);

        String yeniKartCiktisi= "**** **** **** " +kart.substring(12);
        System.out.println("yeniKartCiktisi = " + yeniKartCiktisi);

        String yeniKartNoRegex = kart.substring(0,12).replaceAll("[0-9]", "*") + kart.substring(12);
        System.out.println("yeniKartNoRegex = " + yeniKartNoRegex);



    }
}
