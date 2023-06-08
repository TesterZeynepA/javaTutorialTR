package Challange02;

public class Task01_Modulus {
    public static void main(String[] args) {
// verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru print eden code create ediniz.
// Hint: use / and %
//    input: 12345
//    output: 1
//            2
//            3
//            4
//            5



        int sayi = 12345;
        int birler = sayi %10;
        int onlar= (sayi/10)%10;
        int yüzler = (sayi/100)%10;
        int binler = (sayi/1000)%10;
        int onbinler = (sayi/10000)%10;
        System.out.println("birler : " + birler+"\nonlar : "+onlar+"\nyüzler : "+yüzler+"\nbinler : " + binler+"\nonbinler : "+onbinler);
















    }
}
