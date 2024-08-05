# [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/description/)

## Intuition

The problem is to determine if a target integer exists within a given `m * n` matrix. The matrix has two important 
properties:

1. Each row is sorted in non-decreasing order.
2. The first integer of each row is greater than the last integer of the previous row.

These properties imply that the entire matrix can be treated as a single sorted list. Consequently, we can use binary 
search to achieve the desired `O(log(m * n))` time complexity.

## Approach

The approach involves treating the 2D matrix as a 1D sorted array and applying binary search. Here are the detailed 
steps:

1. **Initialize pointers:** Define two pointers: `leftIndex` starting at 0 and `rightIndex` at `m * n - 1` (the total 
number of elements minus one).
2. **Binary Search:**
    - Compute the middle index of the current search range.
    - Convert this 1D middle index back into 2D matrix coordinates to access the matrix element.
    - Compare the matrix element at the middle coordinates with the target:
      - If it matches the target, return `true`.
      - If the matrix element is less than the target, narrow the search to the right half by updating `leftIndex`.
      - If the matrix element is greater than the target, narrow the search to the left half by updating `rightIndex`.
3. **Termination:** If the `leftIndex` exceeds the `rightIndex`, the target is not present in the matrix. Return `false`.

## Complexity

- **Time Complexity: `O(log(m * n))`**. The binary search divides the search space in half at each step, leading to a 
logarithmic time complexity.
- **Space Complexity: `O(1)`**. The algorithm uses a constant amount of extra space for the pointers and the middle 
index calculation.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/searcha2dmatrix/Solution.java)