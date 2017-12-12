package com.jim.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class MedianOfArray {
    // DO NOT MODIFY BOTH THE LISTS
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        List<Integer> merged = merge(a, b);
        int n = merged.size();
        if (n == 1) {
            return merged.get(0);
        } else if (n % 2 == 1) {
            return merged.get(n / 2);
        } else {
            return (merged.get(n / 2) + merged.get(n / 2 + 1)) * 1.0 / 2;
        }
    }

    private List<Integer> merge(final List<Integer> a, final List<Integer> b) {
        List<Integer> merged = new ArrayList<>(a.size() + b.size());
        int i = 0;
        int j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) < b.get(j)) {
                merged.add(a.get(i));
                i++;
            } else if (a.get(i) > b.get(j)) {
                merged.add(b.get(j));
                j++;
            } else {
                merged.add(a.get(i));
                merged.add(b.get(j));
                i++;
                j++;
            }
        }

        if (i < a.size()) {
            for (; i < a.size(); i++) {
                merged.add(a.get(i));
            }
        } else if (j < b.size()) {
            for (; j < b.size(); j++) {
                merged.add(b.get(j));
            }
        }

        return merged;
    }
}