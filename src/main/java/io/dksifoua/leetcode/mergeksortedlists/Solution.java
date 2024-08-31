package io.dksifoua.leetcode.mergeksortedlists;

import io.dksifoua.leetcode.utils.ListNode;

import java.util.*;

public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        lists = Arrays.stream(lists).filter(Objects::nonNull).toArray(ListNode[]::new);
        if (lists.length == 0) return null;

        Comparator<ListNode> comparator = (ListNode l1, ListNode l2) ->
                Integer.compare(l1.getValue(), l2.getValue());
        Queue<ListNode> queue = new PriorityQueue<>(lists.length, comparator);
        queue.addAll(Arrays.asList(lists));

        ListNode dummy = new ListNode(0, null);
        ListNode current = dummy;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            ListNode temp = node.getNext();
            node.setNext(null);

            current.setNext(node);
            current = current.getNext();

            if (temp != null) {
                queue.add(temp);
            }
        }

        return dummy.getNext();
    }
}
