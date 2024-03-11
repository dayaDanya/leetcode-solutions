package org.goncharov.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {

    @Test
    void singleNumber() {
        assertThat(1).isEqualTo(SingleNumber.singleNumber(new int[]{2, 2, 1}));
    }
    @Test
    void singleNumber1() {
        assertThat(4).isEqualTo(SingleNumber.singleNumber(new int[]{4,1,2,1,2}));
    }
    @Test
    void singleNumber2() {
        assertThat(1).isEqualTo(SingleNumber.singleNumber(new int[]{1}));
    }
}