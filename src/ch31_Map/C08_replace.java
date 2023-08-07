package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C08_replace {

    /*
replace() yöntemi, belirtilen bir anahtarın mevcut değerini başka bir değerle değiştirmek için kullanılır.
Eğer belirtilen anahtar zaten haritada bulunuyorsa,
 bu yöntem eski değeri yeni değerle değiştirir. Eğer anahtar bulunmazsa, herhangi bir değişiklik yapmaz.

 */
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Apple", "250 $");
        map.put("Samsung", "200 $");
        map.put("Huawei", "150 $");
        map.put(null, "125 $");
        map.put("null", null);
        map.put("Hp", "200 $");
        map.put("Casper", "1000 $");
        map.put("Casper", "101 $");//Dublicate Map key olduğu için 101 $ oldu

        System.out.println("map = " + map);
        //map = {null=125 $, Apple=250 $, null=null, Hp=200 $, Casper=101 $, Samsung=200 $, Huawei=150 $}

        System.out.println("map.replace(\"Apple\", \"500 $\") = " + map.replace("Apple", "500 $"));
        //map.replace("Apple", "500 $") = 250 $

        System.out.println("map.replace(\"apple\", \"550 $\") = " + map.replace("apple", "550 $"));
        //map.replace("apple", "550 $") = null

        System.out.println("map = " + map);//map = {null=125 $, Apple=500 $, null=null, Hp=200 $, Casper=101 $, Samsung=200 $, Huawei=150 $}

        //task replace methodu ile istediğijniz bir key in value sunu update ediniz

        System.out.println("map.replace(\"null\", \"1250 $\") = " + map.replace("null", "1250 $"));


    }
}
