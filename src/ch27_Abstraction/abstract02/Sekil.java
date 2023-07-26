package ch27_Abstraction.abstract02;

public abstract class Sekil {

   private String name;

    public Sekil() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alanHesapla();//abstract method
    public abstract double cevreHesapla();//abstract method

    public String ciz(){

        return name+ " isimli sekliniz ciziliyor";
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' + "\n şekil alani : "+ this.alanHesapla() + '\'' + "\n şekil cevresi : "+
                this.cevreHesapla()+ "\n cizilecek şekil : " + this.ciz()+
                '}';
    }
}
