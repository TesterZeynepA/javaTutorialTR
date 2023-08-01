package ch30_Collections.C01_LikedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
     Task->
     Node değerleri "dortmund","javaCAN","javaTAR","berlin" olan bir linkedList create ediniz.
     Girilen bir String değeri linkedListte varlığını kontrol edip varsa silip "silme islemi basarili"
     yoksa "girdiginiz eleman list te yok" print eden code create ediniz
      */

        LinkedList<String> linkedList= new LinkedList<>(Arrays.asList("dortmund","javaCAN","javaTAR","berlin"));

        Scanner input =new Scanner(System.in);
        System.out.println("String bir değer giriniz");
        String str = input.next();

            if (linkedList.contains(str)){

                linkedList.remove(str);
                System.out.println("silme işlemi başarılı");
            }else {
                System.out.println("girdiğiniz eleman listte yok");
            }

        //dogru calistiginda runtime da Exception in thread "main" java.util.ConcurrentModificationException hatasi alirsiniz
        //bu hatayi fix etmek icin iterator a atama yapmalisiniz listinizi
//     for (String each:linkedList) {
//         if (each.equals(silinecekVeri)){
//             linkedList.remove(each);
//             System.out.println("linkedList1 = " + linkedList);
//             System.out.println("silme islemi basarili");
//         }
        //Exception in thread "main" java.util.ConcurrentModificationException hatasi verir


        //ahmet bey in cozumu
        Iterator<String> iterator1= linkedList.iterator();
        while (iterator1.hasNext()){

            if (iterator1.next().equals(str)){
                iterator1.remove();
            }
        }
        System.out.println("linkedList1 = " + linkedList);
    }
}
