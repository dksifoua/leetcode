# 🧠 [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/description/)

## 💡 Intuition

The Trie (or prefix tree) is designed to optimize retrieval operations like prefix matching and full word search. By
storing common prefixes only once, we reduce space complexity compared to storing full words in a list or set. This
makes operations like autocomplete and dictionary-based word lookup highly efficient.

## 🔍 Approach

We define a `TrieNode` class with:

- A map (`Map<Character, TrieNode>`) to track children nodes.
- A boolean `end` flag to mark the end of a complete word.

The `Trie` class encapsulates the root node and implements three operations:

1. **Insert** – Traverse or build nodes for each character, setting the `end` flag on the last character.
2. **Search** – Traverse through the trie using each character. Return `true` only if the `end` flag is `true` at the
   last character.
3. **StartsWith** – Similar to `search`, but returns `true` as long as the prefix path exists, regardless of the `end`
   flag.

## ⏱️ Complexity

### `insert(String word)`
- **Time**: `O(n)`, where `n` is the length of the word. Each character is processed once.
- **Space**: `O(n)`, in the worst case where all characters are unique and new nodes are added.

### `search(String word)`
- **Time**: `O(n)`, where `n` is the length of the word. Each character is traversed once.
- **Space**: `O(1)`, as no additional space is used aside from local variables.

### `startsWith(String prefix)`
- **Time**: `O(n)`, where `n` is the length of the prefix.
- **Space**: `O(1)`, same reasoning as above.

## 🧪 Code

- [Java](../src/main/java/io/dksifoua/leetcode/implementtrieprefixtree/Trie.java)

## ✅ Summary

The Trie efficiently supports prefix-based queries by storing characters in a tree structure where paths represent
prefixes. Its use of hash maps for child node management ensures average-case constant time access, and the separation
of word-end logic via a boolean flag makes it versatile for both full-word and prefix searches.