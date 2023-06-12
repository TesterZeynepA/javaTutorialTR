package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {

        // task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...

        System.out.println("***** for ile cozum ******");

        for (int i = 11; i <20 ; i++) {

            System.out.print(i+" ");

        }
        System.out.println();

        System.out.println("***** while loop ile cozum *****");
        int sayi = 11; // başlangıç değeri create edildi.

        while (sayi <20){ // şartımız 20 olana kadar çalışması kontrol edildi (20 dahil değil)

            System.out.print(sayi+ " ");
        sayi++; // sonsuz loop olmaması için sayi birer artırıldı.

        }


        //task02-> 7 kere javaCAN print eden code create ediniz...



      int i =1;

        while (i<8){

            System.out.println("javaCAN");

            i++;
        }

// 2 basamaklı tek sayıları yanyana print eden code create ediniz

        int k= 11;

        while (k<100){

            System.out.print(k+ " ");

            k+= 2;
        }

        System.out.println();

// task04-> girilen metni while loop ile  tersden print eden code create ediniz


        Scanner input = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str = input.next();
        int uzunluk = str.length()-1;
        while (uzunluk >=0){

            System.out.print(str.charAt(uzunluk));
            uzunluk--;

        }
        System.out.println();

        for (int j = str.length()-1; j>=0 ; j--) {

            System.out.print(str.charAt(j));

        }

// task 05 --> girilen tamsayıya kadar tamsayıların toplamını print eden code creat ediniz...

        System.out.println();
        System.out.println("bir tam sayı giriniz");

        int num = input.nextInt();
        int total = 0;
        while (num >0) {
            total += num;
            num --;

        }
        System.out.println("total = " + total);

        System.out.println();

        //task06 --> girilen tamsayının faktoriyelini print eden code creat ediniz...

        int number = input.nextInt();
        int factoriyal =0;
        while (number > 0) {
            factoriyal *= number;
            number --;

        }
        System.out.println(factoriyal);









    }
}
