package com.jim.interviewbit;

public class MaxSumNoAdjacent {
    public int maxSum(int[][] nums) {
        return maxSumHelper(nums, 0, 0, false);
    }

    public int maxSumHelper(int[][] nums, int col, int preSum, boolean chose) {
        //System.out.println("col=" + col + ", preSum=" + preSum + ", chose=" + chose);
        if (col == nums[0].length) {
            return preSum;
        }

        if (chose) {
            return maxSumHelper(nums, col + 1, preSum, false);
        } else {
            return Math.max(
                        maxSumHelper(nums, col + 1, preSum + Math.max(nums[0][col], nums[1][col]), true),
                        maxSumHelper(nums, col + 1, preSum, false)
                    );
        }
    }
}
