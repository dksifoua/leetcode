package io.dksifoua.leetcode.binarytreerightsideview;

import io.dksifoua.leetcode.utils.TreeNode;
import io.dksifoua.leetcode.utils.Tuple2;

import java.util.*;

public class Solution {

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        Queue<Tuple2<Integer, TreeNode>> queue = new LinkedList<>() {{ add(new Tuple2<>(0, root)); }};
        while (!queue.isEmpty()) {
            Tuple2<Integer, TreeNode> levelToNodeTuple = queue.remove();
            int level = levelToNodeTuple.first();
            TreeNode node = levelToNodeTuple.second();
            if (result.size() - 1 < level) {
                result.add(node.getValue());
            } else {
                result.set(level, node.getValue());
            }

            if (node.getLeft() != null) queue.add(new Tuple2<>(level + 1, node.getLeft()));
            if (node.getRight() != null) queue.add(new Tuple2<>(level + 1, node.getRight()));
        }

        return result;
    }

    public List<Integer> rightSideViewRecursive(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        dfs(root, result, 0);

        return result;
    }

    private void dfs(TreeNode node, List<Integer> result, int level) {
        if (result.size() - 1 < level) {
            result.add(node.getValue());
        } else {
            result.set(level, node.getValue());
        }

        if (node.getLeft() != null) dfs(node.getLeft(), result, level + 1);
        if (node.getRight() != null) dfs(node.getRight(), result, level + 1);
    }
}
