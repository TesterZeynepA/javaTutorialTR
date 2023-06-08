package ch07_StringManipulations;

import java.util.Scanner;

public class C04_contains {

    static String password ="19051985";

    public static void main(String[] args) {

        /* String icerisinde istenen stringin varlığını kontrol eder boolean return eder...

         */
        String str = "Java ile gunler";
        System.out.println("str = " + str);

       //CTE System.out.println("str.contains('Java') = " + str.contains('J')); parametre String olmalı

        System.out.println("str.contains(\"Java\") = " + str.contains("Java"));// str.contains ("Java") = true
        System.out.println("str.contains(\"java\") = " + str.contains("java"));// str.contains ("java") = false
        System.out.println("str.contains(\"\") = " + str.contains(""));// true
        System.out.println("\"\".length() = " + str.length()); // 0

        // task-> girilen uruunun var olup olmaidginiz kontrol eden bir code create ediniz -> ternary kullanınız
        String buzDolap = "elma peynir yumurta zeytin bal kaymak";
        Scanner input = new Scanner(System.in);
        System.out.println("ürün giriniz");
        String urun = input.nextLine();
        String result = buzDolap.contains(urun) ? "evet bu urun dolapta var" : "bu ürün dolapta yok";
        System.out.println("result = " + result);


//TASK giirlen sifrenin dogru ise erisim izni verin yanlis ise vermeyin
// ternary ile switch ile if ile yapiniz
//contains methodu sifre kontrol islemlerinde KULLANILMAMALI


       Scanner scan = new Scanner(System.in);
       System.out.println("lutfen sifre giriniz");
       String sifre = input.nextLine();
      if (password.contains(sifre)){
          System.out.println("you can login");

      }else
          System.out.println("you cannot login");

    // buradaki BUG i bulunuz

//contains icermek anlamında olduğğu için şifredeki herhangi bir karakteri içeren herhangi bir şifre kabul edilir.hata budur


    String result2 = sifre.contains(password) ? "you can log in with ternary": "bye bye happeness";
        System.out.println("result2 = " + result2);

    switch (sifre) {

        case "19051985":
            System.out.println("you can log in via switch case");
            break;
            default:
                System.out.println("you entered wrong value");
                break;

    }








    }
}
