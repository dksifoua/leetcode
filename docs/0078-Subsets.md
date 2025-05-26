# 🧠 [Subsets](https://leetcode.com/problems/subsets/description/)

## 💡 Intuition

To generate all possible subsets (the power set) of an array of unique integers, we recognize that each element has two
choices: either it is included in a subset or it is not. This binary decision at each element leads to a total of
\(2^n\) subsets for an array of length \(n\).

The key idea is to simulate this decision-making process iteratively using a queue (Breadth-First Search style), where
each tuple in the queue represents a current subset and the index of the element being considered next.

## 🔍 Approach

- Use a `Deque` to perform a breadth-first construction of subsets.
- Begin with an empty subset and index 0.
- While the number of generated subsets is less than \(2^n\), pop a tuple off the queue.
- For each tuple, branch into two new tuples:
    - One that keeps the subset as is (excluding the current index).
    - One that includes the current index element in the subset.
- Push both new tuples back into the queue with the index incremented.
- Continue until all subsets are generated.
- Return only the subsets (not the indices).

## ⏱️ Complexity

- **Time Complexity**: \(O(2^n \cdot n)\)
    - There are \(2^n\) subsets.
    - Each subset can take up to \(O(n)\) time to copy or create.
- **Space Complexity**: \(O(2^n \cdot n)\)
    - Due to storing all subsets in memory.

## 🧪 Code

- [Java](../src/main/java/io/dksifoua/leetcode/subsets/Solution.java)

## ✅ Summary

This solution takes an iterative BFS-inspired approach to subset generation. It systematically expands each subset by
including or excluding the current element. The result is an efficient and clean method that produces all \(2^n\)
subsets without duplication.