package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {

    public static void main(String[] args) {

//contains(); -> method listte istenen elemanın varlığını kontrol eder true/false return eder

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDA", "ITALYA"));

        System.out.println("country = " + country);//country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        System.out.println("country.contains(\"almanya\") = " + country.contains("almanya"));//country.contains("almanya") = false

        System.out.println("country.contains(\"UGANDA\") = " + country.contains("UGANDA"));//country.contains("UGANDA") = true


    }
}
