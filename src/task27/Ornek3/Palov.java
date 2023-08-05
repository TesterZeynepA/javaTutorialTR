package task27.Ornek3;


class Palov implements Food {

    @Override
    public void taste() {
        System.out.println("En güzel palov için doğru adrestesiniz...");
    }

    @Override
    public double doubleUcret(double ucret) {
        return ucret * 2;
    }

    public void fry() {
        System.out.println("İç malzememiz kızarmaya bırakıldı...");
    }

    public void boil() {
        System.out.println("Palovumuz kısık ateşte kaynıyor...");
    }
}