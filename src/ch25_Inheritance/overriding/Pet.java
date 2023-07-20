package ch25_Inheritance.overriding;

public class Pet extends Animal {
    public Pet(){
        System.out.println("pet den selamlar petshop her türlü hayvaniniz bakim yapilir");
    }
    public void beslenme(){
        System.out.println("mama ile besleyin kuru ekmek vermeyin");
    }
    public void uyuma(){
        System.out.println("uygun ortamlarda uyutun");
    }




  // CTE @Override
  //  protected void hareket(){
  //      super.hareket();
  //  }

    @Override
    public void icme(){//parent class da access mod. protected
        //child da access mod. level yükseltildi

        System.out.println("overriding icme methodu pet class dan");
    }
private  void privateMethod(){
        //miras alınamaz
    System.out.println("pet class in private methodu");
}
int number=104;
    int age =101;
    int numberOfPet= 201;

    @Override
    public String toString() {
        return "Pet{" +
                "number=" + number +
                ", age=" + age +
                ", numberOfPet=" + numberOfPet +
                "} " + super.toString();
    }
}

