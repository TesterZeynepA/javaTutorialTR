package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {

        System.out.println("************** Iterator **************");

        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep","Ahmet","Eren", "Iclal", "Şafak","Fatih","Ali"));

        System.out.println("list1 in ilk hali = " + list1);

        //task list deki elemanları silip print ediniz Iterator ile...

        Iterator<String> list1Iterator = list1.iterator();

        while (list1Iterator.hasNext()) {

            String s = list1Iterator.next();
            list1Iterator.remove();
        }

        System.out.println("List son hali: " + list1);

    }
}
