# [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/)

This solution is designed to address the problem of determining whether there are two distinct indices `i` and `j` in an
array `nums` such that `nums[i] == nums[j]` and the absolute difference between `i` and `j` is less than or equal to a
given number `k`.

## Intuition

The core idea is to keep track of each number's latest occurrence index in the array. If the same number is encountered
again, the solution checks whether the distance between the current and the previous occurrences is within the specified
range `k`.

## Approach

1. **HashMap for Storage:** A `HashMap<Integer, Integer>` named `uniqueNumbers` is used. Here, the key is the number
   from the array, and the value is the index of its last occurrence.

2. **Iterating through the Array:**

    - The array `nums` is iterated using a for-loop.
    - For each number in the array (`nums[i]`):
        - **Check for Duplicate within Range:**
            - If `uniqueNumbers` already contains `nums[i]`, it implies that this number has been seen before.
            - The solution then checks if the absolute difference between the current index `i` and the stored
              index `uniqueNumbers.get(nums[i])` is less than or equal to `k.
            - If it is, `true` is returned, indicating that a duplicate within the specified range exists.

3. **Updating the HashMap:**

    - Whether a duplicate is found or not, the current index `i` is stored in the `uniqueNumbers` map for `nums[i]`.
    - This update is crucial as it ensures that the map always holds the latest index for each number.

## Complexity

- **Time Complexity: O(N)**, where N is the length of the array `nums`.
    - The algorithm iterates through the array once. The operation of checking and updating the HashMap takes constant
      time O(1) for each element, making the overall time complexity linear.
- **Space Complexity: O(N)**, in the worst case.
    - In the worst-case scenario, where all elements are unique, the HashMap **uniqueNumbers** might end up storing an
      entry for every element in the array. Hence, the space complexity is O(N).

## Code

- [Java](/src/main/java/io/dksifoua/leetcode/containsduplicate2/Solution.java)

## Summary

Overall, the solution efficiently uses a HashMap to keep track of indices of elements and checks for duplicates within
the specified range in a single pass through the array.

