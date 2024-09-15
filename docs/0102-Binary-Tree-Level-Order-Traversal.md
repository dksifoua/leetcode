# [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/description/)

## Intuition

Level-order traversal of a binary tree involves visiting nodes level by level from left to right. This can be
efficiently achieved using a Breadth-First Search (BFS) approach with a queue. By processing all nodes at each level
before moving to the next, we can group node values by levels in the output.

## Approach

1. **Breadth-First Search (BFS):**
    - Use a queue to traverse the tree level by level.
    - Track the level of each node during traversal using a tuple (`Tuple2<TreeNode, Integer>`), where the first value
      is the node, and the second value is the level of the node.
2. **Group Nodes by Level:**
    - Maintain a list of lists (`result`), where each inner list represents the values of the nodes at a specific level.
    - For each node dequeued, check its level:
        - If the level already exists in the result list, add the node’s value to the corresponding inner list.
        - Otherwise, create a new list for the current level and add it to result.
3. **Queue Updates:**
    - Add the left and right children of the current node to the queue with their respective levels (
      `current level + 1`).
    - Continue until the queue is empty.

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the number of nodes in the tree. Each node is visited once during the
  traversal.
- **Space Complexity: `O(n)`**, for the queue and the result list. The queue may hold up to `n` nodes in the worst
  case (complete binary tree).

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/binarytreelevelordertraversal/Solution.java)

## Summary

This solution leverages BFS to perform level-order traversal efficiently, maintaining level information using a tuple.
The result list groups node values by level, providing a clear and structured output. The approach is optimal with
`O(n)` time complexity for traversal and O(n) space for storing results.