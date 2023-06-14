package ch08_Loops.L03_DoWhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Scanner input = new Scanner(System.in);
        int bilgisayarSayisi = (int) (Math.random() * 100) + 1;
        int tahmin;
        int tahminSayisi = 0;

        System.out.println("Bilgisayarın tuttuğu 1 ile 100 arasındaki sayıyı tahmin ediniz");

        while (true) {
            System.out.print("Tahmininiz: ");
            tahmin = input.nextInt();
            tahminSayisi++;

            if (tahmin < bilgisayarSayisi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > bilgisayarSayisi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! Doğru sayıyı buldunuz.");
                System.out.println("Tahmin sayısı: " + tahminSayisi);
                break;


            }

        }
    }
}