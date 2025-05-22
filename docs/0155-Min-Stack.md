# [Min Stack](https://leetcode.com/problems/min-stack/description/)

## Intuition

The goal of this problem is to design a stack that supports standard operations (`push`, `pop`, `top`) along with an
additional operation (`getMin`) which retrieves the minimum element in the stack. All operations should have `O(1)` time
complexity. To achieve this, we need to maintain a structure that can efficiently track the minimum value as elements
are pushed and popped from the stack.

## Approach

To implement the `MinStack`class, we use a custom linked list where each node stores three pieces of information:

1. The value of the element.
2. The minimum value in the stack up to this node.
3. A reference to the next node in the stack.

**Node Structure**

Each node is represented as a record with three fields:

- `val`: the value of the element.
- `min`: the minimum value in the stack up to and including this element.
- `next`: a reference to the next node in the stack.

**Stack Operations**

1. **Initialization (`MinStack`):** The stack is initialized with headset to null.
2. **Push (`push(int val)`)**
    - When pushing a new value, a new node is created.
    - If the stack is empty (`head` is `null`), the new node’s `min` value is the value being pushed.
    - Otherwise, the new node’s `min` value is the minimum of the current head’s `min` value and the new value.
    - The new node is then set as the new head of the stack.
3. **Pop (`pop()`)$:** The top element is removed by setting `head` to `head.next`.
4. **Top (`top()`):** Returns the value of the `head` node.
5. **Get Minimum (`getMin()`)** Returns the minimum value of the head node.

## Complexity

- **Time Complexity: O(1)** for each operation because they involve simple assignments and comparisons.
- **Space Complexity: O(N)**, where `N` is the number of elements in the stack, because each element is stored with its
  associated minimum value.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/minstack/MinStack.java)