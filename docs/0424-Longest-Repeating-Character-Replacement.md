# [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/description/)

## Intuition

The problem asks us to find the longest substring with the same character, allowing for at most `k` character
replacements. The key insight is to use a sliding window approach, where we maintain a window that can be made valid (
all characters the same) by replacing at most `k` characters. We expand the window as long as we can make all characters
in the window the same with at most `k` replacements. When we can't, we start shrinking the window from the left.

## Approach

The solution uses a sliding window technique with two pointers (`i` and `j`) and a `HashMap` to keep track of character
frequencies. Here's how it works:

1. Initialize variables:
    - `maxLength`: to store the length of the longest valid substring
    - `maxCount`: to keep track of the count of the most frequent character in the current window
    - `charCount`: a HashMap to store the frequency of each character in the current window
2. Start with a window of size 1 (`i` at the start, `j` at the second character).
3. Expand the window by moving `j` to the right: Add the new character to `charCount` and update `maxCount` if
   necessary.
4. Check if the current window is valid:
    - A window is valid if `(window size - count of most frequent char) <= k`
    - If not valid, shrink the window from the left by moving `i` to the right and updating `charCount` and `maxCount`.
5. If the window is valid, update `maxLength` if the current window is longer.
6. Repeat steps 3-5 until `j` reaches the end of the string.

## Complexity

- **Time Complexity: `O(n)`** as we iterate through the string once with the `j` pointer. The `i` pointer also moves
  forward, never backwards, so it also iterates through the string at most once. Operations on the hash map are
  constant.
- **Space Complexity: `O(1)`** as the hash map stores at 26 entries (uppercase english letters). All other variables use
  constant space.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/longestrepeatingcharacterreplacement/Solution.java)

## Summary

This solution efficiently solves the problem by using a sliding window approach. It maintains a window that can be made
valid with at most `k` replacements and expands or contracts this window as it moves through the string. The use of a
hash map to track character frequencies allows for quick updates and checks.

The algorithm is optimal in terms of time complexity, as it processes each character at most twice (once when adding to
the window, once when removing). The space complexity is constant, making it memory-efficient for large inputs.

One potential optimization could be to use an array of size 26 instead of a hash map, which might be slightly faster for
very large inputs, but the current implementation is clean and easy to understand.