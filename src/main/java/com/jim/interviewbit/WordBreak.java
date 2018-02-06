package com.jim.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public int wordBreak(String A, ArrayList<String> B) {
        if (A == null || A.length() == 0 || B == null || B.isEmpty()) {
            return 0;
        }

        int maxWordLen = 0;
        for (String w : B) {
            maxWordLen = Math.max(maxWordLen, w.length());
        }

        Set<String> dic = new HashSet<>();
        dic.addAll(B);

        int i = 0;
        while (i < A.length()) {
            int longestWord = 0;
            for (int j = i;  j < (maxWordLen + i) && j < A.length(); j++) {
                String word = A.substring(i, j + 1);
                if (dic.contains(word)) {
                    System.out.println("Word  found " + word);
                    int len = j - i + 1;
                    if (len > longestWord) {
                        longestWord = len;
                    }
                } else {
                    System.out.println("Word not found " + word);
                }
            }

            if (longestWord == 0) {
                System.out.println("No word found starting at " + i);
                return 0;
            } else {
                System.out.println("word found starting at " + i + ", end=" + (i + longestWord));
                i = i + longestWord;

                if (i == A.length()) {
                    return 1;
                }
            }
        }

        return 0;
    }

    public int wordBreak2(String A, ArrayList<String> B) {
        HashSet<String> wordDict = new HashSet<>();
        wordDict.addAll(B);

        int maxLen = 0;
        for (String word: B){
            if (word.length() > maxLen) {
                maxLen = word.length();
            }
        }

        int[] pos = new int[A.length()+1];

        Arrays.fill(pos, -1);

        // Initial starting search position
        pos[0]=0;

        for(int i=0; i<A.length(); i++){
            // Only start searching from last "break" candidate
            if(pos[i]!=-1){
                // Search for possible break up to max dict word length
                for(int j=i+1; j<=A.length() && (j - i <= maxLen); j++){
                    String sub = A.substring(i, j);
                    if(wordDict.contains(sub)){
                        pos[j]=i;
                    }
                }
            }
        }

        return pos[A.length()]!=-1 ? 1 : 0;
    }
}