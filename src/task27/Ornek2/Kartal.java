package task27.Ornek2;

import java.time.LocalDate;

public class Kartal extends Hayvan {


    public Kartal(int id, String isim, LocalDate dogumGunu) {
        super();
        setId(id);
        setIsim(isim);
        setDogumGunu(dogumGunu);

    }

    @Override
    public String yiyecek() {
        return "Balık seversin";
    }

    @Override
    public int yemekMiktarı() {
        return 300;
    }

    @Override
    public int gunlukUykuSuresi() {
        return 4;
    }

    @Override
    public String sesi() {
        return "Kartalın sesi nev-i şahsına münhasırdır :)";
    }
}
