package tasks07;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner input = new Scanner(System.in);
        System.out.println(" iki isim ve bir soy isim giriniz");
        String isim = input.nextLine();
        int indexOfBosluk1 = isim.indexOf(' ');
        int indexOfBosluk2 = isim.lastIndexOf(' ');

        String basHarfler = isim.substring(0,1).toUpperCase()+"." // A.M.
                +isim.substring(indexOfBosluk1+1,indexOfBosluk1+2).toUpperCase()+"."
                +isim.substring(indexOfBosluk2+1,indexOfBosluk2+2).toUpperCase()+".";

        System.out.println("basHarfler = " + basHarfler);


    }
}
