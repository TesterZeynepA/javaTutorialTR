package ch07_StringManipulations;

public class C11_valueOf_parseInt {
    public static void main(String[] args) {

        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..

        String bagis1 ="2500";
        String bagis2 ="3500";

        int yenibagis1 = Integer.valueOf(bagis1);
        int yenibagis2 = Integer.valueOf(bagis2);
        int toplamBagis = yenibagis1 + yenibagis2;
        System.out.println("toplamBagis = " + toplamBagis);




    }

}
