package tasks05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {


         /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir yil giriniz: ");
        int year = input.nextInt();
        if (year%100==0 && year%400 == 0) {

            System.out.println(year + "Leap Year(Artik Yildir)");
        } else if (year%100!=0 && year%4==0){
            System.out.println(year + "Leap Year(Artik Yildir)");
        }else System.out.println(year + "Leap Year (Artik yil) değildir");





    }
}
