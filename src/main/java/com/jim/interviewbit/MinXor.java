package com.jim.interviewbit;

import java.util.List;

public class MinXor {
    public int findMinXor(List<Integer> A) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                int xor = A.get(i) ^ A.get(j);
                System.out.println(A.get(i) + "^" + A.get(j) + " = " + xor);
                result = Math.min(result, xor);
            }
        }

        return result;
    }
}
