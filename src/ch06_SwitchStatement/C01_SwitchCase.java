package ch06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {


        //if else sartli islemlerde
        //ternary sartli islemlerde
        //switch case i de sartli islemlerde kulanilir tek bir fark karsilastirma yapilmaz
        //ornegin kayit icin 1 e bas denilirse bunu if else ile yapilabilir switch durumuna
        // kayidi alip case e 1 verilipd islem yapilir



        // TASK-> 0-2 arası girilen rakamı yazi ile yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.print("Bir rakam giriniz: ");

        int rakam = input.nextInt();

        if (rakam ==0) {
            System.out.println("sifir");
        } else if (rakam == 1) {
            System.out.println("bir");
        } else if (rakam == 2) {
            System.out.println("iki");
        }else System.out.println("0 ile 2 arasinda bir rakam girmelisin");

//switch ile

        System.out.println("Switch ile kodlar");
        switch (rakam) {
            case 0:
                System.out.println("sifir");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            default:
                System.out.println("0 ile 2 arasinda bir rakam girmelisin");
                break;
        }


        //switch örnegi basic olarak

        System.out.println("ana menu icin A \n urun gostermek icin B \n eklemek icin C \n cikis icin Q ya basiniz");
        String islem = input.next().toUpperCase(); //input ile Scanner class ina ulasildi.
        //next methodu ile kullanicidan veri alindi.
        // toUpperCase ile kullanicinin girdigi harf buyuk harfe cevrildi.
        switch (islem) {
            case "A":
                System.out.println("ana menuye hosgeldiniz");
                break;
            case "B":
                System.out.println("hangi urunleri gormek istersiniz");
                break;
            case "C":
                System.out.println("hangi urunleri eklemek istersiniz");
                break;
            case "Q":
                System.out.println("cikis isleminiz yapiliyor");
                break;
        }




    }
}
