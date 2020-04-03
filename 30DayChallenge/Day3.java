
/**
 * Given an integer array nums, find the contiguous subarray 
 * (containing at least one number) which has the largest 
 * sum and return its sum.
 */

import java.util.*;

class Day3 {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        for (int i : nums) {
            if (windowSum < 0)
                windowSum = i;
            else
                windowSum += i;
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {

    }
}