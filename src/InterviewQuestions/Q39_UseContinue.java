package InterviewQuestions;

import java.util.Scanner;

public class Q39_UseContinue {

        /* Task->
         Girilen bir stringin harflerini bosluk veya a harfi teker teker  alt alta print eden code create ediniz.
         */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str = input.nextLine();


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ' || str.charAt(i) == 'a'){// metin karakterlerinin boşluk veya a olma şartı
                continue;//if true ise bu döngü atlanacak diğer döngüden devam edecek.

            }else
                System.out.println("str.charAt(i) = " + str.charAt(i));
        }
    }

}
