package com.judalabs.leetcode.topswe;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class P9_303Test {

    @MethodSource("examples")
    @ParameterizedTest
    void tests(int[] input, List<List<Integer>> ranges, List<Integer> outputs) {
        final P9_303 sut = new P9_303(input);
        for(int i = 0; i < ranges.size(); i++) {
            final List<Integer> range = ranges.get(i);
            final Integer output = outputs.get(i);
            Assertions.assertEquals(output, sut.sumRange(range.get(0), range.get(1)));
        }
    }
    //docker system prune

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(new int[]{-2, 0, 3, -5, 2, -1},
                        List.of(
                                List.of(0, 2),
                                List.of(2, 5),
                                List.of(0, 5)),
                        List.of(1, -1, -3)
                )
        );

    }

}