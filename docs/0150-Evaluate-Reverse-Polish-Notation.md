# [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/description/)

## Intuition

Reverse Polish Notation (RPN) is a mathematical notation in which every operator follows all of its operands. It is 
especially useful in computer science and stack-based calculations because it eliminates the need for parentheses to 
dictate operation order. When evaluating an RPN expression, operands are pushed onto a stack, and when an operator is 
encountered, it is applied to the operands at the top of the stack. This process continues until the entire expression 
has been evaluated.

## Approach

1. **Define an Interface for Operations:** Create an **Apply** interface that has a method **apply(int a, int b)** to 
handle different arithmetic operations dynamically.
2. **Determine the Operation Function:** Use a switch statement to return the corresponding operation for each 
arithmetic operator (`+`, `-`, `*`, `/`). This allows the operations to be applied in a clean and concise manner.
3. **Initialize a Stack:** Use a `Deque<Integer>` (double-ended queue) to implement the stack where integers are stored 
as they are encountered in the tokens array.
4. **Iterate through Tokens:** For each token:
    - If the token is an operator, pop the top two elements from the stack, apply the operation, and push the result 
    back onto the stack.
    - Else, parse the token to an integer and push it onto the stack.
5. **Return the Final Result:** After processing all tokens, the final result will be the last remaining element in the 
stack.

## Complexity

- **Time Complexity: `O(N):`** Each token is processed exactly once, making the time complexity linear with respect to 
the number of tokens.
- **Space Complexity: `O(N):`** The space complexity is linear as well because, in the worst case, all tokens could be 
numbers, requiring storage for all of them in the stack.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/evaluatereversepolishnotation/Solution.java)