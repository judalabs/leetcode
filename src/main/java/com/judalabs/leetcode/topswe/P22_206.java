package com.judalabs.leetcode.topswe;

import com.judalabs.leetcode.topswe.helper.ListNode;

/*
https://leetcode.com/problems/reverse-linked-list/
 */
public class P22_206 {

    ListNode newHead = null;
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        while(head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

//    public ListNode reverseList(ListNode head) {
//        if(head == null) return null;
//        return visit(head);
//    }
//
//    private ListNode visit(ListNode head) {
//        if(head.next == null) return head;
//        ListNode newHead = visit(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }

}
