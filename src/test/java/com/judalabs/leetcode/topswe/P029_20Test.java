package com.judalabs.leetcode.topswe;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P029_20Test {
    @MethodSource("examples")
    @ParameterizedTest
    void tests(String input, boolean output) {
        Assertions.assertEquals(output, new P029_20().isValid(input));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of("(())", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("(())", true),
                Arguments.of("]", false)
        );
    }
}