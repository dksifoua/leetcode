package io.dksifoua.leetcode.validatebinarysearchtree;

import io.dksifoua.leetcode.utils.TreeNode;
import io.dksifoua.leetcode.utils.Tuple3;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        Queue<Tuple3<TreeNode, Long, Long>> queue = new LinkedList<>() {{
            add(new Tuple3<>(root, Long.MIN_VALUE, Long.MAX_VALUE));
        }};
        while (!queue.isEmpty()) {
            Tuple3<TreeNode, Long, Long> tuple3 = queue.remove();
            TreeNode node = tuple3.first();
            long min = tuple3.second(), max = tuple3.third();

            if (node.getValue() <= min || node.getValue() >= max) return false;

            if (node.getLeft() != null) queue.add(new Tuple3<>(node.getLeft(), min, (long) node.getValue()));
            if (node.getRight() != null) queue.add(new Tuple3<>(node.getRight(), (long) node.getValue(), max));
        }

        return true;
    }
}
