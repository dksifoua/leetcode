package io.dksifoua.leetcode.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListNodeTest {

    @Test
    void testPrintNotNull() {
        ListNode list = new ListNode(
                0,
                new ListNode(
                        1,
                        new ListNode(
                                2,
                                null
                        )
                )
        );
        assertEquals("0 -> 1 -> 2 -> null", list.toString());
    }

    @Test
    void testBuild() {
        ListNode list = ListNode.build(new int[] { 0, 1, 2, 3, 4, 5 });
        assertEquals("0 -> 1 -> 2 -> 3 -> 4 -> 5 -> null", list.toString());
    }

    @Test
    void testConvertToArray() {
        ListNode list = ListNode.build(new int[] { 0, 1, 2, 3, 4, 5 });
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, list.toArray());
    }
}
