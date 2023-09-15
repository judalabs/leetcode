package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P5_125Test {

    @ParameterizedTest
    @MethodSource("examples")
    void test(String s, boolean expected) {
        Assertions.assertEquals(expected, new P5_125().isPalindrome(s));
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("0P", false),
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of(" ", true),
                Arguments.of("b a b", true)

        );
    }
}