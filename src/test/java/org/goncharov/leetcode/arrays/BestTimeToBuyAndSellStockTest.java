package org.goncharov.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

//    @Test
//    void maxProfit1() {
//        assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
//    }

    @Test
    void maxProfit2() {
        assertEquals(97, BestTimeToBuyAndSellStock.maxProfit(new int[]{3, 100, 1, 4, 10}));
    }

}