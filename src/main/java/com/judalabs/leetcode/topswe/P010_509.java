package com.judalabs.leetcode.topswe;

import java.util.ArrayList;
import java.util.List;

public class P010_509 {

    private List<Integer> memo = new ArrayList<>();

    public int fib(int n) {
        if(n <= 2) return 1;
        memo.add(1);
        memo.add(1);
        int valor = 0;
        int i = 2;
        while (i < n) {
            final int fibAtual = memo.get(i - 1) + memo.get(i - 2);
            memo.add(fibAtual);
            i++;
        }
        return memo.get(memo.size() - 1);
    }
}
