package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_FibonacciListNumber {

    /* Task-!
     Girilen bir tamsayıya kadar FIBONACCI dizisini print eden code create ediniz.
     0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi = input.nextInt();

     //   ArrayList<Integer> list = new ArrayList<>();
     //   int adet = input.nextInt();
     //   if (adet<=0) {
     //       System.out.println("yanlış bir sayı girdiniz...");
     //   }else if (adet==1){
     //       list.add(0);
     //   }else if (adet==2){
     //       list.add(0);
     //       list.add(1);
     //       System.out.println("list = " + list);
//
     //   }else {
     //       int sayı1 =0;
     //       int sayı2 =1;
     //       int sayı3 =0;
     //       list.add(0);
     //       list.add(1);
     //       for (int i = 3; i <=adet ; i++) {
     //           sayı3=sayı1+sayı2;
//
     //           list.add(sayı3);
     //           sayı1 =sayı2;
     //           sayı2= sayı3;
//
     //       }
     //   }
//
     //   System.out.println("list = " + list);
//

        for (int i = 0; fibonacci(i)<=sayi; i++) {

            System.out.print( fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

}