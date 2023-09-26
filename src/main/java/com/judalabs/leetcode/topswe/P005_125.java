package com.judalabs.leetcode.topswe;

import java.util.Stack;

/*
https://leetcode.com/problems/valid-palindrome/
 */
public class P005_125 {

    public boolean isPalindrome(String s) {
        final String normalized = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        Stack<Character> stack = new Stack<>();

        int mid = normalized.length() / 2;
        for(int i = 0; i < mid; i++) {
            stack.push(normalized.charAt(i));
        }
        if(normalized.length() % 2 == 1) mid++;

        for(int i = mid; i < normalized.length(); i++) {
            if(stack.pop() != normalized.charAt(i)) return false;
        }
        return stack.isEmpty();
    }
}
