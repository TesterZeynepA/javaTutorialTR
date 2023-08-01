package ch30_Collections.C01_LikedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList1= new LinkedList<>(Arrays.asList("berlin", "ankara", "izmir", "dortmund", "istanbul", "newyork"));

        System.out.println("linkedList1 = " + linkedList1);

        System.out.println("linkedList1.remove() = " + linkedList1.remove());
        System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [ankara, izmir, dortmund, istanbul, newyork]

        System.out.println("linkedList1.remove(2) = " + linkedList1.remove(2));//linkedList1.remove(2) = dortmund

        System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [ankara, izmir, istanbul, newyork]

        System.out.println("linkedList1.remove(\"ankara\") = " + linkedList1.remove("ankara"));
        //linkedList1.remove("ankara") = true

        System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [izmir, istanbul, newyork]

        System.out.println("linkedList1.remove(\"ankara\") = " + linkedList1.remove("ankara"));//linkedList1.remove("ankara") = false

        linkedList1.add("izmir");
        System.out.println("linkedList1 = " + linkedList1);
        //linkedList1 = [izmir, istanbul, newyork, izmir]

        linkedList1.removeFirstOccurrence("izmir");
        System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [istanbul, newyork, izmir]

        linkedList1.add("newyork");
        System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [istanbul, newyork, izmir, newyork]

        System.out.println("linkedList1.removeLastOccurrence(\"newyork\") = " + linkedList1.removeLastOccurrence("newyork"));
        //linkedList1.removeLastOccurrence("newyork") = true
        System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [istanbul, newyork, izmir]

        System.out.println("linkedList1.element() = " + linkedList1.element());//linkedList1.element() = istanbul

        System.out.println("linkedList1.getLast() = " + linkedList1.getLast());//linkedList1.getLast() = izmir
        System.out.println("linkedList1.getFirst() = " + linkedList1.getFirst());//linkedList1.getFirst() = istanbul

        //iki list create edin
        LinkedList<String> linkedList2= new LinkedList<>(Arrays.asList("bilecik", "pursaklar", "menemen", "dortmund", "istanbul", "newyork"));

        LinkedList<String> linkedList3= new LinkedList<>(Arrays.asList("hatay", "zigetvar", "plevne", "arnavutluk", "paris"));

        linkedList2.addAll(linkedList3);
        System.out.println("linkedList2 = " + linkedList2);
        //linkedList2 = [bilecik, pursaklar, menemen, dortmund, istanbul, newyork, hatay, zigetvar, plevne, arnavutluk, paris]

        linkedList2.removeAll(linkedList3);
        System.out.println("linkedList2 = " + linkedList2);
        //linkedList2 = [bilecik, pursaklar, menemen, dortmund, istanbul, newyork]

        //task integer list create edin remove islemi yapın

        LinkedList<Integer> linkedList4 = new LinkedList<>(Arrays.asList(1,2,5,6,3,4,7));
        linkedList4.remove();
        System.out.println("linkedList4 = " + linkedList4);//linkedList4 = [2, 5, 6, 3, 4, 7]


    }
}
