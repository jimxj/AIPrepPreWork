package com.jim.interviewbit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubsequenceTest {
    private LongestSubsequence testObject = new LongestSubsequence();

    @Test
    public void testIt1() {
        assertEquals(2, testObject.longestSubsequence("abc", "acb"));
    }

    @Test
    public void testIt2() {
        assertEquals(7, testObject.longestSubsequence("hankerranks", "hankers"));
    }

    @Test
    public void testIt3() {
        assertEquals(2, testObject.longestSubsequence("aedace", "abc"));
    }
}
