package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P25_1971Test {

    @MethodSource("examples")
    @ParameterizedTest
    void tests(int n, int[][] edges, int source, int destination, boolean expected) {
        Assertions.assertEquals(expected, new P25_1971().validPath(n, edges, source, destination));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(10, new int[][]{{4, 3}, {1, 4}, {4, 8}, {1, 7}, {6, 4}, {4, 2}, {7, 4}, {4, 0}, {0, 9}, {5, 4}}, 5, 9, true),
                Arguments.of(6, new int[][]{{0, 1}, {0, 2}, {1, 3}, {3, 5}, {5, 4}, {4, 3}}, 0, 5, true),
                Arguments.of(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2, true),
                Arguments.of(3, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5, false)
        );
    }

}