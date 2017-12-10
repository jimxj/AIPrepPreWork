package com.jim.interviewbit.playground;

import org.junit.Test;

public class MathTest {

    @Test
    public void testMath() {
        System.out.println(calculateStairRows(2));
    }

    private void testIt(long value) {
        double sqrtValue = Math.sqrt(value);
        int floorValue = (int) Math.floor(sqrtValue);
        System.out.println(sqrtValue);
        System.out.println(floorValue);
    }

    @Test
    public void fractionTest() {
        System.out.println(-2147483648 / -1);
        System.out.println(-5 % -3);
    }

    private static int calculateStairRows(long value) {
        //int result = 0;
        //int levelCapacity = 1;
        //while (value >= levelCapacity) {
        //    result++;
        //    value = value - levelCapacity;
        //    levelCapacity = levelCapacity + 1;
        //}

        // n(n + 1) = 2 * value
        //

        double sqrtValue = Math.sqrt(value);
        int floorValue = (int) Math.floor(sqrtValue);

        System.out.println(sqrtValue);
        System.out.println(floorValue);

        long coinsNeeded = value * 2;
        for (int i = floorValue; i <= value; i++) {
            int total = i * (i + 1);
            if (total > coinsNeeded) {
                return i - 1;
            } else if (total == coinsNeeded){
                return i;
            }
        }

        return 0;
    }
}
