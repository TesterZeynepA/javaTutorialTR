package tasks03;

import java.util.Scanner;

public class _23_Scanner2 {

    public static void main(String[] args) {

    /*    Bir int oluşturun.
          Konsol'a herhangi bir sayı giriniz.
          Bu sayıyı yazdırın.   */

        //Kodu aşağıya  yazınız.
        Scanner scanner = new Scanner (System.in);
        System.out.println("bir sayi giriniz :");
        int sayi = scanner.nextInt();
        System.out.println("sayi = " + sayi);

    }
}
