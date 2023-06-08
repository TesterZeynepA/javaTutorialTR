package tasks06;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz");
        int sayi = input.nextInt();

        int yuzler,onlar,birler;

        yuzler=sayi/100;

        onlar=(sayi/10)%10;

        birler = (sayi%10);


        switch (yuzler) {
            case 1:
                System.out.print("Yüz");
                break;
            case 2:
                System.out.print("İkiYüz");
                break;
            case 3:
                System.out.print("ÜçYüz");
                break;
            case 4:
                System.out.print("DörtYüz");
                break;
            case 5:
                System.out.print("BeşYüz");
                break;
            case 6:
                System.out.print("AltıYüz");
                break;
            case 7:
                System.out.print("YediYüz");
                break;
            case 8:
                System.out.print("SekizYüz");
                break;
            case 9:
                System.out.print("DokuzYüz");
                break;
            default:
                System.out.println("Geçersiz bir sayi girdiniz");
                break;

        }

        switch (onlar) {

            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmış");
                break;
            case 7:
                System.out.print("Yetmiş");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
        }

        switch (birler) {
            case 1:
                System.out.print("Bir");
                break;
            case 2:
                System.out.print("İki");
                break;
            case 3:
                System.out.print("Üç");
                break;
            case 4:
                System.out.print("Dört");
                break;
            case 5:
                System.out.print("Beş");
                break;
            case 6:
                System.out.print("Altı");
                break;
            case 7:
                System.out.print("Yedi");
                break;
            case 8:
                System.out.print("Sekiz");
                break;
            case 9:
                System.out.print("Dokuz");
                break;
        }





    }
}
