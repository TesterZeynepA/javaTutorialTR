package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {

        // remove();-> listten istenen elemanı siler

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDA", "ITALYA"));
        System.out.println("country = " + country);//country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        Collections.sort(country);

        System.out.println("country.remove(\"Norway\") = " + country.remove("Norway"));//country.remove("Norway") = false

        System.out.println("country.remove(\"UGANDA\") = " + country.remove("UGANDA"));//country.remove("UGANDA") = true

        System.out.println("country.remove(0) = " + country.remove(0));//country.remove(0) = ALMANYA

        System.out.println("country = " + country);//country = [ITALYA, MADAGASKAR, POLONYA]

        country.add("Amerika");
        country.add("Hollanda");
        country.add("Ukrayna");
        country.add("Amerika");
        System.out.println("country = " + country);//country = [ITALYA, MADAGASKAR, POLONYA, Amerika, Hollanda, Ukrayna, Amerika]
        System.out.println("country.remove(\"Amerika\") = " + country.remove("Amerika"));//country.remove("Amerika") = true
        System.out.println("country = " + country);//country = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika]

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "Erzurum", "İzmir", "Konya", "Bursa", "Mogadishu", "Aydin"));
        System.out.println("city = " + city);//city = [Ankara, Erzurum, İzmir, Konya, Bursa, Mogadishu, Aydin]

        country.addAll(city);
        System.out.println("country = " + country);
        //country = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika, Ankara, Erzurum, İzmir, Konya, Bursa, Mogadishu, Aydin]

        System.out.println("country.removeAll(city) = " + country.removeAll(city));//country.removeAll(city) = true
        System.out.println("country = " + country);//country = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika]


    }
}
