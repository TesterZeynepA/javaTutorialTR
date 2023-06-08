package tasks06;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

   "Nereye yolculuk etmek istiyorsunuz?
   (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)
      yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz,
         bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.

        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.

         */

        Scanner input = new Scanner(System.in);

        int odeme, yolcuSayisi, toplamTutar=0, frankfurtKm = 60, kolnKm = 80, kmBirimFiyat = 5;
        double paraUstu = 0;
        System.out.println("\"Nereye yolculuk etmek istiyorsunuz?\n" +
                "Frankfurt : 60 km"+"\nKöln : 80 km"+"\nÜcret : 20 km başına 5 euro bilet parası alınmaktadir.");
        String sehir = input.nextLine().toUpperCase();
        System.out.print("Kaç kişilik bilet istiyorsunuz?"+"\nMax 2 kişilik bilet alabilirsiniz");
        yolcuSayisi=input.nextInt();
        System.out.print("Ödenen miktar:");
        odeme=input.nextInt();

        if(yolcuSayisi==1 || yolcuSayisi==2){
            switch (sehir) {
                case "FRANKFURT":
                    System.out.println("Gidilecek yer = " + sehir);
                    System.out.println("Frankfurt 15 Euro");
                    toplamTutar=(frankfurtKm/20)*kmBirimFiyat;
                    break;
                case "KOLN":
                    System.out.println("Gidilecek yer = " + sehir);
                    System.out.println("Köln 20 Euro");
                    toplamTutar=(kolnKm/20)*kmBirimFiyat;
                    break;
            }
            switch (yolcuSayisi) {
                case 1:
                    System.out.println(sehir+ "- 1 kişilik ");
                    break;
                case 2:
                    System.out.println(sehir+ "- 2 kişilik ");
                    toplamTutar*=2;
                    break;
            }
            paraUstu=odeme-toplamTutar;
            System.out.println("Ödenen = " + odeme+ " Euro");
            System.out.println("toplamTutar = " + toplamTutar+ " Euro");
            System.out.println("paraUstu = " + paraUstu+ " Euro");


        }else
            System.out.println("Biletler yalnızca 1 ve 2 kişiliktir!");


    }
}
