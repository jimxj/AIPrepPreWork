package com.jim.interviewbit;

import com.jim.interviewbit.utils.OutputUtils;
import org.junit.Test;

public class GrayCodeTest {

    @Test
    public void testIt() {
        GrayCode grayCode = new GrayCode();
        OutputUtils.printArrayList(grayCode.grayCode(3));
    }
}
