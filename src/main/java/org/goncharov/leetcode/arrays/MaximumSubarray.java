package org.goncharov.leetcode.arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxEndHere = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndHere = Math.max(nums[i], maxEndHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        return maxSoFar;
    }
}
