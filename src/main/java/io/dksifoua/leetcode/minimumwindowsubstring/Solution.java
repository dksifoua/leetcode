package io.dksifoua.leetcode.minimumwindowsubstring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public String minWindow(String s, String t) {
        char[] context = s.toCharArray();
        char[] query = t.toCharArray();

        if (query.length > context.length) {
            return "";
        }

        int queryDistinctCount = 0;
        Map<Character, Integer> queryFrequencies = new HashMap<>();
        for (Character character : t.toCharArray()) {
            if (!queryFrequencies.containsKey(character)) {
                queryDistinctCount += 1;
            }
            queryFrequencies.put(character, queryFrequencies.getOrDefault(character, 0) + 1);
        }

        int minWindowLength = Integer.MAX_VALUE;
        int startWindowIndex = 0, endWindowIndex = 0;

        int windowDistinctCount = 0;
        Map<Character, Integer> windowFrequencies = new HashMap<>();
        int i = 0, j = 0;
        while (j < context.length) {
            char lastCharacter = context[j];

            if (queryFrequencies.containsKey(lastCharacter)) {
                windowFrequencies.put(lastCharacter, windowFrequencies.getOrDefault(lastCharacter, 0) + 1);

                if (Objects.equals(windowFrequencies.get(lastCharacter), queryFrequencies.get(lastCharacter))) {
                    windowDistinctCount += 1;
                }
            }

            if (windowDistinctCount == queryDistinctCount) {
                do {
                    char firstCharacter = context[i];

                    int windowLength = j - i + 1;
                    if (windowDistinctCount == queryDistinctCount && windowLength < minWindowLength) {
                        minWindowLength = windowLength;
                        startWindowIndex = i;
                        endWindowIndex = j;
                    }

                    if (windowFrequencies.containsKey(firstCharacter)) {
                        windowFrequencies.put(firstCharacter, windowFrequencies.getOrDefault(firstCharacter, 0) - 1);

                        if (windowFrequencies.get(firstCharacter) < queryFrequencies.get(firstCharacter)) {
                            windowDistinctCount -= 1;
                        }
                    }

                    i += 1;
                } while (i <= j && (windowDistinctCount == queryDistinctCount || !queryFrequencies.containsKey(context[i])));
            }

            j += 1;
        }

        if (minWindowLength == Integer.MAX_VALUE) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int k = startWindowIndex; k < endWindowIndex + 1; k++) {
            result.append(context[k]);
        }

        return result.toString();
    }
}
