package io.dksifoua.leetcode.copylistwithrandompointer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> old2new = new HashMap<>();
        Node current = head;
        while (current != null) {
            old2new.put(current, new Node(current.getVal(), null, null));
            current = current.getNext();
        }

        current = head;
        while (current != null) {
            old2new.get(current).setNext(old2new.get(current.getNext()));
            old2new.get(current).setRandom(old2new.get(current.getRandom()));
            current = current.getNext();
        }

        return old2new.get(head);
    }

    public Node copyRandomListOptimal(Node head) {
        if (head == null) return null;

        Node current = head;
        while (current != null) {
            Node copiedNode = new Node(current.getVal(), current.getNext(), null);

            current.setNext(copiedNode);
            current = current.getNext().getNext();
        }

        current = head;
        while (current != null) {
            if (current.getRandom() != null) {
                current.getNext().setRandom(current.getRandom().getNext());
            }
            current = current.getNext().getNext();
        }

        Node dummy = new Node(0, null, null);
        Node currentDummy = dummy;
        current = head;
        while (current != null) {
            currentDummy.setNext(current.getNext());
            current.setNext(current.getNext().getNext());

            current = current.getNext();
            currentDummy = currentDummy.getNext();
        }


        return dummy.getNext();
    }

    @AllArgsConstructor
    @Getter
    @Setter
    public static final class Node {
        private int val;
        private Node next;
        private Node random;

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder();

            Node current = this;
            while (current != null) {
                int val = current.getVal(), random = current.getRandom() == null ? -1 : getVal();
                str.append(String.format("[%s, %s] -> ", val, random == -1 ? "null" : random));
                current = current.getNext();
            }
            str.append("null");

            return str.toString();
        }
    }
}
