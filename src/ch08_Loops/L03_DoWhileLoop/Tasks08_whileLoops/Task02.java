package ch08_Loops.L03_DoWhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner input = new Scanner(System.in);
        System.out.println("iki tamsayı giriniz");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("***** for döngüsü ile ******");

        for (int i = Math.min(num1,num2); i <Math.max(num1,num2) ; i++) {

            System.out.println(i);

        }


        System.out.println("****** While döngüsü ile *****");

        int i = Math.min(num1, num2);
        while (i < Math.max(num1, num2)) {
            System.out.println(i);
            i++;


        }
    }
}
