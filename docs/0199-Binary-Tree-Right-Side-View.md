# [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/description/)

## Intuition

The “right side view” of a binary tree consists of the nodes that are visible when looking at the tree from the right.
This corresponds to the last node at each level when traversed from top to bottom. Using a level-order traversal (BFS)
ensures that we visit nodes level by level and can easily determine the rightmost node at each level.

## Approach

1. **Breadth-First Search (BFS):**
    - Use a queue to perform a level-order traversal of the tree. Each element in the queue contains a tuple2 of the
      current node and its level.
    - Keep track of the rightmost node at each level. The last node processed for a given level during BFS is the
      rightmost node for that level.
2. **Tracking Nodes by Level:**
    - Use a `List<Integer>` to store the values of the rightmost nodes at each level.
    - If the current level is already in the list, overwrite the value since we encounter the rightmost node last during
      BFS. If the level is not in the list, add it.
3. **Returning the Result:** Once the traversal is complete, the list will contain the values of the rightmost nodes for
   each level from top to bottom.

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the number of nodes in the tree. Each node is visited once during the BFS.
- **Space Complexity: `O(n)`**, due to the space used by the queue in the worst case (for a complete binary tree).

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/binarytreerightsideview/Solution.java)

## Summary

This solution efficiently computes the right side view of a binary tree using BFS. By maintaining the rightmost node at
each level, the algorithm ensures an optimal O(n) traversal while keeping track of level information with minimal
overhead.