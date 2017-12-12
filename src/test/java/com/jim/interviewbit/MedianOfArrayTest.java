package com.jim.interviewbit;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class MedianOfArrayTest {
    @Test
    public void testIt() {
        MedianOfArray testObject = new MedianOfArray();
        assertEquals(3.0, testObject.findMedianSortedArrays(Arrays.asList(1, 4, 5), Arrays.asList(2, 3)));
        assertEquals(-20.0, testObject.findMedianSortedArrays(Arrays.asList(-50, -41, -40, -19, 5, 21, 28), Arrays.asList(-50, -21, -10)));
    }
}
