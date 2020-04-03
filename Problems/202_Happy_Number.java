import java.util.*;

/**
 * Write an algorithm to determine if a number is "happy".
 * 
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers.
 * 
 */

class Day2 {

    // finds the sum of the squares of a number
    public static int number(int n) {
        int tempSum = 0;

        int temp = 0;
        String c = String.valueOf(n);

        for (int i = 0; i < c.length(); i++) {
            temp = Integer.parseInt(String.valueOf(c.charAt(i)));
            tempSum += (temp * temp);
        }
        return tempSum;
    }

    /**
     * while the number is not 1 or 4 iterates over again. However, if the number is
     * 4 then we cannot continue because 4 is a not part of the loop condition since
     * it is not a happy number.
     */
    public static boolean isHappy(int n) {

        while (n != 1 && n != 4) {
            n = number(n);
        }

        if (n == 1)
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.print(isHappy(4));
    }

}