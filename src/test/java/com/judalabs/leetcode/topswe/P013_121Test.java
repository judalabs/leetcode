package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P013_121Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(int[] input, int output) {
        Assertions.assertEquals(output, new P013_121().maxProfit(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                //                          -           +
//                Arguments.of(new int[]{1, 2, 3 ,4 ,5 ,6, 7 }, 0),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{7, 8, 1, 12, 6, 4}, 11),
                Arguments.of(new int[]{7, 3, 4, 3, 1}, 1)

        );
    }
}