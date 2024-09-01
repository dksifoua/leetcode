package io.dksifoua.leetcode.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class ListNode {
    private int value;
    private ListNode next;

    public static  ListNode build(int[] array) {
        ListNode dummy = new ListNode(0, null);

        ListNode current = dummy;
        for (int element : array) {
            ListNode node = new ListNode(element, null);
            current.setNext(node);

            current = current.getNext();
        }

        return dummy.getNext();
    }

    public int[] toArray() {
        List<Integer> list = new ArrayList<>();
        ListNode current = this;
        while (current != null) {
            list.add(current.getValue());
            current = current.getNext();
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        ListNode current = this;
        while (current != null) {
            result.append(current.getValue());
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
