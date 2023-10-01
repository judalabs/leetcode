package com.judalabs.leetcode.topswe.contest._365;

public class Prob2 {

    public long maximumTripletValue(int[] nums) {
        long maxValueI = 0, maxDiff = 0, res = 0;
        for(int num : nums) {
            res = Math.max(res, maxDiff * num);
            maxDiff = Math.max(maxDiff, maxValueI - num);
            maxValueI = Math.max(maxValueI, num);
        }
        return res;
    }
}
