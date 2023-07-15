package OzelTasklar;

import java.util.Random;
import java.util.Scanner;

public class T03_TasKagitMakas {//verildi

    public static void main(String[] args) {
     /*
Taş kağıt makas oyunu....
Bilgisayardan rastle(random class kullanılarak) 1-2-3 1=TAŞ, 2=KAĞIT, 3=MAKAS arasında bir sayı alıp kullanıcının
seçimini  kullanarak 3 puan alanın kazan oldugu code create ediniz .

*/
        System.out.println("****** TAŞ-KAĞIT-MAKAS oyunumuza hoş geldiniz *****");

        int puanOyuncu = 0;
        int puanComputer = 0;

        Scanner input = new Scanner(System.in);

        Random randomSayi = new Random();


        while (puanComputer < 3 && puanOyuncu < 3) {

            System.out.println("lütfen TAŞ icin 1'i \nKAĞIT icin 2'yi \nMAKAS için 3'ü seçiniz. Oyundan çıkmak için 0'ı seçiniz");

            int secimOyuncu = input.nextInt();

            if (secimOyuncu == 0) {
                break;
            }

            int secimComputer = randomSayi.nextInt(3) + 1;

            System.out.println("Bilgisayarın seçtiği sayı = " + secimComputer);

            if (secimOyuncu == secimComputer) {

                System.out.println("Berabere!");

            } else if ((secimOyuncu == 1 && secimComputer == 3) || (secimOyuncu == 2 && secimComputer == 1) || (secimOyuncu == 3 && secimComputer == 2)) {

                System.out.println("Kazandınız!");
                puanOyuncu++;
            } else {
                System.out.println("Kaybettiniz!");
                puanComputer++;
            }

            System.out.println("Oyuncunun puanı = " + puanOyuncu);
            System.out.println("Bilgisayarın puanı = " + puanComputer);

            System.out.println("------------------------");

        }

        if (puanOyuncu > puanComputer) {

            System.out.println("Tebrikler Oyunu KAZANDINIZ!");
        } else if (puanOyuncu < puanComputer) {

            System.out.println("Oyunu KAYBETTİNİZ!");
        } else {

            System.out.println("Oyun BERABERE BİTTİ!");
        }
    }
}
