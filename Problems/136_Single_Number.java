
/**
 * Problem: Given a non-empty array of integers, every element appears twice
 * except for one. Find that single one.
 * 
 * One solution is to iterate through every element and see if it appears or
 * not. This can be accomplished by using pointers. However, the time complexity
 * for such a solution is O(n^2) which is not optimal, especially since the
 * question is asking for a linear solution. Since we cannot do that, then we
 * have to find another approach. The next best approach would be to use a hash
 * table. The reason for using a hash table is because a hash table accepts a
 * key and maps it to a value. The element being the key and the number of
 * occurences that a number appears being the value of hash. The time complexity
 * for doing such solution would be O(n).
 */

import java.util.*;

class Day1 {

    public int singleNumber(int[] nums) {
        // create a hashtable that accepts an int as key and an int as value
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        int count = 0;
        int singleNum = 0;

        for (int i = 0; i < nums.length; i++) {
            // if the key is not in the table, then we assign 1 as a value
            if (!table.keySet().contains(nums[i])) {
                table.put(nums[i], 1);

            } else { // if the key is in the table, then we update the value by using value of hash.
                count = table.get(nums[i]);
                table.put(nums[i], ++count);
            }
        }

        /*
         * gets the value of the hash by using the keys and looping //though them. If
         * the value is equal to 1 then that means that that number is the single
         * number.
         */
        for (Integer o : table.keySet()) { // iterates through all of the keys
            if (table.get(o).equals(1)) {
                singleNum = o;
            }
        }
        return singleNum;
    }

    public static void main(String args[]) {

    }
}