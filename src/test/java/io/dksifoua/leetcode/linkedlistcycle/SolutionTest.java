package io.dksifoua.leetcode.linkedlistcycle;

import io.dksifoua.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        assertFalse(solution.hasCycle(null));
    }

    @Test
    void test2() {
        assertFalse(solution.hasCycle(new ListNode(1, null)));
    }

    @Test
    void test3() {
        ListNode head = new ListNode(1, new ListNode(2, null));
        head.getNext().setNext(head);
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void test4() {
        ListNode tail = new ListNode(-4, null);
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(0, tail)));
        tail.setNext(head.getNext());
        assertTrue(solution.hasCycle(head));
    }
}
