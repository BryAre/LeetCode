/*

One solution is to iterate through every element and 
see if it appears or not. This can be accomplished by 
using pointers. However, the time complexity for such a 
solution is O(n^2) which is not optimal, especially since 
the question is asking for a linear solution. Since we 
cannot do that, then we have to find another approach. 
The next best approach would be to use a hash table. The 
reason for using a hash table is because a hash table 
accepts a key and maps it to a value. The element being 
the key and the number of occurences that a number appears 
being the value of hash. The time complexity for doing such 
solution would be O(n). 

*/

import java.util.Hashtable;
import java.util.*;

class Day1 {

    public int singleNumber(int[] nums) {
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        int count = 0;
        int min = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!table.keySet().contains(nums[i])) {
                table.put(nums[i], 1);

            } else {
                count = table.get(nums[i]);
                table.put(nums[i], ++count);
            }

        }

        for (Integer o : table.keySet()) {
            if (table.get(o).equals(1)) {
                min = o;
            }
        }

        return min;
    }

    public static void main(String args[]) {

    }
}