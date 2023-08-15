package ch10_MethodCreation;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD.*;

public class C05_SwitchCaseMethods {// CRUD class daki methodları buradan switch ize edeceğiz...

    // karşilama methodu yazalım

    public static void menu(){
        System.out.println("sistemimize hoş geldin");
        System.out.println("uygulamaya kayit olmak için 1 \nkullanıcı sorgulamak için 2 \nkullanıcı bilgi güncelleme için 3 \n" +
                "kullanıcı silme için 4 \ncikiş işlemler için 5'e basiniz");

        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        switch (secim) {

            case 1:
                createUser();
                menu();
                break;
            case 2:
                getUser();
                menu();
                break;
            case 3:
                    updateUser();
                    menu();
                    break;

            case 4:
                deleteUser();
                menu();
                break;
            case 5:
                cikis();
                break;
            default:
                System.out.println("hatali secim yaptınız");
                menu();
                break;
        }
    }

}
