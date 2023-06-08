package tasks07;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden code create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Password giriniz");
        String password = input.next();
        char ilkKarakter =password.charAt(0);
        char sonKarakter = password.charAt(password.length() - 1);
        int uzunluk = password.length();

        if (Character.isDigit(sonKarakter) && uzunluk >=6 && ilkKarakter==Character.toUpperCase(ilkKarakter))

            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");

    }}
