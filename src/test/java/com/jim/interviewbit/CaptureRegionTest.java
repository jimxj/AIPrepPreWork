package com.jim.interviewbit;

import org.junit.Test;

public class CaptureRegionTest {

    @Test
    public void testIt() {
        CaptureRegion testObject = new CaptureRegion();
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', '0', '0', 'X'},
                {'X', 'X', '0', 'X'},
                {'X', 'O', 'X', 'X'},
        };

        printArray(board);
        char[][] result = testObject.captureRegin(board);

        printArray(result);
    }

    private void printArray(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }

        System.out.print("\n");
    }
}
