package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {

    /*
entrySet() yöntemi, bir Map nesnesinin içindeki tüm girişleri (anahtar-değer çiftlerini) içeren
bir Set koleksiyonunu döndürür. Her giriş, Map.Entry arabirimi tarafından temsil edilir ve
bu arabirim, getKey() ve getValue() yöntemleri aracılığıyla anahtar ve değerlere erişim sağlar.
 */
    public static void main(String[] args) {

        HashMap<String,String> hm = new HashMap<>();

        //hm.put(); key ve value ekleme yapar map e..

        hm.put("Apple", "250 $");
        hm.put("Samsung", "200 $");
        hm.put("Huawei", "150 $");
        hm.put(null, "125 $");
        hm.put("null", null);
        hm.put("Hp", "200 $");
        hm.put("Casper", "1000 $");
        hm.put("Casper", "101 $");//Dublicate Map key olduğu için 101 $ oldu

        System.out.println("hm = " + hm);

        System.out.println("hm.entrySet() = " + hm.entrySet());
        //m.entrySet() = [null=125 $, Apple=250 $, null=null, Hp=200 $, Casper=101 $, Samsung=200 $, Huawei=150 $]

        //task for each ile entrySet methodu kullanıp map elemanlarını print ediniz

        for (Map.Entry<String, String> key : hm.entrySet()){

            System.out.println("key = " + key);
        }

        for (Map.Entry<String, String> e: hm.entrySet()){
            //entrySet ile gelen key value loop icin Entry <Key, value> data type tanımlanır.

            System.out.println("e.getValue() = " + e.getValue());

        }
        /*e.getValue() = 125 $
e.getValue() = 250 $
e.getValue() = null
e.getValue() = 200 $
e.getValue() = 101 $
e.getValue() = 200 $
e.getValue() = 150 $
*/





    }
}
