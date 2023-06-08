package J_Challange01;

public class Task04_VariableCreate {
    public static void main(String[] args) {

        // data type dataName assaigment initialize (ilk deger atama) ;
        int yas = 48;
        System.out.println("yas = " + yas); //48


        int id ;// -> datatype ve dataName ile variable declaration (tanımlama) yapıldı.
       // System.out.println("id = " + id); //CTE -> initialize (ilk deger atamasi) yapılmayan variable action alamaz.

    id =571622; // -> declaration yapılan variable assignment (value) değer ataması yapıldı.
        System.out.println("id = " + id);

        String isim, meslek, cimbom, memleket; // multiple çoklu tanımlama
        isim = "Safvet";

        int age=33, yil =1905, boy =190; // multiple tanımlama ve atama
        System.out.println(age + "" + yil + "" + boy);


        //Bir degisken tanimlayin : x
//Baska bir degiskeni initialize edin : y
//x degiskenini initialize edin
//y degiskenini yeni bir degerle guncelleyin

        int x;
         int y = 69;
        x= 21;
        y= 35;
        System.out.println("x+ \"\" + y = " + x + "" + y); //35



    }
}
