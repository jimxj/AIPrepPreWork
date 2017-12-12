package com.jim.interviewbit;

public class IntSquare {
    public int sqrt(int a) {
        if (a < 1) {
            return 0;
        } else if (a == 1) {
            return 1;
        }

        long longA = a;
        long left = 1;
        long right = getMax(a);
        while (left < right) {
            long middle = left + (right - left) / 2;
            long power = middle * middle;
            if (power < longA) {
                left = middle + 1;
            } else if (power > longA) {
                right = middle - 1;
            } else {
                return (int) middle;
            }
        }

        long power = left * left;
        if (power < longA) {
            return (int) left;
        } else if (power > longA) {
            return (int) (left - 1);
        } else {
            return (int) left;
        }
    }

    private int getMax(int a) {
        if (a > 99) {
            int max = 1;
            while (a/max > 99) {
                a = a / 10;
                max = 10 * max;
            }
            return max * 10;
        } else {
            return a;
        }
    }
}
