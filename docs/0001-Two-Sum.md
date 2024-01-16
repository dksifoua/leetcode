# [Two Sum](https://leetcode.com/problems/two-sum/)

The "Two Sum" problem on LeetCode is a fundamental challenge in array manipulation and hash table usage. Let's explore 
the optimal solution:

## Intuition

The primary intuition behind solving the Two Sum problem efficiently is recognizing that each number needs a specific 
**"partner"** number to reach the target sum. This understanding shifts the focus from searching for a number to 
identifying its necessary partner. The key insight is to store and quickly look up these partner numbers as we 
iterate through the array.

## Approach

1. **Hash Table Usage:** The optimal approach involves using a hash table to store numbers from the array along with 
their indices. The hash table allows for constant-time lookups, which is crucial for efficiency.

2. **Single Pass Iteration:** As we iterate through the array, we compute the complement (or partner) for each number 
(i.e., target - currentNumber). We then check if this complement is already in the hash table.

3. **Early Return:** If the complement is found, it means a pair that sums up to the target has been identified, and we 
can immediately return their indices. If not, we store the current number and its index in the hash table for future 
reference.

## Complexity

- **Time Complexity: O(N)**, where N is the number of elements in the array. This is because each element is processed 
exactly once, and hash table operations like insertion and lookup are O(1).
- **Space Complexity: O(N)** in the worst-case scenario, which occurs when no matching pair is found until the end of 
the array, necessitating storing all elements in the hash table.

## Code

[link](../src/main/java/io/dksifoua/twosum/Solution.java)