package ch25_Inheritance.inheritance;

public class Pet extends Animal{
    public Pet(){
        System.out.println("pet den selamlar petshop her türlü hayvaniniz bakim yapilir");
    }
    public void beslenme(){
        System.out.println("mama ile besleyin kuru ekmek vermeyin");
    }
    public void uyuma(){
        System.out.println("uygun ortamlarda uyutun");
    }
}
