package com.jim.interviewbit.playground;

import com.jim.interviewbit.utils.OutputUtils;
import org.junit.Test;

import java.util.Arrays;

public class LoopTest {

    @Test
    public void testFor() {
        for (int i = 1; i < getSize(); i++) {
            System.out.println("loop " + i);
        }

        for (int i = 1; i < 1; i++) {
            System.out.println("loop " + i);
        }
    }


    @Test
    public void stringSplit() {
        String[] s = "hello    foo bar".split(" ");
        System.out.println(Arrays.toString(s));
    }

    private int getSize() {
        System.out.println("getSize");
        return 2;
    }
}
