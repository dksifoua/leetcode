# [Remove Nth Node From End Of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)

## Intuition

The key insight for this problem is that we can use two pointers separated by n nodes. When the front pointer reaches
the end of the list, the back pointer will be at the nth node from the end. This allows us to find the target node in a
single pass through the list.

## Approach

1. Initialize three pointers:
    - `previous`: to keep track of the node before the one to be removed
    - `current`: points to the node that might be removed
    - `end`: the front pointer that will be `n` nodes ahead
2. Move the `end` pointer `n` steps ahead.
3. Move all pointers forward until end reaches the end of the list:
    - This positions `current` at the nth node from the end
    - `previous` will be right before the node to be removed
4. Handle edge cases:

- If `previous` is `null`, it means we're removing the head of the list
- Otherwise, remove the nth node by updating the next pointer of `previous`

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the size of the list. We traverse the list once, making it a linear time
  operation.
- **Space Complexity: `O(1)`** as we only use a constant amount of extra space for the pointers, regardless of the input
  size.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/removenthnodefromendoflist/Solution.java)

## Summary

This solution efficiently solves the problem of removing the nth node from the end of a linked list in a single pass. It
uses the two-pointer technique to find the target node without needing to know the length of the list beforehand.