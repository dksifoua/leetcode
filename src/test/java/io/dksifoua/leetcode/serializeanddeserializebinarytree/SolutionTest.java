package io.dksifoua.leetcode.serializeanddeserializebinarytree;

import io.dksifoua.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testSerialize_withValidInput() {
        TreeNode node = TreeNode.build(new Integer[] { 1, 2, 3, null, null, 4, 5 });
        assertEquals("1 2 3 null null 4 5 null null null null", solution.serialize(node));
    }

    @Test
    void testSerialize_withEmptyInput() {
        TreeNode node = TreeNode.build(new Integer[] {});
        assertEquals("null", solution.serialize(node));
    }

    @Test
    void testSerialize_withNullInput() {
        assertEquals("null", solution.serialize(null));
    }

    @Test
    void testDeserialize_withValidInput() {
        String data = "1 2 3 null null 4 5 null null null null";
        assertArrayEquals(new Integer[] { 1, 2, 3, null, null, 4, 5 }, solution.deserialize(data).toArray());
    }

    @Test
    void testDeserialize_withEmptyInput() {
        assertNull(solution.deserialize("null"));
    }
}