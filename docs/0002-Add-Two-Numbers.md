# [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/description/)

## Intuition

The key insight for this problem is that we can perform addition digit by digit, moving from least significant to most
significant, just as we would when adding numbers on paper. The linked list structure naturally supports this order of
operations since the digits are stored in reverse order.

## Approach

1. Initialize a dummy head for the result list to simplify the logic.
2. Iterate through both input lists simultaneously:
    - Sum the current digits from both lists and the carry from the previous operation.
    - Create a new node with the ones digit of the sum.
    - Carry over the tens digit to the next iteration.
3. Continue until both input lists are exhausted and there's no remaining carry.
4. Handle any remaining carry by adding an extra node if necessary.

## Complexity

- **Time Complexity: `O(max(m, n))`**, where `m` and `n` are the lengths of `l1` and `l2` respectively. We traverse both
  lists once, and the length of the result is at most `max(m, n) + 1`.
- **Space Complexity: `O(max(m, n))`** as the length of the new list is at most `max(m, n) + 1`.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/addtwonumbers/Solution.java)

## Summary

This solution efficiently solves the problem of adding two numbers represented as linked lists. It handles the addition
process digit by digit, properly managing the carry between digits.

One minor optimization could be to reuse nodes from the input lists instead of creating new nodes for each digit of the
result, which could be beneficial in memory-constrained environments.