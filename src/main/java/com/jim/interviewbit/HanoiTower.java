package com.jim.interviewbit;

import java.io.*;
import java.util.*;

/**
 * /**
 * Solve the sequence of correct moves for n discs from rod A to rod C.
 *

 A            B          C

 _
 __
 ___
 ____


 _
 __

 -
 --
 ---


 f(n) = 2 * f(n - 1) + 1
 = 2 * (2 * f(n - 2) + 1) + 1 = 4 * f(n - 2) + 2 + 1
 = 2 * f(n - 2) + 2 + 1

 2^(n-1) +  (1 + 2 + )
 */
class HanoiTower {

    /**
     * All possible moves between rods A, B, and C
     */
    public enum Move {
        AB, AC, BA, BC, CA, CB;
    }

    /*
     * @param n - number of discs
     * @return the sequence moves
     */
    public List<Move> solve(int n) {

        List<Move> result = new ArrayList<>();
        moveDisc(n, Move.AC, result);

        System.out.println(result);

        return result;
    }


    private static void moveDisc(int n, Move move, List<Move> result) {
        System.out.println(n);
        if (n == 1) {
            System.out.println("Move : " + move);
            result.add(move);
            return;
        }

        Move top = null;
        Move topNext = null;
        if (move == Move.AB) {
            top = Move.AC;
            topNext = Move.CB;
        } else if (move == Move.AC) {
            top = Move.AB;
            topNext = Move.BC;
        } else if (move == Move.BA) {
            top = Move.BC;
            topNext = Move.CA;
        } else if (move == Move.BC) {
            top = Move.BA;
            topNext = Move.AC;
        } else if (move == Move.CA) {
            top = Move.CB;
            topNext = Move.BA;
        } else if (move == Move.CB) {
            top = Move.CA;
            topNext = Move.AB;
        }

        moveDisc(n - 1, top, result);
        moveDisc(1, move, result);
        moveDisc(n - 1, topNext, result);
    }
}
