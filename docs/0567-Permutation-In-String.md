# [Permutation in String](https://leetcode.com/problems/permutation-in-string/description/)

## Intuition

The problem asks us to determine if a permutation of `s1` is a substring of `s2`. A key insight is that a permutation
of `s1` will have exactly the same character frequencies as `s1` itself. Therefore, we can solve this problem by
comparing character frequencies in a sliding window of `s2` with the character frequencies of `s1`.

## Approach

The solution uses a sliding window technique with two pointers (`i` and `j`) and two frequency arrays. Here's how it
works:

1. Initialize two integer arrays `f1` and `f2` of size 26 (for lowercase English letters) to store character
   frequencies.
2. Populate `f1` with the character frequencies of `s1`.
3. Use a sliding window on `s2`:
    - `j` moves to the right, adding characters to the window.
    - If the window size becomes equal to `s1`'s length, `i` moves to the right, removing characters from the window.
4. For each window:
    - Update `f2` with the frequencies of characters in the current window.
    - Compare `f1` and `f2`. If they're equal, we've found a permutation of `s1` in `s2`.
5. If we've gone through all windows without finding a match, return false.

## Complexity

- **Time Complexity: `O(max(m, n))`** where m is the length of `s1` and n is the length of `s2`.
    - We iterate through `s1` once to build `f1`: `O(m)`
    - We iterate through `s2` once with the sliding window: `O(n)`
    - `Arrays.equals()` is called at most n times, and each call takes `O(1)` time (since the arrays are always of size
      `26`)
    - Overall: `O(max(m, n))`, which simplifies to `O(K)` where `K` is the length of the longer string
- **Space Complexity: O(1)**, as we use two fixed-size arrays of length 26 for character frequencies.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/permutationinstring/Solution.java)

## Summary

This solution efficiently solves the problem by using a sliding window approach combined with frequency counting. It
maintains a window in `s2` that's the same size as `s1` and compares the character frequencies in this window to those
of s1.

The algorithm is optimal in terms of both time and space complexity. It processes each character of `s2` only once and
uses constant extra space regardless of input size.