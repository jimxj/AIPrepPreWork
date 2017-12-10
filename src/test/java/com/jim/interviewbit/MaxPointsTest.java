package com.jim.interviewbit;

import org.junit.Test;

import java.util.Arrays;

public class MaxPointsTest {

    @Test
    public void testIt() {
        MaxPoints maxPoints = new MaxPoints();
        int result = maxPoints.maxPoints(Arrays.asList(-6, -17, 5, -16, -18, -17), Arrays.asList(2, -4, 5, -13, -2, 20));
        System.out.println(result);
    }

}
