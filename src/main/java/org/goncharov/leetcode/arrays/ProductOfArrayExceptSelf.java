package org.goncharov.leetcode.arrays;

import java.util.Arrays;

/**
 * 238. Product of Array Except Self
 */
public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        var answer = new int[nums.length];
        Arrays.fill(answer, 1);
        var leftProduct = 1;
        var rightProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] *= leftProduct;
            leftProduct *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return answer;
    }
}
