package ch15_Varargs;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Varargs {
    public static void main(String[] args) {

        /*
      VARARGS :dillerdeki  yuklem gelmemisse veya daha ornek cogaltilacaksa kullanildigi gibi javada da ayni sekilde kullanilir
      var----variety cesitlilik args---arguments
      SYNTAX ->
      mathodName(parametre1,parametre2, dataType... dataName) {
      method body....

      }

       1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır
       .
    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :


         Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
         ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

*/

        //Task -> verilen iki sayi toplamini print eden Method create ediniz

        int sayi1 = 99;
        int sayi2 = 15;
        int sayi3 = 55;
        int sayi4 = 35;

        toplam (sayi1, sayi2);
        toplam (sayi3, sayi4);

        //Task -> verilen üç sayi toplamini print eden method create ediniz

        toplam (sayi3, sayi4, sayi1);

        System.out.println("***** varargs ile *****");
        toplaVarargs (sayi1, sayi2, sayi4, 33);
        toplaVarargs(sayi1, sayi2, sayi4, 33, 35);
        toplaVarargs(sayi1, sayi2, sayi4, 33, 55, 77);

// Task -> verilen String'lerin en fazla karaktere sahip olanı print eden
// METHOD create ediniz->>
// parametre saysı belirli değil : varargs

        String str1 = "java";
        String str2 = "react";
        String str3 = "spring";
        String str4 = "next.js";
        String str5 = "aws";

        enuzunlengtvarargs(str1, str5);
        enuzunlengtvarargs(str1,str2,str3);
        enuzunlengtvarargs(str1, str5, str4, str3,str2);
        enuzunlengtvarargs(str1,str4, str3, str2);


    }

    private static void enuzunlengtvarargs(String... s) {
        String enFazlaKarakter = "";

        for (String w : s ) {

            if (w.length() > enFazlaKarakter.length()){

                enFazlaKarakter = w;
            }
            
        }

        System.out.println("enFazlaKarakter = " + enFazlaKarakter);

    }

    private static void toplaVarargs(int ... i) {

        System.out.println(i);

        System.out.println("Arrays.toString(i) = " + Arrays.toString(i));

        int toplam = 0;
        for (int w : i ) {

            toplam+= w;

        }

        System.out.println("varargs ile sayilarin toplam = " + toplam);


    }

    private static void toplam(int s, int ss, int sss) {

        System.out.println("üc sayinin toplami = " + (s+ss+sss));
    }

    private static void toplam(int s, int d) {

        System.out.println("iki sayinin toplami = " + (s+d));
    }
}
