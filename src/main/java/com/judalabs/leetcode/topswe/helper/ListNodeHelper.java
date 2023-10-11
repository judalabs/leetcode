package com.judalabs.leetcode.topswe.helper;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListNodeHelper {

    public static ListNode fromArray(int... values) {
        if(values.length == 0) return null;

        final List<ListNode> list = Arrays.stream(values).mapToObj(ListNode::new).toList();
        for(int i = 1; i < list.size(); i++) {
            list.get(i-1).next = list.get(i);
        }
        return list.get(0);
    }

    public static int[] toArray(ListNode node) {
        final List<Integer> objects = new LinkedList<>();
        while(node != null) {
            objects.add(node.val);
            node = node.next;
        }
        final int[] ints = new int[objects.size()];
        int index = 0;
        for(Integer object : objects) {
            ints[index++] = object;
        }
        return ints;
    }
}
