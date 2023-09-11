package com.judalabs.leetcode.easy;

import java.util.List;
import java.util.stream.IntStream;


public class P1_412 {
    /*
    https://leetcode.com/problems/fizz-buzz/description/
     */
    public List<String> fizzBuzz(int n) {
        return IntStream.range(1, n + 1).parallel()
                .mapToObj(this::doReturn)
                .toList();
    }

    private String doReturn(int e) {
        final boolean isFizz = e % 3 == 0;
        final boolean isBuzz = e % 5 == 0;

        if(isFizz && isBuzz) return "FizzBuzz";
        if(isFizz) return "Fizz";
        if(isBuzz) return "Buzz";
        return String.valueOf(e);
    }
}
