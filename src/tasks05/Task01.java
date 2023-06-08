package tasks05;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = input.nextInt();
        if (yas>=0 && yas<=4) {
            System.out.println("Bebek");
        }else if (yas >=5 && yas<=12) {

            System.out.println("Cocuk");
        }else if (yas >=13 && yas <=20) {
            System.out.println("Genc");

        }else if (yas >=21 && yas<=30) {
            System.out.println("yetişkin");
        }else
            System.out.println("Tanimlanmamis evre");





    }
}
