package ch31_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class C12_HashTable {
    public static void main(String[] args) {

        Hashtable <String , String> ht = new Hashtable<>();

        ht.put("Zeynep", "123456789");
        ht.put("fatih", "82875252885");
        ht.put("kemal", "282828282");
        ht.put("ali", "85283863");
        ht.put("iclal", "28282852852");
        ht.put("safak", "828282852");

        System.out.println("ht = " + ht);
        //ht = {safak=828282852, Zeynep=123456789, fatih=82875252885, iclal=28282852852, ali=85283863, kemal=282828282}

        System.out.println("ht.put(\"null\", \"828282852\") = " + ht.put("null", "828282852"));

        // RTE System.out.println("ht.put(null, \"828282852\") = " + ht.put(null, "828282852"));
        //Exception in thread "main" java.lang.NullPointerException

        System.out.println("ht = " + ht);
        //ht = {safak=828282852, null=828282852, Zeynep=123456789, fatih=82875252885, iclal=28282852852, ali=85283863, kemal=282828282}

        //task ikinci bir hastable create ederek putAll methodunu calisiniz

        Hashtable<String, String> ht2 = new Hashtable<>();
        ht2.put("QA", "Zeynep");
        ht2.put("Dev", "İclal");

        ht.putAll(ht2);
        System.out.println("ht = " + ht);
        //ht = {iclal=28282852852, Zeynep=123456789, null=828282852, safak=828282852,
        // Dev=İclal, kemal=282828282, ali=85283863, QA=Zeynep, fatih=82875252885}


    }
}
