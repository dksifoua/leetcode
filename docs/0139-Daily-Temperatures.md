# [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/description/)

## Intuition

To solve the problem of finding how many days one must wait until a warmer temperature occurs, it’s intuitive to track
the temperatures and their indices in a way that allows quick access to the nearest day with a higher temperature.
Utilizing a stack is efficient for this purpose because it allows us to maintain a decreasing sequence of temperatures
and easily find the next greater element for each day.

## Approach

The main idea is to traverse the list of temperatures from the last day to the first. We use a stack to keep the indices
of the days. The key is to maintain the stack in such a way that the temperatures corresponding to the indices are in a
monotonically decreasing order. Here’s a step-by-step breakdown:

1. **Initialize:** Create a result array of the same length as the temperatures array, filled initially with zeros. Also
   , prepare an empty stack to hold indices of the temperatures array.
2. **Traverse from the end:** Loop through the temperatures array starting from the last day back to the first day. For
   each day’s temperature:
    - **Maintain Stack Order:** While the stack is not empty and the current day’s temperature is greater than or equal
      to the temperature of the day indexed at the top of the stack, pop the stack. This step ensures that the stack
      only
      contains days ahead of the current day when the temperature is higher than the current day’s temperature.
    - **Calculate Result:** If the stack is not empty after the above operation, the difference between the top index in
      the stack and the current index gives the number of days until a warmer temperature. This is because the stack’s
      top
      now represents the nearest future day with a higher temperature.
    - **Update Stack:** Push the current day’s index onto the stack.
3. **Finalize:** By the end of the loop, the result array will be filled with the required values, where each entry at
   index `i` tells the number of days one needs to wait from day `i` to get a warmer day. If no such day exists, the
   value
   remains zero.

## Complexity

- **Time Complexity: `O(N)`**, where `N` is the number of days (length of the temperatures array). Each element is
  processed a constant number of times (pushed and popped from the stack at most once).
- **Space Complexity: `O(N)`**, since the stack can potentially store all indices in the worst case, and we also use an
  additional array of size `N` for the result.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/dailytemperatures/Solution.java)