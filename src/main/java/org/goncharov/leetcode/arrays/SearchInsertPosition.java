package org.goncharov.leetcode.arrays;

/**
 * 35. Search Insert Position
 *
 * @author Danil Goncharov
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] n = {3, 5, 6}; //2
        System.out.println(n[(n.length - 1) / 2]);
    }

    public static int searchInsert(int[] nums, int target) {
        var first = 0;
        var last = nums.length - 1;

        while (first < last) {

            var mid = (first + last) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                first = mid + 1;
            }

            if (nums[mid] > target) {
                last = mid - 1;
            }

        }
        return nums[first] >= target ? first : first +1;
    }
}
