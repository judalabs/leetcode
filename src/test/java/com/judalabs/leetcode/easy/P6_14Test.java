package com.judalabs.leetcode.easy;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P6_14Test {

    @ParameterizedTest
    @MethodSource("examples")
    void test(String[] s, String expected) {
        Assertions.assertEquals(expected, new P6_14().longestCommonPrefix(s));
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.of(new String[]{"dog","racecar","car"}, ""),
                Arguments.of(new String[]{"dog"}, "dog"),
                Arguments.of(new String[]{"ab", "a"}, "a")

        );
    }
}