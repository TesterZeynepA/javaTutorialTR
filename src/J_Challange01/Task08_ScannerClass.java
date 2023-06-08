package J_Challange01;

import java.util.Scanner;

public class Task08_ScannerClass {
    public static void main(String[] args) {

        /*
 girilen iki tam sayının toplam ve farkını print eden code create ediniz.

 */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen iki tam sayı giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int toplam = sayi1 + sayi2;
        int fark = sayi1 - sayi2;

        System.out.println("toplam = " + toplam);
        System.out.println("fark = " + fark);













    }
}
