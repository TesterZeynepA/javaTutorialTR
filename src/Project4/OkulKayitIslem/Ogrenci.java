package Project4.OkulKayitIslem;

public class Ogrenci extends Kisiler{
    private String sinif;
    private String numara;

    public Ogrenci(String ad_soyad, String kimlikNo, int yas, String sinif, String numara) {
        super(ad_soyad, kimlikNo, yas);
        this.sinif = sinif;
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +super.toString()+
                "sinif='" + sinif + '\'' +
                ", numara='" + numara + '\'' +
                "} " ;
    }
}
