package com.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
    /**
     * Allows you to add or remove item from anywhere in the list.
     * You can add or remove list from start or end or middle of list
     * using linked list
     * To add item to the beginning of the array with ArrayList takes much longer
     * compare to LinkedList
     * LinkedList does not care where to add item on the list time it takes around same
     * however ArrayList does if you add item at the beginning of the the ArrayList it takes much
     * longer compare adding at the end of the list
     */

    /*
     * ArrayLists manage arrays internally.
     * [0][1][2][3][4][5] ....
     */
    List<Integer> arrayList = new ArrayList<Integer>();

    /*
     * LinkedLists consists of elements where each element
     * has a reference to the previous and next element
     * [0]->[1]->[2] ....
     *    <-   <-
     */
    List<Integer> linkedList = new LinkedList<Integer>();

    doTimings("ArrayList", arrayList);
    doTimings("LinkedList" , linkedList);
    }

    private static void doTimings(String type, List<Integer> list) {

        for(int i=0; i<1E5; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        /*
        // Add items at end of list
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }
        */

        // Add items elsewhere in list
        for(int i=0; i<1E5; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
}
