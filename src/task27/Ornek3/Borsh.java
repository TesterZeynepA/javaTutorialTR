package task27.Ornek3;


class Borsh implements Food {


    @Override
    public void taste() {
        System.out.println("Borsh tadı mükemmel!");
    }

    @Override
    public double doubleUcret(double ucret) {
        return ucret * 2;
    }


    public void boil() {
        System.out.println("İçindekilerle birlikte kaynatılıyor...");
    }
}
