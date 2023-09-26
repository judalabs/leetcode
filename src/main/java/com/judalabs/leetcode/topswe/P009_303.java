package com.judalabs.leetcode.topswe;

/*
https://leetcode.com/problems/range-sum-query-immutable/
 */
public class P009_303 {

    private final int[] nums;

    public P009_303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
