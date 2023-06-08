package tasks04;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inek sayısını giriniz : ");
        int inek = input.nextInt();
        System.out.println("Koyun sayısını giriniz : ");
        int koyun = input.nextInt();
        System.out.println("Tavuk sayısını giriniz : ");
        int tavuk = input.nextInt();

        int toplamAyak = inek *4 + koyun*4 + tavuk*2;

        System.out.println("toplamAyak = " + toplamAyak);


    }

}
