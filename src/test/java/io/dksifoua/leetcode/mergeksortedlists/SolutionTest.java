package io.dksifoua.leetcode.mergeksortedlists;

import io.dksifoua.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        ListNode[] lists = new ListNode[] {
                ListNode.build(new int[] { 1, 4, 5 }),
                ListNode.build(new int[] { 1, 3, 4 }),
                ListNode.build(new int[] { 2, 6 }),
        };
        ListNode mergedList = solution.mergeKLists(lists);
        assertEquals("1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6 -> null", mergedList.toString());
    }

    @Test
    void test2() {
        ListNode[] lists = new ListNode[0];
        ListNode mergedList = solution.mergeKLists(lists);
        assertNull(mergedList);
    }

    @Test
    void test3() {
        ListNode[] lists = new ListNode[] { null };
        ListNode mergedList = solution.mergeKLists(lists);
        assertNull(mergedList);
    }
}
