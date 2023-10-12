package com.judalabs.leetcode.topswe;

import com.judalabs.leetcode.topswe.helper.TreeNode;

/*
https://leetcode.com/problems/validate-binary-search-tree/
 */
public class P021_98 {
    TreeNode ancestor = null;

    public boolean isValidBST(TreeNode currNode) {
        if(currNode== null) return true;
        if(isValidBST(currNode.left) && (ancestor == null || ancestor.val < currNode.val)) {
            ancestor = currNode;
            return isValidBST(currNode.right);
        }
        return false;
    }

}
