package task08_whileLoop;

import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Scanner input=new Scanner(System.in);
        System.out.print("1- 100 arasında bir sayı tahmin ediniz:  ");

        int rastgele= (int) (Math.random()*100+1);// 0 <= olasılık <= 1(double deger aldığı için type casting yapıldı)

        // 1'den 100'e kadar random sayı böyle üretilir.

        System.out.println(rastgele);

        int sayac=0;
        int tahmin =0;

        while(rastgele!=tahmin){
            //System.out.println(rastgele<tahmin?"Daha küçük bir sayı giriniz":"Daha büyük bir sayı giriniz");
            tahmin=input.nextInt();
            sayac++;

            if (rastgele<tahmin) {
                System.out.println("Daha küçük bir sayı giriniz");
            }else
                System.out.println("Daha büyük bir sayı giriniz");


        }
        System.out.println("Tebrikler " + sayac+" tahminde sayıyı buldunuz");

    }
}