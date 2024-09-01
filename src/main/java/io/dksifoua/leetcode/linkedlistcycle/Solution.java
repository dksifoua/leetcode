package io.dksifoua.leetcode.linkedlistcycle;

import io.dksifoua.leetcode.utils.ListNode;

public class Solution {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
