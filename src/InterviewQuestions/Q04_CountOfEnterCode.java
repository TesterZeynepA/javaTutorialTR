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
        boolean flag= true;

        while (flag){

            if (sifre.equals(pin)){

                System.out.println("şifreniz doğru. Giriş yaptınız");
                flag =false;
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


        //2. yol

        while (true){






        }



    }

}
