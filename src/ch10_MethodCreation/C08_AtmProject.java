package ch10_MethodCreation;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD.cikis;

public class C08_AtmProject {


    static Scanner input = new Scanner(System.in);
    static String password = "1234a.";
    static double bakiye = 1000.25;
    static  int count = 3; // kullanıcıya yanlış girme hakkı için create edildi
    public static void main(String[] args) {

        //basit bir atm projesi yazınız
        // switch case, method creation ve diger konuları kullanarak yazınız.
        sifreKontrol();
    }

    private static void sifreKontrol() {

        System.out.println("***********************");
        System.out.println("***** Bankamıza Hoşgeldiniz *****");
        System.out.println("hoşgeldiniz şifrenizi giriniz");

        String sifre = input.nextLine();

        while (count>0){ //
            if (sifre.equals(password)){

                System.out.println("şifre girişi başarılı");
                anaMenu();//şifre doğru ise ana menuye yönlendir
                break;
            }else {
                System.out.println("şifre eşleşmedi tekrar dene");
                sifre = input.nextLine();
                count--;
                if (count==0){
                    System.out.println("kart bloke oldu");
                    break;
                }
            }

        }

    }

    private static void anaMenu() {
        System.out.println("bakiye sorgulamak için 1\npara yatırmak için 2\npara çekme için 3 \n" +
                "cikis için 4'e basiniz");
        int secim = input.nextInt();

        switch (secim){
            case 1:
               bakiyeSorgula();
                anaMenu();
                break;
            case 2:
               paraYatir();
                anaMenu();
                break;
            case 3:
               paraCekme();
                anaMenu();
                break;
            case 4:
                cikisYapma();
                break;
            default:
                System.out.println("hatali secim yaptiniz tekrar deneyin");
                anaMenu();
                break;
        }

    }

    private static void cikisYapma() {

        System.out.println("Sistemden çıkıyorsunuz. Tekrar bekleriz.");
    }

    private static void paraCekme() {
        System.out.println("ne kadar cekmek istersiniz");
        double cekilecekMiktar = input.nextDouble();
        if(cekilecekMiktar<= bakiye) {
            bakiye -= cekilecekMiktar;
            System.out.println("cekilen miktar = " + cekilecekMiktar);
            System.out.println("kalan bakiyeniz = " + bakiye);

        } else System.out.println("bakiyeniz yetersiz oldugu icin cekme isleminiz başarisiz bakiyeniz =" +bakiye);

    }

    private static void paraYatir() {

        System.out.println("ne kadar yatirmak istersin");
        double yatirilacakMiktar = input.nextInt();
        bakiye +=yatirilacakMiktar;
        System.out.println("güncel bakiyeniz: " + bakiye);

    }

    private static void bakiyeSorgula() {

        System.out.println("bakiye = " + bakiye);
    }
}
