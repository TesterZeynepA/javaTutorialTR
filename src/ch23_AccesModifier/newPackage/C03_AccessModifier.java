package ch23_AccesModifier.newPackage;

import ch23_AccesModifier.C01_AccessModifier;

public class C03_AccessModifier {

    private  String privateName= "Meryem hanim";
    String defaultName= "Zeynep hanim";
    public String publicName = "Ali Bey";
    protected String protectedName= "Hasan Bey";


    public static void main(String[] args) {

        C01_AccessModifier obj1 = new C01_AccessModifier();

        System.out.println("obj1.publicYas = " + obj1.publicYas);

       // obj1.defaultYas= 33;
       // obj1.protectedYas =66;

        //'defaultYas' is not public in
        //'ch23_AccesModifier.C01_AccessModifier'.
        //Cannot be accessed from outside package



    }






}
