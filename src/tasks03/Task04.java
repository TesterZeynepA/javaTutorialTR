package tasks03;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
         System.out.println("isim giriniz");
         System.out.println("soy isim giriniz");
         System.out.println("yaşınızı giriniz");
         System.out.println("kilonuzu kg olarak giriniz");
         System.out.println("boyunuzu cm olarak giriniz");
         System.out.println("salona devam edeceğiniz süreyi ay olarak giriniz");
         String isim = input.next();
         String soyisim = input.next();
         int yas = input.nextInt();
         double kilo = input.nextDouble();
         int boy = input.nextInt();
         int ay = input.nextInt();
         int toplamUcret = (int) (ay*20);
         System.out.println("toplamUcret = " + "$" + toplamUcret );


    }
}
