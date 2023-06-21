package Challange07;

import java.util.Scanner;

public class Task01 {
    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str = input.next();

        System.out.println("dizim(str) = " + dizim(str));


    }

    private static boolean dizim(String str) {
        int strUzunluk = str.length();
        //içinde "xyz" dizimi arayabilmek için String ifadenin uzunluğunun en az 3 olması gerekir

        if (strUzunluk < 3) {
            return false;
        }
        for (int i = 0; i < strUzunluk - 2; i++) {

            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {

                return true;
            }


        }

        return false;
    }


    private static boolean xyzVarMi1(String str) {
        return str.contains("xyz")?true:false;
    }

    private static boolean xyzVarMi2(String str) {
        if (str.contains("xyz")){
            return true;
        }else return false;
    }
    private static String xyzVarMi3(String str) {
        return str.contains("xyz")?"Agam girdigin xyz içeririr bizimlezın ":"xyz içermez bizimle değılsın ";
    }

    private static void xyzVarMi4(String str) {
        System.out.println(str.contains("xyz") ? "Agam girdigin xyz içeririr bizimlezın " : "xyz içermez bizimle değılsın ");
    }

}
