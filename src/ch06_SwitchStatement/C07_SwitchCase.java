package ch06_SwitchStatement;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        // TASK -> girilen haftanin gününü hafta içi veya hafta sonu olduğunu print eden code create ediniz...

        Scanner input = new Scanner (System.in);
        System.out.println("1den 7ye kadar bir sayi giriniz");
        int number = input.nextInt();

        switch (number) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici günlerdesiniz");
                break;
                case 6:
                    case 7:
                        System.out.println("haftasonu günlerindesiniz");
                        break;
                        default:
                            System.out.println("geçersiz bir sayi girdiniz");
                            break;

        }

//// String ile çözüm

        System.out.println("gun ismi gir");
        String gun =input.nextLine().toUpperCase();
        System.out.println("gun = " + gun);
        switch (gun) {

            case "PAZARTESI":
            case "SALI":
            case "CARSAMBA":
            case "PERSEMBE":
            case "CUMA":
                System.out.println("girilen gun hafta icidir");
                break;
            case "CUMARTESİ":
            case "PAZAR":
                System.out.println("haftasonu");
            break;
                default:
                    System.out.println("geçersiz bir gun girdiniz");
                    break;





        }








    }
}
