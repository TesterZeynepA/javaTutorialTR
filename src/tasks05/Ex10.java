package tasks05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Taş, kağıt, makas ifadelerinden birini giriniz");
        String x = input.nextLine().toLowerCase();
        System.out.println("Taş, kağıt, makas ifadelerinden birini giriniz");
        String y = input.nextLine().toLowerCase();

        if (x.equals(y)) {
            System.out.println("berabere");
        } else if (x.equals("taş") && y.equals("kağıt")) {

            System.out.println("kazanan:y");

        }else if (x.equals("kağıt") && y.equals("taş")) {

            System.out.println("kazanan:x");

        } else if (x.equals("makas") && y.equals("kağıt")){

            System.out.println("kazanan:x");

        }else if (y.equals("makas") && x.equals("kağıt")) {

            System.out.println("kazanan:y");

        }else if (y.equals("makas") && x.equals("taş")) {

            System.out.println("kazanan:x");

        }else
            System.out.println("sizden istenen ifadelerden birini giriniz");
    }


    }
