package InterviewQuestions;


import java.util.Scanner;

public class Q03_PrimeNumber {
    /* Task->
    Ask user enter a positive number and check if it is prime or not
    Girilen  pozitif bir sayı olmasını kontrol eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz : ");
        int sayi = input.nextInt();

        boolean asalMi = true; //asaldir

        if(sayi>=2){
            for (int i = 2; i <sayi ; i++) {
                if(sayi%i == 0){ //herhangi bir boleni varsa
                    asalMi=false;
                    break;
                }
            }
           if(asalMi) {

               System.out.println(sayi + " sayisi asaldir");

           }else System.out.println(sayi + " sayisi asal degildir");

        }else {System.out.println(sayi + " sayisi asal degildir"); //0,1, negatif sayiari bertaraf etmek icin

    }

    }

}
