package tasks05;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */

    int sayi1 = 19;
    int sayi2 = 18;
    int sayi3 = 12;
    if (sayi1 < sayi2 && sayi1 < sayi3) {

        System.out.println("sayi1 = " + sayi1);
    }else if (sayi2 < sayi1 && sayi2 < sayi3) {

        System.out.println("sayi2 = " + sayi2);
    }else if (sayi3 < sayi1 && sayi3 < sayi2) {

        System.out.println("sayi3 = " + sayi3);
    }




    }
}
