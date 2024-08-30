# [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/description/)

## Intuition

The goal of this problem is to find the smallest substring in s that contains all characters of `t`, including their
frequencies. To do this, we can use a sliding window approach to dynamically adjust the substring range, ensuring we
capture all characters in `t while minimizing the window length.

## Approach

1. **Frequency Maps for Target and Window:**
    - Create a frequency map for `t` (`queryFrequencies`) to track the required count of each character.
    - Use another map (`windowFrequencies`) to keep track of the character counts in the current window within `s`.
2. **Sliding Window with Two Pointers:**`
    - We use two pointers, `i` and `j`, where `i` represents the start of the window and `j` the end.
    - Expand the window by moving `j` to the right and updating `windowFrequencies`.
    - Whenever a character in `windowFrequencies` reaches the count required by `queryFrequencies`, increase
      the `windowDistinctCount`.
3. **Shrinking the Window to Find Minimum Length:**
    - When the `windowDistinctCount` equals the number of distinct characters in `t`, check if the current window length
      is the smallest seen so far.
    - Try to reduce the window size by incrementing `i` and updating `windowFrequencies` until the window no longer
      contains all required characters.
4. **Updating the Result:** Track the smallest valid window by updating `startWindowIndex` and `endWindowIndex` when a
   smaller valid window is found.
5. **Final Result:** If no valid window was found, return an empty string. Otherwise, construct the result substring
   using `startWindowIndex` and `endWindowIndex`.

## Complexity

- **Time Complexity: `O(m + n)`**, where `m` is the length of `s` and `n` is the length of `t`. Each character is
  processed at most twice—once when expanding `j` and once when contracting `i`.
- **Space Complexity: `O(n)`**, due to the additional space for frequency maps and counters.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/minimumwindowsubstring/Solution.java)

## Summary

This solution uses a sliding window technique combined with frequency counting to efficiently find the smallest
substring in s that contains all characters of `t`. By expanding and contracting the window as needed, we ensure that
the solution meets the `O(m + n)` complexity requirement. This approach effectively minimizes the substring length while
guaranteeing that all characters from t are included.