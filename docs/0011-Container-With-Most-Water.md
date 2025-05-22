# [Container With Most Water](https://leetcode.com/problems/container-with-most-water/description/)

## Intuition

The “Container With Most Water” problem involves finding two lines (out of a given array of heights) that together with
the x-axis form a container, such that the container holds the maximum amount of water. The key observation is that the
amount of water held by the container is determined by the shorter of the two lines and the distance between them.
Therefore, to maximize the water held, we should consider both the height of the lines and the distance between them.

## Approach

1. **Initialize Two Pointers:** Start with two pointers, one at the beginning `leftIndex` and one at the end
   `rightIndex` of the array.
2. **Calculate the Area:** In each iteration, calculate the area formed by the lines at the left and right pointers and
   the distance between them.
3. **Update Maximum Area:** Keep track of the maximum area encountered so far.
4. **Move the Pointers:** Move the pointer that points to the shorter line inward. This is because moving the taller
   line inward will not increase the height of the water (since it is constrained by the shorter line), and moving the
   shorter line inward might find a taller line that increases the water capacity.
5. **Repeat:** Continue this process until the two pointers meet.

## Complexity

- **Time Complexity: O(N)**, where `N` is the number of elements in the input array. This is because each element is
  considered at most once by the two pointers, which move towards each other.
- **Space Complexity: O(1)**, as the algorithm uses a constant amount of extra space regardless of the input size.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/containerwithmostwater/Solution.java)