package task24.task01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

/* TODO
    Burada iki class vardır. Biri Main diğeri ise Subscribe.
    Subscribe class'ının içinde;
    Bu variables'ları private oluşturunuz.
    String name
    boolean doYouWanaSubscribe
    String whichMember
    3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)

todo    Main class'ın içinde;
    Örnek;
    Name is Victoria, doYouWanaSubscribe true, whichMember Gold
    Eğer user(kullanıcı) Gold member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos ,
    all homework and see you soon. yazdırınız.

    Eğer user(kullanıcı) Silver member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.

    Eğer user(kullanıcı) Bronze member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.

    Eğer user(kullanıcı) member(üye) olmak istemiyorsa;
    See you when you want to be a member. Thanks yazdırınız.
         */
}
class Runner {
    public static void main(String[] args) {

        Subscribe subscribe = new Subscribe();

        Scanner input = new Scanner(System.in);
        System.out.println("Do You Wana Subscribe?(Yes or No)");

        String secim = input.next().toLowerCase();

        if (secim.equals("yes")) {
            subscribe.setDoYouWanaSubscribe(true);

            System.out.println("İsminizi giriniz: ");
            input.nextLine();//dummy
            subscribe.setName(input.nextLine());

            System.out.println("1- Gold\t 2- Silver\t 3-Bronze");
            int membershipTercih=input.nextInt();

            if (membershipTercih==1) {
                subscribe.setWhichMember("Gold");
            } else if (membershipTercih==2) {
                subscribe.setWhichMember("Silver");
            } else if (membershipTercih==3) {
                subscribe.setWhichMember("Bronze");
            }else
                System.out.println("Hatalı giriş");

            if (subscribe.isDoYouWanaSubscribe()) {

                switch (subscribe.getWhichMember()) {

                    case "Gold":
                        System.out.println("Welcome to membership " + subscribe.getName() + ".Your membership is 40 dollar for month you can enjoy the videos ,\n" +
                                "    all homework and see you soon.");
                        break;
                    case "Silver":
                        System.out.println("Welcome to membership " + subscribe.getName() + ".Your membership is 20 dollar for month you can enjoy the videos and all homework.");
                        break;
                    case "Bronze":
                        System.out.println("Welcome to membership " + subscribe.getName() + ".Your membership is 10 dollar for month you can enjoy the videos.");
                        break;
                }

            }

        }else
            System.out.println("See you when you want to be a member");
    }
}

class Subscribe {
    private String name;
    private boolean doYouWanaSubscribe;
    private String whichMember;

    @Override
    public String toString() {
        return "Subscribe{" +
                "name='" + name + '\'' +
                ", doYouWanaSubscribe=" + doYouWanaSubscribe +
                ", whichMember='" + whichMember + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWanaSubscribe() {
        return doYouWanaSubscribe;
    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(String whichMember) {
        this.whichMember = whichMember;
    }
}