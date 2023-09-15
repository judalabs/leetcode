package com.judalabs.leetcode.topswe;

import java.util.Map;
import java.util.stream.Collectors;

/*
https://leetcode.com/problems/valid-anagram/
 */
public class P3_242 {

    public boolean isAnagram(String s, String t) {
        Map<Integer, Integer> letterCount = s.chars().boxed()
                .collect(Collectors.toMap(e -> e, a -> 1, (a, b) -> ++a));

        for(int i = 0; i < t.length(); ++i) {
            final char ch = t.charAt(i);
            Integer count = letterCount.get((int) ch);
            if(count != null) {
                if(count == 1)
                    letterCount.remove((int) ch);
                else
                    letterCount.put((int) ch, --count);
            } else {
                return false;
            }
        }
        return letterCount.isEmpty();
    }
}
