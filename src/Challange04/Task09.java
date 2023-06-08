package Challange04;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

/* Task->
      Girilen bir kelimede  tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri print eden code create ediniz.
      */

        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = input.nextLine();

        if (kelime.length()%2==1 && kelime.length()>=3) {

            System.out.println("orta karakter = " + kelime.charAt(kelime.length() / 2));
        } else System.out.println("girdiğiniz kelime çift sayida karakter içeriyor");








    }
}
