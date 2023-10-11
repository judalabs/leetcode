package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper;
import com.judalabs.leetcode.topswe.helper.TreeNode;

class P21_98Test {
    @MethodSource("examples")
    @ParameterizedTest
    void tests(TreeNode input, boolean output) {
        Assertions.assertEquals(output, new P21_98().isValidBST(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(LevelOrderTraversalHelper.arrayToTree(5,4,6,null,null,3,7), false),
                Arguments.of(LevelOrderTraversalHelper.arrayToTree(2,1,3), true),
                Arguments.of(LevelOrderTraversalHelper.arrayToTree(5,1,4,null,null,3,6), false)
        );
    }
}