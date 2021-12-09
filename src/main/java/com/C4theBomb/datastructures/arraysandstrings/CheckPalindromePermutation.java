package com.C4theBomb.datastructures.arraysandstrings;

public class CheckPalindromePermutation {
    static boolean checkPalindromePermutation(String str) {
        int[] charCounts = new int[256];
        int differences = 0;
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }

        for (int count : charCounts) {
            if (count % 2 != 0) {
                differences++;
            }
        }

        return (differences > 1) ? false : true;

    }
}
