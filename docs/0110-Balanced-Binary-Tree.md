# [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/description/)

## Intuition

A binary tree is considered height-balanced if the depth of the left and right subtrees of every node differ by no more
than one. To check if a tree is balanced, we can use a depth-first search (DFS) to compute the height of each subtree
and simultaneously check for balance at each node.

## Approach

1. **DFS for Height and Balance Check:**
    - Use a helper method `dfsHeight to recursively calculate the height of each subtree.
    - For each node, calculate the heights of its left and right subtrees.
    - If the difference in height between the left and right subtrees is greater than 1, set a result flag to false,
      indicating the tree is not balanced.
    - Return the height of the current node as `1 + max(left, right)` to propagate the height up the recursion stack.
2. **Global Balance Tracking:**
    - Use a boolean array result initialized to true. If any node is found to be unbalanced, the result flag is set to
      false.
    - Start the recursive check from the root node.
3. **Return the Result:** After the recursion completes, result[0] will indicate whether the tree is balanced.

## Complexity

- **Time Complexity: `O(n`**, where `n` is the number of nodes in the tree. Each node is visited once to calculate its
  height and check for balance.
- **Space Complexity: `O(h)`**, where `h` is is the height of the tree. This represents the space used by the recursive
  call stack. In the worst case (skewed tree), `h = n`, and in the best case (balanced tree), `h=log(n)`.

## Summary

This solution determines if a binary tree is balanced by recursively calculating the height of each subtree while
checking the balance condition at each node. By tracking the balance in a boolean array, we ensure efficient checking
with a single traversal. The approach meets the requirements with `O(n) time complexity.