package Lambda_StreamApi.LambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C08_Limit {
    public static void main(String[] args) {

        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici",
                "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        //  List<String> yemahhh = new ArrayList<>(Arrays.asList("soğanlııı", "Wöveççççç"));
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.

        System.out.println("\n   Task   ");

        printElemanKarakterMax(yemahhh);


    }//main sonu
// Task-> list elemanlarının karakter sayısı en buyuk olanı print code create ediniz...

    public static void printElemanKarakterMax(List<String> yemahhh) {

        System.out.println("*** versiyon 1 ***");

        System.out.println(yemahhh.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1));//java.util.stream.SliceOps$1@67b64c45
        /*
limit(a)-> return typ bir Stream oldg için yani yeni bir eleman akışı oldg için birden çok eleman return edebilir.
dolayısıyla limit() meth. çıktısı doğrudan sout parametre olamaz(print edilemez) .
limit() meth cıktısı array veya List gibi bir collectiona atanmalı.
 */

        System.out.println("*** versiyon 2 ***");
        Stream<String> enBykKarakterEl= yemahhh.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1);

       // System.out.println(enBykKarakterEl.collect(Collectors.toList()));//[bicibici]
        System.out.println("*** versiyon 3 ***");

      //  enBykKarakterEl.toArray()

        System.out.println(Arrays.toString(enBykKarakterEl.toArray()));//[bicibici]
        System.out.println("*** versiyon 4 ***");

        System.out.println(yemahhh.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst());
        //Optional[bicibici]

        System.out.println("*** versiyon 5 ***");
        yemahhh.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1).forEach(SeedMethods::strYazdir);//bicibici

        System.out.println("*** versiyon 6 ***");

        System.out.println(yemahhh.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1).collect(Collectors.toList()).toString());//[bicibici]


    }


}
