package Tasks08_forLoop;

import java.util.Scanner;

public class Task07_Nested {

    public static void main(String[] args) {
        /*
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input   : selam javaCAN'lar
        output : a sayısı : 4
         */

        Scanner input =new Scanner(System.in);
        System.out.println("bir cümle yazınız");
        String cümle= input.nextLine();

        System.out.println("cümledeki sayısını görmek istediğiniz harfi giriniz");



   //    //1. yol
   // char harf=input.next().charAt(0);

   //    int count=0;
   //   for (int i = 0; i <= cümle.length()-1 ; i++) {

   //           count++;
   //       }
   //   } System.out.println(cümle+ " cümlesinde  "+harf+" harfi "+count + " tane var");



   //    //2. yol
   //    String harfString=input.next();

   //    for (int i = 0 ; i < cümle.length() ; i++) {

   //        if (cümle.substring( i , i+1 ).equals(harfString)){//contains
   //            count++;
   //        }


   //    }
   //    System.out.println(cumle+" cümlesinde  "+harfString+" harfi "+count + " tane var");








    }
}
