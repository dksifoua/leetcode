package io.dksifoua.leetcode.sameTree;

import io.dksifoua.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        return p.getValue() == q.getValue()
                && this.isSameTree(p.getLeft(), q.getLeft())
                && this.isSameTree(p.getRight(), q.getRight());
    }

    public boolean isSameTreeIterative(TreeNode p, TreeNode q) {
        Queue<TreeNode> pQueue = new LinkedList<>() {{ add(p); }};
        Queue<TreeNode> qQueue = new LinkedList<>() {{ add(q); }};
        while (!pQueue.isEmpty() && !qQueue.isEmpty()) {
            TreeNode _p = pQueue.poll(), _q = qQueue.poll();
            if (_p == null && _q == null) continue;
            if (_p == null || _q == null || _p.getValue() != _q.getValue()) return false;

            pQueue.add(_p.getLeft());
            qQueue.add(_q.getLeft());

            pQueue.add(_p.getRight());
            qQueue.add(_q.getRight());
        }

        return true;
    }
}
