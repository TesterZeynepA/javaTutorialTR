package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        //nCopies methodu kopyalamak istediginiz degeri verdiginiz sayi kadar copy ediyor.

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "Erzurum", "İzmir", "Konya", "Bursa", "Mogadishu", "Aydin"));
        System.out.println("city = " + city);//city = [Ankara, Erzurum, İzmir, Konya, Bursa, Mogadishu, Aydin]

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDTA", "ITALYA"));

        System.out.println("country = " + country);

        ArrayList<String> yeniList = new ArrayList<>  (Collections.nCopies(7,"NEW ZEALAND")) ;
        System.out.println("yeniList = " + yeniList);
        //yeniList = [NEW ZEILAND, NEW ZEILAND, NEW ZEILAND, NEW ZEILAND, NEW ZEILAND, NEW ZEILAND, NEW ZEILAND]

        //addAll methodu iki

          city.addAll(country);

          System.out.println("city = " + city);
          //city = [Ankara, Erzurum, İzmir, Konya, Bursa, Mogadishu, Aydin, MADAGASKAR, ALMANYA, POLONYA, UGANDTA, ITALYA]

        //belirlenen index e ekleme

        city.addAll(1,country);
        System.out.println("city = " + city);
        //city = [Ankara, MADAGASKAR, ALMANYA, POLONYA, UGANDTA, ITALYA, Erzurum, İzmir, Konya, Bursa, Mogadishu, Aydin]
        System.out.println("country = " + country);//country = [MADAGASKAR, ALMANYA, POLONYA, UGANDTA, ITALYA]














    }
}
