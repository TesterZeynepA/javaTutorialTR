package ch20_Constructor;

public class C02_Arac {

    //fields

    String marka;
    String model;
    int km;
    double motorHacmi;
    boolean vitesAuto;
    boolean ikinciEl;
    int yil;
    String tramer;

    public static void main(String[] args) {

        C02_Arac arac1 = new C02_Arac(); // pm siz constructor kullanilarak arac1 objesi create edildi

        arac1.ikinciEl = true;
        arac1.marka = "mercedes";
        arac1.km = 50000;
        arac1.model = "CLA";
        arac1.motorHacmi = 2.0;
        arac1.tramer = "5 kaza var";
        arac1.yil = 2022;

        System.out.println("arac1 = " + arac1);//arac1 = ch20_Constructor.C02_Arac@26ba2a48

        System.out.println(arac1.marka + " " + arac1.model + " " +

                arac1.motorHacmi + " " + arac1.yil + " " + arac1.tramer + " " +
                arac1.vitesAuto + " " + arac1.km + " " + arac1.ikinciEl);

        //task -> 2. bir aracın tum field larını atayarak print ediniz..

        C02_Arac arac2 = new C02_Arac();

        arac2.ikinciEl = false;
        arac2.marka = "volvo";
        arac2.km = 0;
        arac2.model = "x";
        arac2.motorHacmi = 4.0;
        arac2.tramer = "kazasız";
        arac2.yil = 2023;


    }

    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacmi=" + motorHacmi +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                ", tramer='" + tramer + '\'' +
                '}';
    }

}
