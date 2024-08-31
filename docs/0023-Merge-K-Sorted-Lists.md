# [Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/description/)

## Intuition

The problem requires merging `k` sorted linked lists into one sorted linked list. Since each linked list is already
sorted, the task is to merge them in a way that maintains the overall order. Using a priority queue (min heap) allows us
to efficiently get the smallest element across all linked lists and build the merged list incrementally.

## Approach

1. **Filter Null Lists:** First, filter out any null lists to simplify the merging process, as null lists do not
   contribute any elements.
2. **Initialize the Priority Queue:**
    - Define a custom comparator for the priority queue to compare `ListNode` objects by their values.
    - Add the head of each non-null linked list to the priority queue. The priority queue will keep these nodes in
      ascending order based on their values.
3. **Merging Process:**
    - Create a dummy node to serve as the starting point of the merged list. Use a pointer, current, to build the merged
      list.
    - While the priority queue is not empty:
        - Extract the node with the smallest value (the head of the priority queue).
        - Set `current.next` to this node, effectively adding it to the merged list.
        - Move `current` to this new node.
        - If the extracted node has a next node, add it to the priority queue. This ensures that the queue always
          contains the smallest nodes from each list.
4. **Return the Merged List:** After exiting the loop, `dummy.next` will point to the head of the fully merged and
   sorted linked list.

## Complexity

- **Time Complexity: `O(N log k)`**, where `N` is the total number of nodes in all lists, and `k` is the number of
  linked lists. Each node is processed once, and inserting and removing from the priority queue takes `O(log k)`.
- **Space Complexity: `O(k)`**, as the priority queue stores at most `k nodes at any time.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/mergeksortedlists/Solution.java)

## Summary

This solution uses a min-heap to efficiently merge `k` sorted linked lists in `O(N log k)` time. By always retrieving
the smallest available node from the queue, we ensure the merged list remains sorted. This approach is optimal for
handling multiple sorted lists efficiently.