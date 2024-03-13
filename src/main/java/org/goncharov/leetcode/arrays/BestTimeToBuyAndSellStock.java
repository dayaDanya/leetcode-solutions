package org.goncharov.leetcode.arrays;

/**
 * 121. Best Time to Buy and Sell Stock
 *
 * @author Danil Goncharov
 */
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        var maxDiff = 0;

        var min = prices[0];


        for (int i = 1; i < prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
            }
            else {
                maxDiff = Integer.max(maxDiff, prices[i] - min);
            }
        }

        return maxDiff;
    }
}
