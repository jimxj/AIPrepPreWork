package com.jim.interviewbit;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class KthSmallestInArrayTest {
    @Test
    public void testIt() {
        KthSmallestInArray testObject = new KthSmallestInArray();

        assertThat(testObject.kthsmallest(Arrays.asList(2, 1, 4, 3, 2), 3), equalTo(2));
    }
}
