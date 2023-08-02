package ch30_Collections.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task03 {
    public static void main(String[] args) {
/*
commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
return tipi arraylist olmalı.
ÖRNEĞİN:
İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
Ortak değerleri ArrayListe ekleyiniz.
çıktı:  "USA" , "Brazil" ,"Germany"
ArrayListi yazdırınız.
 */

        HashSet<String> hs1 = new HashSet<>(Arrays.asList("Germany" , "England" , "South Africa" , "Brazil" , "USA"));

        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Germany" , "China" , "Brazil" , "France" ,  "USA"));

        ArrayList<String> ortakElemanlar = commonValues(hs1, hs2);

        System.out.println(ortakElemanlar);
    }

    public static ArrayList<String> commonValues(HashSet<String> s1, HashSet<String> s2) {

        //2. yol

        s1.retainAll(s2);//ortak elemanlar dişindakiler listeden remove edilir
        ArrayList<String> list = new ArrayList<>(s1);// sadece ortak elemanlar liste alındı...
       // ArrayList<String> ortakList = new ArrayList<>();
       // for (String w : s1) {
       //     if (s2.contains(w)) {
       //         ortakList.add(w);
       //     }
       // }
       // return ortakList;

        return list;
    }
}
