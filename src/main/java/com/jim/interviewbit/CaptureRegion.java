package com.jim.interviewbit;

import javafx.util.Pair;

import java.util.*;

public class CaptureRegion {
    Map<Node, Boolean> cache = new HashMap<Node, Boolean>();
    public char[][] captureRegin(char[][] board) {
        List<Pair<Integer, Integer>> captured = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '0') {
                    if (isCaptured(i, j, board)) {
                        //captured.add(new Pair<>(i, j));
                        board[i][j] = 'X';
                    }
                }
            }
        }

        return board;
    }

    private boolean isCaptured(int row, int col, char[][] board) {
        return isCapturedHelper(row, col, board, new HashSet<Node>());
    }

    private boolean isCapturedHelper(int row, int col, char[][] board, Set<Node> visited) {
        System.out.println("\nrow=" + row + ", col=" + col);
        System.out.println("cache=" + cache);
        System.out.println("visited=" + visited);
        boolean left, right, top, bottom = false;

        Node node = new Node(row, col);

        if (cache.containsKey(node)) {
            System.out.println("hit cache");
            return cache.get(node);
        }

        if (visited.contains(node)) {
            System.out.println("visited");
            return true;
        }

        visited.add(node);

        boolean result;
        if(row == 0 || row == board.length - 1 || col == 0 || col == board[0].length) {
            System.out.println("border");
            result = board[row][col] == 'X';
        } else if (board[row][col] == 'X') {
            System.out.println("x");
            result = true;
        } else {
            result = isCapturedHelper(row - 1, col, board, visited) &&
                    isCapturedHelper(row + 1, col, board, visited) &&
                    isCapturedHelper(row, col - 1, board, visited) &&
                    isCapturedHelper(row , col + 1, board, visited);
        }

        System.out.println("Result(" + row + ", " + col + ")=" + result + "\n\n");
        cache.put(node, result);
        return result;
    }

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return x == node.x &&
                    y == node.y;
        }

        @Override
        public int hashCode() {
            return 31 * x + y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Node{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}
