package org.goncharov.leetcode.arrays;

/**
 * 136. Single Number
 * @author Danil Goncharov
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        var result = 0;

        for (var cur : nums) {
            result ^= cur;
        }

        return result;
    }
}
