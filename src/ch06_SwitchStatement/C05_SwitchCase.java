package ch06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        // girilen ayın hangi mevsimde oldugunu print eden code create ediniz...


        Scanner input = new Scanner (System.in);
        System.out.print("Ay numarasi giriniz: ");
        int num = input.nextInt();


        switch (num) {
            case 3:
            case 4:
            case 5:
                    System.out.println("mevsim : ilkbahar");
                    break;

            case 6:
                case 7:
                case 8:
                    System.out.println("mevsim : yaz");
                    break;

            case 9:
                case 10:
                case 11:
                    System.out.println("mevsim : sonbahar");
                    break;

            case 12:
            case 1:
                case 2:
                    System.out.println("mevsim : kış");
                    break;

            default:
                System.out.println("gecerli bir sayi giriniz");
                break;


        }


    }
}
