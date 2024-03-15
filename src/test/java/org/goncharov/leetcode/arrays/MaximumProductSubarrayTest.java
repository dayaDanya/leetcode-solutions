package org.goncharov.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayTest {

    @Test
    void maxProduct() {
        assertEquals(24, MaximumProductSubarray.maxProduct(new int[] {-2, 3, -4}));
    }
}