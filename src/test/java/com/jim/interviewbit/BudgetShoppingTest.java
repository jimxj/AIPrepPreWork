package com.jim.interviewbit;

import org.junit.Test;

public class BudgetShoppingTest {

    @Test
    public void testIt() {
        BudgetShopping budgetShopping = new BudgetShopping();
        System.out.println(budgetShopping.budgetShopping(50, new int[] {20, 19}, new int[] {24, 20}));
    }
}
