package com.jim.interviewbit;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestInArray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> a, int k) {
        if (a == null || k > a.size()) {
            throw new java.lang.IllegalArgumentException();
        }

        PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }

        });

        for (Integer value : a) {
            if (maxQueue.size() < k) {
                maxQueue.offer(value);
            } else {
                if (value < maxQueue.peek()) {
                    maxQueue.poll();
                    maxQueue.offer(value);
                }
            }
        }

        return maxQueue.poll();
    }
}
