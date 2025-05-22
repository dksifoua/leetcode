# [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/description/)

## Intuition

Generating all combinations of well-formed parentheses involves understanding the balance between open and close
parentheses. A well-formed parentheses sequence must ensure that at no point do the close parentheses exceed the open
ones, and by the end, the counts of open and close parentheses must be equal. This ensures that every opening
parenthesis has a corresponding closing one, forming valid sequences.

## Approach

The approach to solving this problem is to use backtracking. Backtracking allows us to explore all possible combinations
of parentheses and ensures we only consider valid sequences. Here’s a step-by-step breakdown:

1. **Initialization:** We start with an empty string and zero counts for both open and close parentheses.
2. **Backtracking Function:** The backtrack function recursively builds the parentheses sequences.
    - *Base Case:* When the counts of both open and close parentheses reach `N`, a valid sequence is formed, and we add
      it to the result list.
    - *Add Open Parenthesis:* If the count of open parentheses is less than `N`, we can add an open parenthesis and
      recursively call the function.
    - *Add Close Parenthesis:* If the count of close parentheses is less than the count of open parentheses, we can add
      a close parenthesis and recursively call the function.
3. **Recursion:** This process continues until all valid sequences are generated and stored in the result list.

## Complexity

- **Time Complexity:** The time complexity is `O(4^N / \sqrt{N})`. This is derived from the fact that the number of
  valid sequences is given by the [nth Catalan number](https://en.wikipedia.org/wiki/Catalan_number), which grows
  exponentially.
- **Space Complexity:** The space complexity is `O(4^N / \sqrt{N})` for the result list storing all sequences.
  Additionally, the recursion stack depth is `O(N)`, making the auxiliary space complexity also `O(N)`.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/generateparentheses/Solution.java)