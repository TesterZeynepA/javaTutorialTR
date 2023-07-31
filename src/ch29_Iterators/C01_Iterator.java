package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep","Ahmet","Eren", "Iclal", "Şafak","Fatih","Ali"));

        System.out.println("list1 in ilk hali = " + list1);

        //task list1 in elemanlarını for loop ile print ediniz

        for (int i = 0; i < list1.size(); i++) {

            System.out.println("list1.get(i) = " + list1.get(i));

        }

        for (String s : list1) {

            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("*****************");

        //task list1 in herbir elemani for loop ile isimlere SDET ekleryerek update ediniz

        for (String w : list1) {

            System.out.print(w + " QA");//The value w + "QA" assigned to 'w' is never used
        }
       // System.out.println("list1 for loop içinde  = " + list1);


        for (int i = 0; i < list1.size(); i++) {
            String name = list1.get(i);
            list1.set(i, name + " SDET");
        }
        System.out.println("list1 in son hali = " + list1);

        //list1 i iterator a alip print ediniz


        Iterator<String> list1Iterator = list1.iterator();//List den iterator methodu kullanılarak
        // Iterator interface den list1Iterator variable tanımlandi.

        while (list1Iterator.hasNext()){

            System.out.println("iterator.next() = " + list1Iterator.next());
            //hasNext(); bir sonraki eleman var ise true return eder
            //next(); önünde olduğu elemanı getirir

        }
        System.out.println();
        System.out.println("list1Iterator in while sonrası hali = " + list1Iterator);
        //list1Iterator in while sonrası hali = java.util.ArrayList$Itr@1324409e




    }
}
