# [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/)

Let's break down the classic and efficient implementation using the two-pointer approach to solve the valid palindrome
problem.

## Intuition

The core idea is to iterate over the string from both ends towards the center, comparing characters that are
alphanumeric while ignoring non-alphanumeric characters and case differences. If any mismatch is found, it's not a
palindrome; otherwise, it is.

## Approach

1. **Two-Pointer Technique**:The `leftIndex` starts at the beginning of the string (index 0), and the `rightIndex`
   starts at the end (index `s.length() - 1`). These pointers move towards each other.
2. **Normalization On-the-Fly:** Instead of creating a new normalized string, we convert characters to lowercase and
   checks their alphanumeric status on-the-fly as it encounters them.
    - If the character at `leftIndex` or `rightIndex` is not alphanumeric, we skip it by moving the respective pointer
      (`leftIndex++` or `rightIndex--`).
    - If both characters are alphanumeric, we compare them. If they are not equal, we return `false` immediately,
      indicating that the string is not a palindrome.
    - If they are equal, both pointers are moved towards the center (`leftIndex++` and `rightIndex--`), and the process
      continues.
3. **Loop Termination:** The loop continues until `leftIndex` is no longer less than `rightIndex`, meaning the entire
   string has been checked.

## Complexity

- **Time Complexity: O(N).** Each character in the string is visited at most once. The operations within the loop
  (character comparison, case conversion, and alphanumeric check) are O(1), leading to a linear time complexity.
- **Space Complexity: O(1).** Our solution does not require extra space proportional to the input size
  (no additional strings or data structures are used). The space used is constant, regardless of the input string size.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/validpalindrome/Solution.java)

## Summary

This solution is concise, efficient, and leverages the two pointers technique effectively. It handles the palindrome
check in-place without needing additional space for a normalized string, making it an optimal solution in terms of both
time and space complexity.