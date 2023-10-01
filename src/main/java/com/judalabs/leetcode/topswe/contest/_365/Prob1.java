package com.judalabs.leetcode.topswe.contest._365;

public class Prob1 {

    public long maximumTripletValue(int[] nums) {
        long max = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    final long actual = (long) (nums[i] - nums[j]) * nums[k];
                    if(actual > max)
                        max = actual;
                }
            }
        }
        return max;
    }
}
