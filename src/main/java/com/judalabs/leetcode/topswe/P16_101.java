package com.judalabs.leetcode.topswe;

import com.judalabs.leetcode.topswe.helper.TreeNode;

/*
https://leetcode.com/problems/symmetric-tree/
 */
public class P16_101 {

    public boolean isSymmetric(TreeNode root) {
        reverse(root.left);
        return verifyEquals(root.left, root.right);
    }

    private void reverse(TreeNode actual) {
        if(actual == null) return;

        TreeNode aux = actual.left;
        actual.left = actual.right;
        actual.right = aux;
        reverse(actual.left);
        reverse(actual.right);
    }

    private boolean verifyEquals(TreeNode left, TreeNode right) {
        if((left == null) != (right == null)) return false;
        if(left == null) return true;
        return left.val == right.val
                && verifyEquals(left.left, right.left)
                && verifyEquals(left.right, right.right);
    }
}
