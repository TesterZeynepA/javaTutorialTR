package ch26_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

  /*
Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Password");
        String password= input.nextLine();
        try {
            if (password.length() < 6 || password.length()>10 ) {
                throw new StringIndexOutOfBoundsException("password 6 karekterden az 10dan fazla olamaz") ;
            }else {
                System.out.println("password doğru devam edebilirsiniz");
            }
        }catch (StringIndexOutOfBoundsException ex) {
            System.out.println("ex = " + ex);
            System.out.println("catch block calisti");
        }

        System.out.println("sistem calisiyor");

        //try catch kullanmaktaki maksat exception ı kontrollü fırlatıp, akışı devam ettirmek zeynep hanımdan
        //Kodun akışında başka şeyler de var. O hatadan bağımsız kod çalışsın istiyoruz iclal hanımdan




    }




}