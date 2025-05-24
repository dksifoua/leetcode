# 🧠 [Word Search II](https://leetcode.com/problems/word-search-ii/description/)

## 💡 Intuition

We need to search for all words from a given list that can be formed by traversing adjacent letters on a 2D grid. The
brute-force approach would involve scanning the board for each word, which is inefficient. Instead, we build a **Trie
** (prefix tree) from the word list to enable prefix pruning during DFS. This avoids unnecessary traversal and
accelerates the search significantly.

## 🔍 Approach

1. **Trie Construction**:  
   We create a Trie data structure where each node represents a character. Words are inserted into this Trie, marking
   the end of each valid word.

2. **DFS Traversal**:  
   From every cell on the board, we initiate a DFS. During the traversal:
    - We check if the current path matches a prefix in the Trie.
    - If a word is found (a Trie node is marked `end`), we add it to the result set.
    - To prevent revisiting the same cell, we maintain a set of visited cells.
    - We perform DFS in four directions: up, down, left, and right.

3. **Optimization**:
    - Use a `Set` to store results and prevent duplicates.
    - Stop early in DFS if the prefix is invalid (not in Trie).

## ⏱️ Complexity

- **Time Complexity**:  
  `O(M × N × 4^L)` in the worst case, where:
    - `M × N` is the size of the board,
    - `L` is the length of the longest word,
    - `4^L` is the number of DFS paths (each cell can branch to 4 neighbors).

  However, due to Trie pruning, the practical complexity is much lower.

- **Space Complexity**:
    - `O(K × L)` for Trie where `K` is number of words and `L` is average word length.
    - `O(L)` for the DFS call stack.
    - `O(W)` for the result set, where `W` is the number of matched words.

## 🧪 Code

- [Java](../src/main/java/io/dksifoua/leetcode/wordsearch2/Solution.java)

## ✅ Summary

Using a Trie to store words allows efficient prefix-based pruning of DFS paths. This avoids redundant searches and
enables solving the problem within constraints, even for large boards and word lists. Combining Trie with DFS provides a
powerful pattern for grid-based word search problems.