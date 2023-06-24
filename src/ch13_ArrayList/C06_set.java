package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    //crUd içindeki Update işlemi için kullanılır.

    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDTA", "ITALYA"));
        System.out.println("country = " + country);

        System.out.println("country.size() = " + country.size());//country.size() = 5

        System.out.println("country.set(0, \"AMERİKA\") = " + country.set(0, "AMERİKA"));//country.set(0, "AMERİKA") = MADAGASKAR

        System.out.println("country = " + country);//country = [AMERİKA, ALMANYA, POLONYA, UGANDTA, ITALYA]

        System.out.println("country.size() = " + country.size());//country.size() = 5



    }
}
