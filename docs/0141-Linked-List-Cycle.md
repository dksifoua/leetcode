# [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/description/)

## Intuition

The key insight for this problem is the use of Floyd's Cycle-Finding Algorithm, also known as the "tortoise and hare"
algorithm. If there is a cycle, two pointers moving at different speeds will eventually meet at some point in the cycle.

## Approach

1. Initialize two pointers, `slow`' and `fast`, both starting from the head of the list.
2. Move the slow pointer one step at a time and the fast pointer two steps at a time.
3. If there's a cycle, the fast pointer will eventually catch up to the slow pointer, and they will meet.
4. If there's no cycle, the fast pointer will reach the end of the list (`null`).

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the number of nodes in the linked list. In the worst case (no cycle), we
  traverse the entire list once. If there is a cycle, we will detect it before or when the fast pointer completes one
  loop of the cycle.
- **Space Complexity: `O(1)`** as we only use two pointers, regardless of the size of the input.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/linkedlistcycle/Solution.java)

## Summary

The solution efficiently implements Floyd's Cycle-Finding Algorithm to detect a cycle in a linked list. It uses constant
extra space and linear time, making it an optimal solution for this problem.