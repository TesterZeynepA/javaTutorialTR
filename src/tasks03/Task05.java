package tasks03;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz :");
        int a = scanner.nextInt();
        System.out.println("Bir tam sayi giriniz :");
        int b = scanner.nextInt();
        int toplam = a + b;
        int fark = a - b;
        int carpma = a*b;
        int bölüm = a/b;
        System.out.println(toplam);
        System.out.println(fark);
        System.out.println(carpma);
        System.out.println(bölüm);


    }

}
