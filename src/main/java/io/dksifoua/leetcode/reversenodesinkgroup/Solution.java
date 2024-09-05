package io.dksifoua.leetcode.reversenodesinkgroup;

import io.dksifoua.leetcode.utils.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        int length = this.computeLength(head);

        if (head == null || head.getNext() == null || k == 1 || k > length) {
            return head;
        }

        return this.reverse(head, k, length);
    }

    public ListNode reverseKGroupOptimalSpace(ListNode head, int k) {
        int length = this.computeLength(head);

        if (head == null || head.getNext() == null || k == 1 || k > length) {
            return head;
        }

        int left = length;
        ListNode reversedHead = null;
        ListNode previous = null, current = head;
        while (left >= k) {
            Map<String, ListNode> map = this.reverse(current, k);

            if (reversedHead == null) {
                reversedHead = map.get("head");
            } else {
                previous.setNext(map.get("head"));
            }
            previous = map.get("previous");
            current = map.get("current");

            left -= k;
        }

        return reversedHead;
    }

    private int computeLength(ListNode head) {
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length += 1;
            node = node.getNext();
        }

        return length;
    }

    private Map<String, ListNode> reverse(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        int i = 1;
        ListNode previous = head, current = head.getNext();
        while (current != null && i < k) {
            previous.setNext(current.getNext());
            current.setNext(head);

            head = current;

            current = previous.getNext();
            i += 1;
        }

        Map<String, ListNode> map = new HashMap<>();
        map.put("head", head);
        map.put("previous", previous);
        map.put("current", current);

        return map;
    }

    private ListNode reverse(ListNode head, int k, int left) {
        if (head == null || left < k) {
            return head;
        }

        int i = 1;
        ListNode previous = head, current = head.getNext();
        while (current != null && i < k) {
            previous.setNext(current.getNext());
            current.setNext(head);

            head = current;

            current = previous.getNext();
            i += 1;
        }

        previous.setNext(this.reverse(current, k, left - k));

        return head;
    }
}
