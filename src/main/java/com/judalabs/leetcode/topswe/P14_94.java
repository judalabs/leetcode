package com.judalabs.leetcode.topswe;

import java.util.ArrayList;
import java.util.List;

import com.judalabs.leetcode.topswe.helper.TreeNode;

/*
https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class P14_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        final List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }

    private void inorderTraversal(TreeNode actual, List<Integer> list) {
        if(actual == null) return;
        inorderTraversal(actual.left, list);
        list.add(actual.val);
        inorderTraversal(actual.right, list);
    }
}

