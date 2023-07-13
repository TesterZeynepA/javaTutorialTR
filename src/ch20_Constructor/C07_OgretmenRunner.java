package ch20_Constructor;

public class C07_OgretmenRunner {
    public static void main(String[] args) {

        C07_Ogretmen ogretmen = new C07_Ogretmen("Iclal hanim", 25);

        System.out.println("ogretmen.isim = " + ogretmen.isim);//ogretmen.isim = Iclal hanim

        System.out.println("ogretmen.tecrube = " + ogretmen.tecrube);//ogretmen.tecrube = 25

        System.out.println("ogretmen.kidem = " + ogretmen.kidem);

        ogretmen.kidemHesapla(12);
    }
}
