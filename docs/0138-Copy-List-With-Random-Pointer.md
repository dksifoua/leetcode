# [Copy List With Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/)

## Intuition

The key insight in this solution is to use a hash map to create a mapping between nodes in the original list and their
corresponding nodes in the copied list. This allows us to create the new list in two passes: one to create the nodes,
and another to set the pointers.

## Approach

1. Create a hash map `oldToNew` to store the mapping between original nodes and their copies.
2. First pass: Iterate through the original list, creating new nodes for each original node and storing the mapping in
   the hash map.
3. Second pass: Iterate through the original list again, using the hash map to set the next and random pointers of the
   copied nodes.

## Complexity

- **Time Complexity: `O(n)`**, where n is the number of nodes in the list. We make two passes through the list.
- **Space Complexity: `O(n)`** for the hash map, which stores a mapping for each node.

## Improvement

An improved solution is to interweave the copied nodes with the original nodes in the list. This allows us to set the
random pointers correctly without needing extra space for a hash map. It implies three passes:

1. First pass: Create copied nodes and insert them after their corresponding original nodes.
2. Second pass: Set the random pointers for the copied nodes.
3. Third pass: Separate the original and copied lists.

- **Time Complexity: `O(n)`**, where n is the number of nodes in the list. We make three passes through the list.
- **Space Complexity: `O(1)`** since we get rid of the hash map.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/copylistwithrandompointer/Solution.java)


