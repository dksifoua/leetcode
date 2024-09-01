package io.dksifoua.leetcode.reverselinkedlist;

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
        ListNode reversedCurrent = solution.reverseList(head);
        int val = 5;
        while (reversedCurrent != null) {
            Assertions.assertEquals(val, reversedCurrent.getValue());
            val -= 1;
            reversedCurrent = reversedCurrent.getNext();
        }
    }

    @Test
    void testOptimal1() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5, null)))));
        ListNode reversedCurrent = solution.reverseListOptimal(head);
        int val = 5;
        while (reversedCurrent != null) {
            Assertions.assertEquals(val, reversedCurrent.getValue());
            val -= 1;
            reversedCurrent = reversedCurrent.getNext();
        }
    }

    @Test
    void test2() {
        ListNode reversedHead = solution.reverseList(null);
        Assertions.assertNull(reversedHead);
    }

    @Test
    void testOptimal2() {
        ListNode reversedHead = solution.reverseListOptimal(null);
        Assertions.assertNull(reversedHead);
    }
}
