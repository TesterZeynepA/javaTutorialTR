package ch30_Collections.C02_Set;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {

/*
Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
main içersinde meth return ettiği arryList'i HashSet, LinkedHashSet ve TreeSet'e atayınız.
*/
        String[] arr = {"iclal", "zerrin", "serap", "derya", "sena"};

        ArrayList<String> listArr = arrayToArrayList(arr);

        HashSet<String> hs = new HashSet<>(listArr);

        LinkedHashSet<String> LinkedHs = new LinkedHashSet<>(listArr);

        TreeSet<String> TreeSet = new TreeSet<>(listArr);

        System.out.println( listArr);
        System.out.println( hs);
        System.out.println(LinkedHs);
        System.out.println(TreeSet);
    }

    public static ArrayList<String> arrayToArrayList(String[] array) {
        ArrayList<String> cozum = new ArrayList<>(Arrays.asList(array));
        return cozum;
    }
}
