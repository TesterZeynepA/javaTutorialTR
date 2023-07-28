package task27.Ornek2;

import java.time.LocalDate;

public class Kedi extends Hayvan {


    public Kedi(int id, String isim, LocalDate dogumGunu) {
        setId(id);
        setIsim(isim);
        setDogumGunu(dogumGunu);
    }

    @Override
    public String yiyecek() {
        return "Kediler yaş mama sever";
    }

    @Override
    public int yemekMiktarı() {
        return 100;
    }

    @Override
    public int gunlukUykuSuresi() {
        return 12;
    }

    @Override
    public String sesi() {
        return "Miyavvvv demeyen kedi mi olurmuş :)";
    }
}
