package io.dksifoua.addtwonumbers;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode solution = new ListNode(Integer.MIN_VALUE);
        ListNode current = solution;

        int retention = 0, sum = 0;
        ListNode node1 = l1, node2 = l2;
        while (node1 != null || node2 != null) {
            if (node1 != null) {
                sum += node1.val;
                node1 = node1.next;
            }
            if (node2 != null) {
                sum += node2.val;
                node2 = node2.next;
            }
            sum += retention;
            retention = sum / 10;
            sum %= 10;

            current = append(current, sum);
            sum = 0;
        }

        if (retention > 0) {
            append(current, retention);
        }

        return solution;
    }

    private ListNode append(ListNode current, int sum) {
        if(current.val == Integer.MIN_VALUE) {
            current.val = sum;
            return current;
        }
        current.next = new ListNode(sum);
        return current.next;
    }
}
