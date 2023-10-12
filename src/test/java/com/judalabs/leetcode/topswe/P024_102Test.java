package com.judalabs.leetcode.topswe;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper;
import com.judalabs.leetcode.topswe.helper.TreeNode;

class P024_102Test {
    @MethodSource("examples")
    @ParameterizedTest
    void tests(TreeNode input, List<List<Integer>> output) {
        Assertions.assertEquals(output, new P024_102().levelOrder(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(LevelOrderTraversalHelper.arrayToTree(3,9,20,80,69,15,7),
                        List.of(List.of(3), List.of(9, 20), List.of(80,69,15, 7))),
                Arguments.of(LevelOrderTraversalHelper.arrayToTree(3, 9, 20, null, null, 15, 7),
                        List.of(List.of(3), List.of(9, 20), List.of(15, 7)))
        );
    }
}