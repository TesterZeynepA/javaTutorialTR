package task08_whileLoop;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç adet sayıyı toplamak istiyorsunuz: ");

        int sayac=input.nextInt();

        int i=0,sayi,toplam=0;

        while (i!=sayac) {
            i++;
            System.out.print(i + " . sayıyı giriniz:  ");
            sayi = input.nextInt();
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);



    }

}
