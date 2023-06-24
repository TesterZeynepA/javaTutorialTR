package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        // index of(); -> list içinde istenen elemanın index değerini return eder

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "Erzurum", "İzmir", "Konya", "Bursa", "Mogadishu", "Aydin"));
        System.out.println("city = " + city);

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDTA", "ITALYA"));
        System.out.println("country = " + country);

        System.out.println("city.indexOf(\"Samsun\") = " + city.indexOf("Samsun"));//city.indexOf("Samsun") = -1

        System.out.println("city.indexOf(\"Ankara\") = " + city.indexOf("Ankara"));//city.indexOf("Ankara") = 0

        country.add("İNGİLTERE");
        System.out.println("country.indexOf(\"İNGİLTERE\") = " + country.indexOf("İNGİLTERE"));
        //country.indexOf("İNGİLTERE") = 5

        System.out.println("country.lastIndexOf(\"İNGİLTERE\") = " + country.lastIndexOf("İNGİLTERE"));
        //country.lastIndexOf("İNGİLTERE") = 5

        country.add("ALMANYA");
        System.out.println("country.indexOf(\"ALMANYA\") = " + country.indexOf("ALMANYA"));//country.indexOf("ALMANYA") = 1

        System.out.println("country.lastIndexOf(\"ALMANYA\") = " + country.lastIndexOf("ALMANYA"));//country.lastIndexOf("ALMANYA") = 6

        System.out.println("country = " + country);//country = [MADAGASKAR, ALMANYA, POLONYA, UGANDTA, ITALYA, İNGİLTERE, ALMANYA]




    }
}
