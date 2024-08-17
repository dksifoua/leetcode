package io.dksifoua.leetcode.addtwonumbers;

import io.dksifoua.leetcode.addtwonumbers.Solution.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        ListNode list1 = new ListNode(2,
                new ListNode(4,
                        new ListNode(3, null)));
        ListNode list2 = new ListNode(5,
                new ListNode(6,
                        new ListNode(4, null)));
        ListNode result = solution.addTwoNumbers(list1, list2);
        Assertions.assertEquals(7, result.getVal());
        Assertions.assertEquals(0, result.getNext().getVal());
        Assertions.assertEquals(8, result.getNext().getNext().getVal());
        Assertions.assertNull(result.getNext().getNext().getNext());
    }

    @Test
    void test2() {
        ListNode list1 = new ListNode(0, null);
        ListNode list2 = new ListNode(0, null);
        ListNode result = solution.addTwoNumbers(list1, list2);
        Assertions.assertEquals(0, result.getVal());
        Assertions.assertNull(result.getNext());
    }

    @Test
    void test3() {
        ListNode list1 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9, null)))))));
        ListNode list2 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9, null))));
        ListNode result = solution.addTwoNumbers(list1, list2);
        Assertions.assertEquals(8, result.getVal());
        Assertions.assertEquals(9, result.getNext().getVal());
        Assertions.assertEquals(9, result.getNext().getNext().getVal());
        Assertions.assertEquals(9, result.getNext().getNext().getNext().getVal());
        Assertions.assertEquals(0, result.getNext().getNext().getNext().getNext().getVal());
        Assertions.assertEquals(0, result.getNext().getNext().getNext().getNext().getNext().getVal());
        Assertions.assertEquals(0, result.getNext().getNext().getNext().getNext().getNext().getNext().getVal());
        Assertions.assertEquals(1, result.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getVal());
        Assertions.assertNull(result.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext());
    }

    @Test
    void test4() {
        ListNode list1 = new ListNode(2,
                new ListNode(4,
                        new ListNode(3, null)));
        ListNode list2 = new ListNode(5,
                new ListNode(6,
                        new ListNode(4, null)));
        ListNode result = solution.addTwoNumbers(list1, list2);
        Assertions.assertEquals(7, result.getVal());
        Assertions.assertEquals(0, result.getNext().getVal());
        Assertions.assertEquals(8, result.getNext().getNext().getVal());
        Assertions.assertNull(result.getNext().getNext().getNext());
    }
}
