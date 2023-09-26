package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P004_344Test {


    @ParameterizedTest
    @MethodSource("examples")
    void tests(char[] mutableString, char[] expected) {
        new P004_344().reverseString(mutableString);
        Assertions.assertArrayEquals(expected, mutableString);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(new char[]{'h', 'e', 'l', 'l', 'o'}, new char[]{'o','l','l','e','h'}),
                Arguments.of(new char[]{'H','a','n','n','a','h'}, new char[]{'h','a','n','n','a','H'})
        );
    }
}