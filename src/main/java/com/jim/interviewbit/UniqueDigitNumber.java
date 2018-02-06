package com.jim.interviewbit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueDigitNumber {
    /*
     * Complete the function below.
     */
    public void countNumbers(int[][] arr) {
        Map<Integer, Boolean> numberCountMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int count = countNumber(arr[i][0], arr[i][1], numberCountMap);
            System.out.println(count);
        }
    }

    static int countNumber(int n, int m, Map<Integer, Boolean> numberCountMap) {
        if (n > m) {
            return 0;
        } else if (n == m) {
            return 1;
        }

        if (!hasUniqueDigit(n / 10, numberCountMap)) {
            numberCountMap.put(n / 10, false);
        }

        int result = 0;
        for (int i = n; i <= m; i++) {
            if (hasUniqueDigit(i, numberCountMap)) {
                result++;
            } else {
                numberCountMap.put(i, false);
            }
        }

        return result;
    }

    static boolean hasUniqueDigit(int n, Map<Integer, Boolean> numberCountMap) {
        Set<Integer> digits = new HashSet<>();
        int num = n;
        //Set<Integer> numbers = new HashSet<>();
        while(num > 0) {
            if (numberCountMap.containsKey(num)) {
                return numberCountMap.get(num);
            }

            int digit = num % 10;
            if (digits.contains(digit)) {
                //numberCountMap.put(num, false);
                //numbers.add(num);
                //System.out.println(n);
                //addCache(numberCountMap, numbers, false);
                return false;
            } else {
                digits.add(digit);
            }

            //numbers.add(num);

            num = num / 10;
        }

        //numberCountMap.put(n, true);
        return true;
    }
}
