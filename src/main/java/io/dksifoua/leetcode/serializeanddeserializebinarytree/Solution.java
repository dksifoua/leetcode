package io.dksifoua.leetcode.serializeanddeserializebinarytree;

import io.dksifoua.leetcode.utils.TreeNode;

import java.util.*;

public class Solution {

    public String serialize(TreeNode root) {
        if (root == null) return "null";

        List<String> list = new ArrayList<>();
        Deque<Optional<TreeNode>> deque = new ArrayDeque<>() {{ addLast(Optional.of(root)); }};
        while (!deque.isEmpty()) {
            Optional<TreeNode> node = deque.removeFirst();
            if (node.isEmpty()) {
                list.add("null");
            } else {
                list.add(String.valueOf(node.get().getValue()));
                deque.addLast(Optional.ofNullable(node.get().getLeft()));
                deque.addLast(Optional.ofNullable(node.get().getRight()));
            }
        }

        return String.join(" ", list.toArray(String[]::new));
    }

    public TreeNode deserialize(String data) {
        String[] array = data.split(" ");

        if (array.length == 0 || array[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(array[0]), null, null);
        Deque<TreeNode> deque = new ArrayDeque<>() {{ addLast(root); }};
        int i = 1;
        do {
            TreeNode node = deque.removeFirst();
            if (!array[i].equals("null")) {
                node.setLeft(new TreeNode(Integer.parseInt(array[i]), null, null));
                deque.addLast(node.getLeft());
            }
            if (!array[i + 1].equals("null")) {
                node.setRight(new TreeNode(Integer.parseInt(array[i + 1]), null, null));
                deque.addLast(node.getRight());
            }

            i += 2;
        } while (i < array.length);

        return root;
    }
}
