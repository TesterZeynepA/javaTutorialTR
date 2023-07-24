package Project4.OkulKayitIslem;

public class Kisiler {

    private String ad_soyad;
    private String kimlikNo;
    private int yas;

    public Kisiler(String ad_soyad, String kimlikNo, int yas) {
        this.ad_soyad = ad_soyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getAd_soyad() {
        return ad_soyad;
    }

    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisiler{" +
                "ad_soyad='" + ad_soyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}

