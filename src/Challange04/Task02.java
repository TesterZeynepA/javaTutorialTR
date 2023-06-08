package Challange04;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {


        //Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner input =new Scanner(System.in);
        System.out.println("iki ayrı kelime giriniz");
        String word1 = input.nextLine();
        String word2 = input.nextLine();

        String result = word1.concat(word2);
        System.out.println("result = " + result);

        String result2= word2.concat(word1);
        System.out.println("result2 = " + result2);


        String result3= word1.substring(1).concat(word2.substring(1));
        System.out.println("result3 = " + result3);


    }
}
