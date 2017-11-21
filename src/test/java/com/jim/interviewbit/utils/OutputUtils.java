package com.jim.interviewbit.utils;

import com.jim.interviewbit.common.ListNode;

import java.util.ArrayList;

public class OutputUtils {

    public static <T> void printArrayList(ArrayList<T> list) {
        for (T row : list) {
            System.out.println(row);
        }
    }

    public static void printLinkedList(ListNode list) {
        int i = 0;
        ListNode head = list;
        while(head != null) {
            if (i > 0) {
                System.out.print("->");
            }
            i++;
            System.out.print(head.val);
            head = head.next;
        }

        System.out.println();
    }
}
