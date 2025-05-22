# [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/description/)

## Intuition

The core idea is to ensure that each number from `1` to `9` appears only once in each row, each column, and each of the
nine 3x3 sub-boxes of the Sudoku board. By keeping track of the numbers we have seen so far in each row, column, and
box, we can efficiently determine if the Sudoku board is valid or not.

## Approach

**Initialization:** We use three hash maps to keep track of the characters we encounter:

- `rows` to track characters for each row.
- `cols` to track characters for each column.
- `boxes` to track characters for each 3x3 sub-box.
- Each of these maps contains sets, which will store the characters seen so far.

**Filling the Maps:**

- We iterate over each cell in the board using nested loops.
- For each cell, if the character is not `.`, we do the following:
    - Calculate the corresponding 3x3 box index using integer division (`rb = i / 3` and `cb = j / 3`).
    - Check if the character already exists in the respective row, column, or box set.
    - If it does, return `false` as it violates the Sudoku rule.
    - If it does not, add the character to the respective sets.

**Final Check:** If we complete the iteration without finding any duplicates, we return `true`, indicating the board is
valid.

## Complexity

- **Time Complexity: O(1)**
    - We always iterate over a fixed 9x9 board, making the iteration part of the solution constant in terms of time
      complexity. Each cell is visited once.
    - The operations of checking and adding elements to the sets are average `O(1)` operations.
- **Space Complexity: O(1)**
    - Although we use additional data structures (maps and sets), their sizes are fixed and proportional to the size of
      the board, which is constant (81 cells).
    - Each map (rows, cols, boxes) holds at most 9 sets, and each set can hold up to 9 elements, making the extra space
      used constant.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/validsudoku/Solution.java)