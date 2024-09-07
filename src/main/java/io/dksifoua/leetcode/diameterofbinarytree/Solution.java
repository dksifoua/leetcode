package io.dksifoua.leetcode.diameterofbinarytree;

import com.sun.source.tree.Tree;
import io.dksifoua.leetcode.utils.TreeNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    private int height(TreeNode node, int[] diameter) {
        if (node == null) {
            return 0;
        }

        int leftHeight = this.height(node.getLeft(), diameter);
        int rightHeight = this.height(node.getRight(), diameter);

        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];

        this.height(root, diameter);

        return diameter[0];
    }

    public int diameterOfBinaryTreeIterative(TreeNode root) {
        int diameter = 0;

        if (root == null) {
            return diameter;
        }

        Map<TreeNode, Tuple> heights = new HashMap<>() {{
            put(null, new Tuple(0, 0));
        }};
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.getLast();
            TreeNode leftNode = node.getLeft(), rightNode = node.getRight();

            if (heights.containsKey(leftNode) && heights.containsKey(rightNode)) {
                Tuple height = new Tuple(
                        1 + Math.max(heights.get(leftNode).get_1(), heights.get(leftNode).get_2()),
                        1 + Math.max(heights.get(rightNode).get_1(), heights.get(rightNode).get_2())
                );
                heights.put(node, height);
                // System.out.printf("%s, (%s, %s)%n", node.getValue(), height.left(), height.right());
                queue.removeLast();
                diameter = Math.max(diameter, height.get_1() + height.get_2() - 2);
                continue;
            }

            if (leftNode != null) {
                queue.addLast(leftNode);
            }

            if (rightNode != null) {
                queue.addLast(rightNode);
            }

            if (leftNode == null && rightNode == null) {
                heights.put(node, new Tuple(1, 1));
                // System.out.printf("%s, (%s, %s)%n", node.getValue(), 1, 1);
                queue.removeLast();
            }
        }

        return diameter;
    }

    @AllArgsConstructor
    @Getter
    private static class Tuple {
        private int _1;
        private int _2;
    }
}
