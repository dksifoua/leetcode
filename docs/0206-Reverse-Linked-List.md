## [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/description/)

## Intuition

The intuition behind this solution is to traverse the original list once, creating a new reversed list as we go. Instead
of modifying the original list in place, we're building a new list from scratch, where each new node becomes the new 
head of the reversed list.

## Approach

The approach can be described as follows:
1. Initialize two pointers:
    - `reversedHead`: Initially `null`, will point to the head of the new reversed list. 
    - `current`: Points to the current node in the original list, starting from the head. 
2. Traverse the original list using the current pointer:
   - For each node in the original list:
     - Create a new node with the same value. 
     - Set the new node's next to point to the current `reversedHead`. 
     - Update reversedHead to point to this new node.
   - Move current to the next node in the original list.
3. Once we've traversed the entire original list, `reversedHead` will point to the head of the fully reversed list.

## Complexity

- **Time Complexity: `O(n)`**
  - We traverse the list once, where `n` is the number of nodes in the list.
  - Each operation inside the loop (creating a new node and updating pointers) is `O(1)`.
- **Space Complexity: `O(n)`**
  - We're creating a new list with the same number of nodes as the original list.
  - This requires additional space proportional to the size of the input list.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/reverselinkedlist/Solution.java)

## Summary

This solution offers a clean and straightforward approach to reversing a linked list. Instead of modifying the original 
list, it creates a new reversed list, which can be beneficial in certain scenarios where preserving the original list is
important.

The trade-off is the additional space used. If memory conservation is crucial, an in-place reversal algorithm might be 
preferable. However, this approach is intuitive and easy to understand, making it a good solution for many situations.

One potential improvement could be to reuse the nodes from the original list instead of creating new ones, which would 
reduce the space complexity to O(1) while maintaining the same time complexity.