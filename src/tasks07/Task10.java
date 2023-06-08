package tasks07;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim = input.next();

        String birinci = isim.substring(0,1);
        String ikinci = isim.substring(1,2);
        String ucuncu = isim.substring(2,3);


        String result = !birinci.equals(ikinci) && !birinci.equals(ucuncu) && !ikinci.equals(ucuncu) ? "unique" : "non unique";
        System.out.println("result = " + result);


    }
}