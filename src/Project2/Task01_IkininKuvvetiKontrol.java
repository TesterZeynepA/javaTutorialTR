package Project2;

import java.util.Scanner;

public class Task01_IkininKuvvetiKontrol {
    public static void main(String[] args) {
        /* Task
        Girilen sayının 2'nin kuvveti olmasının kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("pozitif tam sayi giriniz");
        int sayi = input.nextInt();

        String sonuc = (PowerOfTwo(sayi)) ? sayi + " sayisi 2 nin kuvvetidir": sayi + " sayisi 2 nin kuvveti Değildir";

        System.out.println("sonuc = " + sonuc);

        powerOfTwo1(sayi);



    }

    private static void powerOfTwo1(int sayi) {

       if (sayi%2==0) {
           sayi/=2;
           if (sayi==1){
               System.out.println("girilen sayi 2 nin kuvvetidir");
           }else{

               powerOfTwo1(sayi);
           }
       }else {

           System.out.println("girilen sayi 2'nin kuvveti değildir");
       }


    }

    private static boolean PowerOfTwo(int sayi) {

        boolean sonuc = false;

        for (int i = 1; i <=sayi; i*=2) {

            if (sayi==i){

               sonuc =true;
               break;

            }

        }
        return sonuc;
 // if (sayi<=0){
 //     return false;
 // }

 // while (sayi>1){

 //     if (sayi%2!= 0){
 //         return false;
 //     }

 //     sayi/=2;
 // }

 //return true;

    }//main sonu
}// class sonu

