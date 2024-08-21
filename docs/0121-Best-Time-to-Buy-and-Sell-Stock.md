# [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)

## Intuition

The key insight for this problem is that to maximize profit, we need to find the lowest buying price and the highest
selling price that comes after it. We can do this in a single pass through the array by keeping track of the minimum
price seen so far and updating the maximum profit if we find a better selling opportunity.

## Approach

1. **Initialization:**
    - `maxProfit` to keep track of the maximum profit (initialized to 0).
    - `buy` to keep track of the minimum price seen so far (initialized to the maximum possible integer)
2. **Iterating Through Prices:**
    - If the current price is lower than the buy price, update `buy
    - Calculate the potential profit (`price - buy`) and update `maxProfit if it's higher
3. **Return the Maximum Profit:** After iterating through all the prices, `maxProfit` will hold the maximum profit
   achievable.

## Complexity

- **Time complexity: O(n)** where `n` is the number of prices in the array. We make a single pass through the array
- **Space complexity: O(1)** since we use only a constant amount of extra space regardless of the input size.

## Code

- [Java](/src/main/java/io/dksifoua/leetcode/besttimetobuyandsellstock/Solution.java)

## Summary

This approach efficiently solves the problem of finding the maximum profit from a single buy and sell transaction. It
uses a single-pass approach, which is optimal for this problem.

**Key strengths of the implementation:**

- Efficient single-pass algorithm
- Correct handling of the constraints (buy before sell)
- Use of constant extra space