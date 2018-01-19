package com.jim.interviewbit;

import com.jim.interviewbit.utils.OutputUtils;
import org.junit.Test;

public class HanoiTowerTest {

    @Test
    public void testIt() {
        HanoiTower hanoiTower = new HanoiTower();
        OutputUtils.printArrayList(hanoiTower.solve(3));
    }
}
