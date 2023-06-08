package tasks04;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Bir saniye değeri giriniz: ");
        int saniye = input.nextInt();
        int saat = saniye / 3600;
        int kalanSaniye = saniye % 3600;
        int dakika = kalanSaniye /60;
        kalanSaniye = kalanSaniye % 60;
        System.out.println(saat + " saat " + dakika + " dakika " + kalanSaniye + " saniye ");








    }
}
