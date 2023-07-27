package ch28_Interface_Polymorphism.Interface;

public interface C03_DisDonanim {//parent interface

    public abstract void  kapi();
    //Modifier 'public' is redundant for interface members

    void kaporta();

    String RENK ="siyah";

    public default String sisLamp(){
        return "sisli havada otomatik çalışır";

    }


}
