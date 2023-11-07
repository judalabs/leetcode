package com.judalabs.leetcode.other;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P287Test {
    @MethodSource("examples")
    @ParameterizedTest
    void tests(int[] input, int output) {
        Assertions.assertEquals(output, new P287().findDuplicate(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(new int[]{2,5,9,6,9,3,8,9,7,1}, 9),
                Arguments.of(new int[]{1,3,4,2,2}, 2),
                Arguments.of(new int[]{3,1,3,4,2}, 3),
                Arguments.of(new int[]{1,2,1}, 1)

        );
    }
}