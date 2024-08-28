# [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/description/)

## Intuition

Inverting a binary tree means swapping the left and right children of each node in the tree. We can achieve this by
recursively inverting the subtrees of each node, starting from the root. The recursion ensures that all nodes are
visited, and their left and right children are swapped in a bottom-up approach.

## Approach

1. **Base Case:** If the current node (root) is null, return null. This serves as the termination condition for the
   recursion.
2. **Recursive Inversion:** For each node, temporarily store its left child (`tempNode`). Then:
    - The left child of the current node (root) to the result of inverting the right child.
    - Set the right child of the current node (root) to the result of inverting `tempNode` (the original left child).
3. **Return the Inverted Root:** Once all nodes have been processed, return the root of the modified tree, which will
   now represent the inverted tree.

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the number of nodes in the tree. Each node is visited exactly once to swap
  its children.
- **Space Complexity: `O(h)`**, where `h` is the height of the tree. This represents the recursive call stack space. In
  the worst case (for a skewed tree),  `h = n` , and in the best case (for a balanced tree),  `h = log(n)`.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/invertbinarytree/Solution.java)

## Summary

The recursive solution to invert a binary tree swaps the left and right children of each node. By using recursion, we
can ensure that each node is processed efficiently and that the tree structure is completely reversed. This approach is
efficient with `O(n)` time complexity and meets the requirements for inverting a binary tree.