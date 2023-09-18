package com.judalabs.leetcode.topswe;

/*
https://leetcode.com/problems/power-of-three/
 */
public class P7_326 {

    public boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        if(n < 3) return false;

        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
