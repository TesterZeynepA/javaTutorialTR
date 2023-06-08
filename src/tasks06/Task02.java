package tasks06;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşadığınız güne atanan numarayı giriniz ="+"\n"+"Pazartesi:1\n" +
                "Salı:2\n" +
                "Carsamba:3\n" +
                "Persembe:4\n" +
                "Cuma:5\n" +
                "Cumartesi:6\n" +
                "Pazar:7");
        int yasadigiGun =input.nextInt();

        int yuzGunSonra = (yasadigiGun +100)%7;

        switch (yuzGunSonra) {

            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 0 :
                System.out.println("Pazar");
                break;


        }








    }
}

