package io.dksifoua.leetcode.besttimetobuyandsellstock;

public class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int maxP = 0;
        int buy = prices[0], sell = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                sell = prices[i];
            }
            if (prices[i] > sell) {
                sell = prices[i];
            }

            maxP = Math.max(maxP, Math.max(sell - buy, 0));
        }

        return maxP;
    }
}
