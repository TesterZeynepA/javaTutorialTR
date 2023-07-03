package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {

        //replace all();-> listte belirli bir elemanı belirli bir deger ile update eder

        ArrayList<Integer> listNumber = new ArrayList<>(Arrays.asList(1,2,5,4,3,66,99,55,88,35,34));

        System.out.println("listNumber = " + listNumber);//listNumber = [1, 2, 5, 4, 3, 66, 99, 55, 88, 35, 34]

        System.out.println("Collections.replaceAll(listNumber,1,111) = " + Collections.replaceAll(listNumber, 1, 111));
        //Collections.replaceAll(listNumber,1,111) = true

        System.out.println("listNumber = " + listNumber);//listNumber = [111, 2, 5, 4, 3, 66, 99, 55, 88, 35, 34]

        Collections.fill(listNumber,33);
        System.out.println("listNumber = " + listNumber);//listNumber = [33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33]


    }
}
