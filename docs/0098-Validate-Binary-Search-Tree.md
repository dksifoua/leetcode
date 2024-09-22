# [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/description/)

## Intuition

To validate whether a binary tree is a binary search tree (BST), we need to ensure that each node satisfies the BST
property:

1. The left subtree of a node contains only nodes with keys less than the node’s key.
2. The right subtree of a node contains only nodes with keys greater than the node’s key.

The problem can be approached using a breadth-first search (BFS), where each node is checked against the valid range of
values it can have, derived from its parent nodes.

## Approach

1. **Breadth-First Search (BFS):**
    - Use a queue to traverse the tree level by level.
    - Each element in the queue is a tuple (`Tuple3<TreeNode, Long, Long>`) that contains:
        - The current node.
        - The valid minimum (`min`) value the node can have.
        - The valid maximum (`max`) value the node can have.
    - For each node, check whether its value lies within the valid range:
        - If `node.value` is not within `[min, max]`, the tree is invalid, so return `false`.
        - Otherwise, update the range for the left and right children:
            - Left child: `max` becomes the value of the current node.
            - Right child: `min` becomes the value of the current node.
2. **Return True for a Valid BST:** If the queue becomes empty without finding any violations of the BST property,
   return `true`.

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the number of nodes in the tree. Each node is processed once.
- **Space Complexity: `O(n)`**, for the queue, which may contain up to `n` nodes in the worst case (e.g., a complete
  binary tree).

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/validatebinarysearchtree/Solution.java)

## Summary

This BFS solution ensures each node is validated against the BST property by maintaining a valid range for its values,
derived from its parent nodes. The use of a queue and tuples makes the implementation clear and avoids recursion stack
overhead, providing an efficient `O(n)` time complexity.