package ch01_Variables;

public class C01_Variables {


    //TASK: İsminizi
    //yasinizi ve
    //ogrenci olup olmadiginizi uygun data type lara assign edip
    //konsolda print edin
    //note: assign (atama) = (esittir) atama operatoru ile yapilir

    public static void main(String[] args) {

        String isim = "zeynep";

        // once data type yazilir String int double boolean
        //sonra variable name yazilir name isim yas. //identifier ile variable name ayni seyi ifade eder
        //atama operatoru ile = deger atamasi yapilir
        //data type göre deger atamasi yapildi.
        //son vurus olarak ; ile bitirildi

        int yas = 38;

        boolean ogrenciMi = false;

        System.out.println(isim+ " " + yas + " "+ogrenciMi) ;

        System.out.println(isim); //zeynep
        System.out.println("isim = " + isim); //isim = zeynep

        System.out.println("yas = " + yas); // = 38

        System.out.println("ogrenciMi = " + ogrenciMi); //ogrenciMi = false

        //notes variable ismi yazilip noktaya basildiğinda


        //TASK isim yas maas variableri create edip print ediniz

        //CTE String isim = "Rukiye hanim" ; // Variable 'isim is already defined in the scope
        String name = "Rukiye hanim" ;
        int age = 33 ;
        double salary = 25.000;
        System.out.println("name = " + name); //name = Rukiye hanim
        System.out.println("age = " + age); //age =33
        System.out.println("salary = " + salary); //salary = 25.000

        int boy ; // degeri atanmayan bir variable create edildi
        //CTE System.out.println("boy = " + boy); //Variable 'boy' might not have been initialized
        boy = 180; // deger atamasi yapildigi icin artik kullanilabilir bir variable oldu.
        System.out.println("boy = " + boy); //boy = 180

        //2. yol variable create etmede
        int yas2 , age1 , count;
        yas2 =45;
        age1 =55 ;
                count = 21;
        //3. yol variable create ederken
        int not =100 , ucret = 36500 , chapter = 1;
        String okul = "Clarusway" , bolum = "Tester SDET" , derece = "A" ;
        System.out.println("okul = " + okul); //okul = Clarusway
        System.out.println("bolum = " + bolum); //bolum = Tester SDET
        System.out.println("derece = " + derece); //derece = A

        //variable create edildigi scope da dogar ve o scope da olur (vefat) eder


    }
}