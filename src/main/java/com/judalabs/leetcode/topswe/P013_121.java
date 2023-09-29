package com.judalabs.leetcode.topswe;

/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class P013_121 {


    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        for(int i = 0; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            sell = Math.max(sell, prices[i] - buy);
        }

        return sell;
    }
// timeout version
//    public int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        for(int i = 0; i < prices.length; ++i) {
//            maxProfit = Math.max(maxProfit, maxProfitVisit(prices, i));
//        }
//        return maxProfit;
//    }
//
//    public int maxProfitVisit(int[] prices, int iteration) {
//        int localProfit = 0;
//        for(int i = iteration + 1; i < prices.length; ++i) {
//            localProfit = Math.max(localProfit, prices[i] - prices[iteration]);
//        }
//        return localProfit;
//    }

}
