# [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/description/)

This solution is designed to check for duplicate values in an array of integers. The core idea revolves around utilizing a `Set` data structure, specifically a `HashSet`, to track the uniqueness of elements in the array. Here's a breakdown of the solution:

## Intuition

The primary intuition behind using a `Set` is that this data structure is inherently designed to store unique elements. When an element is added to a `Set`, it checks if the element already exists. If it does, the `Set` remains unchanged. This property of a `Set` is leveraged in this solution to identify duplicates in the array.

## Approach

1. **Initialize a `HashSet`:** A `HashSet` named `uniqueNumbers` is created to store the elements of the array. The choice of `HashSet` is due to its efficient `O(1)` average time complexity for `add` and contains operations.

2. **Iterate Through the Array:** The method iterates over each element in the nums array.

3. **Check for Duplicates:** For every element (`num`) in the array:
   - The method checks if `num` is already in the `HashSet` using `uniqueNumbers.contains(num)`.
   - If `num` is found in the `HashSet`, it means `num` is a duplicate, and the method immediately returns `true`.

4. **`add` Element to `HashSet`:** If `num` is not found in the `HashSet`, it is added using `uniqueNumbers.add(`num`)`. This step ensures that the `HashSet` always contains the unique elements encountered so far in the array.

5. **Return False if No Duplicates Found:** If the method completes iterating through the array without finding any duplicates, it returns `false`.

## Complexity

- **Time Complexity: `O(N)`**, where N is the number of elements in the array. Each element is checked exactly once to see if it is in the `HashSet`, and this check is `O(1)` on average due to the nature of hash-based data structures.

- **Space Complexity: `O(1)`** in the worst case. This happens when all elements in the array are distinct, causing the `HashSet` to grow to the size of the array.

## Code

- [Java](/src/main/java/io/dksifoua/leetcode/containsduplicate/Solution.java)

## Summary

The solution is efficient and straightforward, using the unique properties of a `HashSet` to detect duplicates with a single pass through the array. The `O(N)` time complexity makes it suitable for large arrays, and the approach avoids the need for nested loops or additional sorting, which could increase the time complexity.