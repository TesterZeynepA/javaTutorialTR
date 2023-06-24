package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_get {
    public static void main(String[] args) {
        //get(); -> listte istenen index elemanı return eder (arr[3]-> arr'in 3. indexdeki elemanı ver)

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "Erzurum", "İzmir", "Konya", "Bursa", "Mogadishu", "Aydin"));
        System.out.println("city = " + city);

        System.out.println("city.get(1) = " + city.get(1));//city.get(1) = Erzurum

       // System.out.println("city.get(20) = " + city.get(20));//IndexOutOfBoundsException






    }
}
