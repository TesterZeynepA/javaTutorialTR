package ch30_Collections.C02_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Task04 {
    public static void main(String[] args) {

        //treeSet ve HashSet e 100 adet random deger ekleyin
//ve surelerini kiyaslayin
//hashset ten set olusturup eleman ekleyip bunu tree set e cevirin

        Random rnd = new Random();

        long baslaHs = System.nanoTime();
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            hashSet1.add(rnd.nextInt(1000));//0 ile 999 arasi bir değer ekler
        }
        long bitisHs = System.nanoTime();
        long sure1 = bitisHs - baslaHs;

        long baslaTs = System.nanoTime();
        TreeSet<Integer> treeSet1 = new TreeSet<>(hashSet1);
        long bitisTs = System.nanoTime();
        long sure2 = bitisTs - baslaTs;

        System.out.println("HashSet süresi: " + sure1 + " nanosaniye");
        System.out.println("TreeSet süresi: " + sure2 + " nanosaniye");
    }
}