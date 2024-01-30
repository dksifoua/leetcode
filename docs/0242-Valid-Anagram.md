# [Valid Anagram](https://leetcode.com/problems/valid-anagram/description/)

## Intuition

The core idea behind determining if two strings are anagrams is to verify that both strings have the exact same
characters in the same quantities. An anagram essentially involves rearranging the letters of one string to form
another. If the frequency of each character in both strings is the same, then one is an anagram of the other.

## Approach

1. **Length Check:** If the lengths of the two strings are different, they cannot be anagrams. This check is a quick way
   to rule out non-anagrams and enhances efficiency.

2. **Frequency Mapping with HashMap:** We're using a HashMap to count the frequency of each character in both strings.
   The key idea here is:
    - For each character in string s, increase its count in the map.
    - For each character in string t, decrease its count in the map.

   This way, if the strings are anagrams, all counts in the map should be zero, because each increment for a character
   in s should be matched by a decrement for the same character in t.

3. **Verification:** After processing both strings, we iterate through the values in the map. If any value is not zero,
   it means that there's a mismatch in the frequency of characters between s and t, thus they are not anagrams.

# Complexity

- **Time Complexity: O(N).** The time complexity is linear with respect to the length of the strings. This is because
  each character in both strings is processed exactly once.
- **Space Complexity: O(1) or O(N).** The space complexity is O(1) under the assumption of a fixed character set (like
  ASCII) since the size of the map is bounded by the size of the character set. However, if the character set is
  unbounded (like Unicode), the space complexity would be O(N), where n is the length of the strings.

# Code

- [Java](/src/main/java/io/dksifoua/leetcode/validanagram/Solution.java)

# Summary

This method efficiently checks for anagrams by using a HashMap to track the frequency of characters. It's a smart
approach that balances time and space complexity well, ensuring that it can handle large strings effectively. The
upfront length check is a good optimization for quickly ruling out obvious non-anagrams.