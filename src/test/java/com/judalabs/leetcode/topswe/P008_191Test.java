package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P008_191Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(int input, int expected) {
        Assertions.assertEquals(expected, new P008_191().hammingWeight(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(00000000000000000000000000001011, 3),
                Arguments.of(00000000000000000000000010000000, 1)
//                Arguments.of(11111111111111111111111111111101, 31)
        );
    }
}