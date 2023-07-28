package task27.Ornek2;

import java.time.LocalDate;

public class HayvanatBahcesi {

    public static void main(String[] args) {

        Kedi kedi = new Kedi(1, "Minnoş", LocalDate.of(2020, 9, 22));

        System.out.println("İsim: " + kedi.getIsim());
        System.out.println("Doğum Tarihi: " + kedi.getDogumGunu());
        System.out.println("Vahşi: " + kedi.isVahsi());
        System.out.println("Yiyeceği: " + kedi.yiyecek());
        System.out.println("Günlük Yemek Miktarı: " + kedi.yemekMiktarı() + " gram");
        System.out.println("Günlük Uyku Süresi: " + kedi.gunlukUykuSuresi() + " saat");
        System.out.println("Sesi: " + kedi.sesi());

        System.out.println();

        Kartal kartal = new Kartal(2, "Fırtına", LocalDate.of(2016, 1, 17));

        System.out.println("İsim: " + kartal.getIsim());
        System.out.println("Doğum Tarihi: " + kartal.getDogumGunu());
        System.out.println("Vahşi: " + kartal.isVahsi());
        System.out.println("Yiyeceği: " + kartal.yiyecek());
        System.out.println("Günlük Yemek Miktarı: " + kartal.yemekMiktarı() + " gram");
        System.out.println("Günlük Uyku Süresi: " + kartal.gunlukUykuSuresi() + " saat");
        System.out.println("Sesi: " + kartal.sesi());
    }
}