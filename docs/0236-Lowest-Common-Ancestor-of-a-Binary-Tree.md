# 🧠 [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/)

## 📘 Problem Statement

Given a **binary search tree (BST)**, find the **lowest common ancestor (LCA)** of two given nodes `p` and `q` in the
tree.

According to the definition of LCA on Wikipedia:
> “The lowest common ancestor is defined between two nodes `p` and `q` as the lowest node in `T` that has both `p` and
`q` as descendants (where we allow a node to be a descendant of itself).”

---

## 💡 Intuition

In a **Binary Search Tree (BST)**:

- All nodes in the left subtree of a node have smaller values.
- All nodes in the right subtree have larger values.

This structure allows a comparison-based traversal from the root to the correct ancestor.  
The first node encountered where the path to `p` and `q` **splits** is the **lowest common ancestor**.

---

## 🔍 Approach

The algorithm leverages the ordered nature of a BST:

1. Start at the root node.
2. At each step:
    - If both `p` and `q` are less than the current node, LCA lies in the **left subtree**.
    - If both `p` and `q` are greater than the current node, LCA lies in the **right subtree**.
    - Otherwise, the current node is the **lowest common ancestor**.
3. Stop the traversal once this condition is met.

Edge cases:

- If any of `p`, `q`, or `root` is `null`, it throws an `IllegalArgumentException`.
- If either `p` or `q` is `null`, the other node is returned, following the descendant-of-itself rule.

---

## ⏱️ Complexity

| Metric | Complexity                                               |
|--------|----------------------------------------------------------|
| Time   | `O(h)`, where *h* is the height of the BST                 |
| Space  | `O(1)`, iterative traversal with no additional memory used |

---

## 🧪 Code

- [Java](../src/main/java/io/dksifoua/leetcode/lowestcommonancestorofabinarysearchtree/Solution.java)

---

## ✅ Summary

This solution takes advantage of the binary search tree's sorted properties to efficiently locate the lowest common
ancestor without needing to traverse the entire tree. By narrowing the search space based on comparisons, it ensures an
optimal `O(h)` runtime. This approach is simple, elegant, and scalable for large trees.