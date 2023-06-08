package tasks03;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

Scanner input = new Scanner(System.in);
        System.out.println(" Üçgenin dik kenarını giriniz: ");
        double a = input.nextDouble();
        System.out.println("Üçgenin dik kenarını giriniz: ");
        double b = input.nextDouble();
        double hipotenus = (a*a) + (b*b);
        double sonuc = Math.sqrt (hipotenus);
        System.out.println("sonuc = " + sonuc);


    }
}
