package io.dksifoua.leetcode.lrucache;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private final int capacity;
    private final Map<Integer, Node> data;
    private int currentCapacity;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.currentCapacity = 0;
        this.capacity = capacity;
        this.data = new HashMap<>();
        this.head = null;
        this.tail = null;
    }

    private void moveToEnd(int key) {
        Node node = this.data.get(key);
        if (node.getNext() == null) {
            return;
        }
        Node prev = node.getPrev(), next = node.getNext();
        if (prev == null) {
            next.setPrev(null);
            this.head = next;
        } else {
            prev.setNext(next);
            next.setPrev(prev);
        }
        this.tail.setNext(node);
        node.setPrev(this.tail);
        node.setNext(null);
        this.tail = this.tail.getNext();
    }

    private void addToEnd(int key, int value) {
        Node node = new Node(key, value, this.tail, null);
        if (this.currentCapacity == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = this.tail.getNext();
        }
        this.data.put(key, node);
        this.currentCapacity += 1;
    }

    private void removeHead() {
        int key = this.head.getKey();
        this.head = this.head.getNext();
        if (this.head == null) {
            this.tail = null;
        } else {
            this.head.setPrev(null);
        }
        this.data.remove(key);
        this.currentCapacity -= 1;
    }

    public int get(int key) {
        if (!data.containsKey(key)) {
            return -1;
        }

        this.moveToEnd(key);
        return data.get(key).getVal();
    }

    public void put(int key, int value) {
        if (this.data.containsKey(key)) {
            this.data.get(key).setVal(value);
            this.moveToEnd(key);
        } else {
            if (this.currentCapacity == this.capacity) {
                this.removeHead();
            }
            this.addToEnd(key, value);
        }
    }

    @AllArgsConstructor
    @Getter
    @Setter
    public static class Node {
        private int key;
        private int val;
        private Node prev;
        private Node next;
    }
}
