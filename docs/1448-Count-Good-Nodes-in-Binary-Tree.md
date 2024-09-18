# [Count Good Nodes in Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/)

## Intuition

A node in the binary tree is considered “good” if its value is greater than or equal to the maximum value encountered on
the path from the root to that node. The problem can be solved efficiently using a Breadth-First Search (BFS) approach
where we maintain the maximum value encountered so far at each level of traversal.

## Approach

1. **Breadth-First Search (BFS):**
    - Use a queue to traverse the binary tree level by level.
    - Each element in the queue is a tuple (`Tuple2<TreeNode, Integer>`) consisting of the current node and the maximum
      value observed from the root to that node.
2. **Check for Good Nodes:**
    - For each node dequeued:
        - Compare its value with the maximum value in its path.
        - If the node’s value is greater than or equal to this maximum value, it is a good node, and we increment the
          result.
        - Update the maximum value for the path by taking the larger of the current node’s value and the previous
          maximum.
    - Enqueue the left and right children of the current node (if they exist) along with the updated maximum value.
3. **Return the Result:** After completing the BFS traversal, result contains the total number of good nodes.

## Complexity

- **Time Complexity: `O(n)`, where `n` is the number of nodes in the tree. Each node is visited once during the
  traversal.
- **Space Complexity: `O(n)`**, for the queue, which may hold up to `n` nodes in the worst case (e.g., for a complete
  binary tree).

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/countgoodnodesinbinarytree/Solution.java)

## Summary

This BFS solution efficiently counts the “good” nodes in a binary tree by maintaining the maximum value along each path.
Using a queue to traverse the tree ensures a level-by-level exploration, and the algorithm achieves optimal `O(n)` time
complexity. The use of a tuple makes it easy to pass and update the maximum value dynamically during traversal.