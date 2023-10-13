package com.judalabs.leetcode.topswe;

import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/description
 */
public class P029_20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(char currChar : s.toCharArray()) {
            if(currChar == '(')
                stack.push(')');
            else if(currChar == '[')
                stack.push(']');
            else if(currChar == '{')
                stack.push('}');

            else if(stack.isEmpty() || stack.pop() != currChar) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
