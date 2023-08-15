package ch10_MethodCreation;

import java.util.Scanner;

public class C05_CRUD {// biz burada methodlar create edeceğiz
    // buradaki methodları Runner class dan ve Switch class dan calistiracagiz
    // buradaki methodlar ihtiyaç olduğunda istenen yerden call edilebilir
    //bu methodları call edeceğiniz yer de main method olmalı.


    static Scanner input= new Scanner(System.in);// class level da tanımlandı
    static String staticUserName = ""; // kullanıcıdan alınan user name i kayit etmek için create edildi.


    public static void createUser() {


        System.out.println("user name gir");

        String userName = input.nextLine();// bu method için create edildi

        staticUserName = userName; // kullanıcının girdiği user name bizde static olan variable a atandı
        // çünkü aşagıdaki methodlarda kullanıcı kontrolu yapılıp true ise işleme alınacak.

        System.out.println("create edilen userName = " + userName);
        System.out.println(userName + " isimli kullanici sisteme kayit oldu");


    }

public static void getUser() {// kullanici isim girmeli bu isme göre bir kontrol yapilip kullaniciya true false dönmeli

    System.out.println("sorgulamak istediğin user name gir");
    String userName = input.nextLine();

    if (userName.equals((staticUserName))){

        System.out.println(userName + " isimli kullanici sistemde mevcut");
    }else System.out.println(userName + " isimli kullanıcı sistemde mevcut DEĞİL 404 not found");




}

public static void updateUser(){// burada kullanıcı kendi ismini update edecek
    System.out.println("şu anki mevcut isminiz " + staticUserName);
    System.out.println("yeni isim giriniz");

    String yeniIsim =input.nextLine();

    staticUserName = yeniIsim;
    System.out.println("isim güncelleme başarılı 200 ok");
    System.out.println("yeni isminiz " + staticUserName);



}

public static void deleteUser(){
    System.out.println("silmek istediğin ismi gir");
        String silinecekİsim =input.nextLine();
        if (silinecekİsim.equals(staticUserName)){// kullanıcıdan alinan isim eşit ise sistemde kayıtlı olan static user name e

            System.out.println(staticUserName + "isimli kullıcı sistemden silindi");
            staticUserName =null;
            System.out.println("silinen isim " +silinecekİsim);

        }else System.out.println(silinecekİsim + "isimli kullanici sistemde mevcut değil 404 not found");


}

public static void cikis () {

    System.out.println();
}

}
