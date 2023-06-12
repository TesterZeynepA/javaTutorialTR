package Tasks08_forLoop;

import java.util.Scanner;

public class Task06_Nested {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir boyut giriniz");
        int boyut = input.nextInt();

       for (int i = 1; i <=boyut ; i++) {

           for (int j = 1; j <=i ; j++) {

               System.out.print("* ");
           }
           System.out.println();
       }

    }
}



