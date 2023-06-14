package ch10_MethodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {

// task-> girilen tam sayının rakamları toplamını print eden METHOD create ediniz

        Scanner input =new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi = input.nextInt();

        System.out.println("rakamlarToplamı(sayi) = " + rakamlarToplamı(sayi));// method call edildi


    }

    public static int rakamlarToplamı(int x) {

       int rakamlarToplami =0;

       while (x>0){// sayi 0'dan büyük olduğu müddetçe çalış

           rakamlarToplami+=x%10;// sayinin son basamagı. her seferinde 10 a bölüp kalani toplayacak
           x/=10; //her döngüde 10'na bölünecek ve bir önceki basamak atılmış olacak int sayesinde

       }


       return rakamlarToplami;
    }

}
