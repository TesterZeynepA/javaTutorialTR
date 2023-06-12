package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String[] args) {

        // task-> girilen tamsayını pozitif tam bolen sayısını print eden code create ediniz...
// 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
// 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayı = input.nextInt();

        int bölen =1;
        int bölenSayisi = 0;
        while (bölen <=sayı) { //bölen sayı alınan sayıdan küçük olduğu müddetçe çalış

            if (sayı%bölen == 0) { // tam bölünme şartı

                bölenSayisi++;

            }
            bölen++;// bu kod olmazsa loop bitmez


        }
        System.out.println(bölenSayisi);









    }
}
