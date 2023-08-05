package task27.Ornek3;


class Lahmacun implements Food {

    @Override
    public void taste() {
        System.out.println("Lahmacun bir tane ile doyulmayacak kadar lezzetli...");
    }

    @Override
    public double doubleUcret(double ucret) {
        return ucret * 2;
    }

    public void dough() {
        System.out.println("Lahmacunun ince ve çıtır çıtır olması için hamur hazırlanıyor...");
    }

    public void topping() {
        System.out.println("Lahmacunun üzerindeki özel harcı mükemmel...");
    }

    public void bake() {
        System.out.println("Ve artık lahmacun fırına giriyor");
    }
}