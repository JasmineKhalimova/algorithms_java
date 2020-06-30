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

#LinkedHashMap
LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it. 
HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of 
insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order.

#Sets
The set interface present in the java.util package and extends the Collection interface is an unordered collection 
of objects in which duplicate values cannot be stored. It is an interface which implements the mathematical set. 
This interface contains the methods inherited from the Collection interface and adds a feature 
which restricts the insertion of the duplicate elements.
There are two interfaces which extend the set implementation namely SortedSet and NavigableSet.
(https://docs.oracle.com/javase/7/docs/api/java/util/Set.html)

Examples of sets: (https://www.geeksforgeeks.org/set-in-java/?ref=lbp)
- EnumSet: EnumSet is one of the specialized implementation of Set interface for use with the enumeration type.
- HashSet: The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance. 
No guarantee is made as to the iteration order of the set which means that the class does not guarantee the constant 
order of elements over time. This class permits the null element. The class also offers constant time performance 
for the basic operations like add, remove, contains and size assuming the hash function disperses the elements 
properly among the buckets, which we shall see further in the article.
- TreeSet: TreeSet is one of the most important implementations of the SortedSet interface in Java that uses 
a Tree for storage. The ordering of the elements is maintained by a set using their natural ordering whether 
or not an explicit comparator is provided. This must be consistent with equals if it is to correctly implement 
the Set interface. It can also be ordered by a Comparator provided at set creation time, depending on which 
constructor is used. The TreeSet implements a NavigableSet interface by inheriting AbstractSet class.





