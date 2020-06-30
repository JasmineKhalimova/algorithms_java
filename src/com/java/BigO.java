package com.java;

public class BigO {

    public static void main(String[] args) {
        /**
         * "O(1)" Constant runtime- takes a constant amount of time to run. It's not dependent on the size of n.
         *
         */
        int n = 500;
        System.out.println("Hey - your input is: " + n);
        System.out.println("Hmm.. I'm doing more stuff with: " + n);
        System.out.println("And more: " + n);

        /**
         * "O(n)" Leaner runtime - After logarithmic time algorithms, we get the next fastest class: linear time algorithms.
         * If we say something grows linearly, we mean that it grows directly proportional to the size of its inputs.
         */
        for (int i = 0; i < n; i++) {
            System.out.println("Hey - I'm busy looking at: " + i);
            System.out.println("Hmm.. Let's have another look at: " + i);
            System.out.println("And another: " + i);
        }

        /**
         * "O(n^2)" Exponential runtime - these algorithms grow in proportion to some factor
         * exponential by the input size.
         */
        for (int i = 1; i <= Math.pow(2, n); i++){
            System.out.println("Hey - I'm busy looking at: " + i);
        }
        /**
         * "O(n log)" Logarithm runtime -Constant time algorithms are (asymptotically) the quickest.
         * Logarithmic time is the next quickest
         * One common example of a logarithmic time algorithm is the binary search algorithm
         */

        for (int i = 1; i < n; i = i * 2){
            System.out.println("Hey - I'm busy looking at: " + i);
        }

        /**
         * "O(n log n)" N Log N runtime
         */
        for (int i = 1; i <= n; i++){
            for(int j = 1; j < 8; j = j * 2) {
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
        /**
         * "O(n!)" Factorial runtime - This class of algorithms has a
         * run time proportional to the factorial of the input size.
         */
//        for (int i = 1; i <= factorial(n); i++){
//            System.out.println("Hey - I'm busy looking at: " + i);
//        }

    }
}
