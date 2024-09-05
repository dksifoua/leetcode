package io.dksifoua.leetcode.reversenodesinkgroup;

import io.dksifoua.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        ListNode head = ListNode.build(new int[] { 1, 2, 3, 4, 5 });
        assertArrayEquals(new int[] { 2, 1, 4, 3, 5 }, solution.reverseKGroup(head, 2).toArray());
    }

    @Test
    void test1OptimalSpace() {
        ListNode head = ListNode.build(new int[] { 1, 2, 3, 4, 5 });
        assertArrayEquals(new int[] { 2, 1, 4, 3, 5 }, solution.reverseKGroupOptimalSpace(head, 2).toArray());
    }

    @Test
    void test2() {
        ListNode head = ListNode.build(new int[] { 1, 2, 3, 4, 5 });
        assertArrayEquals(new int[] { 3, 2, 1, 4, 5 }, solution.reverseKGroup(head, 3).toArray());
    }

    @Test
    void test2OptimalSpace() {
        ListNode head = ListNode.build(new int[] { 1, 2, 3, 4, 5 });
        assertArrayEquals(new int[] { 3, 2, 1, 4, 5 }, solution.reverseKGroupOptimalSpace(head, 3).toArray());
    }

    @Test
    void test3() {
        ListNode head = ListNode.build(new int[] { 1 });
        assertArrayEquals(new int[] { 1 }, solution.reverseKGroup(head, 3).toArray());
    }

    @Test
    void test3OptimalSpace() {
        ListNode head = ListNode.build(new int[] { 1 });
        assertArrayEquals(new int[] { 1 }, solution.reverseKGroupOptimalSpace(head, 3).toArray());
    }

    @Test
    void test4() {
        ListNode head = ListNode.build(new int[] { 1, 2, 3, 4, 5 });
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, solution.reverseKGroup(head, 6).toArray());
    }

    @Test
    void test4OptimalSpace() {
        ListNode head = ListNode.build(new int[] { 1, 2, 3, 4, 5 });
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, solution.reverseKGroupOptimalSpace(head, 6).toArray());
    }
}
