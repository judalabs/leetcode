package com.judalabs.leetcode.topswe;

import com.judalabs.leetcode.topswe.helper.TreeNode;

/*
https://leetcode.com/problems/same-tree/
 */
public class P18_100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        return p.val == q.val &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }
}
