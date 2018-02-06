package com.jim.interviewbit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostFrequentSubString {
    /*
     * Complete the function below.
     */
    public int getMaxOccurrences(String s, int minLength, int maxLength, int maxUnique) {
        Map<String, Integer> subStrCount = new HashMap<>();

        for (int i = 0; i < s.length() - minLength + 1; i++) {
            Set<Character> uniqueChars = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                uniqueChars.add(s.charAt(j));
                int len = j - i + 1;
                if (len >= minLength) {
                    if (len <= maxLength && uniqueChars.size() <= maxUnique) {
                        String subStr = s.substring(i, j + 1);
                        int count = subStrCount.getOrDefault(subStr, 0);
                        subStrCount.put(subStr, count + 1);
                    } else {
                        break;
                    }
                }
            }
        }

        int max = 0;
        for (Map.Entry<String, Integer> e : subStrCount.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
            }
        }

        return max;
    }
}
