package io.dksifoua.leetcode.mergetwosortedlists;

import io.dksifoua.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4, null)));
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4, null)));

        ListNode currentMerged = solution.mergeTwoLists(list1, list2);
        for (int val : List.of(1, 1, 2, 3, 4, 4)) {
            Assertions.assertEquals(currentMerged.getValue(), val);
            currentMerged = currentMerged.getNext();
        }
    }

    @Test
    void testOptimal1() {
        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4, null)));
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4, null)));

        ListNode currentMerged = solution.mergeTwoListsOptimal(list1, list2);
        for (int val : List.of(1, 1, 2, 3, 4, 4)) {
            Assertions.assertEquals(currentMerged.getValue(), val);
            currentMerged = currentMerged.getNext();
        }
    }

    @Test
    void testRecursive1() {
        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4, null)));
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4, null)));

        ListNode currentMerged = solution.mergeTwoListsRecursive(list1, list2);
        for (int val : List.of(1, 1, 2, 3, 4, 4)) {
            Assertions.assertEquals(currentMerged.getValue(), val);
            currentMerged = currentMerged.getNext();
        }
    }

    @Test
    void test2() {
        ListNode mergedList = solution.mergeTwoLists(null, null);
        Assertions.assertNull(mergedList);
    }

    @Test
    void test2Optimal() {
        ListNode mergedList = solution.mergeTwoListsOptimal(null, null);
        Assertions.assertNull(mergedList);
    }

    @Test
    void test2Recursive() {
        ListNode mergedList = solution.mergeTwoListsRecursive(null, null);
        Assertions.assertNull(mergedList);
    }

    @Test
    void test3() {
        ListNode currentMerged = solution.mergeTwoLists(null, new ListNode(0, null));
        Assertions.assertEquals(0, currentMerged.getValue());
        Assertions.assertNull(currentMerged.getNext());
    }

    @Test
    void test3Optimal() {
        ListNode currentMerged = solution.mergeTwoListsOptimal(null, new ListNode(0, null));
        Assertions.assertEquals(0, currentMerged.getValue());
        Assertions.assertNull(currentMerged.getNext());
    }

    @Test
    void test3Recursive() {
        ListNode currentMerged = solution.mergeTwoListsRecursive(null, new ListNode(0, null));
        Assertions.assertEquals(0, currentMerged.getValue());
        Assertions.assertNull(currentMerged.getNext());
    }
}
