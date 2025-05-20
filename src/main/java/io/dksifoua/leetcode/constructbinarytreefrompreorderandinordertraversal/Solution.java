package io.dksifoua.leetcode.constructbinarytreefrompreorderandinordertraversal;

import io.dksifoua.leetcode.utils.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;

        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            lookup.put(inorder[i], i);
        }

        TreeNode root = new TreeNode(preorder[0], null, null);

        int rootIndex = lookup.get(preorder[0]);

        int[] inorderLeft = Arrays.copyOfRange(inorder, 0, rootIndex);
        int[] inorderRight = rootIndex + 1 < inorder.length
                ? Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length)
                : new int[0];

        int[] preorderLeft = Arrays.copyOfRange(preorder, 1, inorderLeft.length + 1);
        int[] preorderRight = inorderLeft.length + 1 < preorder.length
                ? Arrays.copyOfRange(preorder, inorderLeft.length + 1, preorder.length)
                : new int[0];

        root.setLeft(this.buildTree(preorderLeft, inorderLeft));
        root.setRight(this.buildTree(preorderRight, inorderRight));

        return root;
    }
}
