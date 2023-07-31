package ch29_Iterators;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
         /*
task -> Verilen bir integer listin tek  elemanrının karesini tersten listIterator  print eden code create ediniz
 */

        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("numberList in ilk hali = " + numberList);

        ListIterator<Integer> listIterator = numberList.listIterator();


        while (listIterator.hasNext()) {
            listIterator.next();

        }


        while (listIterator.hasPrevious()) {

            int a = listIterator.previous();
            System.out.println("a = " + a);
            if (a%2==1){
                listIterator.set(a*a);;
            }else listIterator.remove();
        }

        System.out.println("numberList = " + numberList);

        System.out.println("*****************");

        while (listIterator.hasNext()) {
            listIterator.next();
        }

        while (listIterator.hasPrevious()) {

            System.out.println("listIterator.previous() + \" \" = " + listIterator.previous() + " ");
        }

    }
}