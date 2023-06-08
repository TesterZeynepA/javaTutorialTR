package tasks03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        System.out.println("Günde kaç saat uyuduğunuzu girin");

        int saat = scan.nextInt();

      int ayda = (int) (saat*30/24.0);

       int yil = (int) (saat*365/24.0);

        int kirkyil = (int) (saat*40*365/24.0);

        System.out.println("ayda = " + ayda);

        System.out.println("yil = " + yil);

        System.out.println("kirkyil = " + kirkyil);

    }
}
