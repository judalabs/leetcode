package com.judalabs.leetcode.topswe;

import com.judalabs.leetcode.topswe.helper.TreeNode;

/*
https://leetcode.com/problems/symmetric-tree/
 */
public class P16_101 {

    public boolean isSymmetric(TreeNode root) {
        return verifyEquals(root.left, root.right);
    }

    private boolean verifyEquals(TreeNode left, TreeNode right) {
        if((left == null) != (right == null)) return false;
        if(left == null) return true;
        return left.val == right.val
                && verifyEquals(left.right, right.left)
                && verifyEquals(left.left, right.right);
    }
}
