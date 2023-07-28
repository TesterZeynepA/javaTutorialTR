package task26.task07;


import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();

        for (int i = 1; i <=2; i++) {
            System.out.println(i+" . kullanıcının bilgilerini giriniz"+ " Kullanıcı adı : ");
            String username = input.nextLine();

            String password;

            do {
                System.out.println("Şifre: ");
                password =input.nextLine();
                if (password.length()<6){
                    System.out.println("şifre en az 6 karakter olmalıdır. Tekrar deneyiniz");
                }
            }while (password.length()<6);

            userList.add(new User(username, password));
        }

        System.out.println("Kaydedilen kullanıcıların listesi: ");
        for (User kullanici: userList){

            System.out.println(kullanici);
        }
    }
}
