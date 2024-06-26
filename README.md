# Leetcode - Java

![Makefile CI](https://github.com/dksifoua/leetcode/actions/workflows/makefile-ci.yaml/badge.svg)
![Codecov](https://img.shields.io/codecov/c/github/dksifoua/leetcode)

## Types of data structures

- Primitive
    - **byte**: 1 byte (8 bits)
    - **boolean**: The size is not precisely defined in the Java Language Specification, but it typically uses 1 byte in
      most JVM implementations for memory alignment purposes, even though it represents a single bit of information (
      true or false).
    - **char**: 2 byte (16 bits)
    - **short**: 2 bytes (16 bits)
    - **int**: 4 bytes (32 bits)
    - **long**: 8 bytes (64 bits)
    - **float**: 4 bytes (32 bits)
    - **double**: 8 bytes (64 bits)
- Non-Primitive
    - Linear:
        - Static:
            - **Array**
        - Dynamic:
            - **Linked List**
            - **Stack**
            - **Queue**
    - Non Linear
        - **Tree**
        - **Graph**

## Types of algorithms

- **Simple Recursive Algorithms**

The work as iterative algorithms. The recursion acts as a loop.

```java
int sum(int[] A, int n) {
    if (n == 1) return A[0];

    s = sum(A, n - 1); // Recursive on all but last
    return s + A[n - 1]; // Add the last element
}
```

- **Divide and Conquer Algorithms**
    - Divide the problem into smaller sub-problems of the same type, and solve these sub-problems recursively.
    - Combine the solutions of the sub-problems into a solution for the original problem.
    - Traditionally, an algorithm is called divide and conquer if it contains at least two recursive calls.
    - **Example:** Quick sort and Merge sort.

- **Dynamic Programming Algorithms**
    - Almost same as divide and conquer, but they use memorization to solve each sub-problems only one time.
        - The algorithm saves the past sub-problem solutions to find the next sub-problem solutions.
    - These types of algorithms are generally used for optimization problems.
        - The goal is to find the best solution among multiple solutions.

- **Greedy Algorithms**
    - They work in phases.
    - At each phase, we take the best solution without worrying about future consequences.
    - We hope that by choosing a local optimum solution at each step, we will end up at a global optimum solution.

- **Brute Force Algorithms**
    - They simply try all possibilities until a satisfactory solution is found.

- **Randomized Algorithms**
    - They use a random at least once during the computation to make a decision.

## Solutions

| ID   | Difficulty | Problem                            | Topics                            | Link                                                       |
|------|------------|------------------------------------|-----------------------------------|------------------------------------------------------------|
| 0001 | Easy       | Two Sum                            | Array, HashMap                    | [solution](./docs/0001-Two-Sum.md)                         |
| 0002 | Medium     | Add Two numbers                    | LinkedList, Recursion             |                                                            |
| 0015 | Medium     | Three sum                          | Array, Two Pointers, Sorting      | [solution](./docs/0015-Three-Sum.md)                       |
| 0049 | Medium     | Group Anagrams                     | Array, HashTable, String, Sorting | [solution](./docs/0049-Group-Anagrams.md )                 |
| 0121 | Easy       | Best Time to Buy and Sell Stock    | Array                             | [solution](./docs/0121-Best-Time-to-Buy-and-Sell-Stock.md) |
| 0125 | Easy       | Valid Palindrome                   | String, Two Pointers              | [solution](./docs/0125-Valid-Palindrome.md)                |       
| 0128 | Medium     | Longest Consecutive Sequence       | Array, HashSet                    | [solution](./docs/0128-Longest-Consecutive-Sequence.md)    |
| 0167 | Medium     | Two Sum II - Input Array Is Sorted | Array, Two Pointers               | [solution](./docs/0167-Two-Sum-II-Array-Is-Sorted.md)      |
| 0169 | Easy       | Majority Element                   | Array, HashTable, Counting        | [solution](./docs/0169-Majority-Element.md)                |
| 0217 | Easy       | Contains Duplicate                 | Array                             | [solution](./docs/0217-Contains-Duplicate.md)              |
| 0219 | Easy       | Contains Duplicate II              | Array                             | [solution](./docs/0219-Contains-Duplicate-II.md)           |
| 0238 | Medium     | Product of Array Except Self       | Array                             | [solution](./docs/0238-Product-Of-Array-Except-Self.md)    |
| 0242 | Easy       | Valid Anagram                      | String, HashTable                 | [solution](./docs/0242-Valid-Anagram.md)                   |   
| 0347 | Medium     | Top K Frequent Elements            | Array, HashMap, Bucket Sort       | [Solution](./docs/0347-Top-K-Frequent-Elements.md)         |