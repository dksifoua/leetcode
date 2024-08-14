# [Reorder List](https://leetcode.com/problems/reorder-list/description/)

## Intuition

The problem requires rearranging a singly linked list in a specific pattern (interleaving nodes from the beginning and
end of the list) without modifying the node values. The key insight is that we can split this task into three main
steps: finding the middle of the list, reversing the second half, and then merging the two halves in the required order.
This approach allows us to solve the problem in-place, without using extra space for a new list.

## Approach

1. **Find the middle of the list:**
    - Use the **tortoise and hare** method with two pointers moving at different speeds.
    - The slow pointer (`middle`) moves one step at a time, while the fast pointer (`current`) moves two steps.
    - When the fast pointer reaches the end, the slow pointer will be at the middle.
2. **Reverse the second half of the list:**
    - Use the standard iterative method (each node is place at the head of the list) to reverse a linked list.
    - Keep track of the previous, current, and next nodes while reversing the links.
3. **Merge the two halves:**
    - Interleave nodes from the first half and the reversed second half.
    - Adjust pointers to create the new ordering.

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the number of nodes in the list. We traverse the list once to find the
  middle, once to reverse the second half, and once to merge the halves.
- **Space Complexity: `O(1)`**, as we only use a constant amount of extra space regardless of the input size. The
  reordering is done in-place.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/reorderlist/Solution.java)

## Summary

This solution efficiently solves the problem by using a combination of well-known linked list techniques. The approach
of splitting, reversing, and merging is both intuitive and optimal in terms of time and space complexity.

**Key points of the implementation:**

- The use of multiple pointers in findMiddle to accurately split the list.
- In-place reversal of the second half in the reverse method.
- Careful pointer manipulation in the merge method to interleave the nodes correctly.
