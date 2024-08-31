# [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/description/)

## Intuition

To find the maximum in each sliding window of size `k` across an array `nums`, we need a data structure that can
efficiently keep track of maximum elements in a way that allows for quick access, insertion, and removal as the window
moves. Using a deque (double-ended queue) is ideal because it allows us to store indices of elements in `nums` in a way
that:

1. Maintains the order of elements within the window.
2. Ensures that the maximum element of the window is always accessible at the front of the deque.

## Approach

1. **Initialize the Deque for the First Window:**
    - Iterate over the first `k` elements and maintain a deque (queue) that stores indices in a decreasing order of the
      values they point to in `nums`.
    - This means the element at the front of the deque is always the maximum in the current window.
    - For each element, remove indices from the back of the deque if their corresponding value in `nums` is smaller than
      the current element (as they cannot be the maximum of any future window).
2. **Sliding the Window Across the Array:** For each new element from index `k` to the end of nums:
    - *Remove Out-of-Window Elements:* If the element at the front of the deque is out of the current window (i.e., its
      index is less than `i - k`), remove it from the front.
    - *Maintain Monotonic Deque:* Remove elements from the back of the deque if they are smaller than the current
      element (since they cannot be maximum while the current element is in the window).
    - *Add the Current Element:* Add the current element’s index to the deque.
    - *Record the Maximum:* The element at the front of the deque is the maximum for the current window, so add it to
      the results.
3. **Output the Results:** Each position in the result array corresponds to the maximum of the sliding window for that
   position.

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the length of `nums`. Each element is added and removed from the deque at
  most once.
- **Space Complexity: `O(k)`**, as the deque stores at most `k` elements at any time.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/slidingwindowmaximum/Solution.java)

## Summary

This solution leverages a deque to efficiently track the maximum in each sliding window of size `k` in `O(n)` time
complexity. The deque maintains a decreasing order of values by indices, ensuring the maximum element in the window is
always at the front. This approach is efficient and optimal for finding sliding window maximums across large arrays.