package com.jim.interviewbit;

public class LongestSubsequence {
    /*
     * Complete the function below.

     */
    public int longestSubsequence(String x, String y) {
        if (x == null || x.length() < 1 || y == null || y.length() < 1) {
            return 0;
        }

        int[] xCharCount = new int[26];
        int[] xCharPosition = new int[26];
        for (int i = 0; i < x.length(); i++) {
            xCharCount[x.charAt(i) - 'a'] += 1;
        }

        int start = 0;
        int end = 0;
        int result = 0;
        /*
        a 1
        b 1
        c 1

        a  e  d  a  c  e
                       ^
                       ^

        result 2


        hankerranks
        h 0
        a 1
        n 1
        k 1
        e 0
        r 1
        s 0

        hankers
        ^
               ^
        result

        abc
        a 1
        b 1
        c 1

        acb
        ^
        ^

        result
        */
        while(start <= end && end < y.length()) {
            int charNo = y.charAt(end) - 'a';
            boolean isValidSeq = isValidSeq(x, y, start, end);
            if (xCharCount[charNo] < 1) {
                result = Math.max(result, end - start);
                //if (isValidSeq) {
                    while (start < end && xCharCount[charNo] < 1) {
                        int startCharNu = y.charAt(start) - 'a';
                        xCharCount[startCharNu] = xCharCount[startCharNu]++;
                        start++;
                    }

                    if (start == end) {
                        start++;
                        end++;
                    } else {
                        end++;
                    }
//                } else {
//                    start++;
//                }
            } else if (!isValidSeq) {
                start++;
            } else {
                xCharCount[charNo] -= 1;
                end++;
            }
        }

        if (end == y.length()) {
            result = Math.max(result, end - start);
        }

        return result;
    }

// abc
// acb
    /**
     a c b
     ^

     xPos = 3
     */
    private static boolean isValidSeq(String x, String y, int start, int end) {
        int xPos = 0;
        for (int i = start; i <= end; i++) {
            while(xPos < x.length() && y.charAt(i) != x.charAt(xPos)) {
                xPos++;
            }

            if (xPos == x.length()) {
                return false;
            }
        }

        return true;
    }
}
