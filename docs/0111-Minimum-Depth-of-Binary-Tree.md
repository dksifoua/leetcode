# [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/description/)

## Intuition

The minimum depth of a binary tree is the length of the shortest path from the root to a leaf. Unlike the maximum depth,
which considers all paths, the minimum depth stops at the first leaf node it encounters. A recursive approach allows us
to explore each node’s depth until we reach the closest leaf, ensuring the minimum depth calculation.

## Approach

1. **Base Case:** If the root is null, the depth is `0` because there are no nodes.
2. **Handle Nodes with One Child:** If either the left or right child is null, it means that the node has only one
   child. In this case, the minimum depth must come from the non-null child, so we use `Math.max()` to find the depth of
   the non-null side.
3. **Recursive Minimum Depth Calculation:**
    - If both left and right children exist, compute the minimum depth for both subtrees and take the smaller one
      with `Math.min()`.
    - Add `1` to account for the current node.
4. **Return the Result:** The recursion will return the minimum depth by following the shortest path to a leaf node.

## Complexity

- **Time Complexity: `O(n)**, where `n` is the number of nodes in the tree. Each node is visited once to calculate its
  depth.
- **Space Complexity: `O(h)`, where `h` is the height of the tree. This represents the space used by the call stack
  during recursion. In the worst case (a skewed tree), `h = n` , and in the best case (a balanced tree), `h = log(n)`.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/minimumdepthofbinarytree/Solution.java)

## Summary

This recursive solution calculates the minimum depth by prioritizing the shortest path to a leaf node. By handling cases
where nodes have only one child separately, we ensure the correct minimum depth calculation, making this approach
efficient with O(n) time complexity.