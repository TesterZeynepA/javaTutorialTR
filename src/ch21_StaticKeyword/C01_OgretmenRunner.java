package ch21_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {

        C01_Ogretmen.okul = "tayyar mehmet paşa okulu";

        C01_Ogretmen ogretmen = new C01_Ogretmen("Mustafa Bey", 35);

        System.out.println("ogretmen = " + ogretmen);

        System.out.println("ogretmen.isim = " + ogretmen.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen.tecrube);
        System.out.println("ogretmen.okul = " + ogretmen.okul);

        //okul static olduğu için obje den call edilmemeli

        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);

        C01_Ogretmen ogretmen2 = new C01_Ogretmen("Zeynep hanim", 35);

        C01_Ogretmen.okul = "yildiz teknik okulu";

        System.out.println("ogretmen = " + ogretmen2);

        System.out.println("ogretmen.isim = " + ogretmen2.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen2.tecrube);
        System.out.println("ogretmen.okul = " + ogretmen2.okul);

        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);

        //static methoda class name ile call edildi

        C01_Ogretmen.maasHesapla();
        //non static method ile call edildi
        ogretmen2.evlilikYilDonumu();


    }
}
