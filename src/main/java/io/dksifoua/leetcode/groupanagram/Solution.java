package io.dksifoua.leetcode.groupanagram;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String string : strings) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(string);
        }
        return new ArrayList<>(map.values());
    }
}
