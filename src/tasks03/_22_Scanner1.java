package tasks03;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    Bir String oluşturun.
          Konsol'a isminizi girin.
          İsminizi yazdırın.  */

        //Kodu aşağıya  yazınız.

        Scanner input = new Scanner (System.in);
        System.out.print("İsminizi girin: ");
        String isim = input.nextLine();

        System.out.println(isim);


    }
}
