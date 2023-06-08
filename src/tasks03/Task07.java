package tasks03;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
   Scanner scanner = new Scanner (System.in);
   System.out.print("Mesafeyi giriniz: ");
   int m = scanner.nextInt();
   System.out.print("Hızı giriniz: ");
   int h = scanner.nextInt();
   int s = m/h;
        System.out.println("s = " + s);


    }
}
