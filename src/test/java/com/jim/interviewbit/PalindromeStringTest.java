package com.jim.interviewbit;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PalindromeStringTest {
    @Test
    public void testIt() {
        System.out.println(Character.isAlphabetic('1'));
        PalindromeString testObject = new PalindromeString();
        assertEquals(0, testObject.isPalindrome("1a2"));
    }
}
