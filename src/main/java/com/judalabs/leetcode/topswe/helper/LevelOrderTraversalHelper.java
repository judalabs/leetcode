package com.judalabs.leetcode.topswe.helper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.google.common.collect.Lists;

public class LevelOrderTraversalHelper {

    private LevelOrderTraversalHelper() {
    }

    public static List<Integer> treeToList(TreeNode root) {
        final QueueData queueData = new QueueData();
        queueData.addIfPossible(root);
        while (queueData.isNotEmpty()) {
            final TreeNode actual = queueData.remove();
            queueData.addIfPossible(actual.left);
            queueData.addIfPossible(actual.right);
        }
        return queueData.data;
    }

    public static int[] treeToArray(TreeNode root) {
        return treeToList(root).stream().mapToInt(Integer::intValue).toArray();
    }

    public static TreeNode listToTree(List<Integer> list) {
        final QueueData queueData = new QueueData();
        if(list.isEmpty()) return null;
        final TreeNode root = new TreeNode(list.remove(0));
        queueData.addIfPossible(root);

        TreeNode actual = queueData.remove();
        while (!list.isEmpty()) {

            if(list.get(0) == null) {
               list.remove(0);
               continue;
            }

            if(actual.left == null) {
                actual.left = new TreeNode(list.remove(0));
                queueData.addIfPossible(actual.left);

            } else if(actual.right == null) {
                actual.right = new TreeNode(list.remove(0));
                queueData.addIfPossible(actual.right);
            } else {
                actual = queueData.remove();
            }
        }
        return root;
    }


    public static TreeNode arrayToTree(Integer... list) {
        return listToTree(Lists.newArrayList(list));
    }

    static class QueueData {
        private final Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> data = new ArrayList<>();

        void addIfPossible(TreeNode node) {
            if(node == null) return;
            queue.add(node);
            data.add(node.val);
        }

        TreeNode remove() {
            return queue.remove();
        }

        public boolean isNotEmpty() {
            return !queue.isEmpty();
        }
    }
}
