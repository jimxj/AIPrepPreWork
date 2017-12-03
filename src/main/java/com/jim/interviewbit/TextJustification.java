package com.jim.interviewbit;

//public class TextJustification {
// package whatever; // don't place package name!

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//aaaa bbbb cccc dddd
//String text = "This is an example of text justification.";
//        start
//        end
//
//        count           7
//        tmpCount        9
//        start           3
//        end             4





//16

//This     is     an       8 + 8
//example  of text          13
//justification

class TextJustification {
    public static void main (String[] args) {
        System.out.println("Hello Java");

    }

    public List<String> textJustification(String s, int l) {
        String[] words = s.split(" ");

        List<String> result = new ArrayList<>();
        int start = 0;
        int end = start;
        int count = 0;
        while(end < words.length) {
            int tmpCount = count + words[end].length();
            if (count > 0) {
                tmpCount++;
            }
            if (tmpCount < l) {
                count = tmpCount;
                end++;
            } else if (tmpCount == l) {
                result.add(makeALine(words, start, end, tmpCount, l));
                end++;
                start = end;
                count = 0;
            } else {
                result.add(makeALine(words, start, end - 1, count, l));
                start = end;
                count = 0;
            }
        }

        if (count > 0) {
            result.add(makeALine(words, start, end - 1, count, l));
        }

        return result;
    }


    //This is an

    public String makeALine(String[] words, int start, int end, int count, int l) {
        int extraSpaces = l - count;           //6
        int wordsCount = end - start + 1;      //3

        int avgSpace = 1;    //2
        int firstPadding = 0;   //0
        int lastPadding = 0;   //0

        if (end != words.length - 1) {
            if (extraSpaces > 0 && wordsCount > 1) {
                avgSpace = 1 + extraSpaces / (wordsCount - 1);    //2
                firstPadding = extraSpaces % (wordsCount - 1);   //0
            } else if (wordsCount == 1) {
                firstPadding = extraSpaces;
            }
        } else {
            lastPadding = extraSpaces;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(words[i]);

            if (i == start) {
                addSpaces(sb, avgSpace + firstPadding);
            } else if (i != end) {
                addSpaces(sb, avgSpace);
            }

            if (i == words.length - 1)  {
                addSpaces(sb, lastPadding);
            } else if (i == start && wordsCount == 1) {
                addSpaces(sb, avgSpace + firstPadding);
            } else if (i < (start + firstPadding)) {
                addSpaces(sb, avgSpace + 1);
            } else {
                addSpaces(sb, avgSpace);
            }
        }

        return sb.toString();
    }

    private void addSpaces(StringBuilder sb, int count) {
        for (int i = 0; i < count; i++) {
            sb.append(" ");
        }
    }
}

