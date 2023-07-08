package Project2;

import java.util.Scanner;

public class Task04_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");

        double yukseklik = input.nextDouble();

        double topunToplamYolu=0;

        int yereVurmaSayisi=0;

        do {
            topunToplamYolu+=yukseklik;// ilk düşüş
            yukseklik*=0.75;//zıplama yüksekliği
            topunToplamYolu+=yukseklik*2;// ikinci zıplama
            yereVurmaSayisi++;
        }while (yukseklik>=1.0);// zıplama 1 metrenin altına düşünce durur

        System.out.println("Topun toplam yolu = " + topunToplamYolu);
        System.out.println("Topun toplam yere vurma sayısı = " + yereVurmaSayisi);


    }
}
