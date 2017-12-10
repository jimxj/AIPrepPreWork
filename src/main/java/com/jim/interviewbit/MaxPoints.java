package com.jim.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class MaxPoints {

    public int maxPoints(List<Integer> a, List<Integer> b) {
        if (a == null || b == null) {
            return 0;
        }

        int n = Math.min(a.size(), b.size());
        if (n < 3) {
            return n;
        }

        int result = 2;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int yDiff = b.get(j) - b.get(i);
                int xDiff = a.get(j) - a.get(i);

                int count = 2;
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) {
                        if (xDiff == 0) {
                            if (a.get(i) == a.get(k)) {
                                count++;
                            }
                        } else {
                            if (b.get(k) == b.get(i) + (yDiff * (b.get(k) - b.get(i)) / xDiff)) {
                                count++;
                                System.out.println("make a line :" + getPointString(a, b, i) + getPointString(a, b, i)
                                        + getPointString(a, b, i));
                            }
                        }
                    }
                }

                result = Math.max(result, count);
            }
        }

        return result;
    }

    private String getPointString(List<Integer> a, List<Integer> b, int index) {
        return "(" + a.get(index) + "," + b.get(index) + ")";
    }
}