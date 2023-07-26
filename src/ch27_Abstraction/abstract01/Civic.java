package ch27_Abstraction.abstract01;

public class Civic extends Lastik{

    /**
     * extends Lastik yazılarak lastik class a consrete bir civic class tanimlandı.
     * java CTE verdi
     * çözüm olarak
     * a-> unimplemented method lar implement edilmeli
     * b-> parent lastik class dan abstract keyword kaldırılmalı
     * c-> concrete olan child Civic class abstract edilmeli
     */

    //concrete class da abstract method tanımlanır mı?

   // public abstract void absMethod();
    //Abstract method in non-abstract class
    @Override//implement edilen abstract method
    void motor() {

        System.out.println("civic için ideal motor 1.6");

    }

    @Override
    void koltuk() {

        System.out.println("koltuklar kadife kumaş");

    }

    @Override
    void kapi() {

        System.out.println("4 kapı uzun kasa");

    }

    @Override
    public void lastikEbat() {

        System.out.println("lastikler 18 inc");

    }

    public int vites (){
        return 6;
    }
}
