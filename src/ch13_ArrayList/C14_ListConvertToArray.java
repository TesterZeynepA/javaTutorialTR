package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class C14_ListConvertToArray {
    public static void main(String[] args) {

        //listi Array e çevirmek için toArray() methodu kullanilir

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "Erzurum", "İzmir", "Konya", "Bursa", "Mogadishu", "Aydin"));
        System.out.println("city = " + city);//city = [Ankara, Erzurum, İzmir, Konya, Bursa, Mogadishu, Aydin]

        //1. yol dönen deger Object class a atanirsa

        Object [] arrCity = city.toArray();

        System.out.println("Arrays.toString(arrCity) = " + Arrays.toString(arrCity));
        //Arrays.toString(arrCity) = [Ankara, Erzurum, İzmir, Konya, Bursa, Mogadishu, Aydin]

        //2. yol toArray methodu ile

        String [] arrCity2 = city.toArray(new String[0]);
        System.out.println("Arrays.toString(arrCity2) = " + Arrays.toString(arrCity2));
        //Arrays.toString(arrCity2) = [Ankara, Erzurum, İzmir, Konya, Bursa, Mogadishu, Aydin]



    }
}
