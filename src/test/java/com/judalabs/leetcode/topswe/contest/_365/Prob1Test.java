package com.judalabs.leetcode.topswe.contest._365;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Prob1Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(int[] input, long output) {
        Assertions.assertEquals(output, new Prob1().maximumTripletValue(input));
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(new int[]{12, 6, 1, 2, 7}, 77L),
                Arguments.of(new int[]{1, 10, 3, 4, 19}, 133L),
                Arguments.of(new int[]{1, 2, 3}, 0L)
        );
    }
}