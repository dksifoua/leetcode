package io.dksifoua.leetcode.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> foundCharacters = new HashSet<>();
        int leftIndex = 0, rightIndex = 0;
        while (leftIndex < s.length() && rightIndex < s.length()) {
            if (foundCharacters.contains(s.charAt(rightIndex))) {
                foundCharacters.remove(s.charAt(leftIndex));
                leftIndex += 1;
            } else {
                foundCharacters.add(s.charAt(rightIndex));
                rightIndex += 1;
            }

            maxLength = Math.max(maxLength, rightIndex - leftIndex);
        }

        return maxLength;
    }
}
