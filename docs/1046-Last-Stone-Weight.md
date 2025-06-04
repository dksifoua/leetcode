# 🧠 [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/description/)

## 💡 Intuition

This problem mimics a game where you continuously smash the two heaviest stones together. The use of a **max-heap** (
priority queue in reverse order) naturally fits this simulation, as it allows efficient retrieval of the largest stones
at each step.

## 🔍 Approach

We use a **max-heap** to simulate this process:

1. Add all stones to a max-heap.
2. While there are at least two stones in the heap:
    - Extract the two largest stones (`y` and `x`, where `y >= x`).
    - If they are not equal, insert the difference `y - x` back into the heap.
3. At the end, either one stone remains (return its weight) or all are destroyed (return 0).

## ⏱️ Complexity

- **Time Complexity**: `O(n log n)`  
  Each insertion and removal from the heap takes `O(log n)`, and we do this `O(n)` times in total.

- **Space Complexity**: `O(n)`  
  We store all the stones in a priority queue.

## 🧪 Code

- [Java](../src/main/java/io/dksifoua/leetcode/laststoneweight/Solution.java)

## ✅ Summary

A classic heap problem that simulates repeated reduction of values using a priority queue, efficiently narrowing down to
the final remaining stone.