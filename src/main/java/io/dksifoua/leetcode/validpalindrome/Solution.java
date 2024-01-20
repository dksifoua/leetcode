package io.dksifoua.leetcode.validpalindrome;

public class Solution {

    public boolean isPalindrome(String s) {
        int leftIndex = 0, rightIndex = s.length() - 1;
        while (leftIndex < rightIndex) {
            char leftCharacter = Character.toLowerCase(s.charAt(leftIndex));
            if (!Character.isLetterOrDigit(leftCharacter)) {
                leftIndex += 1;
                continue;
            }

            char rightCharacter = Character.toLowerCase(s.charAt(rightIndex));
            if (!Character.isLetterOrDigit(rightCharacter)) {
                rightIndex -= 1;
                continue;
            }

            if (leftCharacter != rightCharacter) return false;

            leftIndex += 1;
            rightIndex -= 1;
        }

        return true;
    }
}
