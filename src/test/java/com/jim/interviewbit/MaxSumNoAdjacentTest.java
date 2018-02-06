package com.jim.interviewbit;

import org.junit.Test;

public class MaxSumNoAdjacentTest {

    @Test
    public void testIt() {
        MaxSumNoAdjacent maxSumNoAdjacent = new MaxSumNoAdjacent();
        int[][] nums = new int[][] {
                {1, 2, 3, 4},
                {2, 3, 4, 5}
        };
        System.out.println(maxSumNoAdjacent.maxSum(nums));

        int[][] nums2 = new int[][] {
                {1, 2, 3, 4, 8},
                {2, 3, 4, 5, 1}
        };
        System.out.println(maxSumNoAdjacent.maxSum(nums2));
    }
}
