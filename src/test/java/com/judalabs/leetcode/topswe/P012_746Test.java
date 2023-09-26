package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P012_746Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(int[] input, int expected) {
        Assertions.assertEquals(expected,new P012_746().minCostClimbingStairs(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(new int[]{2,2,1,0}, 2),
                Arguments.of(new int[]{10, 10, 1, 2}, 11),
                Arguments.of(new int[]{10,15,20}, 15),
                Arguments.of(new int[]{1,100,1,1,1,100,1,1,100,1}, 6)
        );
    }
}