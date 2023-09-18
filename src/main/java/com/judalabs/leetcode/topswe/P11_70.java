package com.judalabs.leetcode.topswe;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/climbing-stairs/submissions/
 */
public class P11_70 {

    private List<Integer> memo = new ArrayList<>();

    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        memo.add(0);
        memo.add(1);
        memo.add(2);

        int i = 3;
        while (i <= n) {
            final int actualMemo = memo.get(i - 1) + memo.get(i - 2);
            memo.add(actualMemo);
            i++;
        }

        return memo.get(memo.size() - 1);
    }
}
