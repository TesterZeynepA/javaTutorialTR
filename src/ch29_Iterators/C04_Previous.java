package ch29_Iterators;

import java.util.*;

public class C04_Previous {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("numberList in ilk hali = " + numberList);

        //task numberListi tersten print ediniz

        ListIterator <Integer> listItrs = numberList.listIterator();

        while (listItrs.hasNext()) {

            System.out.print(listItrs.next() + " ");
        }

        System.out.println();

        while (listItrs.hasPrevious()) {

            System.out.print(listItrs.previous()+ " ");
        }

        //task son elemana bir unvan ekleyin

        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep","Ahmet","Eren", "Iclal", "Şafak","Fatih","Ali"));

        System.out.println("list1 in ilk hali = " + list1);

        ListIterator<String> listIterator1 = list1.listIterator();

        while (listIterator1.hasNext()) {

            String str = listIterator1.next();
            System.out.println("str = " + str);

            if (!listIterator1.hasNext()){// false verdiği noktayı nasıl son eleman da belirtir

                listIterator1.set(str + " SDET");


            }
        }
        System.out.println("list1 in son hali = " + list1);

        /*
      önemli ->  hasPrevious() meth için MUTLAKA  hasNext() ve next() meth
     calıştırılarak cursor(pointer) en sona getirilmeli.

     ITERATOR VE LISTITERATOR farkları

     1- ITERATOR-> sadece hasNext(), next(), remove() meth çalışır
        LISTITERATOR -> hasNext(), next(), remove(). hasPrevious(), previous(),add(), set() vs methodlar çalışır

     2- LISTITERATOR -> sadece List yapılarda tanımlanır
        ITERATOR-> tum collection(list set Array, map..) için tanımlanır.

     3- ITERATOR-> sadece ileri b->s tekrarlar
       LISTITERATOR -> b<->s ileri ve geri çift yönlü tekrarlar

       ITERATOR-> kapsamı geniş ama aksiyonu az
       LISTITERATOR -> kapsamı dar ama aksiyıonu çok

        */






    }
}
