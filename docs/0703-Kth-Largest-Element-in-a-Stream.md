# 🧠 [Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/description/)

## 💡 Intuition

To dynamically maintain the kth largest element in a stream of integers, we can leverage a min-heap (priority queue). By
keeping only the **k largest elements** in the heap, the smallest element in this heap will always be the **kth largest
** overall. This structure allows us to efficiently insert new elements and retrieve the kth largest in **logarithmic
time**.

## 🔍 Approach

- Use a **min-heap** (`PriorityQueue`) of size `k`.
- Initially populate the heap with elements from the input array `nums`. If the size exceeds `k`, remove the smallest.
- On each call to `add(val)`, insert the new value into the heap.
    - If the heap exceeds size `k`, remove the smallest element (i.e., the root of the heap).
- Return the root of the heap, which is the kth largest element.

This approach ensures that at any moment, the priority queue contains only the top `k` largest values seen so far, with
the smallest among them (i.e., the kth largest overall) at the top.

## ⏱️ Complexity

- **Time Complexity**:
    - Constructor: O(n log k), where n is the length of `nums`.
    - `add(val)`: O(log k), for inserting into the heap and possibly removing an element.

- **Space Complexity**: O(k), as the heap stores at most `k` elements at any time.

## 🧪 Code

- [Java](../src/main/java/io/dksifoua/leetcode/kthlargestelementinastream/KthLargest.java)

## ✅ Summary

By maintaining a min-heap of size `k`, we can efficiently keep track of the kth largest element in a dynamic stream.
This approach balances time efficiency and memory usage, making it ideal for scenarios like real-time cutoff tracking in
admission processes.