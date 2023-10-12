package com.judalabs.leetcode.topswe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.judalabs.leetcode.topswe.helper.TreeNode;

/*
https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class P024_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> level = new LinkedList<>();
        final List<List<Integer>> lists = new ArrayList<>();
        if(root == null) return new ArrayList<>();

        queue.add(root);
        lists.add(List.of(root.val));
        level.add(0);
        while (!queue.isEmpty()) {
            final TreeNode actual = queue.remove();
            final int thisLevel = level.remove();
            final List<Integer> innerlist = new ArrayList<>();
            if(actual.left != null) {
                queue.add(actual.left);
                innerlist.add(actual.left.val);
                level.add(thisLevel + 1);

            }
            if(actual.right != null) {
                queue.add(actual.right);
                innerlist.add(actual.right.val);
                level.add(thisLevel + 1);
            }
            if(!innerlist.isEmpty()) {
                if(thisLevel + 1 < lists.size()) {
                    lists.get(thisLevel + 1).addAll(innerlist);
                } else {
                    lists.add(innerlist);
                }
            }
        }
        return lists;
    }
}
