package com.judalabs.leetcode.topswe;

import static com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper.arrayToTree;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.judalabs.leetcode.topswe.helper.TreeNode;

class P019_112Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(TreeNode p, int targetSum, boolean result) {
        Assertions.assertEquals(result, new P019_112().hasPathSum(p, targetSum));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(arrayToTree(1, 2), 1, false),
                Arguments.of(arrayToTree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1), 22, true),
                Arguments.of(arrayToTree(), 0, false),
                Arguments.of(arrayToTree(1, 2, 3), 5, false)
        );
    }
}