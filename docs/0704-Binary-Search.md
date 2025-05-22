# [Binary Search](https://leetcode.com/problems/binary-search/description/)

## Intuition

The problem is to find the index of a target value within a sorted array of integers. The constraint that the array is
sorted allows us to utilize a binary search algorithm, which is known for its `O(log N)` runtime complexity. This
efficiency is achieved by repeatedly dividing the search interval in half until the target value is found or the
interval is empty.

## Approach

The binary search algorithm works as follows:

1. **Initialize Pointers:** Start with two pointers, `leftIndex` at the beginning (0) and `rightIndex` at the end (
   length of the array - 1).
2. **Iterative Search:**
    - Calculate the middle index of the current search interval.
    - Compare the target value with the middle element of the array.
        - If the target is equal to the middle element, return the middle index.
        - If the target is less than the middle element, narrow the search interval to the left half by moving the
          `rightIndex` to `middleIndex - 1`.
        - If the target is greater than the middle element, narrow the search interval to the right half by moving the
          `leftIndex` to `middleIndex + 1`.
3. **Termination:** The loop terminates when `leftIndex` exceeds `rightIndex`, indicating the target is not in the array
   . In this case, return `-1`.

## Complexity

- **Time Complexity: `O(log N)`:** Binary search repeatedly divides the search interval in half, leading to a
  logarithmic time complexity.
- **Space Complexity: `O(1)`:** The algorithm uses a constant amount of extra space for the pointers and the middle
  index calculation.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/binarysearch/Solution.java)