
/**
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 *
 * If there're duplicates in arr, count them seperately.
 */

import java.util.*;

class Day7 {
    public int countElements(int[] arr) {
        Set<Integer> numbers = new HashSet<>(); // create a hashset which stores all numbers and no duplicates

        int count = 0;
        for (int i : arr) {
            numbers.add(i); // add all entries of the array into the hashset
        }

        // if the hashset contains i+1, from an entry of the array, then we add one to
        // count
        for (int i : arr) {
            if (numbers.contains(i + 1))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] ar = { 1, 1, 2, 2, 3, 3, 5 };
        Day7 d = new Day7();
        System.out.print(d.countElements(ar));
    }
}