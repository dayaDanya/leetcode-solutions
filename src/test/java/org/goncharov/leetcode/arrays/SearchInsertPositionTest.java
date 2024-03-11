package org.goncharov.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
class SearchInsertPositionTest {

    @Test
    void searchInsert1() {
        assertThat(0).isEqualTo(SearchInsertPosition.searchInsert(new int[]{3,5,6}, 2));
    }

    @Test
    void searchInsert2() {
        assertThat(1).isEqualTo(SearchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    void searchInsert3() {
        assertThat(4).isEqualTo(SearchInsertPosition.searchInsert(new int[]{1,3,5,6}, 7));
    }
}