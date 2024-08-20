# [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/description/)

## Intuition

The problem requires merging two strings, `word1` and `word2`, by alternating their characters, starting with `word1`.
If one string is longer than the other, the remaining characters from the longer string should be appended to the end of
the merged result. The goal is to create a merged string that reflects this alternating pattern while efficiently
handling the possibility of differing string lengths.

## Approach

1. **Initialization:** Start by creating a `StringBuilder` to hold the merged result, initialized with a capacity equal
   to the combined length of `word1` and `word2`. This optimizes memory usage and avoids repeated resizing during the
   appending process.
2. **Two-Pointer Technique:** Utilize two pointers, `i` and `j`, initialized at the start of `word1` and `word2`,
   respectively. Use a while loop to iterate through both strings as long as there are characters available in both
   strings:
    - Append the character from `word1` at position `i` and then increment `i`.
    - Append the character from `word2` at position `j` and then increment `j`.
3. **Appending Remaining Characters:** After exiting the loop (when either string is exhausted), use the `substring`
   method to append any remaining characters from `word1` or `word2` to the result. This step handles cases where one
   string is longer than the other.
4. **Return the Result:** Convert the `StringBuilder` to a string and return it as the final merged result.

## Complexity

- **Time Complexity: `O(m+n)`**, where `n` is the length of `word1` and `m` is the length of `word2`. This is because
  each character from both strings is processed exactly once.
- **Space Complexity: `O(m+n)`**, mainly due to the space used by the `StringBuilder`, which stores the merged string of
  length equal to the sum of `word1` and `word2`.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/mergestringsalternately/Solution.java)

## Summary

The solution effectively merges two strings by alternating their characters using a two-pointer technique. By leveraging
a StringBuilder, the approach ensures efficient string manipulation and minimizes unnecessary memory usage. This method
handles differing string lengths gracefully by appending any remaining characters once one string is exhausted, making
the solution both time and space efficient. The overall design is straightforward, making the code easy to read and
maintain.