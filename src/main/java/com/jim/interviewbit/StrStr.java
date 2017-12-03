package com.jim.interviewbit;

public class StrStr {
    public int strStr(final String haystack, final String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length()) {
            return -1;
        }

        int m = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= m - n; i++) {
            int j = 0;
            for (; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == n) {
                return i;
            }
        }

        return -1;
    }
}
