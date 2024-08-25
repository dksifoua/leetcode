package io.dksifoua.leetcode.mergetwosortedlists;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = null, currentMerged = null;
        ListNode current1 = list1, current2 = list2;
        while (current1 != null || current2 != null) {
            int val;
            if (current1 != null && current2 != null) {
                val = Math.min(current1.getVal(), current2.getVal());
                if (current1.getVal() <= current2.getVal()) {
                    current1 = current1.getNext();
                } else {
                    current2 = current2.getNext();
                }
            } else if (current1 == null) {
                val = current2.getVal();
                current2 = current2.getNext();
            } else {
                val = current1.getVal();
                current1 = current1.getNext();
            }

            if (mergedList == null) {
                mergedList = new ListNode(val, null);
                currentMerged = mergedList;
            } else {
                currentMerged.setNext(new ListNode(val, null));
                currentMerged = currentMerged.getNext();
            }
        }

        return mergedList;
    }

    public ListNode mergeTwoListsOptimal(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode mergedList = new ListNode(0, null), current = mergedList;
        while (list1 != null && list2 != null) {
            if (list1.getVal() <= list2.getVal()) {
                current.setNext(new ListNode(list1.getVal(), null));
                list1 = list1.getNext();
            } else {
                current.setNext(new ListNode(list2.getVal(), null));
                list2 = list2.getNext();
            }

            current = current.getNext();
        }

        if (list1 != null) current.setNext(list1);
        if (list2 != null) current.setNext(list2);

        return mergedList.getNext();
    }

    public ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode mergedList = new ListNode(0, null);
        if (list1.getVal() < list2.getVal()) {
            mergedList.setNext(new ListNode(list1.getVal(), this.mergeTwoListsRecursive(list1.getNext(), list2)));
        } else {
            mergedList.setNext(new ListNode(list2.getVal(), this.mergeTwoListsRecursive(list1, list2.getNext())));
        }
        return mergedList.getNext();
    }

    @AllArgsConstructor
    @Getter
    @Setter
    public static class ListNode {
        private int val;
        private ListNode next;
    }
}
