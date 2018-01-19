package com.jim.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class SubString {
    public  List<String> getSubstrings(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            getSubstringsHelper(s, new StringBuilder(), i, result);
        }
        return result;
    }

    public  List<String> getSubstrings2(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
                result.add(sb.toString());
            }
        }
        return result;
    }

    private void getSubstringsHelper(String s, StringBuilder current, int position, List<String> result) {
        if (current.length() > 0) {
            result.add(current.toString());
        }

        if (position == s.length()) {
            return;
        }

        current.append(s.charAt(position));
        getSubstringsHelper(s, current, position + 1, result);
    }
}
