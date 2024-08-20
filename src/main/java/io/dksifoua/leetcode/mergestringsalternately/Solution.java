package io.dksifoua.leetcode.mergestringsalternately;

public class Solution {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder(word1.length() + word2.length());

        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }
        result.append(word1.substring(i));
        result.append(word2.substring(j));

        return result.toString();
    }
}
