package com.judalabs.leetcode.topswe;

import static com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper.arrayToTree;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.judalabs.leetcode.topswe.helper.TreeNode;

class P16_101Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(TreeNode root, boolean output) {
        Assertions.assertEquals(output, new P16_101().isSymmetric(root));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(arrayToTree(1, 2), false),
                Arguments.of(arrayToTree(1, null, 2), false),
                Arguments.of(arrayToTree(1, 2, 2, 3, 4, 4, 3), true),
                Arguments.of(arrayToTree(1, 2, 2, 3, 4, 4, 3,5), false),
                Arguments.of(arrayToTree(1, 2, 2, null, 3, null, 3), false),
                Arguments.of(arrayToTree(1), true)
        );
    }
}