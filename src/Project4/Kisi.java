package Project4;

public class Kisi {//parent pojo class
    //fields...
  private String   adSoyad;
  private String   kimlikNo;
  private  int yas;
  //constructor
    public Kisi() {//p'siz cons.
    }

    public Kisi(String adSoyad, String kimlikNo, int yas) {//full p'licons.
        this.adSoyad = adSoyad.toUpperCase();
        this.kimlikNo = kimlikNo;
        this.yas = Math.abs(yas);
    }
    //getters and setters

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
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
  //toString
    @Override
    public String toString() {
        return
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas ;
    }
}





