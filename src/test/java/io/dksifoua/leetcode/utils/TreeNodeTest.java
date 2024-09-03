package io.dksifoua.leetcode.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeNodeTest {

    @Test
    void testBuildFromArray() {
        Integer[] array = new Integer[] { 3, 9, 20, null, null, 15, 7 };
        TreeNode tree = TreeNode.build(array);
        assertEquals("""
                3
                ├── 9
                └── 20
                    ├── 15
                    └── 7""", tree.toString());
    }

    @Test
    void testConvertToArray() {
        Integer[] array = new Integer[] { 3, 9, 20, null, null, 15, 7 };
        TreeNode tree = TreeNode.build(array);
        assertArrayEquals(array, tree.toArray());
    }
}
