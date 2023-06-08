package ch06_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchStatement {
    public static void main(String[] args) {

/*
   Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
   Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
   programi izlemek zorlasacaktir.
    Programimizin bir degerini bir çok degerle
   karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
   ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
   Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
   Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
   çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
   Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
         Switch de sadece int, byte, short, char, String data tipleri kullanilabilir
       Eger 3 den fazla durum varsa switch() tercih edilir.
*/
        // TASK -> kullanıcının girdiği rakamı yazı ile print eden code create ediniz.
        //input 1
        //output bir
        Scanner input = new Scanner (System.in);
        System.out.print("Bir rakam giriniz: ");
        int rakam = input.nextInt();

        switch (rakam) {
            case 0:
                System.out.println("sifir");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Lütfen gecerli bir rakam giriniz");
                break;
        }





    }
}
