package com.judalabs.leetcode.topswe;

import com.judalabs.leetcode.topswe.helper.TreeNode;

/*
https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 */
public class P017_104 {

    public int maxDepth(TreeNode root) {
        return maxDepthVisit(root, 0);
    }

    public int maxDepthVisit(TreeNode actual, int level) {
        if(actual == null) return level;
        return Math.max(maxDepthVisit(actual.left, level), maxDepthVisit(actual.right, level)) + 1;
    }
}
