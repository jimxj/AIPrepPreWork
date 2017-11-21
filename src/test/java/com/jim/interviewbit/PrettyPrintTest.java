package com.jim.interviewbit;

import com.jim.interviewbit.utils.OutputUtils;
import org.junit.Test;

import java.util.ArrayList;

public class PrettyPrintTest {

    @Test
    public void testIt() {
        PrettyPrint prettyPrint = new PrettyPrint();

        ArrayList<ArrayList<Integer>> result3 = prettyPrint.prettyPrint(3);
        OutputUtils.printArrayList(result3);

        ArrayList<ArrayList<Integer>> result4 = prettyPrint.prettyPrint(4);
        OutputUtils.printArrayList(result4);
    }

}
