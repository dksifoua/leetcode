package io.dksifoua.leetcode.addtwonumbers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        int retention = 0;
        ListNode result = new ListNode(0, null);
        ListNode current = result;
        while (l1 != null || l2 != null) {
            int sum = retention;
            if (l1 != null) {
                sum += l1.getVal();
                l1 = l1.getNext();
            }
            if (l2 != null) {
                sum += l2.getVal();
                l2 = l2.getNext();
            }
            retention = sum / 10;
            current.setNext(new ListNode(sum % 10, null));
            current = current.getNext();
        }

        if (retention > 0) {
            current.setNext(new ListNode(retention, null));
        }

        return result.getNext();
    }

    @AllArgsConstructor
    @Getter
    @Setter
    public static final class ListNode {
        private int val;
        private ListNode next;
    }
}
