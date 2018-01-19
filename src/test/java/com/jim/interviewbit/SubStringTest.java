package com.jim.interviewbit;

import com.jim.interviewbit.utils.OutputUtils;
import org.junit.Test;

public class SubStringTest {
    @Test
    public void testIt() {
        SubString subString = new SubString();
        OutputUtils.printArrayList(subString.getSubstrings("123"));
    }

    @Test
    public void testIt2() {
        SubString subString = new SubString();
        OutputUtils.printArrayList(subString.getSubstrings2("123"));
    }
}
