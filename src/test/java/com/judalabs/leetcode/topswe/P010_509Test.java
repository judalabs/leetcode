package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P010_509Test {

    @MethodSource("examples")
    @ParameterizedTest
    void test(int input, int expected) {
        Assertions.assertEquals(expected, new P010_509().fib(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
            Arguments.of(0, 1),
            Arguments.of(2, 1),
            Arguments.of(3, 2),
            Arguments.of(4, 3),
            Arguments.of(20, 6765)
        );
    }
}