package ch20_Constructor;

public class C06_Ogrenci {//POJO class

    //fields
    String isim= "Zeynep hanim";
    int yas;
    String name;
    int age;

    public C06_Ogrenci(String isim, int yas) {
        // this.isim = isim;
        // this.yas = yas;

        isim = isim;
        yas = yas;

        name = isim;
        age = yas;

        System.out.println("Pojo içinden isim = " + isim);
        System.out.println("Pojo içinden this.isim = " + this.isim);
        System.out.println("Pojo içinden name = " + name);
    }

    public C06_Ogrenci() {


    }
}


