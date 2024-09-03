# [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/)

## Intuition

The maximum depth of a binary tree is the length of the longest path from the root node to a leaf node. In a binary
tree, we can calculate the depth by recursively finding the maximum depth of the left and right subtrees and adding one
for the current node. This recursive approach naturally explores all paths from the root to each leaf.

## Approach

1. **Base Case:** If the root is null, the depth is 0 because there are no nodes.
2. **Recursive Depth Calculation:**
    - Recursively calculate the maximum depth of the left and right subtrees.
    - Use `Math.max()` to get the larger depth between the left and right subtrees.
    - Add `1` to account for the current node.
3. **Return the Result:** This recursion will return the maximum depth as it propagates back up from the leaf nodes to
   the root.

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the number of nodes in the binary tree. Each node is visited once to
  calculate its depth.
- **Space Complexity: `O(h)`**, where `h` is the height of the tree. This represents the space used by the call stack
  during recursion. In the worst case (a skewed tree), `h = n`, and in the best case (a balanced tree), `h = log(n)`.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/maximumdepthofbinarytree/Solution.java)

## Summary

This recursive solution calculates the maximum depth of a binary tree by exploring the depth of each subtree and taking
the maximum. It’s a straightforward and efficient approach with `O(n)` time complexity, ensuring that every node
contributes to the final depth calculation.