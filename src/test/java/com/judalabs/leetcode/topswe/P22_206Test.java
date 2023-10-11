package com.judalabs.leetcode.topswe;

import static com.judalabs.leetcode.topswe.helper.ListNodeHelper.fromArray;
import static com.judalabs.leetcode.topswe.helper.ListNodeHelper.toArray;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.judalabs.leetcode.topswe.helper.ListNode;

class P22_206Test {

    @MethodSource("examples")
    @ParameterizedTest
    void tests(ListNode input, ListNode output) {
        final int[] array = toArray(output);
        final int[] array1 = toArray(new P22_206().reverseList(input));
        Assertions.assertArrayEquals(array, array1);
    }

    public static Stream<Arguments> examples() {
        return Stream.of(
                Arguments.of(fromArray(1, 2, 3, 4, 5), fromArray(5, 4, 3, 2, 1)),
                Arguments.of(fromArray(1,2), fromArray(2,1)),
                Arguments.of(fromArray(1), fromArray(1)),
                Arguments.of(null, null)
        );
    }
}