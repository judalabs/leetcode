package com.judalabs.leetcode.other;

/*
https://leetcode.com/problems/find-the-duplicate-number/
 */
public class P287 {

    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        for(int i = 0; i < nums.length; i++) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast)
                break;
        }
        int pointer = nums[0];
        while (pointer != slow) {
            slow = nums[slow];
            pointer = nums[pointer];
        }
        return pointer;
    }
}
