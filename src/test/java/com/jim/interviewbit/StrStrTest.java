package com.jim.interviewbit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrStrTest {
    @Test
    public void testIt() {
        StrStr strStr = new StrStr();
        assertEquals(3, strStr.strStr("bbabbaaab", "bbaa"));
    }
}
