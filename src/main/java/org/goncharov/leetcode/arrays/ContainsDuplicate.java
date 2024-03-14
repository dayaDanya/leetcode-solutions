package org.goncharov.leetcode.arrays;

import java.util.HashMap;

/**
 * @author Danil Goncharov
 * 217. Contains Duplicate
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null) return false;
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var number = map.putIfAbsent(nums[i], i);
            if (number != null)
                return true;
        }
        return false;
    }
}
