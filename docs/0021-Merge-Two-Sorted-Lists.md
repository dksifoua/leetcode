# [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/)

## Intuition

The intuition behind this solution is to compare elements from both lists and build a new merged list by selecting the
smaller element at each step. This approach leverages the fact that both input lists are already sorted.

## Approach

The approach can be described as follows:

1. Initialize pointers:
    - `mergedList`: The head of the new merged list (initially null).
    - `currentMerged`: Pointer to the current end of the merged list.
    - `current1` and `current2`: Pointers to traverse `list1` and `list2` respectively.
2. Traverse both lists simultaneously:
    - While either list has remaining elements:
        - Compare the current elements of both lists (if both exist).
        - Select the smaller element (or the only available element if one list is exhausted).
        - Create a new node with this value and add it to the merged list.
        - Move the pointer of the list from which the element was selected.
3. Build the merged list:
    - If it's the first element, initialize `mergedList` and `currentMerged`.
    - For subsequent elements, add to the end of `mergedList` and update `currentMerged`.
4. Return the head of the merged list.

## Complexity

- **Time Complexity: `O(m + n)`** where `n` and `m` are the lengths of `list1` and `list2` respectively. We traverse
  both lists once, performing constant-time operations at each step.
- **Space Complexity: `O(m + n)`** since we create a new list containing all elements from both input lists. The space
  required is proportional to the sum of the lengths of the input lists.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/mergetwosortedlists/Solution.java)

## Summary

This solution provides a straightforward and efficient approach to merging two sorted linked lists. It maintains the
sorted order of the input lists in the merged result.

**Key points:**

- The solution creates a new list rather than modifying the input lists in-place.
- It handles cases where one list may be exhausted before the other.
- The approach is intuitive and easy to understand, making it maintainable and debuggable.

**Potential improvements:**

- Reuse nodes from the input lists instead of creating new ones to optimize space usage to `O(1)`.
- Use a dummy head node to simplify the logic for handling the first node of the merged list.

Overall, this solution effectively solves the problem of merging two sorted lists while maintaining good readability and
a straightforward implementation.