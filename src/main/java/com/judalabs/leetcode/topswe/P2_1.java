package com.judalabs.leetcode.topswe;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
https://leetcode.com/problems/two-sum/
 */
public class P2_1 {

    public int[] twoSum2(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException();
    }

    public int[] twoSum(final int[] nums, int target) {
        final Map<Integer, Integer> numMap = IntStream.range(0, nums.length).boxed()
                .collect(Collectors.toMap(index -> nums[index], Function.identity(), (a, b) -> b));

        for(int i = 0; i < nums.length; i++) {
            final int complementValue = target - nums[i];

            if(numMap.containsKey(complementValue) && i != numMap.get(complementValue))
                return new int[]{i,numMap.get(complementValue)};
        }
        return new int []{};
    }
}
