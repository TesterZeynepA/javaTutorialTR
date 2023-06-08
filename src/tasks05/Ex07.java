package tasks05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        /*
          TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise
           kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz


         */

        Scanner scanner = new Scanner(System.in);
        int eksikYil, eksikMesafe;

        System.out.println("Ehliyetiniz var mı? :");
        boolean ehliyet = scanner.nextBoolean();
        System.out.println("Kaç yil sürücü tecrübeniz var? :");
        int yilTecrube = scanner.nextInt();
        System.out.println("Kac Km Mesafe yaptınız? :");
        int mesafe = scanner.nextInt();

        if (ehliyet && yilTecrube>=7 && mesafe>=100000) {
            System.out.println("Kontak anahtarını veriniz");
        }else if (ehliyet && yilTecrube<7 && mesafe >=100000) {
            eksikYil =7-yilTecrube;
            System.out.println("Yıl tecrübeniz eksik" +  eksikYil + "sonra tekrar geliniz");
        }else if (ehliyet && yilTecrube>= 7 && mesafe < 100000){
            eksikMesafe =(100000 - mesafe);
            System.out.println("Mesafe uzunluğunuz eksik" +  eksikMesafe + "daha yaptıktan sonra tekrar geliniz");
        }else
            System.out.println("Arac kullanmaya yetkiniz bulunmamaktadir");





    }
}
