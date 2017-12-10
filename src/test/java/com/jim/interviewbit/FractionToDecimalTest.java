package com.jim.interviewbit;

import org.junit.Test;

public class FractionToDecimalTest {

    @Test
    public void testIt() {
        FractionToDecimal testObject = new FractionToDecimal();
        System.out.println(testObject.fractionToDecimal(-2147483648, -1));
    }
}
