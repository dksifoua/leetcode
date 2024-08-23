package io.dksifoua.leetcode.copylistwithrandompointer;

import io.dksifoua.leetcode.copylistwithrandompointer.Solution.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        assertNull(solution.copyRandomList(null));
    }

    @Test
    void test1Optimal() {
        assertNull(solution.copyRandomListOptimal(null));
    }

    @Test
    void test2() {
        Node node0 = new Node(7, null, null);
        Node node1 = new Node(13, null, null);
        Node node2 = new Node(11, null, null);
        Node node3 = new Node(10, null, null);
        Node node4 = new Node(1, null, null);

        node0.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        node1.setRandom(node0);
        node2.setRandom(node4);
        node3.setRandom(node2);
        node4.setRandom(node0);

        Node copiedHead = solution.copyRandomList(node0);

        assertNotSame(copiedHead, node0);
        assertEquals(copiedHead.toString(), node0.toString());

    }

    @Test
    void test2Optimal() {
        Node node0 = new Node(7, null, null);
        Node node1 = new Node(13, null, null);
        Node node2 = new Node(11, null, null);
        Node node3 = new Node(10, null, null);
        Node node4 = new Node(1, null, null);

        node0.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        node1.setRandom(node0);
        node2.setRandom(node4);
        node3.setRandom(node2);
        node4.setRandom(node0);

        Node copiedHead = solution.copyRandomListOptimal(node0);

        assertNotSame(copiedHead, node0);
        assertEquals(copiedHead.toString(), node0.toString());
    }

    @Test
    void test3() {
        Node node0 = new Node(1, null, null);
        Node node1 = new Node(2, null, null);

        node0.setNext(node1);

        node1.setRandom(node1);


        Node copiedHead = solution.copyRandomList(node0);

        assertNotSame(copiedHead, node0);
        assertEquals(copiedHead.toString(), node0.toString());
    }

    @Test
    void test3Optimal() {
        Node node0 = new Node(1, null, null);
        Node node1 = new Node(2, null, null);

        node0.setNext(node1);

        node1.setRandom(node1);


        Node copiedHead = solution.copyRandomList(node0);

        assertNotSame(copiedHead, node0);
        assertEquals(copiedHead.toString(), node0.toString());
    }

    @Test
    void test4() {
        Node node0 = new Node(3, null, null);
        Node node1 = new Node(3, null, null);
        Node node2 = new Node(3, null, null);

        node0.setNext(node1);
        node1.setNext(node2);

        node1.setRandom(node0);

        Node copiedHead = solution.copyRandomList(node0);

        assertNotSame(copiedHead, node0);
        assertEquals(copiedHead.toString(), node0.toString());

    }

    @Test
    void test4Optimal() {
        Node node0 = new Node(3, null, null);
        Node node1 = new Node(3, null, null);
        Node node2 = new Node(3, null, null);

        node0.setNext(node1);
        node1.setNext(node2);

        node1.setRandom(node0);

        Node copiedHead = solution.copyRandomList(node0);

        assertNotSame(copiedHead, node0);
        assertEquals(copiedHead.toString(), node0.toString());

    }
}
