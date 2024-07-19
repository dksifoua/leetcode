package io.dksifoua.leetcode.minstack;

public class MinStack {

    private record Node(int val, int min, Node next) {}

    private Node head;

    public MinStack() {
        head = null;
    }

    public void push(int val) {
        if (head == null) {
            head = new Node(val, val, null);
        } else {
            head = new Node(val, Math.min(head.min(), val), head);
        }
    }

    public void pop() {
        head = head.next();
    }

    public int top() {
        return head.val();
    }

    public int getMin() {
        return head.min();
    }
}
