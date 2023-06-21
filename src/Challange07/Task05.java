package Challange07;

import java.util.Scanner;

public class Task05 {
        static Scanner sc = new Scanner(System.in);
        // task->
        //Kullaniciya kac sayi toplamak istedigini sorun.
        //Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
        //Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
        //2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Agam kaç sayi gireceksin : ");
            int sayiAdedi = input.nextInt();
            if (sayiAdedi < 2) {
                System.out.println("En az 2 sayi girmelisiniz");
            } else if (sayiAdedi == 2) {
                System.out.print("agam 1. sayi giresen");
                int sayi1 = input.nextInt();
                System.out.print("agam 2. sayi giresen");
                int sayi2 = input.nextInt();

                System.out.println(sayiTopla(sayi1, sayi2));

            } else if (sayiAdedi == 3) {
                System.out.print("agam 1. sayi giresen");
                int sayi1 = input.nextInt();
                System.out.print("agam 2. sayi giresen");
                int sayi2 = input.nextInt();
                System.out.print("agam 3. sayi giresen");
                int sayi3 = input.nextInt();

                System.out.println(sayiTopla(sayi1, sayi2, sayi3));


            } else if (sayiAdedi == 4) {
                System.out.print("agam 1. sayi giresen");
                int sayi1 = input.nextInt();
                System.out.print("agam 2. sayi giresen");
                int sayi2 = input.nextInt();
                System.out.print("agam 3. sayi giresen");
                int sayi3 = input.nextInt();
                System.out.print("agam 4. sayi giresen");
                int sayi4 = input.nextInt();
                System.out.println(sayiTopla(sayi1, sayi2, sayi3, sayi4));
            } else System.out.println("cok sayi girdiniz, ben toplayamam");

        }// main sonu

        private static int sayiTopla(int sayi1, int sayi2) {// 2 sayi toplayıp return meth
            return (sayi1 + sayi2);
        }
        private static int sayiTopla(int sayi1, int sayi2,int sayi3) {// 3 sayi toplayıp return meth
            return (sayi1 + sayi2+sayi3);
        }
        private static int sayiTopla(int sayi1, int sayi2 ,int sayi3,int sayi4) {// 4 sayi toplayıp return meth
            return (sayi1 + sayi2+sayi3+sayi4);
        }

    }// Class sonu
