package io.dksifoua.leetcode.reverselinkedlist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



public class Solution {

    @AllArgsConstructor
    @Getter
    @Setter
    static class ListNode {
        private int val;
        private ListNode next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode reversedHead = null, current = head;
        while (current != null) {
            reversedHead = new ListNode(current.getVal(), reversedHead == null ? null : reversedHead);
            current = current.getNext();
        }

        return reversedHead;
    }
}
