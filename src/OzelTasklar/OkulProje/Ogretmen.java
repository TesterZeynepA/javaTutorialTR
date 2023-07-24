package OzelTasklar.OkulProje;

public class Ogretmen extends Kisi {

    private String bolum;
    private String sicilNo;

    public Ogretmen() {
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        setBolum(bolum);
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {

        this.bolum = bolum.toUpperCase();
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return super.toString()+
                " ,\t bolum='" + bolum + '\'' +
                ",\t sicilNo='" + sicilNo + '\'' ;
    }
}
