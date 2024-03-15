package org.goncharov.leetcode.arrays;

/**
 * 152. Maximum Product Subarray
 */
public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxEndHere = nums[0];
        int maxSoFar = nums[0];
        int minEndHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                var temp = maxEndHere;
                maxEndHere = minEndHere;
                minEndHere = temp;
            }

            maxEndHere = Math.max(nums[i], maxEndHere * nums[i]);
            minEndHere = Math.min(nums[i], minEndHere * nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        return maxSoFar;
    }
}
