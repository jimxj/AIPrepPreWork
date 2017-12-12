package com.jim.interviewbit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntSquareTest {
    @Test
    public void testIt() {
        IntSquare testObject = new IntSquare();
        assertEquals(3, testObject.sqrt(11));
        assertEquals(30506, testObject.sqrt(930675566));
    }
}
