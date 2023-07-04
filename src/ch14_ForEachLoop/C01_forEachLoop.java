package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_forEachLoop {
    public static void main(String[] args) {

         /*
for-each loop for loop'un gelilmş halıdir.
1. clean code- yazım kolaylığı
2. code okuma kolaylıgı
3. hata yapma riskini azaltır.
 */
        List<Integer> sayiList  = new ArrayList<>(List.of(1,2,55,66,33,35,34,72));

        System.out.println("***** task 01 *****");

    // task list elemanlarını ayrı satırlara print ediniz.


        for (int i = 0; i < sayiList.size(); i++) {

            System.out.println(sayiList.get(i));

        }

        for (Integer i : sayiList) {
            System.out.println(i);
        }

        System.out.println("***** task 02 *****");

        //task list elemanlarinın ilk 3 eleman hariç tek olanları print ediniz.


        for (Integer i : sayiList.subList(3, sayiList.size())) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        System.out.println("***** task 03 *****");
//task list elemanlarinın 2 ile 5 dahil indexler  arasındaki (2,3,4,5) elemanların toplamını  print ediniz.

        int toplam = 0;
        int index = 0;
        for (Integer sayi : sayiList) {
            if (index >= 2 && index <= 5) {
                toplam += sayi;
            }
            index++;
        }

        System.out.println("Toplam: " + toplam);

        //2. yol

        int total = 0;

        for (Integer z : sayiList.subList(2, 6)) {
            total+=z;
        }
        System.out.println("total = " + total);





    }
}