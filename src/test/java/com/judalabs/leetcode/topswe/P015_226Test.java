package com.judalabs.leetcode.topswe;

import static com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper.arrayToTree;
import static com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper.treeToArray;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.judalabs.leetcode.topswe.helper.TreeNode;

class P015_226Test {

    @ParameterizedTest
    @MethodSource("examples")
    void test(TreeNode input, TreeNode output) {
        Assertions.assertArrayEquals(treeToArray(output), treeToArray(new P015_226().invertTree(input)));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(arrayToTree(4, 2, 7, 1, 3, 6, 9), arrayToTree(4, 7, 2, 9, 6, 3, 1)),
                Arguments.of(arrayToTree(2, 1, 3), arrayToTree(2, 3, 1)),
                Arguments.of(arrayToTree(), arrayToTree()),
                Arguments.of(arrayToTree(2, 1, 3, 4), arrayToTree(2, 3, 1, 4))
        );
    }
}