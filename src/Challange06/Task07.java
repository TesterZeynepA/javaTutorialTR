package Challange06;

import java.util.Scanner;

public class Task07 {


    // Task-> Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)== 'a' || str.charAt(i)== ' '){

                continue;

            }
            System.out.println(str.charAt(i));
        }

    }

}
