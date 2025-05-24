package io.dksifoua.leetcode.wordsearch2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    private Solution[] children;
    private boolean end;

    public Solution() {
        this.children = new Solution[26];
        this.end = false;
    }

    private void reset() {
        this.children = new Solution[26];
        this.end = false;
    }

    private void insert(String word) {
        Solution node = this;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Solution();
            }
            node = node.children[index];
        }
        node.end = true;
    }

    public List<String> findWords(char[][] board, String[] words) {
        this.reset();
        for (String word : words) {
            this.insert(word);
        }

        Set<String> result = new HashSet<>();
        Set<Tuple<Integer, Integer>> visitedCells = new HashSet<>();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                this.dfs(board, row, col, visitedCells, result, "");
            }
        }

        return result.stream().toList();
    }

    private void dfs(char[][] board, int row, int col, Set<Tuple<Integer, Integer>> visitedCells, Set<String> result, String word) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[row].length) return;

        int index = board[row][col] - 'a';
        if (this.children[index] == null) return;

        Tuple<Integer, Integer> cell = new Tuple<>(row, col);
        if (visitedCells.contains(cell)) return;

        word += board[row][col];
        visitedCells.add(cell);

        if (this.children[index].end) result.add(word);

        this.children[index].dfs(board, row - 1, col, visitedCells, result, word);
        this.children[index].dfs(board, row + 1, col, visitedCells, result, word);
        this.children[index].dfs(board, row, col - 1, visitedCells, result, word);
        this.children[index].dfs(board, row, col + 1, visitedCells, result, word);

        visitedCells.remove(cell);
    }

    private static record Tuple<T, U>(T a, U b) {
    }

    ;
}
