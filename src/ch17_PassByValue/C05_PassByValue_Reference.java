package ch17_PassByValue;

public class C05_PassByValue_Reference {

    public static void main(String[] args) {


        /*
        eger bir method da yapılan değişiklik kalıcı olsun istenirse
        2. değişiklik yapılan variable'lar atama tanımlanır
         */

        double etiketFiyat = 100;
        double indirimOrani = 0.1;

        System.out.println("indirim öncesi etiket Fiyati = " + etiketFiyat);//indirim öncesi etiket Fiyati = 100.0

        etiketFiyat = indirim(etiketFiyat, indirimOrani);

        System.out.println("indirim sonrası etiket Fiyati = " + etiketFiyat);//indirim sonrası etiket Fiyati = 90.0


    }

    private static double indirim(double etiketFiyat, double indirimOrani) {

        etiketFiyat*= (1-indirimOrani);

        System.out.println("method içinden Fiyat = " + etiketFiyat);//method içinden Fiyat = 90.0

        return etiketFiyat;
    }
}
