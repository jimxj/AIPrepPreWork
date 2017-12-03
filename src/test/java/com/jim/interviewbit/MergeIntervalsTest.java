package com.jim.interviewbit;

import com.jim.interviewbit.utils.OutputUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervalsTest {
    @Test
    public void testIt() {
        MergeIntervals testObject = new MergeIntervals();
        ArrayList<MergeIntervals.Interval> input = new ArrayList<MergeIntervals.Interval>();
        input.addAll(Arrays.asList(new MergeIntervals.Interval(1,2), new MergeIntervals.Interval(3,5),
                new MergeIntervals.Interval(6,7), new MergeIntervals.Interval(8,10),
                new MergeIntervals.Interval(12,16)));
        ArrayList<MergeIntervals.Interval> result = testObject.insert(input, new MergeIntervals.Interval(4,9));
        OutputUtils.printArrayList(result);
    }
}
