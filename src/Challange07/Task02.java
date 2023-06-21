package Challange07;
import java.util.Scanner;

public class Task02 {

		// task-> girilen tamsayının tek-çift olmasını kontrol eden method create ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Agam bi sayi giresen : ");
        //int sayi = input.nextInt();
        // System.out.println(tekCiftControtEt1(sayi));
        // System.out.println(tekCiftControtEt1(input.nextInt()));
        // System.out.println(tekCiftControtEt2(sayi));
        System.out.println(tekCiftControtEt2(input.nextInt()));
    }//main sonu

    private static boolean tekCiftControtEt1(int sayi) {

        return sayi%2==0?true:false;
    }
    static String  tekCiftControtEt2(int sayi) {

        return sayi%2==0?"girilen sayi CİFT":"girilen sayi TEK";
    }

}//Class sonu
