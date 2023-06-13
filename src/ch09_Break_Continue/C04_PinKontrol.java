package ch09_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {
        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.

        Scanner input = new Scanner(System.in);


        String sifre = "12345.abs";

        int girisHakkı =3;

        while (true){

            System.out.println("pin kod gir");
            String password = input.next();

            if (sifre.equals(password)) {
                System.out.println("sifre eslesti");
                break;
            }else {

                System.out.println("şifre yanlış tekrar dene");
                girisHakkı--;
                System.out.println("kalan deneme hakkın " + girisHakkı);

                if (girisHakkı ==0){

                    System.out.println("bloke oldun");
                    break;

                }


            }

        }

    }
}
