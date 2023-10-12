package com.judalabs.leetcode.topswe;

import static com.judalabs.leetcode.topswe.helper.LevelOrderTraversalHelper.arrayToTree;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.judalabs.leetcode.topswe.helper.TreeNode;

class P014_94Test {

    @ParameterizedTest
    @MethodSource("examples")
    void test(TreeNode input, TreeNode output) {
        Assertions.assertEquals(output, new P015_226().invertTree(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(arrayToTree(1,null,2,3), arrayToTree(1,3,2)),
                Arguments.of(arrayToTree(1), arrayToTree(1))
        );
    }
}