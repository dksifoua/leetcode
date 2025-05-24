package io.dksifoua.leetcode.wordsearch2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void testExample1() {
        Solution solution = new Solution();
        char[][] board = {
                { 'o', 'a', 'a', 'n' },
                { 'e', 't', 'a', 'e' },
                { 'i', 'h', 'k', 'r' },
                { 'i', 'f', 'l', 'v' }
        };
        String[] words = { "oath", "pea", "eat", "rain" };
        List<String> result = solution.findWords(board, words);

        assertTrue(result.contains("oath"));
        assertTrue(result.contains("eat"));
        assertEquals(2, result.size());
    }

    @Test
    void testExample2() {
        Solution solution = new Solution();
        char[][] board = {
                { 'a', 'b' },
                { 'c', 'd' }
        };
        String[] words = { "abcb" };
        List<String> result = solution.findWords(board, words);

        assertTrue(result.isEmpty());
    }

}