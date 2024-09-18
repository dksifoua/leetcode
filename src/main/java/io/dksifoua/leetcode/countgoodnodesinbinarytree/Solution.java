package io.dksifoua.leetcode.countgoodnodesinbinarytree;

import io.dksifoua.leetcode.utils.TreeNode;
import io.dksifoua.leetcode.utils.Tuple2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int goodNodes(TreeNode root) {
        int result = 0;
        if (root == null) return result;

        Queue<Tuple2<TreeNode, Integer>> queue = new LinkedList<>() {{
            add(new Tuple2<>(root, Integer.MIN_VALUE));
        }};
        while (!queue.isEmpty()) {
            Tuple2<TreeNode, Integer> tuple2 = queue.remove();
            TreeNode node = tuple2.first();
            Integer maxValue = tuple2.second();

            if (node.getValue() >= maxValue) {
                maxValue = node.getValue();
                result += 1;
            }

            if (node.getLeft() != null) queue.add(new Tuple2<>(node.getLeft(), maxValue));
            if (node.getRight() != null) queue.add(new Tuple2<>(node.getRight(), maxValue));
        }

        return result;
    }
}
