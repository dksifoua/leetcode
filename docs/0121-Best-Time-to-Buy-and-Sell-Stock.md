# [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)

## Intuition

The basic idea is to find the lowest price to buy the stock (buy) and then find the highest price to sell the stock
after that day (sell). The goal is to maximize the difference between the selling and buying prices, which represents
the profit. It's important to note that we must buy before we sell, and we can only perform one buy and one sell
operation.

## Approach

1. Initialization:

    - Start with a `maxP` variable set to 0, representing the maximum profit.
    - Initialize `buy` and `sell` variables with the price on the first day.

2. Iterating Through Prices:

    - Loop through the array of prices starting from the second day.
    - If the current price is less than the current buy price, update buy and sell to this lower price. This step
      ensures we're considering the lowest price so far to buy the stock.
    - If the current price is higher than the current sell price, update sell to this price. This step looks for a
      higher selling price after the buying day.
    - After each iteration, update `maxP` by calculating the profit (`sell - buy) and comparing it with the current `
      maxP`. The profit is only updated if it's greater than the previous `maxP`.

3. Return the Maximum Profit:

After iterating through all the prices, `maxP` will hold the maximum profit achievable.

## Complexity

- **Time complexity: O(N)** where N is the number of days (the length of the `prices` array). This is because it requires
  a single pass through the array, checking each price once.
- **Space complexity: O(1)** since only a constant amount of extra space is used (for the variables `maxP`, `buy`,
  and `sell`).

## Code

- [Java](/src/main/java/io/dksifoua/leetcode/besttimetobuyandsellstock/Solution.java)

## Summary

This approach is optimal for several reasons:

- **Efficiency:** It efficiently finds the maximum profit with a single pass through the stock prices, avoiding the need
  for nested loops which would increase the time complexity.
- **Simplicity:** The logic is straightforward and easy to understand, focusing on updating the buy and sell prices
  based on the conditions that define the maximum profit.
- **Practicality:** The solution is practical and aligns well with real-world scenarios, where we want to buy low and
  sell high.