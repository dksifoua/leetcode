# [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/description/)

## Intuition

The problem asks for the product of all elements in the array except the one at the current index. This can be done efficiently by keeping track of prefix and postfix products separately. By avoiding the use of division, we ensure that our solution is robust and handles edge cases like zeros in the array.

## Approach

1. **Prefix and Postfix Arrays:**
    - First, we create two auxiliary arrays, prefixes and postfixes, where `prefixes[i]` contains the product of all elements to the left of `i` and `postfixes[i]` contains the product of all elements to the right of `i`.
    - Initialize the first element of prefixes to `1` because there are no elements to the left of the first element.
    - Initialize the last element of postfixes to `1` because there are no elements to the right of the last element.
2. **Filling Prefix and Postfix Arrays:**
    - Traverse the input array to fill the prefixes array such that each element at index `i` in prefixes is the product of all elements to the left of `i`.
    - Simultaneously, traverse the input array in reverse to fill the postfixes array such that each element at index `i` in postfixes is the product of all elements to the right of `i`.
3. **Combining Results:** Create the result array where each element at index i is the product of `prefixes[i]` and `postfixes[i]`, giving the desired product of all elements except `nums[i]`.
4. **Space Optimization:** he second method, `productExceptSelfWithExtraSpaceComplexity`, optimizes space by combining the steps for prefixes and postfixes into a single array, thereby reducing the space complexity to `O(1)` additional space.

## Complexity

- **Time Complexity:**
  - **`O(N)`** for both methods, where `N` is the length of the input array. Each method involves traversing the array a few times, which results in linear time complexity.
- **Time Complexity:**
  - For the first method, `productExceptSelf`, the space complexity is `O(N)` due to the use of the prefixes and postfixes arrays.
  - For the second method, `productExceptSelfWithExtraSpaceComplexity`, the space complexity is `O(1)` additional space since we only use a single array for the result and a few extra variables.

## Code

- [Java](/src/main/java/io/dksifoua/leetcode/productofarrayexceptself/Solution.java)