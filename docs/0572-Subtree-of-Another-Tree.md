# 🧠 Subtree of Another Tree

## 🚀 Problem Summary

Given two binary trees, `root` and `subRoot`, determine if `subRoot` is a subtree of `root`. A subtree of a tree `tree`
is any node of `tree` and all of its descendants. The goal is to check whether there exists a subtree of `root` that
matches `subRoot` in both structure and node values.

---

## 💡 Intuition

The core idea behind this solution is to **serialize both trees** (main tree and subtree) into arrays using **preorder
traversal with `null` markers** for absent children, and then apply the **KMP (Knuth-Morris-Pratt)** pattern matching
algorithm to check if the serialized form of `subRoot` exists as a subarray in that of `root`.

This avoids expensive recursive subtree comparisons by transforming the problem into a **pattern-matching** problem over
sequences of values.

---

## 🧭 Approach

1. **Serialize Both Trees**:
    - Use **preorder traversal** (`node -> left -> right`) with explicit `null` markers to capture both structure and
      values.
    - This ensures that different tree shapes with the same values aren't mistakenly matched.

2. **Apply KMP Algorithm**:
    - Treat the serialized subtree as the **pattern** and the serialized main tree as the **text**.
    - Use the KMP string matching algorithm to efficiently search for the pattern in the text.
    - The KMP algorithm uses a **Longest Prefix Suffix (LPS)** array to skip redundant comparisons.

3. **Edge Cases**:
    - If `subRoot` is `null`, it’s trivially a subtree.
    - If `root` is `null` and `subRoot` is not, return false.

---

## ⏱️ Time and Space Complexity

### Time Complexity

- **Serialization**: `O(n)` for `root`, `O(m)` for `subRoot`, where `n` and `m` are the number of nodes.
- **LPS computation**: `O(m)`
- **KMP pattern matching**: `O(n)`
- **Overall**: `O(n + m)`

### Space Complexity

- **Serialized arrays**: `O(n + m)`
- **LPS array**: `O(m)`
- **Auxiliary stack and list**: `O(h)` in worst-case depth
- **Overall**: `O(n + m)`

---

## 📦 Code

- [Java](../src/main/java/io/dksifoua/leetcode/subtreeofanothertree/Solution.java)

---

## 🧩 Summary

| Aspect        | Description                                      |
|---------------|--------------------------------------------------|
| Technique     | Tree Serialization + KMP Pattern Matching        |
| Serialization | Preorder with null markers to preserve structure |
| Matching      | KMP ensures linear time subtree detection        |
| Performance   | Efficient and robust for large trees             |
| Trade-off     | Extra space usage in exchange for faster lookup  |

---

## ✅ Final Thoughts

This approach is both elegant and efficient, leveraging string-matching techniques in a tree context. The use of `null`
in serialization is crucial to avoid false positives due to structural ambiguity, and KMP ensures linear-time matching —
a big win over naive recursive comparison.