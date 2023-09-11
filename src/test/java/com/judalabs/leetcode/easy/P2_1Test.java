package com.judalabs.leetcode.easy;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P2_1Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(int[] input, int target, int[] expected) {
        Assertions.assertArrayEquals(expected, new P2_1().twoSum(input, target));
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0,1}),
                Arguments.of(new int[]{3,2,4}, 6, new int[]{1,2}),
                Arguments.of(new int[]{3,3}, 6, new int[]{0,1}));
    }
}