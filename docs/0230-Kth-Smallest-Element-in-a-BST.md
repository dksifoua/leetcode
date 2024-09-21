# [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/)

## Intuition

The Binary Search Tree (BST) property ensures that the in-order traversal of the tree produces nodes in sorted order. By
performing an in-order traversal, we can iterate over the nodes in ascending order and directly find the kth smallest
element by keeping a counter.

## Approach

1. **In-order Traversal:**
    - Traverse the tree in-order (`left → root → right`). This guarantees that nodes are visited in ascending order for
      a BST.
    - Use an array smallest to store the result:
        - `smallest[0]`: Acts as a counter, tracking the number of nodes visited.
        - `smallest[k]`: Stores the kth smallest value once encountered during traversal.
    - Stop the traversal once the kth smallest element is found (i.e., when smallest[0] equals k).
2. **Recursive Traversal:**
    - Recursively traverse the left subtree.
    - Process the current node:
        - Check if the kth smallest element has been reached by comparing the counter `smallest[0]` with the length of
          the array smallest.
        - Store the node’s value in smallest if it is within bounds.
        - Increment the counter.
    - Recursively traverse the right subtree.
3. **Return the Result:** After the in-order traversal, `smallest[k]` will contain the kth smallest value.

## Complexity

- **Time Complexity: `O(h + k)`**, where `h` is the height of the tree and `k` is the number of nodes we need to
  traverse. The traversal stops once the kth smallest node is found. In the best case, the traversal ends early (e.g.,
  when `k` is small).
- **Space Complexity: `O(h)`**, where `h` is the height of the tree. This is due to the recursive call stack during
  in-order traversal.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/kthsmallestelementinabst/Solution.java)

## Summary

his solution efficiently finds the kth smallest element in a BST using in-order traversal. By leveraging the sorted
property of BSTs, the traversal stops early once the desired element is found, ensuring optimal performance. The use of
an array for tracking the result simplifies handling state during the recursive traversal.