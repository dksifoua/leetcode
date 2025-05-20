# 🧠 [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/)

## 💡 Intuition

The preorder traversal visits nodes in the order: root ➝ left ➝ right.  
The inorder traversal visits nodes in the order: left ➝ root ➝ right.

By using the preorder array, we can always identify the root of the current subtree. The inorder array then tells us how
to split the tree into left and right subtrees relative to that root. This recursive pattern enables the full
reconstruction of the tree.

## 🔍 Approach

1. Use the first element of the preorder array as the root.
2. Find this root value in the inorder array to determine the boundaries of left and right subtrees.
3. Recursively build the left subtree using the left part of both arrays.
4. Recursively build the right subtree using the right part of both arrays.
5. Use a `HashMap` to store the indices of elements in the inorder array for faster lookups.

Note: `Arrays.copyOfRange` is used to create the necessary sub-arrays for recursion, which simplifies the logic but
increases memory usage.

## ⏱️ Complexity

- **Time Complexity:** O(n²) in the worst case due to repeated array copying.
- **Space Complexity:** O(n²) also due to new arrays created at each recursive call.

This can be optimized to O(n) time and space using index pointers instead of copying arrays.

## 🧪 Code

- [Java](../src/main/java/io/dksifoua/leetcode/constructbinarytreefrompreorderandinordertraversal/Solution.java)

## ✅ Summary

This solution leverages the structure of preorder and inorder traversals to recursively build the binary tree. While
straightforward and readable, the use of array slicing at each step causes inefficiencies in time and space. It can be
further optimized using indices and shared state.