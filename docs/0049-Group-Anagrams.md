# [Group Anagram](https://leetcode.com/problems/group-anagrams/description/)

## Intuition

The key intuition to solve the grouping anagrams' problem is that for a group of words to be anagrams, they must yield
the same string when their letters are sorted. For example, "eat", "tea", and "ate" all sort to "aet". This sorted
string can serve as a unique identifier (or key) for anagram groups in a hashmap.

## Approach

1. **Data Structure:** Use a hashmap where the keys are sorted strings, and the values are lists containing all strings
   that, when sorted, match the key.
2. **Sorting as Key Generation:** For each string in the input array, convert the string into a character array, sort
   the array (which brings anagrams to the same ordered form), and then convert back to a string. This sorted string
   acts as the key in our hashmap.
3. **Grouping:** Check if the hashmap already has the sorted string as a key. If not, create a new list and add it to
   the map using this sorted string as the key. Then, add the original string to the corresponding list in the map.
4. **Result Compilation:** Finally, extract all values from the map. Each value in the map is a list of strings that are
   anagrams of each other, and these are collected and returned as the final list of anagram groups.

## Complexity

- **Time Complexity: `O(N*M*log(M))`**. The major time cost comes from sorting the strings. Sorting each string
  takes `O(M*log(M))` time, where M is the average length of a string. If there are N strings in total, the overall time
  complexity for the algorithm is `O(N*M*log(M))`.
- **Space Complexity: `O(N*M)`** where N is the number of strings, and M is the length of the longest string. This space
  is used to store the output data structure (the list of lists), as well as the intermediate data structures (the
  hashmap and character arrays for sorting).

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/groupanagram/Solution.java)

## Summary

This solution neatly demonstrates a common approach to categorizing items based on a computed key, and efficiently
groups anagrams using a combination of sorting and hashmap storage.