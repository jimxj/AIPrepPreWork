package com.jim.interviewbit;

public class Power {
    int MAX_INT_SQRT = (int) Math.sqrt((double) Integer.MAX_VALUE);

    public int pow(int x, int n, int d) {
        if (x == 0) {
            return 0;
        }
        if (d == 0) {
            throw new IllegalArgumentException();
        }
        long powerResult = powerHelper(x, n);

        if (Math.abs(powerResult) > Integer.MAX_VALUE) {
            return 0;
        }

        int result = (int) powerResult % d;
        return result > 0 ? result : (d + result);
    }

    private long powerHelper(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            long half = powerHelper(x, n / 2);
            if (half > MAX_INT_SQRT) {
                return 0;
            }
            if (n % 2 == 0) {
                return checkOverflow(half * half);
            } else {
                return checkOverflow(half * half * x);
            }
        }
    }

    private long checkOverflow(long num) {
        return (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) ? 0 : num;
    }
}

