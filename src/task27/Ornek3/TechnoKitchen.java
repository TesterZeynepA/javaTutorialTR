package task27.Ornek3;

import java.util.ArrayList;
import java.util.List;

public class TechnoKitchen {

    private List<Food> siparisler;

    public TechnoKitchen() {
        siparisler = new ArrayList<>();
    }

    public void siparisEkle(Food yemek) {
        siparisler.add(yemek);
    }

    public void hazirlananSiparisler() {
        for (Food yemek : siparisler) {
            if (yemek instanceof AdanaKebab) {
                AdanaKebab adanaKebab = (AdanaKebab) yemek;
                adanaKebab.marinade();
                adanaKebab.grill();
            } else if (yemek instanceof Lahmacun) {
                Lahmacun lahmacun = (Lahmacun) yemek;
                lahmacun.dough();
                lahmacun.topping();
                lahmacun.bake();
            } else if (yemek instanceof Borsh) {
                Borsh borsh = (Borsh) yemek;
                borsh.boil();
            } else if (yemek instanceof Palov) {
                Palov palov = (Palov) yemek;
                palov.fry();
                palov.boil();
            }
        }
    }

    public void toplamUcret() {
        double toplamUcret = 0.0;
        for (Food yemek : siparisler) {
            System.out.println("Yemek: " + yemek.getClass().getSimpleName());

            if (yemek instanceof AdanaKebab) {
                        toplamUcret += 160;
                    } else if (yemek instanceof Lahmacun) {
                        toplamUcret += 50;
                    } else if (yemek instanceof Borsh) {
                        toplamUcret += 70;
                    } else if (yemek instanceof Palov) {
                        toplamUcret += 80;
                    }
                }
                System.out.println("Toplam Tutar: " + toplamUcret);
            }

    public static void main(String[] args) {
        TechnoKitchen mutfak = new TechnoKitchen();
        mutfak.siparisEkle(new AdanaKebab());
        mutfak.siparisEkle(new Lahmacun());
        mutfak.siparisEkle(new Borsh());
        mutfak.siparisEkle(new Palov());

        mutfak.hazirlananSiparisler();
        mutfak.toplamUcret();
    }
}