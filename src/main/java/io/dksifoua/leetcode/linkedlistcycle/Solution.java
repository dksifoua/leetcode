package io.dksifoua.leetcode.linkedlistcycle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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

    @AllArgsConstructor
    @Getter
    @Setter
    public static final class ListNode {
        private int val;
        private ListNode next;
    }
}
