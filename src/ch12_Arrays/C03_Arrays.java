package ch12_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {


        // String'i array'a çevirme... split() girilen parametre değere göre String ifade parçalanır


        String str = " tam oturması için birkaç ornek daha gerekir";

        String [] yeniArr = str.trim().split(" "); // string array e çevrildi

        System.out.println("str = " + str);

        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));

        System.out.println("yeniArr.length = " + yeniArr.length);


        //task str objesinde kaç tane karakter vardır
        System.out.println("str.length() = " + str.length());

        // task str objesinde kaç tane harf kullanılmiştir print ediniz
        String bosluksuz = str.replaceAll("\\s", "");

        System.out.println("bosluksuz = " + bosluksuz); //bosluksuz = tamoturmasıiçinbirkaçornekdahagerekir

        String [] arrBosluksuz = bosluksuz.split("");

        System.out.println("Arrays.toString(arrBosluksuz) = " + Arrays.toString(arrBosluksuz));
        //Arrays.toString(arrBosluksuz) = [t, a, m, o, t, u, r, m, a, s, ı, i, ç, i, n, b, i, r, k, a, ç, o, r, n, e, k, d, a, h, a, g, e, r, e, k, i, r]

        System.out.println("arrBosluksuz.length = " + arrBosluksuz.length);//arrBosluksuz.length = 37


        System.out.println("bosluksuz.split(\"\").length = " + bosluksuz.split("").length);//37


    }
}
