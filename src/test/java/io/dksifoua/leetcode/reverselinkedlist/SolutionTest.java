package io.dksifoua.leetcode.reverselinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        Solution.ListNode head = new Solution.ListNode(1,
                new Solution.ListNode(2,
                        new Solution.ListNode(3,
                                new Solution.ListNode(4,
                                        new Solution.ListNode(5, null)))));
        Solution.ListNode reversedHead = solution.reverseList(head);
        Solution.ListNode reversedCurrent = reversedHead;
        int val = 5;
        while (reversedCurrent != null) {
            Assertions.assertEquals(val, reversedCurrent.getVal());
            val -= 1;
            reversedCurrent = reversedCurrent.getNext();
        }
    }

    @Test
    void test2() {
        Solution.ListNode head = null;
        Solution.ListNode reversedHead = solution.reverseList(head);
        Assertions.assertNull(reversedHead);
    }
}
