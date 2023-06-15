package Challange06;

import java.util.Scanner;

public class Task07 {


    // Task-> Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str = input.next();

        int index = 0;
        int strUzunluk = str.length();

        while (index < strUzunluk) {
            char ch = str.charAt(index);

            if (ch != ' ' && ch != 'a') {
                System.out.println(ch);
            }

            index++;


        }

    }

}
