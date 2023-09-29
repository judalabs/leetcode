package com.judalabs.leetcode.topswe;

import java.util.ArrayDeque;
import java.util.Deque;

import com.judalabs.leetcode.topswe.helper.TreeNode;

/*
https://leetcode.com/problems/invert-binary-tree/
 */
public class P015_226 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        final Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            final TreeNode actual = queue.remove();
            if(actual.left != null) {
                queue.add(actual.left);
            }
            if(actual.right != null) {
                queue.add(actual.right);
            }
            TreeNode aux = actual.left;
            actual.left = actual.right;
            actual.right = aux;
        }

        return root;
    }
}
