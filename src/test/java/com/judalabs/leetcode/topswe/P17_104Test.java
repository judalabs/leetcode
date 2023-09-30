package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper;
import com.judalabs.leetcode.topswe.helper.TreeNode;

class P17_104Test {


    @ParameterizedTest
    @MethodSource("examples")
    void tests(TreeNode input, int output) {
        Assertions.assertEquals(output, new P17_104().maxDepth(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(LevelOrderTraversalHelper.arrayToTree(1), 1),
                Arguments.of(LevelOrderTraversalHelper.arrayToTree(1,null, 2), 2),
                Arguments.of(LevelOrderTraversalHelper.arrayToTree(3,9,20,null,null,15,7), 3)

        );
    }
}