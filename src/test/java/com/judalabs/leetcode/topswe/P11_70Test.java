package com.judalabs.leetcode.topswe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P11_70Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(int input, int expected) {
        assertEquals(expected, new P11_70().climbStairs(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(15, 987)
        );
    }
}