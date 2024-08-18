# [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)

## Intuition

The idea is to treat the input array as a linked list where each element is a node, and the value of each node is the
index of the next node. Since there is a duplicate in the array, it forms a cycle. We can use two pointers, a slow
pointer and a fast pointer, to detect the cycle. The duplicate number will then be the start of the cycle.

## Approach

- **Cycle Detection:** In the first phase, we use two pointers, `slow` and `fast`, to detect the cycle. The `slow`
  pointer moves one step at a time, while the `fast` pointer moves two steps at a time. If there is a cycle, these two
  pointers will eventually meet at some point within the cycle.
- **Cycle Start Detection:** In the second phase, we reset the `slow` pointer to the starting point and move both
  pointers one step at a time. The point where they meet again is the start of the cycle, which is the duplicate number.

## Complexity

- **Time Complexity: `O(n)`**, where `n is the length of the array. Both phases of the algorithm will take at most `n`
  steps each.
- **Time Complexity: `O(1)`** as we only use two pointers, regardless of the size of the input.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/findtheduplicatenumber/Solution.java)

## Summary

The solution uses Floyd's Tortoise and Hare algorithm to detect the cycle in the array and then finds the start of the
cycle, which is the duplicate number. The time complexity is linear, and the space complexity is constant, making it an
efficient solution for this problem.