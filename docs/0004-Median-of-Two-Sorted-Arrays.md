# [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/description/)

## Intuition

To find the median of two sorted arrays, we can take advantage of their sorted nature and avoid brute force merging and
sorting, which would result in an `O(m+n)` complexity. Instead, we aim to exploit binary search on one of the arrays to
reduce the time complexity to `O(log(min(m, n)))`. The intuition behind this approach is to partition the arrays into
two halves such that the left half contains the smaller elements, and the right half contains the larger elements. This
way, we can directly calculate the median based on the partitioning.

## Approach

1. **Recursive Handling of Array Sizes:** The function first ensures that we always perform the binary search on the
   smaller array (`nums1`). This ensures the search space is minimized.
2. **Binary Search and Partitioning:** We calculate the middle index for `nums1` and determine the corresponding
   partition index for `nums2`. The goal is to ensure that the elements in the left partitions of both arrays are
   smaller than the elements in the right partitions.
3. **Conditions to Find the Median:**
    - If the largest element in the left partition of `nums1` is smaller than or equal to the smallest element in the
      right partition of `nums2`, and vice versa, then we have correctly partitioned the arrays.
    - If the total length of both arrays is odd, the median is the maximum of the left partition.
    - If the total length is even, the median is the average of the maximum of the left partition and the minimum of the
      right partition.
4. **Adjusting the Partition:** If the current partitioning does not meet the conditions, the binary search is adjusted
   by either moving the partition in `nums1` to the left or right, depending on the comparison of boundary elements.

## Complexity

- **Time Complexity: `O(log(min(m, n)))`**. The binary search is performed on the smaller array, so the time complexity
  is logarithmic in the size of the smaller array.
- **Space Complexity: `O(1)`** as no additional space beyond a few variables is used.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/medianoftwosortedarrays/Solution.java)

## Summary

This solution uses a binary search technique to find the correct partitioning of two sorted arrays, allowing us to find
the median in `O(log(min(m, n))) time. By focusing on partitioning the arrays into equal halves and ensuring the left
half contains all smaller elements, we can calculate the median without merging the arrays. This method is efficient and
meets the problem’s time complexity requirement.