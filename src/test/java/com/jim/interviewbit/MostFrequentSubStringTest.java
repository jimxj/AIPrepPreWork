package com.jim.interviewbit;

import org.junit.Test;

public class MostFrequentSubStringTest {
    @Test
    public void testIt() {
        MostFrequentSubString mostFrequentSubString = new MostFrequentSubString();
        System.out.println(mostFrequentSubString.getMaxOccurrences("ababab", 2, 3, 4));
    }
}
