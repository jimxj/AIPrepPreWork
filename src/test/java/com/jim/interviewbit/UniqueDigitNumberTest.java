package com.jim.interviewbit;

import com.jim.interviewbit.utils.OutputUtils;
import org.junit.Test;

public class UniqueDigitNumberTest {
    @Test
    public void testIt() {
        UniqueDigitNumber uniqueDigitNumber = new UniqueDigitNumber();
        uniqueDigitNumber.countNumbers(new int[][] {{1, 20}, {9, 19}});
    }
}
