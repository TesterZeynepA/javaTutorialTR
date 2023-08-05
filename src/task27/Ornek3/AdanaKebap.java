package task27.Ornek3;

class AdanaKebab implements Food {
    @Override
    public void taste() {
        System.out.println("Adana Kebabı burada yenir! Mükemmel bir seçim...");
    }

    @Override
    public double doubleUcret(double ucret) {
        return ucret * 2;
    }

    // AdanaKebab sınıfına özel marinade() ve grill() metotlarını ekliyoruz.
    public void marinade() {
        System.out.println("Kebabımızı özel yapan özellik etin marine edilmesi...");
    }

    public void grill() {
        System.out.println("Şimdi marine edilen etin ızgara ile buluşma anı...");
    }
}
