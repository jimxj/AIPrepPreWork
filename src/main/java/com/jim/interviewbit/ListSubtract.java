package com.jim.interviewbit;

import com.jim.interviewbit.common.ListNode;

import java.util.Stack;

public class ListSubtract {
    public ListNode subtract(ListNode a) {
        if (a == null || a.next == null) {
            return a;
        }

        ListNode faster = a;
        ListNode slower = a;
        int length = 0;
        while (faster != null && faster.next != null) {
            faster = faster.next.next;
            slower = slower.next;
            length++;
        }

        Stack<ListNode> lastHalf = new Stack<ListNode>();
        while (slower != null) {
            lastHalf.push(slower);
            slower = slower.next;
        }

        ListNode head = a;
        for (int i = 0; i < length; i++) {
            //while (!lastHalf.isEmpty()){
            head.val = lastHalf.pop().val - head.val;
            head = head.next;
        }

        return a;
    }
}
