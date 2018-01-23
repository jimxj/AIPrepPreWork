package com.jim.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int a) {
        List<Integer> result = new ArrayList<Integer>();
        grayCodeHelper(a, 0, 0, result);
        return result;
    }

    private void grayCodeHelper(int a, int value, int start, List<Integer> result) {
        System.out.println("value=" + Integer.toBinaryString(value) + ", start=" + start) ;
        if (!result.contains(value)) {
            result.add(value);
        }

        for (int i = start; i < a; i++) {
            grayCodeHelper(a, value ^ (1 << i), i + 1, result);
        }
    }
}
