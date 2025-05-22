# [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/)

## Intuition

In a rotated sorted array, there is a point at which the order breaks from the highest value back to the smallest value.
This is due to the rotation. For example, an array `[4, 5, 6, 7, 0, 1, 2]` was originally `[0, 1, 2, 4, 5, 6, 7]` and
rotated. We need to find this pivot point where the smallest element exists. The key observation is that if we split
the array and look at the middle element, we can determine which half of the array to search for the minimum element.

## Approach

1. **Binary Search Logic:**
    - Initialize two pointers, `leftIndex` and `rightIndex`, at the start and end of the array, respectively.
    - Check if the array between `leftIndex` and `rightIndex` is sorted. If `nums[leftIndex] <= nums[rightIndex]`, the
      array is sorted, and the smallest element is `nums[leftIndex]`.
    - Otherwise, compute the middle index, `middleIndex = (leftIndex + rightIndex) / 2`.
    - Compare `nums[middleIndex]` with `nums[rightIndex]`:
        - If `nums[middleIndex]` > `nums[rightIndex]`, the smallest value must be to the right of middleIndex. Hence,
          update `leftIndex` to `middleIndex + 1`.
        - Otherwise, the smallest value is at `middleIndex` or to the left of `middleIndex`. Hence, update `rightIndex`
          to `middleIndex.
    - Repeat the process until `leftIndex` meets `rightIndex`. The value at this index is the smallest element.

## Complexity

- **Time Complexity: O(logN)**. The algorithm performs a binary search, reducing the search space by half each time,
  leading to logarithmic time complexity.
- **Space Complexity: O(1)**. The algorithm uses a constant amount of extra space.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/findminimuminrotatedsortedarray/Solution.java)