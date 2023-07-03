package ch13_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C15_ArrayConvertToList {
    public static void main(String[] args) {

        String [] names ={"Ali", "Zeynep", "Fatih","Safak", "Derya"};

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));//Arrays.toString(names) = [Ali, Zeynep, Fatih, Safak, Derya]

        List<String> namesList = Arrays.asList(names);
        System.out.println("namesList = " + namesList);//namesList = [Ali, Zeynep, Fatih, Safak, Derya]

      //RTE System.out.println("namesList.add(\"Zafer\") = " + namesList.add("Zafer"));
       //Exception in thread "main" java.lang.UnsupportedOperationException

       //RTE ArrayList<String> nameArrayList = (ArrayList<String>) Arrays.asList(names);
       // System.out.println("nameArrayList = " + nameArrayList);
        //Exception in thread "main" java.lang.ClassCastException

        ArrayList<String> nameArrayList = new  ArrayList<>(Arrays.asList(names));

        System.out.println("nameArrayList = " + nameArrayList);//nameArrayList = [Ali, Zeynep, Fatih, Safak, Derya]
        Collections.sort(nameArrayList);
        System.out.println("nameArrayList = " + nameArrayList);//nameArrayList = [Ali, Derya, Fatih, Safak, Zeynep]


    }
}
