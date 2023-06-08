package J_Challange01;

import java.util.Scanner;

public class Task09_ScannerClass {
    public static void main(String[] args) {

        //  Girilen yaricap değeri için cemberin cevresini ve dairenin alanini print eden code create ediniz. (pi =3.14)

        Scanner input = new Scanner(System.in);
        System.out.println("Çemberin yarıçapını giriniz");
        double yaricap = input.nextDouble();
        double pi = 3.14;
        double cevre = 2* pi * yaricap;
        System.out.println("Çevre: " + cevre);
        double daireAlan = pi * (yaricap*yaricap);
        System.out.println("Daire Alanı: " + daireAlan);




    }


}
