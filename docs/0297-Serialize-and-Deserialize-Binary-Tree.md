# 🔐 [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/)

## 🚀 Problem Summary

Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored
in a file or memory buffer or transmitted across a network. The reverse operation, deserialization, reconstructs the
original data structure.

We needed to design an algorithm to serialize and deserialize a binary tree.

- The serialization format should ensure that a binary tree can be serialized to a string.
- This string should then be deserialized back to the **same** original tree structure.

---

## 💡 Intuition

To preserve the full structure of the binary tree, including null nodes (i.e., where a child is missing), we decided to
perform a **level-order traversal** (BFS). This way, both the node values and the "shape" of the tree (null placements)
are captured and encoded into the string.

The deserialization step simply reverses the process, using the same ordering to recreate the original tree.

---

## 🧭 Approach

### Serialize

- We used a queue to perform BFS traversal.
- For each node:
    - If it's not null, we append its value.
    - If it's null, we append the string `"null"`.
- Children are added to the queue even if they are null.
- Finally, we join the list into a string with space delimiters.

### Deserialize

- We split the input string by spaces.
- We create the root node from the first value.
- Then, we use a queue to reconstruct the tree by connecting left and right children in the same order.
- When `"null"` is encountered, we skip adding a child.

---

## ⏱️ Time and Space Complexity

### Time Complexity

- **Serialization**: `O(n)` where `n` is the number of nodes (including null placeholders).
- **Deserialization**: `O(n)` to read and reconstruct each node.

### Space Complexity

- **Serialization**: `O(n)` for storing the output string.
- **Deserialization**: `O(n)` for the queue and tree node references.

---

## 📦 Code

- [Java](../src/main/java/io/dksifoua/leetcode/serializeanddeserializebinarytree/Solution.java)

---

## 🧩 Summary

| Aspect          | Description                                          |
|-----------------|------------------------------------------------------|
| Traversal       | Level-order traversal (BFS)                          |
| Serialization   | Encodes values and nulls into space-delimited string |
| Deserialization | Rebuilds tree using queue and same value order       |
| Performance     | Linear time and space complexity                     |
| Use Cases       | Persistent storage, network transmission             |

---

## ✅ Final Thoughts

This BFS-based serialization/deserialization approach ensures structure fidelity while being straightforward to
implement. It's ideal for systems that need to store or transmit binary trees reliably across environments.