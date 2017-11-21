package com.jim.interviewbit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        boolean[] used = new boolean[a.size()];
        permuteHelper(a, new ArrayList<Integer>(), 0, used, result);
        return result;
    }

    private void permuteHelper(ArrayList<Integer> a, ArrayList<Integer> prefix, int start,
                               boolean[] used, ArrayList<ArrayList<Integer>> result) {
        if (prefix.size() == a.size()) {
            result.add(new ArrayList<Integer>(prefix));
            return;
        }

        Set<Integer> usedSameLevel = new HashSet<Integer>();
        for (int i = 0; i < a.size(); i++) {
            if (!used[i] && !usedSameLevel.contains(a.get(i))) {
                usedSameLevel.add(a.get(i));
                used[i] = true;
                prefix.add(a.get(i));
                permuteHelper(a, prefix, start + 1, used, result);
                prefix.remove(prefix.size() - 1);
                used[i] = false;
            }
        }
    }
}
