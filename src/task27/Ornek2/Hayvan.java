package task27.Ornek2;


import java.time.LocalDate;

public abstract class Hayvan {

    private int id;
    private String isim;
    private boolean vahsi;
    private LocalDate dogumGunu;


    public Hayvan() {

    }

    public abstract String yiyecek();

    public abstract int yemekMiktarı();

    public abstract int gunlukUykuSuresi();

    public abstract String sesi();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public LocalDate getDogumGunu() {
        return dogumGunu;
    }

    public void setDogumGunu(LocalDate dogumGunu) {
        this.dogumGunu = dogumGunu;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumGunu=" + dogumGunu +
                '}';
    }
}
