package ch31_Map;

import java.util.HashMap;

public class C06_putAll {
    /*
putAll() yöntemi, bir haritayı, başka bir haritaya veya bir Map nesnesine eklemek için kullanılır.
Bu yöntem, kaynak haritadaki tüm anahtar-değer çiftlerini hedef haritaya kopyalar. Eğer hedef harita
içinde önceden aynı anahtar varsa, o anahtarın eski değeri üzerine yazılır.
Eğer kaynak haritada olmayan yeni anahtarlar varsa, hedef haritaya bu anahtar-değer çiftleri eklenir.
 */
    public static void main(String[] args) {

        //task 2. bir map create ederek putAll methodu kullanip map leri print ediniz

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
        HashMap<String,String> hm2 = new HashMap<>();

        hm2.put("1", "Zeynep");
        hm2.put("2", "İclal");
        hm2.put("3", "Serap");
        hm2.put(null, "Ali");

        System.out.println("hm2 = " + hm2);//hm2 = {null=Ali, 1=Zeynep, 2=İclal, 3=Serap}

        hm.putAll(hm2);
        System.out.println("hm = " + hm);
        //hm = {null=Ali, 1=Zeynep, Apple=250 $, 2=İclal, 3=Serap, null=null, Hp=200 $, Casper=101 $, Samsung=200 $, Huawei=150 $}
        System.out.println("hm2 = " + hm2);//hm2 = {null=Ali, 1=Zeynep, 2=İclal, 3=Serap}

        //clean code
        HashMap<String,String> hm3 = new HashMap<>(hm2);

        //hm3 create edildi hem de entry olarak hm2 map i parametre olarak atandı.

        HashMap<String,String> hm4 = hm2;
        //hm4 tanımlandı map olarak ve hm2 map i atama yapildi

        System.out.println("hm3 = " + hm3);//hm3 = {null=Ali, 1=Zeynep, 2=İclal, 3=Serap}

        System.out.println("hm4 = " + hm4);//hm4 = {null=Ali, 1=Zeynep, 2=İclal, 3=Serap}

       //CTE HashMap<String,Integer> hm5 = new HashMap<>(hm2);
        //birinin value data type string diğeri integer olurca CTE veriyor.





    }
}
