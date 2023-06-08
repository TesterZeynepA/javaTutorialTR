package tasks07;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti." ==> 14


        //replace() method'u bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.


        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.


        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz


        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********

        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str =input.nextLine();

        //Example 1 çözümü:

        System.out.println(str.replace(" ","").length());

        // Example 2 çözümü:

        String str2 = str.replaceAll("a", "A");

        System.out.println("str2 = " + str2);

        //Example 3 çözümü:

        String str3 = str.replaceAll("kara", "*");

        System.out.println("str3 = " + str3);

        //Example 4 çözümü:

        String str4 = str.replaceAll("\\d", "*");

        System.out.println("str4 = " + str4);


    }
}
