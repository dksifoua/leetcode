package io.dksifoua.leetcode.reorderlist;

import io.dksifoua.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        ListNode head = null;
        solution.reorderList(head);
        Assertions.assertNull(head);
    }

    @Test
    void test2() {
        ListNode head = new ListNode(1, null);
        solution.reorderList(head);
        assertEquals(1, head.getValue());
        assertNull(head.getNext());
    }

    @Test
    void test3() {
        ListNode head = new ListNode(1,
                new ListNode(2, null));
        solution.reorderList(head);
        assertEquals(1, head.getValue());
        assertEquals(2, head.getNext().getValue());
        assertNull(head.getNext().getNext());
    }

    @Test
    void test4() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3, null)));
        solution.reorderList(head);
        assertEquals(1, head.getValue());
        assertEquals(3, head.getNext().getValue());
        assertEquals(2, head.getNext().getNext().getValue());
        assertNull(head.getNext().getNext().getNext());
    }

    @Test
    void test5() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4, null))));
        solution.reorderList(head);
        assertEquals(1, head.getValue());
        assertEquals(4, head.getNext().getValue());
        assertEquals(2, head.getNext().getNext().getValue());
        assertEquals(3, head.getNext().getNext().getNext().getValue());
        assertNull(head.getNext().getNext().getNext().getNext());
    }

    @Test
    void test6() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5, null)))));
        solution.reorderList(head);
        assertEquals(1, head.getValue());
        assertEquals(5, head.getNext().getValue());
        assertEquals(2, head.getNext().getNext().getValue());
        assertEquals(4, head.getNext().getNext().getNext().getValue());
        assertEquals(3, head.getNext().getNext().getNext().getNext().getValue());
        assertNull(head.getNext().getNext().getNext().getNext().getNext());
    }

    @Test
    void test7() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(7,
                                                                new ListNode(8,
                                                                        new ListNode(9,
                                                                                new ListNode(10, null))))))))));
        solution.reorderList(head);
        assertEquals(1, head.getValue());
        assertEquals(10, head.getNext().getValue());
        assertEquals(2, head.getNext().getNext().getValue());
        assertEquals(9, head.getNext().getNext().getNext().getValue());
        assertEquals(3, head.getNext().getNext().getNext().getNext().getValue());
        assertEquals(8, head.getNext().getNext().getNext().getNext().getNext().getValue());
        assertEquals(4, head.getNext().getNext().getNext().getNext().getNext().getNext().getValue());
        assertEquals(7, head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getValue());
        assertEquals(5, head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getValue());
        assertEquals(6, head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getValue());
        assertNull(head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext());
    }
}
