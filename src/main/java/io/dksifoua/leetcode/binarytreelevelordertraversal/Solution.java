package io.dksifoua.leetcode.binarytreelevelordertraversal;

import io.dksifoua.leetcode.utils.TreeNode;
import io.dksifoua.leetcode.utils.Tuple2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Tuple2<TreeNode, Integer>> queue = new LinkedList<>() {{
            add(new Tuple2<>(root, 0));
        }};
        while (!queue.isEmpty()) {
            Tuple2<TreeNode, Integer> tuple2 = queue.remove();
            TreeNode node = tuple2.first();
            Integer level = tuple2.second();

            if (level <= result.size() - 1) {
                result.get(level).add(node.getValue());
            } else {
                result.add(new ArrayList<>() {{ add(node.getValue()); }});
            }

            if (node.getLeft() != null) queue.add(new Tuple2<>(node.getLeft(), level + 1));
            if (node.getRight() != null) queue.add(new Tuple2<>(node.getRight(), level + 1));
        }

        return result;
    }
}
