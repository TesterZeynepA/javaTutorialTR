package Challange07;

import java.util.Scanner;

public class Task04 {


    /* task->
    Girilen bir tamsayı için
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini print eden method'lar create ediniz.
    */ public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Agam bi sayi giresen : ");
        int sayi = input.nextInt();
        pzitifNegatifControlEt(sayi); //10 satır action

        System.out.println(Task02.tekCiftControtEt2(sayi));// 11. satır action
        // ucBasamakRakamTopla(sayi);// 12. satır action
        // yuzdenKckBirlerBasamak(sayi);// 13. satır action
        System.out.println( sayi>99 ? ucBasamakRakamTopla(sayi)/* 12. satır action*/:yuzdenKckBirlerBasamak(sayi)/* 13. satır action*/);



    }//main sonu

    private static int yuzdenKckBirlerBasamak(int sayi) {

        return sayi%10;
    }

    private static int ucBasamakRakamTopla(int sayi) {
        int toplam = 0;
        while (sayi > 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }
        return toplam;
        //  return (sayi%10)+((sayi/10)%10)+(sayi/100) ;
    }

    private static void pzitifNegatifControlEt(int sayi) {

        System.out.println((sayi>0&&sayi!=0) ?"girilen sayi POZİTİFTİR":"girilen sayi NEGATİFTİR");
    }


}//Class sonu