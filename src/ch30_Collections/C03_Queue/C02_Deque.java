package ch30_Collections.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C02_Deque {
    public static void main(String[] args) {
/*
 Deque: Double Ended Queue -> Queue'larda FİFO Deque'lerde hem FİFO hem LİFO geçerli
LİFO : Last in First out

  */
        Deque <String> dq1 = new LinkedList<>(Arrays.asList("almanya", "hollanda", "fransa", "amerika", "afrika", "brezilya", "yeni zellanda"));

        System.out.println("dq1 = " + dq1);//dq1 = [almanya, hollanda, fransa, amerika, afrika, brezilya, yeni zellanda]

        dq1.add("Turkiye");

        System.out.println("dq1 = " + dq1);//dq1 = [almanya, hollanda, fransa, amerika, afrika, brezilya, yeni zellanda, Turkiye]

        System.out.println("dq1.getFirst() = " + dq1.getFirst());//dq1.getFirst() = almanya

        System.out.println("dq1.getLast() = " + dq1.getLast());//dq1.getLast() = Turkiye

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());//dq1.peekFirst() = almanya

        System.out.println("dq1.peekLast() = " + dq1.peekLast());//dq1.peekLast() = Turkiye

        System.out.println("dq1 = " + dq1);//dq1 = [almanya, hollanda, fransa, amerika, afrika, brezilya, yeni zellanda, Turkiye]

        //Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
        //Returns:
        //the head of this deque, or null if this deque is empty



        //Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
        //Returns:
        //the tail of this deque, or null if this deque is empty


        dq1.clear();

        System.out.println("dq1 = " + dq1);//dq1 = []

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());//dq1.peekFirst() = null
       // System.out.println("dq1.getFirst() = " + dq1.getFirst());//Exception in thread "main" java.util.NoSuchElementException

        Deque<String>dq2 = new LinkedList<>(Arrays.asList("almanya", "hollanda", "fransa", "amerika", "afrika", "brezilya", "yeni zellanda"));

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());//dq2.pollFirst() = almanya
        System.out.println("dq2 = " + dq2);//dq2 = [hollanda, fransa, amerika, afrika, brezilya, yeni zellanda]

        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());//dq2.removeFirst() = hollanda

        System.out.println("dq2 = " + dq2);//dq2 = [fransa, amerika, afrika, brezilya, yeni zellanda]

        System.out.println("dq2.pollLast() = " + dq2.pollLast());//dq2.pollLast() = yeni zellanda

        System.out.println("dq2 = " + dq2);//dq2 = [fransa, amerika, afrika, brezilya]

        System.out.println("dq2.removeLast() = " + dq2.removeLast());//dq2.removeLast() = brezilya
        System.out.println("dq2 = " + dq2);//dq2 = [fransa, amerika, afrika]

        dq2.clear();
        System.out.println("dq2.pollLast() = " + dq2.pollLast());//dq2.pollLast() = null

       // System.out.println("dq2.removeLast() = " + dq2.removeLast());//Exception in thread "main" java.util.NoSuchElementException

    }

}
