# [LRU Cache](https://leetcode.com/problems/lru-cache/description/)

## Intuition

The intuition to solve this problem is to use a combination of a hash map and a doubly linked list to implement the LRU
Cache. This approach allows for `O(1) time complexity for both get and put operations. The hash map provides fast access
to cache entries, while the doubly linked list maintains the order of usage, with the most recently used items at the
tail and the least recently used at the head.

## Approach

- Use a HashMap to store key-node pairs for quick access.
- Implement a doubly linked list with head and tail pointers to maintain the order of elements.
- Keep track of the current capacity and the maximum capacity.
- For get operations, move the accessed element to the end of the list (most recently used).
- For put operations, add new elements to the end or update existing ones and move them to the end.
- When capacity is exceeded, remove the least recently used element (head of the list).

## Complexity

- **Time Complexity: `O(1)`** for both get and put operations.
- **Space Complexity: `O(capacity)`** to store up to `capacity` number of key-value pairs.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/lrucache/LRUCache.java)

## Summary

This implementation efficiently manages the LRU Cache by using a HashMap for quick access and a doubly linked list for
maintaining the order of elements. The get and put operations are optimized to run in `O(1)` time complexity, meeting
the problem requirements.

The use of a custom Node class and helper methods (moveToEnd, addToEnd, removeHead) makes the code more readable and
maintainable. The solution correctly handles edge cases, such as empty cache and reaching maximum capacity.

Overall, this is a solid implementation of an LRU Cache that balances efficiency with code clarity.