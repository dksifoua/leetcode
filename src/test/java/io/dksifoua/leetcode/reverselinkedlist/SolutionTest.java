package io.dksifoua.leetcode.reverselinkedlist;

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
        ListNode reversedHead = solution.reverseList(head);
        ListNode reversedCurrent = reversedHead;
        int val = 5;
        while (reversedCurrent != null) {
            Assertions.assertEquals(val, reversedCurrent.getVal());
            val -= 1;
            reversedCurrent = reversedCurrent.getNext();
        }
    }

    @Test
    void test2() {
        ListNode head = null;
        ListNode reversedHead = solution.reverseList(head);
        Assertions.assertNull(reversedHead);
    }
}
