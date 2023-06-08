package Challange03;

import java.util.Scanner;

public class Task03_NestedTernary {
    public static void main(String[] args) {

/*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("harf notunuzu giriniz");
        char harfNot = input.next().charAt(0);

        String result = harfNot == 'A'  ?  "Gayet Basarili": harfNot == 'B' ? "Basarili" : harfNot== 'C' ? "Ha gayret" :"Digerleri";
        System.out.println("result = " + result);


    }
}
