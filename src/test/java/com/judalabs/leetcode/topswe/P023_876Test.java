package com.judalabs.leetcode.topswe;

import static com.judalabs.leetcode.topswe.helper.ListNodeHelper.fromArray;
import static com.judalabs.leetcode.topswe.helper.ListNodeHelper.toArray;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.judalabs.leetcode.topswe.helper.ListNode;

class P023_876Test {

    @MethodSource("examples")
    @ParameterizedTest
    void tests(ListNode input, ListNode output) {
        Assertions.assertArrayEquals(toArray(output), toArray(new P023_876().middleNode(input)));
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(fromArray(1, 2, 3, 4, 5), fromArray(3,4,5)),
                Arguments.of(fromArray(1, 2, 3, 4, 5, 6), fromArray(4,5,6))
        );
    }
}