# [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/description/)

## Intuition

The problem involves finding the largest rectangle that can be formed in a histogram represented by an array of integers
, where each integer denotes the height of a bar, and each bar has a width of 1. The key challenge is to efficiently
determine the maximum rectangular area that can be formed using these bars.

## Approach

To solve this problem, we can use a stack-based approach, which helps efficiently manage and track the heights of the
bars and their indices. The main idea is to leverage the properties of the stack to keep track of the bars in increasing
order of heights, and compute areas whenever we encounter a bar that is shorter than the bar on top of the stack. Here’s
a step-by-step explanation of the approach:

1. **Initialize Stack and Max Area:**
    - We initialize an empty stack to keep track of indices of the histogram bars.
    - We also initialize `maxArea` to `0`, which will store the maximum rectangular area found.
2. **Iterate Through Bars:** For each bar in the histogram, we perform the following:
    - While the stack is not empty and the current bar’s height is less than the height of the bar at the index stored
      on the top of the stack, we do the following:
        - Pop the index from the stack.
        - Calculate the width of the rectangle formed using the popped bar’s height. The width is determined by the
          difference between the current index and the index of the new top of the stack (after popping). If the stack
          is
          empty, the width is the current index itself.
        - Calculate the area using the height of the popped bar and the calculated width.
        - Update `maxArea` if the calculated area is greater than the current `maxArea`.
    - Push the current index onto the stack.
3. **Handle Remaining Bars in Stack:** After processing all bars, there may still be indices left in the stack. For
   these indices, we repeat the process of popping, calculating the width, and updating the area as described above.
4. **Return Result:** Finally, return the `maxArea`, which now holds the area of the largest rectangle found in the
   histogram.

## Complexity

- **Time Complexity: `O(N)`**: Each bar is pushed and popped from the stack at most once, leading to a linear time
  complexity.
- **Space Complexity: `O(N)`**: In the worst case, all indices could be stored in the stack, leading to linear space
  complexity.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/largestrectangleinhistogram/Solution.java)