package io.dksifoua.leetcode.longestrepeatingcharacterreplacement;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int characterReplacement(String s, int k) {
        int maxLength = 1, maxCount = 1;
        Map<Character, Integer> charCount = new HashMap<>() {{
            put(s.charAt(0), 1);
        }};
        int i = 0, j = 1;
        while (i < s.length() && j < s.length()) {
            charCount.put(s.charAt(j), charCount.getOrDefault(s.charAt(j), 0) + 1);
            maxCount = Math.max(maxCount, charCount.get(s.charAt(j)));
            if (maxCount + k < j - i + 1) {
                if (charCount.get(s.charAt(i)) == maxCount) {
                    maxCount -= 1;
                }
                charCount.put(s.charAt(i), charCount.get(s.charAt(i)) - 1);
                i += 1;
            } else {
                maxLength = Math.max(maxLength, j - i + 1);
            }

            j += 1;
        }

        return maxLength;
    }

    public int characterReplacementOptimal(String s, int k) {
        int maxLength = 1, maxCount = 1;
        int[] charCount = new int[26];
        charCount[s.charAt(0) - 'A'] += 1;
        int i = 0, j = 1;
        while (i < s.length() && j < s.length()) {
            charCount[s.charAt(j) - 'A'] += 1;
            maxCount = Math.max(maxCount, charCount[s.charAt(j) - 'A']);
            if (maxCount + k < j - i + 1) {
                if (charCount[s.charAt(i) - 'A'] == maxCount) {
                    maxCount -= 1;
                }
                charCount[s.charAt(i) - 'A'] -= 1;
                i += 1;
            } else {
                maxLength = Math.max(maxLength, j - i + 1);
            }

            j += 1;
        }

        return maxLength;
    }
}
