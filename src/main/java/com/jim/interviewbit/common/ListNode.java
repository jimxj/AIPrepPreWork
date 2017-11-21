package com.jim.interviewbit.common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) { val = x; next = null; }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createList(int... list) {
        ListNode head = null;
        if (list.length > 0) {
            for (int i = list.length - 1; i >= 0; i--) {
                if (head == null) {
                    head = new ListNode(list[i]);
                } else {
                    ListNode newNode = new ListNode(list[i], head);
                    head = newNode;
                }
            }
        }

        return head;
    }
}
