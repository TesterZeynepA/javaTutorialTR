package ch28_Interface_Polymorphism.Interface;

import static ch28_Interface_Polymorphism.Interface.C03_DisDonanim.RENK;

public class Runner {
    public static void main(String[] args) {

        C06_Passat passat = new C06_Passat();
        passat.ebat();//C05 den
        passat.jant();//C05 den
        passat.kapi();//C03 den
        passat.kaporta();//C03 den
        passat.klima();//C04 den
        passat.koltuk();//C04 den
        passat.motor();//C02 den
        passat.yakit();//C02 den
        passat.sisLamp();//C03 den
        passat.sunroof();//C02 den

        System.out.println("C05_Lastik.RENK = " + C05_Lastik.RENK);

        System.out.println("RENK = " + RENK);

        System.out.println("C04_IcDonanim.KUMAS = " + C04_IcDonanim.KUMAS);

        //CTE C04_IcDonanim.TAPE ="SADA";
        //Cannot assign a value to final variable 'TAPE'

        //Task Polymorphism kullanarak passat objesi create edin

        C05_Lastik arc =new C06_Passat();
        C04_IcDonanim arc1 =new C06_Passat();
        C03_DisDonanim arc2 =new C06_Passat();

       //CTE C04_IcDonanim arc3 =new C04_IcDonanim();
        //'C04_IcDonanim' is abstract; cannot be instantiated

        ((C06_Passat) arc2).motor();





    }
}
