package com.judalabs.leetcode.topswe;

import java.util.stream.IntStream;

/*
https://leetcode.com/problems/number-of-1-bits/
 */
public class P008_191 {

    public int hammingWeight(int n) {
        return IntStream.range(0, 32)
                .map(i -> calculateBitIndex(n, i)).sum();
    }

    private static int calculateBitIndex(int n, int i) {
        final int mask = 1 << i;
        if((n & mask) != 0) {
            return 1;
        }
        return 0;
    }
}
