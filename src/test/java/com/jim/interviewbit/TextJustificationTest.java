package com.jim.interviewbit;

import com.jim.interviewbit.utils.OutputUtils;
import org.junit.Test;

import java.util.List;

public class TextJustificationTest {
    @Test
    public void testIt() {
        TextJustification testObject = new TextJustification();
        List<String> result = testObject.textJustification("This is an example of text justification.", 16);
        OutputUtils.printArrayList(result);
    }
}
