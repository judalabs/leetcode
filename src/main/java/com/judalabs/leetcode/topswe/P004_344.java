package com.judalabs.leetcode.topswe;

/*
https://leetcode.com/problems/reverse-string/
 */
public class P004_344 {

    public void reverseString(char[] s) {
        char aux;
        int right = s.length - 1;
        final int mid = s.length / 2;

        for(int left = 0; left < mid; left++) {
            aux = s[left];
            s[left] = s[right];
            s[right] = aux;
            right--;
        }
    }
}
