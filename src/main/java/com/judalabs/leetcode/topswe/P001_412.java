package com.judalabs.leetcode.topswe;

import java.util.AbstractList;
import java.util.List;
import java.util.stream.IntStream;

/*
https://leetcode.com/problems/fizz-buzz/
 */
public class P001_412 {
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

    public List<String> fizzBuzz2(int n) {

        return new AbstractList<>() {
            public String get(int index) {
                return switch (++index % 15) {
                    case 0 -> "FizzBuzz";
                    case 3, 6, 9, 12 -> "Fizz";
                    case 5, 10 -> "Buzz";
                    default -> String.valueOf(index);
                };
            }

            public int size() {
                return n;
            }
        };
    }
}
