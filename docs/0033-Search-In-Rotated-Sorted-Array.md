# [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/description/)

## Intuition

The problem requires finding a target value in a rotated sorted array. The key challenge is to achieve this in
`O(log N)` time complexity, which suggests using a binary search approach. The main insight is that even though the
array is rotated, at least one half of the array (either left or right of the middle) will always be sorted. This
property can be exploited to decide which half to discard in each step of the binary search.

## Approach

1. **Initialize Pointers:** Start with two pointers, `leftIndex` at the beginning of the array and `rightIndex` at the
   end.
2. **Binary Search Loop:** Use a while loop that continues as long as `leftIndex` is less than or equal to `rightIndex`.
3. **Find Middle:** Calculate the middle index, `middleIndex`, as the average of `leftIndex` and `rightIndex`.
4. **Check Middle:** If the element at `middleIndex` is the target, return `middleIndex`.
5. **Determine Sorted Half:**
    - **Left Half Sorted:** If `nums[leftIndex] <= nums[middleIndex]`, then the left half is sorted. Check if the target
      lies within this sorted half (`nums[leftIndex] <= target < nums[middleIndex]`).
        - If yes, move `rightIndex` to `middleIndex - 1`.
        - Otherwise, move `leftIndex` to `middleIndex + 1`.
    - **Right Half Sorted:** Otherwise, the right half must be sorted. Check if the target lies within this sorted half
      (`nums[middleIndex] < target <= nums[rightIndex]`).
        - If yes, move `leftIndex` to `middleIndex + 1`.
        - Otherwise, move `rightIndex` to `middleIndex - 1`.
6. **Return -1:** If the loop ends without finding the target, return -1.

## Complexity

- **Time complexity: O(log N)**, because each iteration of the loop halves the search space.
- **Space Complexity: O(N)**, as no additional space is used beyond the input array and a few variables.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/searchinrotatedsortedarray/Solution.java)

## Summary

This solution effectively uses a modified binary search to find the target in a rotated sorted array. By identifying
which half of the array is sorted at each step, We decide whether to search the left or right half, ensuring that the
algorithm runs in logarithmic time. This approach is efficient and well-suited for the constraints given in the problem.