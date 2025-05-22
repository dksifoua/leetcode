# [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/)

## Intuition

Given a sorted array, we need to find two numbers that sum up to a specific target. Since the array is sorted, we can
use a two-pointer technique to find the two numbers efficiently. This approach leverages the sorted nature of the array
to eliminate the need for nested loops, thus optimizing the search process.

## Approach

1. **Initialize Two Pointers:** Start with one pointer `leftIndex` at the beginning of the array and the other pointer
   `rightIndex` at the end of the array.
2. **Iterate with Two Pointers:**
    - Calculate the sum of the elements at the two pointers.
    - If the sum is less than the target, move the `leftIndex` pointer to the right to increase the sum.
    - If the sum is greater than the target, move the `rightIndex` pointer to the left to decrease the sum.
    - If the sum equals the target, return the 1-indexed positions of the two elements.
3. **Return Result:** If the loop exits without finding the target sum (which is guaranteed not to happen due to problem
   constraints), throw an `IllegalArgumentException.

## Complexity

- **Time Complexity: `O(N)`**, where `N` is the length of the array. Each element is checked at most once, making the
  time complexity linear.
- **Time Complexity: `O(1)`**, as we are using only a constant amount of extra space for the pointers and a few
  variables.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/twosum2/Solution.java)