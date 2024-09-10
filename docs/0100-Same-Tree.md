# [Same Tree](https://leetcode.com/problems/same-tree/description/)

## Intuition

To determine if two binary trees are the same, we need to check if they are structurally identical and if each
corresponding node has the same value. This can be efficiently done using a recursive approach that compares each node
pair-wise.

## Approach

1. **Base Cases:**
    - If both nodes (`p` and `q`) are null, they are considered the same, so return true.
    - If one of the nodes is null and the other is not, they are not the same, so return false.
    - If the values of `p` and `q` are different, return false since this indicates they are not identical.
2. **Recursive Comparison:*
    - Recursively check the left children of `p` and `q`.
    - Recursively check the right children of `p` and `q`.
    - Both left and right subtrees must match for the trees to be considered identical.
3. **Return the Result:** Use the && operator to ensure that the current nodes have the same value and that both left
   and right subtrees are identical.

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the number of nodes in the smaller tree (if both trees have the same
  structure, then `n` is the total number of nodes in either tree). Each node is visited once.
- **Space Complexity: `O(h)`**, where `h` is the height of the tree. This represents the maximum depth of the recursion
  stack. In the worst case (for a skewed tree), `h = n`; in the best case (for a balanced tree), `h = log(n)`.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/sameTree/Solution.java)

## Summary

This solution checks if two binary trees are the same by recursively comparing each node’s value and structure. By
traversing both trees simultaneously, we ensure that they are identical in both structure and values, achieving an
efficient `O(n) time complexity.