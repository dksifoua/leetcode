# 🧠 [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/description/)

## 💡 Intuition

Instead of sorting the entire array (which takes O(n log n) time), we can maintain a data structure that keeps track of
the **k largest elements** seen so far. The **kth largest** element will then be the smallest among those k largest,
which we can get using a **min-heap** of size `k`.

## 🔍 Approach

- We use a `PriorityQueue` as a **min-heap** to always keep the `k` largest elements at any point.
- Iterate through each element:
    - If the heap has fewer than `k` elements, simply add the number.
    - If the heap already has `k` elements, compare the current number with the smallest in the heap (top of the
      min-heap). If the current number is larger, remove the smallest and add the current number.
- After processing all elements, the heap contains the `k` largest elements, and the smallest among them (the top) is
  the answer.

This avoids sorting the entire array, especially when `k` is small relative to the size of the array.

## ⏱️ Complexity

- **Time Complexity:** `O(n log k)` where `n` is the number of elements in `nums`. Each insert and removal from the heap
  takes `O(log k)` time.
- **Space Complexity:** `O(k)` for the heap storing the top `k` elements.

## 🧪 Code

- [Java](../src/main/java/io/dksifoua/leetcode/kthlargestelementinanarray/Solution.java)

## ✅ Summary

By using a min-heap of size `k`, we efficiently track the `k` largest elements without sorting the entire array. This is
particularly optimal for large datasets where full sorting is unnecessary.