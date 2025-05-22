# [Three Sum](https://leetcode.com/problems/3sum/description/)

## Intuition

The problem requires us to find all unique triplets in an array that sum up to zero. Given the constraints and the need
to avoid duplicates, a sorted array and a two-pointer approach are suitable. Sorting helps in easily skipping duplicates
and efficiently using two pointers to find pairs that sum up to a target.

## Approach

1. **Sort the Array:** In order to make it easier to avoid duplicates and use the two-pointer technique.
2. **Iterate Through the Array:**
    - Use a loop to fix one element of the triplet. This element will be the current element in the loop.
    - Skip duplicate elements to ensure the uniqueness of the triplets.
3. **Two-Pointer Technique:**
    - For each fixed element, use two pointers (`left` and `right`) to find pairs that sum up to the negative of the
      fixed element.
    - Adjust the pointers based on the sum of the triplet:
        - If the sum is less than zero, move the left pointer to the right to increase the sum.
        - If the sum is greater than zero, move the right pointer to the left to decrease the sum.
        - If the sum is zero, add the triplet to the result list and move both pointers, skipping duplicates.
4. **Return the Result:** After processing all elements, return the list of unique triplets.

## Complexity

- **Time Complexity: `O(N^2)`**, where `N` is the number of elements in the array. Sorting the array takes `O(NlogN)`,
  and the two-pointer technique takes `O(N^2)` in the worst case.
- **Space Complexity: `O(1)` or `O(N)`** depending on the implementation of sorting the input.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/threesum/Solution.java)