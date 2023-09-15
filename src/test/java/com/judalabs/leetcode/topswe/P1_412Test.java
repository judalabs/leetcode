package com.judalabs.leetcode.topswe;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P1_412Test {

    @ParameterizedTest
    @MethodSource("examples")
    void tests(int input, List<String> expected) {
        Assertions.assertEquals(expected, new P1_412().fizzBuzz(input));
    }

    private static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(3, List.of("1", "2", "Fizz")),
                Arguments.of(5, List.of("1", "2", "Fizz", "4", "Buzz")),
                Arguments.of(15, List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"))
        );
    }
}