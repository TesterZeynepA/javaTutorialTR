package InterviewQuestions;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
        //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.

    public static void main(String[] args) {
        String pin = "fethiye1234";
        int count=2;

        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String sifre = input.nextLine();

        while (count>0){
            if (sifre.equals(pin)){

                System.out.println("şifreniz doğru. Giriş yaptınız");
                break;
            }else {
                System.out.println("şifre eşleşmedi tekrar deneyin");
                sifre = input.nextLine();
                count--;
                if (count==0){
                    System.out.println("şifre giriş hakkınız bitti.");
                    break;
                }
            }

        }



    }

}
