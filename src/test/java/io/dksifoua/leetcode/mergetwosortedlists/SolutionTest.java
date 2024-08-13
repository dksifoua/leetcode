package io.dksifoua.leetcode.mergetwosortedlists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        Solution.ListNode list1 = new Solution.ListNode(1,
                new Solution.ListNode(2,
                        new Solution.ListNode(4, null)));
        Solution.ListNode list2 = new Solution.ListNode(1,
                new Solution.ListNode(3,
                        new Solution.ListNode(4, null)));

        Solution.ListNode currentMerged = solution.mergeTwoLists(list1, list2);
        for (int val : List.of(1, 1, 2, 3, 4, 4)) {
            Assertions.assertEquals(currentMerged.getVal(), val);
            currentMerged = currentMerged.getNext();
        }
    }

    @Test
    void testOptimal1() {
        Solution.ListNode list1 = new Solution.ListNode(1,
                new Solution.ListNode(2,
                        new Solution.ListNode(4, null)));
        Solution.ListNode list2 = new Solution.ListNode(1,
                new Solution.ListNode(3,
                        new Solution.ListNode(4, null)));

        Solution.ListNode currentMerged = solution.mergeTwoListsOptimal(list1, list2);
        for (int val : List.of(1, 1, 2, 3, 4, 4)) {
            Assertions.assertEquals(currentMerged.getVal(), val);
            currentMerged = currentMerged.getNext();
        }
    }

    @Test
    void test2() {
        Solution.ListNode mergedList = solution.mergeTwoLists(null, null);
        Assertions.assertNull(mergedList);
    }

    @Test
    void test2Optimal() {
        Solution.ListNode mergedList = solution.mergeTwoListsOptimal(null, null);
        Assertions.assertNull(mergedList);
    }

    @Test
    void test3() {
        Solution.ListNode currentMerged = solution.mergeTwoLists(null, new Solution.ListNode(0, null));
        Assertions.assertEquals(0, currentMerged.getVal());
        Assertions.assertNull(currentMerged.getNext());
    }

    @Test
    void test3Optimal() {
        Solution.ListNode currentMerged = solution.mergeTwoListsOptimal(null, new Solution.ListNode(0, null));
        Assertions.assertEquals(0, currentMerged.getVal());
        Assertions.assertNull(currentMerged.getNext());
    }
}
