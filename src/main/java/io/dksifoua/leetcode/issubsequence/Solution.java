package io.dksifoua.leetcode.issubsequence;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i += 1;
            }
            j += 1;
        }

        return i == s.length();
    }
}
