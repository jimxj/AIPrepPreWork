package com.jim.interviewbit;

import com.jim.interviewbit.utils.OutputUtils;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.OutputUtil;
import org.junit.Test;

public class NQueenTest {

    @Test
    public void testIt() {
        NQueen nQueen = new NQueen();
        OutputUtils.printArrayList(nQueen.solveNQueens(8));
    }
}
