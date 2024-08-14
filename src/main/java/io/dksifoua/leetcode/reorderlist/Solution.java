package io.dksifoua.leetcode.reorderlist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Solution {

    private ListNode findMiddle(ListNode head) {
        System.out.println("- Find the middle of the list");
        if (head == null || head.getNext() == null) return null;

        ListNode current = head.getNext(), middle = current, previous = head;
        while (current != null && current.getNext() != null) {
            previous = middle;
            middle = middle.getNext();
            current = current.getNext().getNext();
        }
        previous.setNext(null);
        return middle;
    }

    private ListNode reverse(ListNode head) {
        if (head == null) return null;

        ListNode previous = head, current = head.getNext();
        while (current != null) {
            ListNode temp = current.getNext();
            current.setNext(head);
            previous.setNext(temp);
            head = current;
            current = previous.getNext();
        }

        return head;
    }

    private void merge(ListNode list1, ListNode list2) {
        ListNode current = list1;
        while (current != null && list2 != null) {
            ListNode next = current.getNext();
            current.setNext(list2);
            list2 = list2.getNext();

            current = current.getNext();
            current.setNext(next);

            current = current.getNext();
            System.out.println("List1: " + list1);
            System.out.println("List2: " + list2);
        }
    }

    public void reorderList(ListNode head) {
        System.out.println(head);

        // Find the middle of the list
        ListNode middle = this.findMiddle(head);
        System.out.println("Head: " + head);
        System.out.println("Middle: " + middle);

        // Reverse the second half
        System.out.println("- Reverse the second half");
        middle = this.reverse(middle);
        System.out.println("Head: " + head);
        System.out.println("Middle: " + middle);

        // Merge the two halves
        System.out.println("- Merge the two halves");
        this.merge(head, middle);
        System.out.println("Reordered: " + head);
    }

    @AllArgsConstructor
    @Getter
    @Setter
    public static class ListNode {
        private int val;
        private ListNode next;

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();

            ListNode current = this;
            while (current != null) {
                result.append(current.getVal());
                if (current.getNext() != null) {
                    result.append(" -> ");
                } else {
                    result.append(" -> null");
                }
                current = current.getNext();
            }

            return result.toString();
        }
    }
}
