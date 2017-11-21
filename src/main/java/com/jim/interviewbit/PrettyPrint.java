package com.jim.interviewbit;

import java.util.ArrayList;

public class PrettyPrint {

    public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
        if (a <= 0) {
            return null;
        }

        int size = a * 2 - 1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(size);
        int middle = a - 1;
        for (int i = 0; i <= middle; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>(size);
            int j = 0;
            for (j = 0; j < i; j++) {
                row.add(a - j);
            }

            while (j <= middle) {
                row.add(a - i);
                j++;
            }

            //copy left side
            while (j < size) {
                row.add(row.get(size - 1 - j));
                j++;
            }
            result.add(row);
        }

        //copy top
        for (int i = a; i < size; i++) {
            result.add(i, new ArrayList(result.get(size - 1 - i)));
        }

        return result;
    }
}
