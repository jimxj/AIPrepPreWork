package com.jim.interviewbit;

import com.jim.interviewbit.common.ListNode;
import com.jim.interviewbit.utils.OutputUtils;
import org.junit.Test;

public class ListSubtractTest {

    @Test
    public void testIt() {
        ListSubtract testObject = new ListSubtract();

        //1 -> 2 -> 3 -> 4 -> 5
        ListNode list = ListNode.createList(1, 2, 3, 4, 5);

        OutputUtils.printLinkedList(testObject.subtract(list));
    }
}
