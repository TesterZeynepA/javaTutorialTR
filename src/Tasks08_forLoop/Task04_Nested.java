package Tasks08_forLoop;

import java.util.Scanner;

public class Task04_Nested {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int kenar = input.nextInt();

        for (int i = 1; i <=kenar ; i++) {

            for (int j = 1; j <=kenar ; j++) {
                if (i==j){
                    System.out.print("1 ");

                }else System.out.print("0 ");

            }
            System.out.println();
        }

    }
}
