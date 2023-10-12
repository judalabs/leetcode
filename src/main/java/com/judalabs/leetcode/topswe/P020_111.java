package com.judalabs.leetcode.topswe;

import java.util.LinkedList;
import java.util.Queue;

import com.judalabs.leetcode.topswe.helper.TreeNode;

/*
https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class P020_111 {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        final Queue<TreeNode> queue = new LinkedList<>();
        final Queue<Integer> queueLevel = new LinkedList<>();
        queue.add(root);
        queueLevel.offer(1);
        Integer actualLevel = 0;
        while (!queue.isEmpty()) {
            final TreeNode actual = queue.poll();
            actualLevel = queueLevel.poll();
            if(actual.left == null && actual.right == null) {
                return actualLevel;
            }
            if(actual.left != null) {
                queue.add(actual.left);
                queueLevel.add(actualLevel + 1);
            }
            if(actual.right != null) {
                queue.add(actual.right);
                queueLevel.add(actualLevel + 1);
            }
        }
        return actualLevel;
    }
//    DFS version
//    public int minDepth(TreeNode root) {
//        if(root == null) return 0;
//        return minDepth(root, 0);
//    }
//
//    private int minDepth(TreeNode actual, int i) {
//        if(actual == null) {
//            return Integer.MAX_VALUE;
//        }
//        if(actual.left == null && actual.right == null) return i+1;
//
//        return Math.min(minDepth(actual.left, i + 1), minDepth(actual.right, i + 1));
//    }
}
