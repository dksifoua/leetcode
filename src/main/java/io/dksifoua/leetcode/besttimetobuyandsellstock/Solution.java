package io.dksifoua.leetcode.besttimetobuyandsellstock;

public class Solution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for (int price : prices) {
            if (price < buy) {
                buy = price;
            }
            maxProfit = Math.max(maxProfit, price - buy);
        }
        return maxProfit;
    }
}
