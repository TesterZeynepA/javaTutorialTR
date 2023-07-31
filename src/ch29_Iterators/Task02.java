package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task02 {
    public static void main(String[] args) {

/*  task->
     Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
   elementleri silip print eden code create ediniz
   (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23]
    */
        List<Integer> numberList = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));

        System.out.println("numberList in ilk hali = " + numberList);

        int ilkSayi = 20;
        int ikinciSayi = 40;

        ListIterator<Integer> iterator = numberList.listIterator();

        while (iterator.hasNext()) {
            int sayi = iterator.next();
            if (sayi <= ilkSayi || sayi >= ikinciSayi) {
                iterator.remove();
            }
        }

        System.out.println(numberList);
    }
}