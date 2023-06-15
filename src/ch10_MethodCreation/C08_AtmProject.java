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
               // bakiyeSorgula();
                anaMenu();
                break;
            case 2:
               // paraYatir();
                anaMenu();
                break;
            case 3:
               // paraCekme();
                anaMenu();
                break;
            case 4:
                cikis();
            default:
                System.out.println("hatali secim yaptiniz tekrar deneyin");
                anaMenu();
                break;







        }

    }
}
