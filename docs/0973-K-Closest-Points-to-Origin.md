# 🧠 [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/description/)

## 💡 Intuition

The goal is to find the **k closest points** to the origin (0, 0) from a list of 2D points. Instead of computing the
actual Euclidean distance using the square root (which is computationally expensive), we can compare distances using
their **squared values** since the square root function is monotonically increasing.

To efficiently track the **k smallest** distances, we can use a **max heap** (priority queue) of size `k`. By always
keeping the k closest points in the heap, we can discard farther points as we iterate.

## 🔍 Approach

1. Use a **max heap** to store the k closest points.
    - The heap is ordered by the negative (inverted) squared distance so the point with the **largest** distance among
      the k is at the root.
2. For each point:
    - Compute its squared distance to the origin.
    - Add it to the heap.
    - If the heap size exceeds `k`, remove the farthest point (i.e., the root).
3. After processing all points, extract all elements from the heap into the result array.

> Using a max heap instead of sorting the entire list helps reduce time complexity from O(n log n) to O(n log k), which
> is optimal for large input sizes when k ≪ n.

## ⏱️ Complexity

- **Time Complexity**: `O(n log k)`  
  For each of the `n` points, insertion into a heap of size `k` takes `O(log k)`.

- **Space Complexity**: `O(k)`  
  The heap holds at most `k` points.

## 🧪 Code

- [Java](../src/main/java/io/dksifoua/leetcode/kclosestpointstoorigin/Solution.java)

## ✅ Summary

- Used a **max heap** to maintain the k closest points.
- Avoided computing the square root to simplify and speed up comparisons.
- Efficient for cases where `k` is much smaller than `n`.