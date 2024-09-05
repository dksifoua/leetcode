# [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/description/)

## Intuition

The goal is to reverse the nodes of a linked list in groups of size `k`. If the remaining nodes at the end of the list
are fewer than `k`, they should remain in their original order. We can accomplish this by recursively or iteratively
reversing each group of `k` nodes while keeping track of the list structure to connect each reversed group back to the
rest of the list.

## Approach

### Recursive

1. **Calculate the List Length:** Traverse the list once to find its length. This helps determine when to stop reversing
   groups if the remaining nodes are fewer than `k`.
2. **Recursive Reversal in Groups of `k`:** Use a helper method `reverse` to handle the reversal of each k-sized group.
   For each group of k nodes:
    - Reverse the first k nodes by rearranging their pointers.
    - After reversing, the last node of the reversed group should point to the result of recursively reversing the
      remaining nodes (or the next group).
    - If the remaining nodes are fewer than `k`, leave them as is.
3. **Helper Method (Reverse):** The helper function reverse performs the reversal of `k` nodes:
    - Initialize two pointers, previous and current, where previous points to the current head and current is the next
      node.
    - For each node in the group, adjust the pointers to reverse the order.
    - When the group is fully reversed, connect the last node of this group to the next reversed group (or the
      remaining nodes).
4. **Return the New Head:** The new head of the list will be the head of the first reversed group.

### Iterative

1. **Calculate the Length of the List:** First, determine the length of the linked list to check if there are enough
   nodes for each group reversal. This also ensures that groups with fewer than `k` nodes at the end of the list can be
   left as is.
2. **Iterative Reversal in Groups of `k`:**
    - Initialize pointers: `reversedHead` to track the new head of the list after reversing groups, `previous` to track
      the end of the last reversed group, and `current` as the starting node of each group.
    - Use a loop to process each group of `k` nodes as long as there are at least `k` nodes left.
    - For each group:
        - Use the helper method reverse to reverse the `k nodes starting from current.
        - The `reverse` method returns a map containing:
            - The new head of the reversed group (`head`).
            - The last node of the reversed group (`previous`).
            - The starting node for the next group (`current`).
        - Connect the previous group’s tail to the head of the newly reversed group.
        - Update previous and current to prepare for the next group.
3. **Return the New Head:** Once all groups are processed, reversedHead will point to the head of the newly arranged
   list with k-group reversals.

#### Helper Methods:

- **`computeLength`:** Calculates the total number of nodes in the list.
- **`reverse`:** Reverses `k` nodes starting from a given head and returns a map with pointers to maintain the linked
  structure.

## Complexity

### Recursive

- **Time Complexity: `O(n)`**, where `n` is the number of nodes in the linked list. Each node is visited once during the
  reversal process.
- **Space Complexity: `O(n/k)`** for the recursive stack, as each recursive call processes `k` nodes. In the worst
  case (all nodes are reversed in groups), the stack will hold approximately `n/k` frames.

### Iterative

- **Time Complexity: `O(n)`**, where `n` is the total number of nodes in the list. We iterate through each node once.
- **Space Complexity: `O(1)`**, ignoring the map creation, as we modify pointers in place without additional data
  structures that grow with input size.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/reversenodesinkgroup/Solution.java)

## Summary

### Recursive

The recursive solution elegantly handles the problem using recursion. Here are some key points:

- **Recursive Approach:** The use of recursion simplifies the logic for handling multiple groups.
- **In-place Reversal:** The reversal is done in-place, which is memory efficient.
- **Edge Case Handling:** The solution correctly handles edge cases like empty lists, single-node lists, and when `k=1`.
- **Length Calculation:** Pre-calculating the length allows for efficient decision-making about when to stop reversing.

Overall, it is an excellent solution that effectively balances readability with efficiency, making it a robust approach
to this challenging problem.

### Iterative

The iterative solution offers several advantages:

- **Iterative Approach:** It avoids the potential stack overflow issues that could occur with a recursive solution for
  very large lists.
- **In-place Reversal:** The reversal is done in-place, which is memory efficient.
- **Clear Structure:** The separation of the main logic and the group reversal into different methods enhances
  readability.
- **Edge Case Handling:** The solution correctly handles all edge cases.

Compared to the recursive solution:

- This iterative approach has better space complexity (`O(1)` vs `O(n/k)`).
- It may be slightly more complex to read but avoids potential stack overflow for very large lists.
- Both solutions have the same time complexity of O(n).

