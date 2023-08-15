package ch07_StringManipulations;

public class C08_equals_equalsIgnoreCase {
    public static void main(String[] args) {

        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
/**
 * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
 * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
 */

    String str1 = "Merhaba";
    String str2 = "merhaba";

        System.out.println("str1 replace oncesi = " + str1);

        System.out.println("str1.replace(\"\\\\w\" , \"*\") = " + str1.replaceAll("\\w", "*"));

        //regex karakterler sadece replaceAll de calışıyor

        System.out.println("str1 replace sonrasi = " + str1); //str1 replace sonrasi = merhaba

        System.out.println("str1.equals(\"str2\") = " + str1.equals("str2"));//false
        System.out.println("str2.equals(\"str1\") = " + str2.equals("str1"));//false

        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));//true


        str2 = "Merhaba"; // str2 nin degeri update edildi yeniden atama yapıldı.
        System.out.println("str1.equals(str2) = " + str1.equals(str2)); //true

    String s1 = "ahmet";//jvm s1 ve s2 yi String
    String s2 = "ahmet";
        String s3 = new String ("zeynep");
        String s4 = new String ("zeynep");
        System.out.println("(s1==s2) = " + (s1 == s2));//(s1==s2) = true
        System.out.println("s1.equals(s2) = " + s1.equals(s2));//s1.equals(s2) = true
        System.out.println("(s3 ==s4) = " + (s3 == s4));//(s3 ==s4) = false
        System.out.println("s3.equals(s4) = " + s3.equals(s4));//s3.equals(s4) = true

        System.out.println("(s1==s3) = " + (s1 == s3));//false
        System.out.println("s1.equals(s3) = " + s1.equals(s3));//false




    }
}
