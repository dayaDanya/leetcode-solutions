package org.goncharov.leetcode.arrays;

import java.util.HashMap;

/**
 * 1. Two Sum
 *
 * @author Danil Goncharov
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++){
                if (nums[j-i] + nums[j] == target){
                    return new int[] {j-i, j};
                }
            }
        }
        return null;
    }
}
