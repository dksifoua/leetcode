# [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/description/)

## Intuition

The problem requires finding the length of the longest consecutive sequence in an unsorted array. To achieve an `O(N) time complexity, we can leverage a set for constant-time lookups. The key insight is that for each element, if it’s the start of a sequence (i.e., the element before it is not present in the array), we can then find the length of the sequence starting from this element.

## Approach

1. **Add Elements to a Set.**
2. **Identify & Store Sequence Starts:** An element is considered the start of a sequence if there is no element that precedes it in the set (i.e., `num - 1 is not in the set).
3. **Calculate Sequence Lengths:**
    - For each identified start of a sequence, determine the length of the sequence by checking consecutive elements (`start + 1`, `start + 2`, etc.) until the next element is not found in the set.
      - Track the maximum length of all such sequences.

## Complexity

- **Time Complexity: `O(N)`**, where `N` is the number of elements in the input array. Each element is processed a constant number of times (added to the set and checked for the start of sequences).
- **Space Complexity: `O(N)`**, for storing the elements in the set.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/longestconsecutivesequence/Solution.java)