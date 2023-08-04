package ch30_Collections.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
 Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
 ile obj uretilir.
 Eczane yemekhane banka vs belirli şart ile aksiyon alan elemanlar için kullanılır.
 Cons seçimine göre queue obj özelliklieri belirlenir.
 FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenişr enbaştan silinir

   peek()-> copt-paste gibi ilk elemanı return eder ama silmez
poll()-> cut-paste gibi ilk elemanı siler ve  return eder
element() -> ilk elemanı silmeden return eder.
remove() -> ilk elemnı siler ve return eder..
  */

        Queue<String>q1 = new LinkedList<>(Arrays.asList("almanya", "hollanda", "fransa", "amerika", "afrika", "brezilya", "yeni zellanda"));

        System.out.println("q1 = " + q1);//q1 = [almanya, hollanda, fransa, amerika, afrika, brezilya, yeni zellanda]

        q1.add("turkiye");

        System.out.println("q1 = " + q1);//q1 = [almanya, hollanda, fransa, amerika, afrika, brezilya, yeni zellanda, turkiye]


        Queue<String>q2 = new PriorityQueue<>(Arrays.asList("almanya", "hollanda", "fransa", "amerika", "afrika", "brezilya", "yeni zellanda"));

        System.out.println("q2 = " + q2);//q2 = [afrika, almanya, brezilya, amerika, hollanda, fransa, yeni zellanda]
        q2.add("turkiye");
        q2.add("andorra");

        System.out.println("q2 = " + q2);//q2 = [afrika, almanya, brezilya, amerika, hollanda, fransa, yeni zellanda, turkiye, andorra]

        System.out.println("q2.peek() = " + q2.peek());//q2.peek() = afrika
        System.out.println("q2.remove() = " + q2.remove());//q2.remove() = afrika

        System.out.println("q2 = " + q2);//q2 = [almanya, amerika, brezilya, andorra, hollanda, fransa, yeni zellanda, turkiye]

        System.out.println("q2.poll() = " + q2.poll());//q2.poll() = almanya

        System.out.println("q2 = " + q2);//q2 = [amerika, andorra, brezilya, turkiye, hollanda, fransa, yeni zellanda]

        System.out.println("q2.element() = " + q2.element());//q2.element() = amerika

        System.out.println("q2 = " + q2);//q2 = [amerika, andorra, brezilya, turkiye, hollanda, fransa, yeni zellanda]

        //poll ve remove farki eger Queue boş ise remove methodu nullpointerexception atar
        //pool ise null return eder

        q1.clear();
        System.out.println("q1 = " + q1);//q1 = []

        System.out.println("q1.poll() = " + q1.poll());//q1.poll() = null

       // System.out.println("q1.remove() = " + q1.remove());//Exception in thread "main" java.util.NoSuchElementException

        System.out.println("q1.offer(\"madagascar\") = " + q1.offer("madagascar"));//q1.offer("madagascar") = true

        System.out.println("q1 = " + q1);//q1 = [madagascar]

        //offer add farki
        //eger eleman kisitlaması varsa add methodu exception fırlatır,  offer methodu false return eder...
        //add add IllegalStateException ediyor...


    }
}
