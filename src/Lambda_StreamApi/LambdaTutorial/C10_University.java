package Lambda_StreamApi.LambdaTutorial;

public class C10_University {//pojo class

   private String university;
    private String bolum;
    private int ogrncSayisi;
   private int notOrt;

    public C10_University(String university, String bolum, int ogrncSayisi, int notOrt) {
        this.university = university;
        this.bolum = bolum;
        this.ogrncSayisi = ogrncSayisi;
        this.notOrt = notOrt;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrncSayisi() {
        return ogrncSayisi;
    }

    public void setOgrncSayisi(int ogrncSayisi) {
        this.ogrncSayisi = ogrncSayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "university='" + university + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrncSayisi=" + ogrncSayisi +
                ", notOrt=" + notOrt;
    }
}
