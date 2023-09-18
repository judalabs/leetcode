package com.judalabs.leetcode.topswe;


import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P7_326Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(int n, boolean expected) {
        Assertions.assertEquals(expected,new P7_326().isPowerOfThree(n));
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(0, false),
                Arguments.of(1, true),
                Arguments.of(27, true),
                Arguments.of(45, false),
                Arguments.of(2, false),
                Arguments.of(-2, false),
                Arguments.of(8, false),
                Arguments.of(-1, false)
        );
    }
}