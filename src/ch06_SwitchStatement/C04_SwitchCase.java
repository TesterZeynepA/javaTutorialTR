package ch06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        // Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
//break in ozelligini kullanin
//29 subat icin sartlarini hatirlayiniz.

        Scanner input = new Scanner (System.in);
        System.out.print("Sayı giriniz: ");
        int num = input.nextInt();


        switch (num) {

            case 1:
                System.out.println("31 gün");
                break;
            case 2:
                System.out.println("yılı giriniz");
                int yıl = input.nextInt();
                if (yıl%4==0){
                    System.out.println("ay 29 gün çeker");
                } else
                    System.out.println("ay 28 gün çeker");
                break;
            case 3:
                System.out.println("31 gün");
                break;
            case 4:
                System.out.println("30 gün");
                break;
            case 5:
                System.out.println("31 gün");
                break;
            case 6:
                System.out.println("30 gün");
                break;
            case 7:
                System.out.println("31 gün");
                break;
            case 8:
                System.out.println("31 gün");
                break;
            case 9:
                System.out.println("30 gün");
                break;
            case 10:
                System.out.println("31 gün");
                break;
            case 11:
                System.out.println("30 gün");
                break;
            case 12:
                System.out.println("31 gün");
                break;
                default:
                    System.out.println("geçerli bir sayi giriniz");

        }

        /*ternary :
System.out.println(yil % 4 == 0 ? "girilen ayda 29 gün vardır" : "girilen ayda 28 gün vardır");
break;

         */


      //switch (num) {
      //    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(num + " 31 ceken aylardandir");
      //    case 4, 6, 9, 11 -> System.out.println(num + " 30 ceken aylardandir");
      //    case 2 -> {
      //        System.out.print("Please enter a year: ");
      //        int year = input.nextInt();
      //        Object subat = (year % 4 == 0) ? num + " 29 ceker" : num + " 28 ceker";
      //        System.out.println(subat);
      //    }
      //    default -> System.out.println("tekrar dene");





    }
}
