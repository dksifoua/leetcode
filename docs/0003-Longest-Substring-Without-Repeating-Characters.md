# [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)

## Intuition

The intuition behind this solution is to use a sliding window approach. We maintain a window of characters that contains
no duplicates and expand or contract this window as we move through the string.

## Approach

The approach can be described as follows:

1. Initialize variables:
    - `maxLength`: To keep track of the longest substring length.
    - `foundCharacters`: A `HashSet` to store unique characters in the current window.
    - `leftIndex` and `rightIndex`: Pointers defining the current window.
2. Slide the window through the string:
    - Expand the window by moving `rightIndex`:
        - If the character at `rightIndex` is not in `foundCharacters`, add it and move `rightIndex`.
        - If it is in `foundCharacters`, remove the character at `leftIndex` and move `leftIndex`.
3. Update `maxLength`: After each iteration, update `maxLength` if the current window is longer.
4. Continue until either pointer reaches the end of the string.
5. Return `maxLength` as the result.

## Complexity

- **Time Complexity: `O(n)`** where `n` is the length of the input string. Each character is processed at most twice
  (once by `rightIndex` and once by `leftIndex`). `HashSet` operations (`add`, `remove`, `contains`) are `O(1)` on
  average.
- **Space Complexity: `O(n)`** In the worst case, the HashSet stores all unique characters in the string.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/longestsubstringwithoutrepeatingcharacters/Solution.java)

## Summary

This solution efficiently finds the longest substring without repeating characters using a sliding window technique.

**Key points:**

- The sliding window approach allows us to solve the problem in a single pass through the string.
- Using a `HashSet` for `foundCharacters` provides `O(1)` lookup, insertion, and deletion.
- The solution handles edge cases well, including empty strings and strings with all unique characters.

**Strengths:**

- Efficient time complexity of `O(n)`.
- Space-efficient, using only additional space proportional to the unique characters.
- The code is concise and readable.

**Potential improvements:**
For very large character sets, we should consider using a boolean array instead of a `HashSet` if the character range
is known and limited. The solution could be optimized slightly by moving `leftIndex` directly to the position after the
first occurrence of the duplicate character, rather than incrementing by one each time.