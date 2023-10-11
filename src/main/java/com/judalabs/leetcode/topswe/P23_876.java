package com.judalabs.leetcode.topswe;

import com.judalabs.leetcode.topswe.helper.ListNode;

/*
https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class P23_876 {

    public ListNode middleNode(ListNode head) {
        ListNode delayed = head;
        boolean update = true;

        while (head != null) {
            head = head.next;
            update = !update;
            if(update) {
                delayed = delayed.next;
            }
        }
        return delayed;
    }
}
