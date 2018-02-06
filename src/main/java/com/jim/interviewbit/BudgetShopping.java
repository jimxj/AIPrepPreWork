package com.jim.interviewbit;

public class BudgetShopping {

    /*
     * Complete the function below.
     */

    public int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {
        int minCost = Integer.MAX_VALUE;
        for (int c : bundleCosts) {
            if (c < minCost) {
                minCost = c;
            }
        }

        ValueHolder valueHolder = new ValueHolder();
        budgetShoppingHelper(n, bundleQuantities, bundleCosts, 0, minCost, valueHolder);

        return valueHolder.value;
    }

    static int budgetShopping2(int n, int[] bundleQuantities, int[] bundleCosts) {
        int minCost = Integer.MAX_VALUE;
        for (int c : bundleCosts) {
            if (c < minCost) {
                minCost = c;
            }
        }

        ValueHolder valueHolder = new ValueHolder();
        budgetShoppingHelper(n, bundleQuantities, bundleCosts, 0, minCost, valueHolder);

        return valueHolder.value;
    }

    static void budgetShoppingHelper(int n, int[] bundleQuantities, int[] bundleCosts, int noteBookNum,
                                     int minCost, ValueHolder valueHolder) {
        if (n < minCost) {
            if (valueHolder.value < noteBookNum) {
                valueHolder.value = noteBookNum;
            }

            return;
        }

        for (int i = 0; i < bundleQuantities.length; i++) {
            if (n >= bundleCosts[i]) {
                budgetShoppingHelper(n - bundleCosts[i], bundleQuantities, bundleCosts, noteBookNum + bundleQuantities[i],
                        minCost, valueHolder);
            }
        }
    }

    public static class ValueHolder {
        public int value;
    }

}
