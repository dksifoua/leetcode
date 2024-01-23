# [Majority Element](https://leetcode.com/problems/majority-element/description/)

A straightforward approach to this problem is to use a hash map to count the occurrences of each element and then find
the element that appears more than `n / 2` times. However, there's an even more efficient algorithm known
as [Boyer-Moore Voting Algorithm](https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm) which is
particularly useful for this kind of problem. Let's break down the intuition, approach, and complexity of this solution:

## Intuition

The key idea behind the Boyer-Moore Voting Algorithm is that if we pair each occurrence of the majority element with an
occurrence of any other element, there will still be some occurrences of the majority element left unpaired. This is
because the majority element appears more than `n / 2` times.

## Approach

1. **Initialization:** We start with two variables, `element` and `count`. `element` will eventually hold the majority
   element, and `count` is used to keep track of the potential dominance of this element over the others.

2. **Iterating Over the Array:** For each number `num` in the array:
    - If `count` is 0, this indicates that the previous set of elements (up to this point) does not have a clear
      majority element, so we take the current element as a new potential majority element and set `count` to 1.
    - If `element` is equal to `num`, this means the current element is the same as the potential majority element, so
      we increase the `count`.
    - If `element` is not equal to `num`, we decrease the `count`, representing that there's a conflict in the majority.

3. **Majority Element:** Since the majority element exists and appears more than `n / 2` times, by the end of the
   array, `element` will hold the majority element.

## Complexity

- **Time Complexity: O(N)**, where N is the length of the input array. This is because the algorithm only needs to
  iterate through the array once.
- **Space Complexity: O(1)**, as the algorithm uses a fixed amount of extra space (two variables, `element`
  and `count`).

## Solution

[Code](/src/main/java/io/dksifoua/leetcode/majorityelement/Solution.java)

## Summary

The Boyer-Moore Voting Algorithm is particularly powerful for this problem due to its linear time complexity and
constant space usage. It smartly leverages the fact that the count of the majority element will always outweigh the
count of all other elements combined, ensuring that the candidate retained at the end of the single pass through the
array is indeed the majority element.