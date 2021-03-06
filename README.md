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

#Sorting

Sorting data means arranging it in a certain order, often in an array-like data structure. 
You can use various ordering criteria, common ones being sorting numbers from least to greatest or vice-versa, 
or sorting strings lexicographically.

    - Bubble Sort works by swapping adjacent elements if they're not in the desired order. 
        This process repeats from the beginning of the array until all elements are in order
    - Insertion Sort  is dividing the array into the sorted and unsorted subarrays.The sorted part is of length 1 at 
        the beginning and is corresponding to the first (left-most) element in the array
    - Selection Sort also divides the array into a sorted and unsorted subarray. Though, this time, the sorted 
        subarray is formed by inserting the minimum element of the unsorted subarray at the end of the sorted array, 
        by swapping
    - Merge Sort Merge Sort uses recursion to solve the problem of sorting more efficiently than algorithms 
        previously presented, and in particular it uses a divide and conquer approach
    - Heapsort A heap is a tree that satisfies the heap property, which is that for each node, all of its children 
        are in a given relation to it. Additionally, a heap must be almost complete. An almost complete binary 
        tree of depth d has a subtree of depth d-1 with the same root that is complete, and in which each node with 
        a left descendent has a complete left subtree. In other words, when adding a node, we always go for the 
        leftmost position in the highest incomplete level.
    - Quicksort  is another Divide and Conquer algorithm. It picks one element of an array as the pivot and sorts 
        all of the other elements around it, for example smaller elements to the left, and larger to the right.

#Queues
(https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html)
Queue represents a data structure designed to have elements inserted at the end of the queue, 
and elements removed from the beginning of the queue.

#Big O Notation - Time Complexity 

Big o notation is used to describe the performance or complexity of an argument. Big O specifically describes
the worst - case scenario and can be used to describe the execution time required or space used 
(e.g. in memory or disk)

 "O(1)" Constant runtime - executes same amount of time no matter how big the set is.
 
 "O(n)" Leaner runtime - is proportional to the input if the input value increases so the function runtime. 
 
 "O(n^2)" Exponential runtime - the time to complete is proportional to the square of the amount of Data.
 
 v very efficient has 2 inputs. 1 sort order and 2 key value. 
 e.g. BinarySearch
 
 "O(n log n)" N Log N Time Algorithms - n log n is the next class of algorithms. 
 The running time grows in proportion to n log n of the input.
 
 "O(n!)" Factorial runtime - This class of algorithms has a run time proportional to the factorial of the input size.

# Iterator
An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
It is called an "iterator" because "iterating" is the technical term for looping.
 
