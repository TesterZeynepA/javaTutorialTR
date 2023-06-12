package Tasks08_forLoop;

import java.util.Scanner;

public class Task05_Nested {
    public static void main(String[] args) {
        /*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Kare için bir kenar birim değeri giriniz");

        int kenar = input.nextInt();


        for (int i = 1; i <=kenar ; i++) {

            for (int j = 1; j <=kenar; j++) {

                System.out.print(i*j+ "\t");

            }
            System.out.println();
        }






    }
}
