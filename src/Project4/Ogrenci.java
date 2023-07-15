package Project4;

public class Ogrenci extends Kisi {//Kisi parnet Class'a extend child pojo Class
    //fields..
   private String  numara;
   private String  sinif;

   // constructor..
    public Ogrenci() {//p'siz cons.
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sinif) {//full p'li cons.
        super(adSoyad, kimlikNo, yas);//super parent  full p'li cons call
        this.numara = numara;
        this.sinif = sinif;
    }

    //getter setter..

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
    //toString...

    @Override
    public String toString() {
        return  super.toString() +
                " numara='" + numara + '\'' +
                ", sinif='" + sinif + '\'';
    }
}
