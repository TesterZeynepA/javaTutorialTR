package Tasks08_forLoop;


import java.util.Scanner;

public class Odev07 {

    public static void main(String[] args) {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısı giriniz");
        int satır= input.nextInt();

        for (int i = 1; i <= satır; i++) {

            for (int b = satır; b >=i; b--) {

                System.out.print(" ");

            }
            for (int j = 1; j <=i; j++) {

                if (j==1 || j==i || i== satır) {

                    System.out.print("* ");

                }else System.out.print("! ");

            }
            System.out.println();
        }










}










}
