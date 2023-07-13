package ch20_Constructor;

public class C07_Ogretmen {

    //fields

    String isim;
    int tecrube;
    int kidem;

    public C07_Ogretmen(String isim, int tecrube) {//2 pm li constr
        this.isim = isim;
        this.tecrube = tecrube;
    }

    public void kidemHesapla (int kidem) {//int pm alan method
        System.out.println("kidem = " + (kidem*2));//methoda gelen int degeri alır 2 ile çarpar
        System.out.println("this.kidem = " + this.kidem);//int variable a islem yapildi
        //bu class daki kidem variable in default degeri ile işlem yapar.

    }
}
