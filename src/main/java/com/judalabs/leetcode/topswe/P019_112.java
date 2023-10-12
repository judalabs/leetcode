package com.judalabs.leetcode.topswe;

import com.judalabs.leetcode.topswe.helper.TreeNode;

/*
https://leetcode.com/problems/path-sum/
 */
public class P019_112 {

    public boolean hasPathSum(TreeNode actual, int decrease) {
        if( actual == null ) return false;
        decrease -= actual.val;

        if(decrease == 0 && actual.left == null && actual.right == null) return true;
        return hasPathSum(actual.left, decrease) || hasPathSum(actual.right, decrease);
    }
}
