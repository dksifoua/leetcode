package io.dksifoua.leetcode.mergetwosortedlists;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Solution {

    @AllArgsConstructor
    @Getter
    @Setter
    public static class ListNode {
        private int val;
        private ListNode next;
    }

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
}
