package ch27_Abstraction.abstract01;

public abstract class Honda {//parent

    abstract void motor();//abstract method

    protected  void sunroof(){
        System.out.println("panoramik cam tavan harika seyir katar");
    }
    String name = "Fatih bey";//abstract class da variable tanımlanabilir
   // abstract String name2 = "Fatih bey";//abstract class da variable tanımlanabilir
    //variable abstract olamaz Modifier 'abstract' not allowed here

    abstract  void koltuk();
    abstract void  kapi();


}
