# 🧠 [Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/description/)

## 💡 Intuition

The challenge is to efficiently support two operations:

- Adding words to a dictionary.
- Searching for words, with support for wildcard characters (`.`) that can match any letter.

The wildcard requirement hints at a **recursive backtracking** or **Depth-First Search (DFS)** approach. A **Trie** (
Prefix Tree) is the ideal data structure because it allows shared prefixes to be stored compactly and supports fast
lookup.

## 🔍 Approach

- **Data Structure**: Implement a Trie where each node contains a map from characters to child nodes and a boolean
  indicating the end of a word.
- **addWord**: Traverse the Trie, creating child nodes for each character in the word if they don’t exist. Mark the last
  node as the end of a word.
- **search**: Use a recursive DFS. If a character is a dot (`.`), recursively explore all child paths. If it’s a regular
  character, follow that specific child if it exists.

## ⏱️ Complexity

### Time Complexity:

- `addWord(word)`: O(n), where n is the length of the word.
- `search(word)`:
    - Worst-case: O(m·26^d), where `m` is the length of the word and `d` is the number of `.` in the word, since `.` can
      match all 26 letters.

### Space Complexity:

- O(n·k) total for `n` words of average length `k` in the Trie.

## 🧪 Code

- [Java](../src/main/java/io/dksifoua/leetcode/designaddandsearchwordsdatastructure/WordDictionary.java)

## ✅ Summary

This problem is a classic application of a Trie with a twist: supporting wildcard queries. The solution uses recursive
DFS for search and provides optimal time/space usage for dynamic word storage and pattern-based search.