package com.judalabs.leetcode.topswe;

/*
https://leetcode.com/problems/longest-common-prefix/submissions/
 */
public class P006_14 {

    public String longestCommonPrefix(String[] strs) {
        int longest = 0;
        final String baseString = strs[0];

        for(int i = 0; i < baseString.length(); i++) {
            for(int stringIndex = 1; stringIndex < strs.length; stringIndex++) {
                if(strs[stringIndex].length() <= i || strs[stringIndex].charAt(i) != baseString.charAt(i)) {
                    return baseString.substring(0, longest);
                }
            }
            longest++;
        }
        return baseString;
    }
}
