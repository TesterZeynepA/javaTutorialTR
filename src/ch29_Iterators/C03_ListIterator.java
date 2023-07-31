package ch29_Iterators;

import java.util.*;

public class C03_ListIterator {
    public static void main(String[] args) {

        System.out.println("********* C03_ListIterator *************");

        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep","Ahmet","Eren", "Iclal", "Şafak","Fatih","Ali"));

        System.out.println("list1 in ilk hali = " + list1);

        //task yukaridaki LIST o ListIterator a atama yaparak SDET eklereyek update kalici ediniz..

        ListIterator <String> list1Iterator = list1.listIterator();

        while (list1Iterator.hasNext()) {

            list1Iterator.set(list1Iterator.next() + "SDET");
        }

        System.out.println("List son hali: " + list1);

        //task yeni list create ediniz
        //list1 i iterator a atayınız
        //list2 yi add methodu ile list1 e ekleyin
        //herbir elemanı print ediniz

        List <String> list2 = new ArrayList<>(Arrays.asList("offerlariniz geliyor"));
        System.out.println("list2 nin ilk hali = " + list2);

        ListIterator <String> listIterator2 = list1.listIterator();

        while (listIterator2.hasNext()){
            listIterator2.set(listIterator2.next().toUpperCase().charAt(0)+ "*****");
            //herbi ismi getirir ilk harfi alir gerisini yildiz ekler
            listIterator2.add(list2.toString());
        }
        System.out.println("list2 nin son hali= " + list2);


        System.out.println("list1 in en son hali  = " + list1);

    }
}

