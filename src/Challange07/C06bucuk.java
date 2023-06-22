package Challange07;

import java.util.Locale;
import java.util.Scanner;

public class C06bucuk {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Agam adını giresen : ");
            String ad = input.nextLine().toUpperCase(); //HALUK
            System.out.print("Agam soyadını giresen : ");
            String soyad = input.nextLine().toUpperCase(); //BİLGİN
            System.out.println(name(ad, soyad));

        }// main sonu

        public static String name(String ad, String soyad) {
            return (ad.charAt(0)+(ad.substring(1).toLowerCase()))+" "
                    +(soyad.charAt(0)+(soyad.substring(1).toLowerCase()));
        }
    }// Class