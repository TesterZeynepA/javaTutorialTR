package Project4;

public class Ogretmen extends Kisi {//Kisi parent Class'a extend child pojo Class

    // fields...
    private String sicilNo;
    private String bolum;

    //construct
    public Ogretmen() {
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicilNo, String bolum) {//full p'li cons
        super(adSoyad, kimlikNo, yas);//super parent  full p'li cons call
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }

    //getters and setters

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    //toString


    @Override
    public String toString() {
        return super.toString() +//parent Class obj variable call edildi
                " sicilNo='" + sicilNo + '\'' +
                ", bolum='" + bolum + '\'';
    }


    // @Override
    // public String toString() {
    //     return "Ogretmen{" +
    //             "sicilNo='" + sicilNo + '\'' +
    //             ", bolum='" + bolum + '\'' +
    //             "} " + super.toString();
    // }
}


































