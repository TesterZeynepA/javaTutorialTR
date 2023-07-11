package ch20_Constructor;

public class C04_TeacherRunner {
    //task pm li const kullanarak
// ogretmen objesi create ediniz tum field lari kullanma opsionel

    public static void main(String[] args) {
        C04_Teacher ogretmen = new C04_Teacher();

       ogretmen.ad= "zeynep";
       ogretmen.soyad= "Aytop";
       ogretmen.brans = "kimya";
       ogretmen.id = 123654;
       ogretmen.emekliMi= false;
       ogretmen.maas = 15000;
       ogretmen.tecrube= 15;
       ogretmen.yas=37;


        System.out.println("ogretmen = " + ogretmen);

        C04_Teacher ogretmenFullPmli = new C04_Teacher(1, "bayram" , "aslan" , "fizik", 30,55,5000.5,false);

        System.out.println("ogretmenFullPmli = " + ogretmenFullPmli);


    }
}
