package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper;
import com.judalabs.leetcode.topswe.helper.TreeNode;

class P20_111Test {

    @MethodSource("examples")
    @ParameterizedTest
    void tests(TreeNode input, int output) {
        Assertions.assertEquals(output, new P20_111().minDepth(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(LevelOrderTraversalHelper.arrayToTree(2,null,3,null,4,null,5,null,6), 5),
                Arguments.of(LevelOrderTraversalHelper.arrayToTree(3,9,20,null,null,15,7), 2),
                Arguments.of(LevelOrderTraversalHelper.arrayToTree(), 0)

        );
    }
}