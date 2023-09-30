package com.judalabs.leetcode.topswe.helper;

import static com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper.arrayToTree;
import static com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper.treeToArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class LevelOrderTraversalHelperTest {

    @Nested
    class ToTree {

        @Test
        void empty() {
            final TreeNode root = arrayToTree();
            Assertions.assertAll(
                    () -> Assertions.assertNull(root)
            );
        }

        @Test
        void nodes2() {
            final TreeNode root = arrayToTree(1, 2);
            Assertions.assertAll(
                    () -> Assertions.assertEquals(1, root.val),
                    () -> Assertions.assertEquals(2, root.left.val),
                    () -> Assertions.assertNull(root.right)
            );
        }

        @Test
        void nodes7() {
            final TreeNode root = arrayToTree(4, 2, 7, 1, 3, 6, 9);
            Assertions.assertAll(
                    () -> Assertions.assertEquals(4, root.val),
                    () -> Assertions.assertEquals(2, root.left.val),
                    () -> Assertions.assertEquals(7, root.right.val),
                    () -> Assertions.assertEquals(1, root.left.left.val),
                    () -> Assertions.assertEquals(3, root.left.right.val),
                    () -> Assertions.assertEquals(6, root.right.left.val),
                    () -> Assertions.assertEquals(9, root.right.right.val)
            );
        }

        @Test
        void broken() {
            final TreeNode root = arrayToTree(1, 2, 2, null, 3, null, 3);

            Assertions.assertAll(
                    () -> Assertions.assertEquals(1, root.val),
                    () -> Assertions.assertEquals(2, root.left.val),
                    () -> Assertions.assertEquals(3, root.left.right.val),
                    () -> Assertions.assertNull(root.left.left),

                    () -> Assertions.assertEquals(2, root.right.val),
                    () -> Assertions.assertEquals(3, root.right.right.val),
                    () -> Assertions.assertNull(root.right.left)
            );
        }
    }

    @Nested
    class ToList {

        @Test
        void nodesEmpty() {
            final int[] ints = treeToArray(null);
            Assertions.assertArrayEquals(new int[]{}, ints);
        }

        @Test
        void nodes3() {
            final int[] ints = treeToArray(new TreeNode(2,
                    new TreeNode(1), new TreeNode(3)));
            Assertions.assertArrayEquals(new int[]{2, 1, 3}, ints);
        }

        @Test
        void nodes7() {
            final int[] ints = treeToArray(new TreeNode(4,
                    new TreeNode(2,
                            new TreeNode(1), new TreeNode(3)),
                    new TreeNode(7,
                            new TreeNode(6), new TreeNode(9))));
            Assertions.assertArrayEquals(new int[]{4, 2, 7, 1, 3, 6, 9}, ints);
        }
    }
}