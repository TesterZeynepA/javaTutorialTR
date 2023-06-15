package ch10_MethodCreation;

import java.util.Scanner;

public class C07_Palindrome {
    public static void main(String[] args) {

        /*
girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
plindrome:her iki yönde okundugunda eşit olan ifadeler
madam , ada ,iki asa, 121
 */

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String ifade =input.nextLine();

        palindrome (ifade);


    }

    private static void palindrome(String i) {
        String ters = "";// boş konteyner oluşturuldu
        for (int j = i.length()-1; j >=0 ; j--) {// kelime tersten alındı

        ters +=i.charAt(j);// tersten her bir karakter atandı

        }

        System.out.println("girdiğin kelimenin tersi = " + ters);

        if (ters.equalsIgnoreCase(i)) {

            System.out.println("bu kelime palindrome dur");


        }else System.out.println("bu kelime palindrome DEGİLDİR");

    }
}
