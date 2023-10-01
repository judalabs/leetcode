package com.judalabs.leetcode.topswe.contest._365;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Prob2Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(int[] input, long output) {
        Assertions.assertEquals(output, new Prob2().maximumTripletValue(input));
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(new int[]{6,14,20,19,19,10,3,15,12,13,8,1,2,15,3}, 285L),
                Arguments.of(new int[]{8,6,3,13,2,12,19,5,19,6,10,11,9}, 266L),
                Arguments.of(new int[]{1000000,1,1000000}, 999999000000L),
                Arguments.of(new int[]{12, 6, 1, 2, 7}, 77L),
                Arguments.of(new int[]{1, 10, 3, 4, 19}, 133L),
                Arguments.of(new int[]{1, 2, 3}, 0L)
        );
    }
}