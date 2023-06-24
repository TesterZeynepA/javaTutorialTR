package Project;

import java.util.Random;
import java.util.Scanner;

/*
Sayı tahmin etme oyunu....
Bilgisayardan rastle(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan code create ediniz .
*/
public class SayiTahminEtmeOyunu {

    static   Scanner input = new Scanner(System.in);
    static   Random rnd = new Random();
    static int pcSayi = rnd.nextInt(100) + 1;

    public static void main(String[] args) {

        sayıTahminEt();

        //Scanner input = new Scanner(System.in);
        //Random rnd = new Random();
        //int pcSayi = rnd.nextInt(100)+1;
        ///  System.out.println("pcSayi = " + pcSayi);
        //System.out.print("   ***   Tahmin oyununa hoş geldiniz :)   ***   \nagam ahan da 1-100 arası bişey giresen : ");

        //int agaTahmin = input.nextInt();


        //if (agaTahmin < 100 && agaTahmin > 0) {
        //    while (agaTahmin!=pcSayi) {
        //        if (agaTahmin<pcSayi) {
        //            System.out.println("agam elini yuksek tut sayıyı artır ");
        //            agaTahmin=input.nextInt();

        //        } else if (agaTahmin>pcSayi) {
        //            System.out.println("agam elini alçak tut sayıyı azalt ");
        //            agaTahmin=input.nextInt();
        //        }
        //    }
        //    System.out.println("BiNGOOO agam kazandın çaylar senden :) ");
        //} else System.out.println("Agam gelmim oraya adam gibi bişey giresen  :-( ");
    }//main sonu

    private static void sayıTahminEt() {

        System.out.println("pcSayi = " + pcSayi);
        System.out.print("   ***   Tahmin oyununa hoş geldiniz :)   ***   \nagam ahan da 1-100 arası bişey giresen : ");

        int agaTahmin = input.nextInt();

        int tahminSayısı = 1;

        if (agaTahmin < 100 && agaTahmin > 0) {
            tahminSayısı++;
            while (agaTahmin != pcSayi) {
                if (agaTahmin < pcSayi) {
                    System.out.println("agam elini yuksek tut sayıyı artır ");
                    agaTahmin = input.nextInt();
                    tahminSayısı++;
                } else if (agaTahmin > pcSayi) {
                    System.out.println("agam elini alçak tut sayıyı azalt ");
                    agaTahmin = input.nextInt();
                    tahminSayısı++;
                }
            }
            System.out.println("BiNGOOO agam kazandın çaylar senden :) " + tahminSayısı + ". tahminde buldunuz...");
        } else {
            System.out.println("Agam gelmim oraya adam gibi bişey giresen  :-( ");
            sayıTahminEt();
        }


    }


}//Class sonu













