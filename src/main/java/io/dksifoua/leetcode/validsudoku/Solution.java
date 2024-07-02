package io.dksifoua.leetcode.validsudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>() {{
            for (int i = 0; i < 9; i++) {
                put(i, new HashSet<>());
            }
        }};
        Map<Integer, Set<Character>> cols = new HashMap<>() {{
            for (int i = 0; i < 9; i++) {
                put(i, new HashSet<>());
            }
        }};
        Map<String, Set<Character>> boxes = new HashMap<>() {{
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    put(i + " " + j, new HashSet<>());
                }
            }
        }};

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char digit = board[i][j];

                if (digit == '.') {
                    continue;
                }

                int rb = i / 3;
                int cb = j / 3;

                if (
                        rows.get(i).contains(digit)
                        || cols.get(j).contains(digit)
                        || boxes.get(rb + " " + cb).contains(digit)
                ) return false;

                rows.get(i).add(digit);
                cols.get(j).add(digit);
                boxes.get(rb + " " + cb).add(digit);
            }
        }

        return true;
    }
}
