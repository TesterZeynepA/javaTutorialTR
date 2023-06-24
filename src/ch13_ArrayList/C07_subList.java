package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {

        //subList() -> listten istenen list parçasını return eder...

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDTA", "ITALYA"));
        System.out.println("country = " + country);

        System.out.println("country.subList(3,5) = " + country.subList(3, 5));//country.subList(3,5) = [UGANDTA, ITALYA]

        //yeni list oluşturup eski listten eleman çekme

        ArrayList<String> yeniList = new ArrayList<>(country.subList(2,5));

        System.out.println("yeniList = " + yeniList);//yeniList = [POLONYA, UGANDTA, ITALYA]

       // RTE System.out.println("country.subList(3,6) = " + country.subList(3, 6));//java.lang.IndexOutOfBoundsException



    }
}
