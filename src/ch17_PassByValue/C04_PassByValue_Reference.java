package ch17_PassByValue;

public class C04_PassByValue_Reference {

    static double etiketFiyat ; //güneş, ay, yıldız

    static double indirimOrani ;//güneş, ay, yıldız


    public static void main(String[] args) {

        /*
        eğer bir method da yapılan değişiklik kalıcı olsun istenirse
        1. değişiklik yapılan variable'lar static olarak tanımlanır.
         */

        etiketFiyat = 100;

        System.out.println("method call öncesi etiket Fiyati = " + etiketFiyat);




    }
}
