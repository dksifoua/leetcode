package io.dksifoua.leetcode.permutationinstring;

import java.util.Arrays;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int[] f1 = new int[26], f2 = new int[26];

        for (char c : s1.toCharArray()) {
            f1[c - 'a'] += 1;
        }

        int i = 0, j = 0;
        while (j < s2.length()) {
            f2[s2.charAt(j) - 'a'] += 1;

            if (Arrays.equals(f1, f2)) {
                return true;
            }

            if (j - i + 1 == s1.length()) {
                f2[s2.charAt(i) - 'a'] -= 1;
                i += 1;
            }

            j += 1;
        }

        return false;
    }
}
