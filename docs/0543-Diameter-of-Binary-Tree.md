# [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/description/)

# Intuition

The diameter of a binary tree is the longest path between any two nodes, measured by the number of edges. This path can
pass through or exclude the root. To find the diameter, we need to examine the sum of the heights of the left and right
subtrees at each node, as this provides the longest path that passes through that node.

## Approach

1. **Recursive Height Calculation with Diameter Update:**
    - Use a helper function `height` to recursively calculate the height of each subtree.
    - For each node, calculate the height of its left and right subtrees.
    - The potential diameter at each node is the sum of the heights of its left and right subtrees (
      `leftHeight + rightHeight`). Update the global diameter if this value is larger than the current maximum diameter.
    - Return the height of the current node, which is `1 + max(leftHeight, rightHeight)`.
2. **Global Diameter Tracking:**
    - Use an array diameter with a single element to keep track of the maximum diameter found so far (since Java
      does not allow primitive integers to be modified within recursive calls).
    - Start the recursive height calculation from the root, which will update the diameter as it traverses each node.
3. **Return the Result:** After traversing the tree, `diameter[0]` will contain the maximum diameter, which is the
   result.

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the number of nodes in the tree. Each node is visited once to calculate its
  height and update the diameter.
- **Space Complexity: `O(h)`**, where `h` is the height of the tree. This represents the space used by the recursive
  call stack. In the worst case (skewed tree),`h = n`, and in the best case (balanced tree), `h = log(n)`.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/diameterofbinarytree/Solution.java)

## Summary

This solution calculates the diameter of a binary tree by recursively determining the height of each subtree while
updating the diameter at each node. By calculating `leftHeight + rightHeight` at each node, we capture the longest path
passing through that node, ensuring the correct diameter is found. The approach is efficient with `O(n)` time
complexity, as it leverages a single traversal to determine both height and diameter.