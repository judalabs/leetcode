package com.judalabs.leetcode.topswe;

/*
https://leetcode.com/problems/min-cost-climbing-stairs/
 */
public class P012_746 {


    public int minCostClimbingStairs(int[] cost) {
        for(int i = 2; i < cost.length; i++) {
            cost[i] = Math.min(cost[i-1], cost[i-2]) + cost[i];
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
//    public int minCostClimbingStairs(int[] cost) {
//        return Math.min(
//                minCostClimbingStairsVisit(cost, cost[0], 0),
//                minCostClimbingStairsVisit(cost, cost[1], 1));
//    }
//
//    private int minCostClimbingStairsVisit(int[] cost, int actualSum, int index) {
//        if(index >= cost.length - 2) {
//            return actualSum;
//        }
//        return Math.min(
//                minCostClimbingStairsVisit(cost, actualSum + cost[index + 1], index + 1),
//                minCostClimbingStairsVisit(cost, actualSum + cost[index + 2], index + 2)
//        );
//    }
}
