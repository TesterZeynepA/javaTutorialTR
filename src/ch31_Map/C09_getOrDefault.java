package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C09_getOrDefault {
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


        System.out.println("map.getOrDefault(\"Apple\",null) = " + map.getOrDefault("Apple", null));

        //map.getOrDefault("Apple",null) = 250 $

        System.out.println("map.getOrDefault(\"apple\", \"200 $\") = " + map.getOrDefault("apple", "200 $"));
        //map.getOrDefault("apple", "200 $") = 200 $

        //key ayniysa eski,key farkliysa yeni degeri veriyor



    }
}
