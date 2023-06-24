package Challange08;


import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
        /* task->
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String [] str = {"HeySiri"};

// 1. yol-> cincix code

        System.out.println("cincix code");
        System.out.println("HeySiri");// "HeySiri"
        System.out.println("HeySiri".replace("Hey", "Bye"));// "ByeSiri"

        // 2. yol -> amele code

        System.out.println("amele code");
        String arr[]="HeySiri".split("y");//[He,Siri]
        arr[0] ="Bye"; // He->Bye
        System.out.println(arr[0] + arr[1]);//ByeSiri
    }
}
