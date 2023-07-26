package ch27_Abstraction.abstract_polymorphism01;

public abstract class AbstractClass {//parent class

    public static void byLinkText(){//concrete method

        System.out.println("Link text super");

    }
    public void get(){//concrete method

        System.out.println("chrome");

    }

    abstract void  absMethod();

}

class Test extends AbstractClass{

    public static void byLinkText(){//concrete method

        System.out.println("Link text sub class");

    }
    public void get(){//concrete method

        System.out.println("firefox");

    }



    @Override
    void absMethod() {

        System.out.println("abs method override edildi");

    }

    public static void  test(){

        System.out.println("test method");
    }

    public static void main(String[] args) {

        Test.byLinkText();//link text sub class
        AbstractClass.byLinkText();//link text super


        //AbstractClass obj = new AbstractClass();
        //AbstractClass' is abstract; cannot be instantiated

        AbstractClass obj = new Test();//polymorphism kullanılarak create edilen obje
        obj.absMethod();//abstract method override edildi
        obj.get();//firefox

    }
}
