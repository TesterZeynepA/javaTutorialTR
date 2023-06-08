package ch07_StringManipulations;

import java.util.Scanner;

public class C10_isEmpty {
    public static void main(String[] args) {
        String hi = "hello";
        System.out.println("hi.isEmpty() = " + hi.isEmpty());//false


        //Task->  2: Girilen  isim space'den farkli en az 1 character icermediğini kontrol eden code
// create ediniz
// Task->  2 : kullanici isim girsin. siz kullancinin isim girip girmedigi kontrol edin
//        //isim girdiyse devam etsin girmediyse yeniden denesin

        Scanner input = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = input.nextLine();

        if (isim.isEmpty()) {// boşluk kabul ediyor
            System.out.println("isminizi girmeden ilerleyemezsiniz");
        }else
            System.out.println("hoşgeldin " +isim);

        if (isim.isBlank()) {// boşluk kabul etmez
            System.out.println("isminizi girmeden ilerleyemezsiniz (blank ile)");
        }else
            System.out.println("hoşgeldin (blank ile)" + isim);





    }
}
