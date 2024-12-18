package io.dksifoua.leetcode.removenthnodefromendoflist;

import io.dksifoua.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5, null)))));
        ListNode result = solution.removeNthFromEnd(head, 2);
        Assertions.assertEquals(1, result.getValue());
        Assertions.assertEquals(2, result.getNext().getValue());
        Assertions.assertEquals(3, result.getNext().getNext().getValue());
        Assertions.assertEquals(5, result.getNext().getNext().getNext().getValue());
        Assertions.assertNull(result.getNext().getNext().getNext().getNext());
    }

    @Test
    void test2() {
        ListNode head = new ListNode(1, null);
        ListNode result = solution.removeNthFromEnd(head, 1);
        Assertions.assertNull(result);
    }

    @Test
    void test3() {
        ListNode head = new ListNode(1,
                new ListNode(2, null));
        ListNode result = solution.removeNthFromEnd(head, 1);
        Assertions.assertEquals(1, result.getValue());
        Assertions.assertNull(result.getNext());
    }
}
