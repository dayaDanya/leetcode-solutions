package org.goncharov.leetcode.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ProductOfArrayExceptSelfTest {

    @Test
    void productExceptSelf() {
        assertThat(new int[]{24, 12, 8, 6}).isEqualTo(ProductOfArrayExceptSelf.productExceptSelf(new int[] {1, 2, 3, 4}));
    }
}