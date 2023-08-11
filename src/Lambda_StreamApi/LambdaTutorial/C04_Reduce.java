package Lambda_StreamApi.LambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_Reduce {
     /*
reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
kullanımı yaygındır pratiktir.
Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılımlı bir hesaplama süreci elde edilmiş olmaktadır.
reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

*/
     public static void main(String[] args) {

         List<Integer> sayiList = new ArrayList<>(Arrays.asList(7,58,17,54,33,3,13,35,65,18,61,46,25,16,6));

         System.out.println("    *** task 01 ***   ");
         printCiftKareEnByk(sayiList);//Optional[3364]

         System.out.println("\n   *** task 02 ***   ");

         System.out.println(printListElemanToplam(sayiList));//Optional[457]

         System.out.println("\n   *** task 03 ***   ");
         printListElemanToplam1(sayiList);//457

         System.out.println("\n   *** task 04 ***   ");

         printCiftElemanCarpim(sayiList);//248956416

         System.out.println("\n   *** task 04 ***   ");
         printListElemanMin(sayiList);//

         System.out.println("\n   *** task 05 ***   ");

         System.out.println(printList58BykElMinTek(sayiList));//Optional[61]


     }//main sonu

    ////Task01-> list çift elemanlarının karelerinin en buyugunu print code create ediniz...

    private static void printCiftKareEnByk(List<Integer> sayiList) {

      // Optional<Integer> maxSayi=sayiList.
      //         stream().
      //         filter(SeedMethods::ciftMi).map(SeedMethods::kareAl).reduce(Math::max);
      // System.out.println(maxSayi);
        System.out.println(sayiList.
                stream().
                filter(SeedMethods::ciftMi).map(SeedMethods::kareAl).reduce(Math::max));
    }

//Task02-> list elemanlarının toplamını  print code create ediniz...

    private static Optional<Integer> printListElemanToplam(List<Integer> sayiList) {

       return sayiList.
               stream().
               //reduce(Math::addExact);//app yavaşlatır
               reduce(Integer::sum);//specific data olduğu için app hızlı çalışır.
    }

    private static void printListElemanToplam1(List<Integer> sayiList) {

        System.out.println("sayiList.\n                stream().\n                //reduce(Math::addExact);//app yavaşlatır\n                        reduce(0,(t,u)-> (t+u)) = " + sayiList.
                stream().
                //reduce(Math::addExact);//app yavaşlatır
                        reduce(0, (t, u) -> (t + u)));//specific data olduğu için app hızlı çalışır.
        /*
a: ilk değerini her zaman  atanan identity değerden alır.
b: değerini her zaman Stream()'den alır
a: ilk değerden sonraki değerini action(işlem body)'den alır
  */
    }
    //Task03-> list'in çift elemanlarının çarpımını  print code create ediniz...


    private static void printCiftElemanCarpim(List<Integer> sayiList) {

        System.out.println("sayiList.stream().filter(SeedMethods::ciftMi).reduce(1,(t,u)->(t+u)) = "
                + sayiList.
                stream().
                filter(SeedMethods::ciftMi).
                //reduce(1, (t, u) -> (t * u)));
                reduce(Math::multiplyExact));

    }
//Task04-> list elemanlarının en küçüğünü  print code 4 farklı code create ediniz...

private static void printListElemanMin(List<Integer> sayiList) {
         //1. yol

    System.out.println("1. yol math ref : " + sayiList.stream().reduce(Math::min));

    //2. yol

    System.out.println(" 2. yol Integer ref : " + sayiList.stream().reduce(Integer::min));

    //3. yol

    System.out.println("3. yol Seed ref : " + sayiList.stream().reduce(SeedMethods::minBul));

    //4. yol

    System.out.println("4. yol İdentity ref : " + sayiList.stream().reduce(sayiList.get(0), (a, b) -> a < b ? a : b));

}


    // Task05-> List elemanlarının 58'den buyuk en kucuk tek elemanını print eden code create ediniz...
    private static Optional <Integer> printList58BykElMinTek(List<Integer> sayiList) {

         return sayiList.
                 stream().
                 filter(SeedMethods::tekMi).filter(t->t>58).reduce(SeedMethods::minBul);









    }




}
