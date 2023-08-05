package task27.Ornek3;

interface Food {
    void taste();
    double doubleUcret(double ucret);
}

class FoodClass implements Food {
    @Override
    public void taste() {
        System.out.println("Lezzetin yeni adresine Hoşgeldiniz!");
    }

    @Override
    public double doubleUcret(double ucret) {
        return ucret * 2;
    }
}