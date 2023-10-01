package com.judalabs.leetcode.topswe;

import static com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper.arrayToTree;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.judalabs.leetcode.topswe.helper.TreeNode;

class P18_100Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(TreeNode p, TreeNode q, boolean result) {
        Assertions.assertEquals(result, new P18_100().isSameTree(p, q));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(arrayToTree(1, 2, 1), arrayToTree(1, 1, 2), false),
                Arguments.of(arrayToTree(1, 2, 3), arrayToTree(1, 2, 3), true),
                Arguments.of(arrayToTree(1, 2), arrayToTree(1, null, 2), false),
                Arguments.of(arrayToTree(1, null, 1), arrayToTree(1, 1, 1), false)

        );
    }
}