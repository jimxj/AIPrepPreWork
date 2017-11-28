package com.jim.interviewbit;

public class PalindromeString {
    public int isPalindrome(String a) {

        if (a != null) {
            if (a.length() == 1) {
                return 1;
            }

            char[] chars = a.toCharArray();
            int left = 0;
            int right = chars.length - 1;

            while (left < right) {
                while (!Character.isLetterOrDigit(chars[left]) && left < right) {
                    left++;
                }

                while (!Character.isLetterOrDigit(chars[right]) && left < right) {
                    right--;
                }

                if (left < right) {
                    if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                        if (Character.toUpperCase(chars[left]) != Character.toUpperCase(chars[right])) {
                            return 0;
                        }
                    } else if (chars[left] != chars[right]){
                        return 0;
                    }

                    if (right == left + 1 || right == left + 2) {
                        return 1;
                    } else {
                        left++;
                        right--;
                    }
                } else {
                    return 1;
                }
            }
        }

        return 0;
    }
}