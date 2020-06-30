package com.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sortedmaps {
    /**
     * LinkedHashMap is just like HashMap with an additional feature of
     * maintaining an order of elements inserted into it.
     */
    public static void main(String[] args) {
        // does not guarantee order
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        // Maintain the order the way you put elements in and the same was it executed
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        // Sort the key in natural order e.g 1, 2, 3, 4 and so on.
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        testMap(linkedHashMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");

        for(Integer key: map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }
}
