package com.jim.interviewbit;

public class BSTValidation {
    public  boolean isValidBST(int[] arr) {
        return isValidBSTHelper(arr, 0, arr.length - 1, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private boolean isValidBSTHelper(int[] arr, int start, int end, int max, int min) {
        if (start == end) {
            return arr[start] > min && arr[start] < max;
        }

        int rightSubStart = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < min || arr[i] > max) {
                return false;
            }

            if (arr[i] > arr[start]) {
                rightSubStart = i;
                break;
            }
        }

        boolean isRightValid = true;
        boolean isLeftValid = true;
        if (rightSubStart > 0) {
            isRightValid = isValidBSTHelper(arr, rightSubStart, end, max, Math.max(min, arr[start]));
        }
        if (rightSubStart > start + 1) {
            isLeftValid = isValidBSTHelper(arr, start + 1, rightSubStart - 1, Math.min(arr[start], max), min);
        }

        return isRightValid && isLeftValid;
    }
}
