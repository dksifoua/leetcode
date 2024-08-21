# [Is Subsequence](https://leetcode.com/problems/is-subsequence/description/)

## Intuition

The key insight for this problem is to iterate through both strings simultaneously, matching characters from `s` with
characters from `t` in order. If we can match all characters from `s` in the same order as they appear in `t`, then `s`
is a subsequence of `t`.

## Approach

1. Use two pointers, `i` for string `s` and `j` for string `t`.
2. Iterate through both strings:
    - If the current characters match, move both pointers forward.
    - If they don't match, only move the pointer for `t` forward.
3. Continue until we reach the end of either string.
4. If we've matched all characters in `s` (i.e., `i` has reached the end of `s`), then `s` is a subsequence of `t.

## Complexity

- **Time Complexity: `O(n)`**, where `n` is the length of `t`. In the worst case, we iterate through all characters
  of `t` once.
- **Space Complexity: `O(1)`**, as we only use two integer pointers, regardless of the input size.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/issubsequence/Solution.java)

## Summary

The solution efficiently checks if `s` is a subsequence of `t` using a two-pointer approach. By iterating through both
strings with pointers `i` and `j`, it confirms if characters of `s` appear in the same order within `t`. The solution
handles edge cases, such as when `s` is empty (always a subsequence) or when `t` is too short to contain all characters
of `s`. The algorithm operates in linear time, making it suitable for large inputs while maintaining constant space
usage, ensuring optimal performance.