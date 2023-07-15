package Project3;

import java.util.ArrayList;
import java.util.Scanner;

import static Project3.Kayıt.*;

public class AppMenu {

    public static void giris(){

      Kayıt obj = new Kayıt();

        System.out.println("Lütfen işleminizi seçiniz : \n1->Kullanıcı kayıt al \n2->Şanslı kişi bul  \n3-> Kayıtları Listele \n0->Çıkış");

        System.out.println("Seçiminizi giriniz : ");

        switch (new Scanner(System.in).nextInt()) {

            case 0:

                obj.cıkıs();
                break;
            case 1:
              obj.kayıtAl();//Kayıt Class dan kayıtAl meth call edildi.
                giris();
                break;
            case 2:
                obj.sansliKullaniciBul(kullanıcılar);
                giris();
                break;
            case 3:
                obj.listele(kullanıcılar);
                giris();
                break;
            default:
                System.out.println("Hatalı bir seçim yaptınız lütfen terar deneyiniz");
                break;

        }

    }

}

