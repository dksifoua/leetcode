package io.dksifoua.leetcode.removenthnodefromendoflist;

import io.dksifoua.leetcode.utils.ListNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        ListNode previous = null, current = head, end = head;
        for (int i = 0; i < n; i++) {
            end = end.getNext();
        }
        while (end != null) {
            previous = current;
            current = current.getNext();
            end = end.getNext();
        }

        if (previous == null) {
            return current.getNext();
        }

        previous.setNext(current.getNext());

        return head;
    }
}
