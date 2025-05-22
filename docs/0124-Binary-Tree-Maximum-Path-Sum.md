# 🧠 [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/description/)

## 💡 Intuition

The key insight in this problem is to realize that the maximum path **may start and end at any node**, and doesn't
necessarily pass through the root. This flexibility means that, at each node, we need to consider all possible
combinations of paths involving that node and its subtrees to determine if they contribute to a maximum.

We also must **keep track of the maximum path sum found so far**, and at each recursive call, compute the best path sum
that can be extended to the parent (which must be a linear path – not branching).

## 🔍 Approach

1. Use **post-order traversal (DFS)** to process children before the parent.
2. At each node:
    - Compute `leftSum` and `rightSum` – the maximum path sums from left and right children.
    - Update the **global result** with the maximum of:
        - The current max
        - `node.val`
        - `node.val + leftSum`
        - `node.val + rightSum`
        - `node.val + leftSum + rightSum` (a V-shaped path passing through the node)
3. Return the maximum gain that can be extended to the parent:
    - This would be the max of:
        - `node.val`
        - `node.val + leftSum`
        - `node.val + rightSum`
    - **Never return a "V" shaped path up to parent**, only linear ones are valid extensions.

This ensures that the maximum path sum is correctly propagated and updated.

## ⏱️ Complexity

- **Time Complexity:** `O(n)` where `n` is the number of nodes in the tree. Every node is visited once.
- **Space Complexity:** `O(h)` where `h` is the height of the tree due to the recursion stack.

## 🧪 Code

- [Java](../src/main/java/io/dksifoua/leetcode/binarytreemaximumpathsum/Solution.java)

## ✅ Summary

This problem highlights the importance of considering **all possible path configurations** at each node while ensuring *
*only linear paths are extended upwards**. A global variable (or wrapper) is critical to track the maximum across the
entire tree during recursion. A well-designed post-order DFS is the perfect fit for this kind of subtree-aggregate
computation.