package ch04_JavaOperators.jo01_ArithmeticOperators;

import java.util.Scanner;

public class C03_RakamlarToplamiTask {
    public static void main(String[] args) {
        // kullanıcıdan alınan 3 basamaklı bir sayının rakamları toplamını print eden code create ediniz
        //input 111
        //output 3
        //1. adım Scanner obje create edilir
        //2. adım sout komut ile veri istenir
        //3. adım int degere atama yapılır input objesinden netxtInt() methodu ile
        //4. adım % ve 10'a bolme uygulanır.

        Scanner input = new Scanner(System.in);
        System.out.println("3 basamakli sayi gir");

        int sayi = input.nextInt();//user in girdigi deger atandi

        int birlerBasamagi = sayi % 10 ;//sayinin 10 a bolumunden kalan birler basamagi atandi

        sayi /= 10; //sayinin birler basamagi atildi

        int onlarBasamagi = sayi % 10 ; //iki basamaga dusen sayinin birler basamagi alindi. (ilk sayinin onlar basamagi)

        int yuzlerBasamagi = sayi / 10 ; //sayinin yuzler basamagi alinmis oldu


        int toplam = birlerBasamagi + onlarBasamagi +yuzlerBasamagi;

        System.out.println("toplam = " + toplam);//toplam = 6
    }
}
