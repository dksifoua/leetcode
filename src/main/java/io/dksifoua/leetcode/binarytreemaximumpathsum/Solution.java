package io.dksifoua.leetcode.binarytreemaximumpathsum;

import io.dksifoua.leetcode.utils.TreeNode;

import java.util.Collections;
import java.util.List;

public class Solution {

    public int maxPathSum(TreeNode root) {
        int[] r = new int[] { Integer.MIN_VALUE };

        this.dfs(root, r);

        return r[0];
    }

    private int dfs(TreeNode node, int[] result) {
        if (node == null) {
            return 0;
        }

        int leftSum = this.dfs(node.getLeft(), result), rightSum = this.dfs(node.getRight(), result);

        result[0] = Collections.max(
                List.of(
                        result[0],
                        node.getValue(),
                        leftSum + node.getValue(),
                        leftSum + node.getValue() + rightSum,
                        node.getValue() + rightSum
                )
        );

        return Collections.max(List.of(node.getValue(), leftSum + node.getValue(), node.getValue() + rightSum));
    }

}
