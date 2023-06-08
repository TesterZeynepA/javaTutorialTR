package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {



        int a = 3;
        if (a>0) {

            System.out.println("Sayi pozitiftir");

        }
    else {
            System.out.println("sayi negatiftir");


        }
    //ternary ile
        //CTE atama yapmak lazım a>0 ? "pozitif" : "negatif"; not a statement

        String sonuc = a>0 ? "pozitif" : "negatif";
        System.out.println(sonuc);

        //atama yapmadan nasıl kullanılır

        System.out.println("atama yapmadan sonuc¹");
        System.out.println(a>0 ? "pozitif" : "negatif");


        //Example 2: Iki sayidan kucuk olani secen kodu yaziniz ternary kullaniniz

        int num = 5;
        int num2 = 8;
        int kucuk = num> num2 ? num2 : num; // can be replaced with 'Math.min ()' call
        System.out.println("kucuk = " + kucuk); //kucuk = 5


//Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
//           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
//           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.

        int d = -1;
        int abs = d < 0 ? (-1*d) : (d);
        System.out.println("abs = " + abs); // abs =1
        System.out.println("Math.abs(d) = " + Math.abs (d)); // Math.abs(d) = 1

        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, // return type int
// farkli isaretli ise "Islem yapamam" mesaji veriniz             //return type String

        int e = 12;
        int f = 23;
        Object obje = (e > 0 && f>0) || (e<0 && f<0) ? (e*f) : "Islem yapamam" ;

        // eger sartlar iki farklı deger return ediyorsa atamayi parent class dan yapmak gerekir.
        System.out.println("obje = " + obje);

// TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi gir");

        int sayi = input.nextInt();

        //bu ne demek -> sayi % 2 == 0  sayinin 2 ye bolumunden kalan 0 mi demek
        String result=  sayi % 2 ==0 ? "cift sayi"   : "tek sayi "   ;
        System.out.println("result = " + result);


    }
}
