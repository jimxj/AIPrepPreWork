package com.jim.interviewbit;

import com.jim.interviewbit.utils.OutputUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueen {
    public ArrayList<ArrayList<String>> solveNQueens(int n) {
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        boolean[][] config = new boolean[n][n];
        for (boolean[] row : config) {
            Arrays.fill(row, false);
        }

        solveNQueensHelper(n, 0, config, result);

        return result;
    }

    private static void solveNQueensHelper(int n, int row, boolean[][] config, ArrayList<ArrayList<String>> result) {
        System.out.println("row=" + row + ", config=" + configToString(config));
        if (row == n) {
            result.add(configToString(config));
            return;
        }

        for (int col = 0; col < n; col++) {
            boolean canPlacePosition = canPlacePosition(config, row, col);
            System.out.println("canPlacePosition(" + row + "," + col + ")=" + canPlacePosition);
            if (canPlacePosition) {
                config[row][col] = true;
                solveNQueensHelper(n, ++row, config, result);
                config[row][col] = false;
            }
        }

    }

    private static boolean canPlacePosition(boolean[][] config, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (config[i][col]) {
                return false;
            }
//            for (int j = 0; j < config.length; j++) {
//                if (Math.abs(row - i) == Math.abs(col - j)) {
//                    if (config[i][j]) {
//                        return false;
//                    }
//                }
//            }
        }

        for(int i=row-1,m=col+1;i>=0&&m<config.length;i--,m++){
            if(config[i][m])
                return false;
        }

        for(int i=row-1,m=col-1;i>=0&&m>=0;i--,m--){
            if(config[i][m])
                return false;
        }

//        for(int i=0;i<r;i++){
//            if(config[i][j])
//                return false;
//        }
//        for(int i=k-1,m=j-1;i>=0&&m>=0;i--,m--){
//            if(config[i][m])
//                return false;
//        }
//        for(int i=k-1,m=j+1;i>=0&&m<=config.length;i--,m++){
//            if(config[i][m])
//                return false;
//        }

        return true;
    }

    private static ArrayList<String> configToString(boolean[][] config) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < config.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < config.length; j++) {
                sb.append(config[i][j] ? "Q" : ".");
            }

            result.add(sb.append("\n").toString());
        }

        return result;
    }
}

