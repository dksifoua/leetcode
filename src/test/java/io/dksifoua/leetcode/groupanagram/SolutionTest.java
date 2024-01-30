package io.dksifoua.leetcode.groupanagram;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    public final Solution solution = new Solution();

    private void sort(List<List<String>> list) {
        for (List<String> sublist : list) {
            sublist.sort(String::compareTo);
        }
        list.sort(Comparator.comparing(sublist -> sublist.get(0), String::compareTo));
    }

    @Test
    public void test1() {
        String[] strings = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> expected = new ArrayList<>() {{
            add(new ArrayList<>() {{ add("bat"); }});
            add(new ArrayList<>() {{ add("nat"); add("tan"); }});
            add(new ArrayList<>() {{ add("ate"); add("eat"); add("tea"); }});
        }};
        List<List<String>> actual = solution.groupAnagrams(strings);
        System.out.println(actual.getClass().getName() + " " + actual);
        sort(expected);
        sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        String[] strings = { "" };
        List<List<String>> expected = List.of(List.of(""));
        List<List<String>> result = solution.groupAnagrams(strings);
        assertEquals(expected, result);
    }

    @Test
    void test3() {
        String[] strings = { "a" };
        List<List<String>> expected = List.of(List.of("a"));
        List<List<String>> result = solution.groupAnagrams(strings);
        assertEquals(expected, result);
    }
}
