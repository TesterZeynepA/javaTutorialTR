package ch14_ForEachLoop;

import java.util.ArrayList;

public class C03_forEachLoop {
    public static void main(String[] args) {

// task-> iki string array eleamanlarının ortak olmasını kontrol eden varsa
// ortaklari yazdirancode create ediniz.. with for-each

        String [] arr1= {"zerrin", "fatih", "mustafa", "zeynep", "iclal", "musa", "kasim", "john"};
        String [] arr2= {"chirstina", "bale", "mustafa", "zeynep", "iclal", "moossa", "reese", "angel"};

        ArrayList<String> ortak = new ArrayList<>();
        for (String str1 :arr1) {

            for (String str2 : arr2) {

            if (str1.equalsIgnoreCase(str2)) {

               ortak.add(str1);


            }

        }

        System.out.println("ortak = " + ortak);
    }
    }}

