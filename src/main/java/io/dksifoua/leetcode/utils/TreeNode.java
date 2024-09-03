package io.dksifoua.leetcode.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@AllArgsConstructor
@Getter
@Setter
public class TreeNode {

    private int value;
    private TreeNode left;
    private TreeNode right;

    public Integer[] toArray() {
        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                list.add(node.getValue());

                queue.add(node.getLeft());
                queue.add(node.getRight());
            } else {
                list.add(null);
            }
        }

        int i = list.size() - 1;
        while (i >= 0 && list.get(i) == null) {
            list.remove(i);
            i--;
        }

        return list.toArray(Integer[]::new);
    }

    public static TreeNode build(Integer[] array) {
        if (array == null || array.length == 0) return null;

        TreeNode root = new TreeNode(array[0], null, null);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < array.length) {
            TreeNode node = queue.poll();

            if (node != null && array[i] != null) {
                node.setLeft(new TreeNode(array[i], null, null));
                queue.add(node.getLeft());
            }
            i += 1;

            if (node != null && i < array.length && array[i] != null) {
                node.setRight(new TreeNode(array[i], null, null));
                queue.add(node.getRight());
            }
            i += 1;
        }

        return root;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        buildString(builder, "", "");
        return builder.toString().trim();
    }

    private void buildString(StringBuilder builder, String prefix, String childrenPrefix) {
        builder.append(prefix).append(value).append("\n");
        if (left != null && right != null) {
            left.buildString(builder, childrenPrefix + "├── ", childrenPrefix + "│   ");
            right.buildString(builder, childrenPrefix + "└── ", childrenPrefix + "    ");
        } else if (left != null) {
            left.buildString(builder, childrenPrefix + "└── ", childrenPrefix + "    ");
        } else if (right != null) {
            right.buildString(builder, childrenPrefix + "└── ", childrenPrefix + "    ");
        }
    }
}
