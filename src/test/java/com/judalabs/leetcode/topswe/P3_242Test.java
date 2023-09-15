package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P3_242Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(String s, String t, boolean expected) {
        Assertions.assertEquals(expected, new P3_242().isAnagram(s, t));
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("ab", "a", false),
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false),
                Arguments.of("aba", "baa", true),
                Arguments.of("tritri", "tirrti", true),
                Arguments.of("b", "b", true)
        );
    }
}