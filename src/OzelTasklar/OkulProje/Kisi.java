package OzelTasklar.OkulProje;
//
public class Kisi {


    private String adSoyad;
    private String kimlikNo;
    private int yas;



    public Kisi() {

    }

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }


    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {

        this.adSoyad = adSoyad.toUpperCase();
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
        return "adSoyad='" + adSoyad + '\'' +
                ",\t kimlikNo='" + kimlikNo + '\'' +
                ",\t yas= " + yas;
    }
}
