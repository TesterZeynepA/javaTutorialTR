package tasks06;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının sayi değerini yazı ile yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.println("onlar basamagi olan bir sayi giriniz");
        int sayi = input.nextInt();
        int onlarBasamagi=(sayi/10)%10;

        switch (onlarBasamagi){

            case 1:
                System.out.println("bir");
                break;

            case 2:
                System.out.println("iki");
                break;

            case 3:
                System.out.println("üç");
                break;

            case 4:
                System.out.println("dört");
                break;

            case 5:
                System.out.println("beş");
                break;

            case 6:
                System.out.println("altı");
                break;

            case 7:
                System.out.println("yedi");
                break;

            case 8:
                System.out.println("sekiz");
                break;

            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Lutfen gecerli bir sayı giriniz");
                break;
        }



    }
}
