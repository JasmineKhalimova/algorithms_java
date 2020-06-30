# algorithms_java
Algorithms with Java

#ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.
The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
(if you want to add or remove elements to/from an array, you have to create a new one). 
While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different.

#LinkedList
The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. 
This means that you can add items, change items, remove items and clear the list in the same way.
However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.
     * LinkedList does not care where to add item on the list time it takes around same
     * however ArrayList does if you add item at the beginning of the ArrayList it takes much
     * longer compare adding at the end of the list
     
#HashMap
HashMap store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
One object is used as a key (index) to another object (value). It can store different types: String keys and Integer 
values, or the same type, like: String keys and String values.
