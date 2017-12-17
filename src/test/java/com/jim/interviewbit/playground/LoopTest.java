package com.jim.interviewbit.playground;

import com.jim.interviewbit.utils.OutputUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopTest {

    @Test
    public void testFor() {
        for (int i = 1; i < getSize(); i++) {
            System.out.println("loop " + i);
        }

        for (int i = 1; i < 1; i++) {
            System.out.println("loop2 " + i);
        }
    }


    @Test
    public void stringSplit() {
        String[] s = "hello    foo bar".split(" ");
        System.out.println(Arrays.toString(s));
    }

    @Test
    public void listTest() {
        ArrayList<Integer> row = new ArrayList<Integer>(1);
        for (int i = 0; i < 2; i++) {
            row.set(i, i);
        }
    }

    private int getSize() {
        System.out.println("getSize");
        return 2;
    }
}
