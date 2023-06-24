package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {

        // size() method arraylistin uzunluğunu verir yani eleman sayisini

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDTA", "ITALYA"));
        System.out.println("country = " + country);

        System.out.println("country.size() = " + country.size());//country.size() = 5




    }
}
