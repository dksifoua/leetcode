package io.dksifoua.leetcode.reverselinkedlist;

import io.dksifoua.leetcode.utils.ListNode;


public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode reversedHead = null, current = head;
        while (current != null) {
            reversedHead = new ListNode(current.getValue(), reversedHead);
            current = current.getNext();
        }

        return reversedHead;
    }

    public ListNode reverseListOptimal(ListNode head) {
        if (head == null) return null;

        ListNode prev = head, current = head.getNext();
        while (current != null) {
            prev.setNext(current.getNext());
            current.setNext(head);

            head = current;
            current = prev.getNext();
        }
        return head;
    }
}
