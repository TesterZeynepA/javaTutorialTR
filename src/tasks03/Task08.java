package tasks03;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Vize 1 notunu giriniz: ");
        int vize1 = input.nextInt();
        System.out.println("Vize 2 notunu giriniz: ");
        int vize2 = input.nextInt();
        System.out.println("Final notunu giriniz: ");
        int finalNot = input.nextInt();
        int geçmeNotu = (int) ((int) ((vize1+vize1)/2)*0.3 + finalNot*0.7);

        System.out.println("geçmeNotu = " + geçmeNotu);

    }
}
